package com.monsanto.mbt;

import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface SortOperation {

	Map<String, List<Widget>> sort(List<Widget> widgets);
}
