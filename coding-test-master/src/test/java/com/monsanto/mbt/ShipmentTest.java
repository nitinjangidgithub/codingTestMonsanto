package com.monsanto.mbt;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.Map;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;
public class ShipmentTest {

	final Shipment shipment = new Shipment();


    @Test
    public void testShipment_Sorted_By_Color(){
    	final List<Widget> widgets = WidgetUtils.getSampleWidgets();
		final SortOperation so1 = shipment.sortByColor();
		final Map<String,List<Widget>> sortedWidgets = so1.sort(widgets);
		assertThat(sortedWidgets.size(), is(3));
		assertThat(sortedWidgets, IsMapContaining.hasKey("Shipment 1"));
    }

    @Test
    public void testShipment_Sorted_By_Date(){
    	final List<Widget> widgets = WidgetUtils.getSampleWidgets();
    	final SortOperation so2 = shipment.sortByDate();
    	final Map<String,List<Widget>> sortedWidgets = so2.sort(widgets);
    	assertThat(sortedWidgets.size(), is(3));
    	assertThat(sortedWidgets, IsMapContaining.hasKey("Shipment 1"));
    }


}
