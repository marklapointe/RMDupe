/**
 * 
 */
package com.demo.dupes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author marklapointe
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		Integer[] data = new Integer[] {1, 1, 2, 2, 3, 4, 4, 4, 4};
		
		// The easy way
		Set<Integer> result = new TreeSet<Integer>();
		for(Integer c: data) {
			result.add(c);
		}
		System.out.println(result);
		
		// The hard way
		Integer lastValue = null;
		int removeCount = 0;
		List<Integer> result2 = new ArrayList<Integer>();
		for(Integer c: data) {
			if (lastValue != c) {
				result2.add(c);
				lastValue = c;
			} else {
				removeCount++;
			}
		}
		Integer[] resultarr = new Integer[result2.size()];
		for (int i = 0; i < result2.size();i++) {
			resultarr[i] = result2.get(i);
		}
		System.out.println(removeCount);
		System.out.println(result2);
		for(Integer i: resultarr) System.out.println(i);
		System.out.println();
		// The harder way
		Integer lastValueHarder = null;
		int removeCountHarder = 0;
		int addCounter = 0;
		int[] retdata = new int[data.length];
		for(Integer c: data) {
			if (lastValue != c) {
				lastValue = c;
				retdata[addCounter] = c;
				addCounter++;
			} else {
				removeCount++;
			}
		}
		int[] newdata = new int[addCounter];
		System.arraycopy(retdata, 0, newdata, 0, addCounter);
		for(Integer i: newdata) System.out.println(i);


		System.out.println();
		
		System.out.println("End");
	}

}
