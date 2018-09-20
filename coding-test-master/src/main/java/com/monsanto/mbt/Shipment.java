package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shipment {

	public static Map<String, List<Widget>> doSort(final SortOperation s, final List<Widget> widgets) {
		  return s.sort(widgets);
	}

	public SortOperation sortByColor() {
		final SortOperation so = (widgets) -> {
			Collections.sort(widgets, new SortbyColor());

			final Map<String, List<Widget>> shipments = new HashMap<>();
			truncateList(widgets, shipments);

			System.out.println(shipments);
			return shipments;
		};
		return so;
	}


	public SortOperation sortByDate() {
		final SortOperation so = (widgets) -> {
			Collections.sort(widgets, new SortbyDate());

			final Map<String, List<Widget>> shipments = new HashMap<>();
			truncateList(widgets, shipments);

			System.out.println(shipments);
			return shipments;
		};
		return so;
	}

	private void truncateList(final List<Widget> widgets, final Map<String, List<Widget>> shipments) {
		//truncate the list
		final int noOfShipment = widgets.size() / 10;

		int m = 0;
		int n = 10;
		for(int i = 0; i <= noOfShipment - 1; i++) {
			final List<Widget> subWidgets = new ArrayList<>();
			final int s = i+1;
			final String shipmentKey = "Shipment " + s;
			for(int j = m; j <= n - 1; j++) {
				subWidgets.add(widgets.get(j));
			}
			m += 10;
			n += 10;
			shipments.put(shipmentKey, subWidgets);
		}
		if(noOfShipment*10 < widgets.size()) {
			final List<Widget> subWidgets = new ArrayList<>();
			for(int j = noOfShipment*10 + 1; j <= widgets.size() - 1; j++) {
				subWidgets.add(widgets.get(j));
			}

			final int s = noOfShipment + 1;
			final String shipmentKey = "Shipment " + s;
			shipments.put(shipmentKey, subWidgets);
		}
	}


	public static void main(final String[] args) {

		@SuppressWarnings("deprecation")
		final List<Widget> widgets = Arrays.asList(new Widget(1, "Red", new Date("1/1/2006")),
				new Widget(2, "Blue", new Date("2/1/2007")),
				new Widget(3, "Red", new Date("3/1/2006")),
				new Widget(4, "Green", new Date("4/1/2009")),
				new Widget(5, "Orange", new Date("5/1/2009")),
				new Widget(6, "Violet", new Date("6/1/2009")),
				new Widget(7, "Green", new Date("7/1/2009")),
				new Widget(8, "Green", new Date("8/1/2009")),
				new Widget(9, "Blue", new Date("9/1/2009")),
				new Widget(10, "Orange", new Date("10/1/2009")),
				new Widget(11, "Green", new Date("11/1/2009")),
				new Widget(12, "Red", new Date("12/1/2009")),
				new Widget(13, "Red", new Date("13/1/2009")),
				new Widget(14, "Green", new Date("14/1/2009"))

				);

		final Shipment shipment = new Shipment();

		System.out.println("Sort by Color");
		final SortOperation so1 = shipment.sortByColor();
		so1.sort(widgets);

		System.out.println("Sort by Date");
		final SortOperation so2 = shipment.sortByDate();
		so2.sort(widgets);
	}
}
