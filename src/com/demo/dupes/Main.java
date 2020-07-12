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
		List<Integer> result2 = new ArrayList<Integer>();
		for(Integer c: data) {
			if (lastValue != c) {
				result2.add(c);
				lastValue = c;
			}
		}
		System.out.println(result2);
		
		System.out.println("End");
	}

}
