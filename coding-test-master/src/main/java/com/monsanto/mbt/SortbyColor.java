package com.monsanto.mbt;

import java.util.Comparator;

public class SortbyColor implements Comparator<Widget>{

	@Override
	public int compare(final Widget a, final Widget b)
    {
        return a.getColor().compareTo(b.getColor());
    }
}
