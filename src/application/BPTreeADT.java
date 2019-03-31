package application;

import java.util.List;

/**
 * A generic B+ Tree interface (DO NOT edit this file)
 * 
 * @author sapan (sapan@cs.wisc.edu)
 */

public interface BPTreeADT<K, V> {

	/**
	 * Inserts the key and value in the appropriate nodes in the tree
	 * 
	 * Note: key-value pairs with duplicate keys can be inserted into the tree.
	 * 
	 * @param key
	 * @param value
	 */
	public void insert(K key, V value);

	/**
	 * Gets the values that satisfy the given range search arguments.
	 * 
	 * Value of comparator can be one of these: "<=", "==", ">="
	 * 
	 * Example: If given key = 2.5 and comparator = ">=": return all the values with
	 * thecorresponding keys >= 2.5
	 * 
	 * If key is null or not found, return empty list. If comparator is null, empty,
	 * or not according to required form, return empty list.
	 * 
	 * @param key
	 *            to be searched
	 * @param comparator
	 *            is a string
	 * @return list of values that are the result of the range search; if nothing
	 *         found, return empty list
	 */
	public List<V> rangeSearch(K key, String comparator);

	/**
	 * Returns a string representation for the tree This method is provided to
	 * students in the implementation.
	 * 
	 * @return a string representation
	 */
	public String toString();
}
