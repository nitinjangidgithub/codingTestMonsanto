package com.monsanto.mbt;

import java.util.Comparator;

public class SortbyDate implements Comparator<Widget>{

    @Override
	public final int compare(final Widget a, final Widget b)
    {
        return a.getProductionDate().compareTo(b.getProductionDate());
    }
}
