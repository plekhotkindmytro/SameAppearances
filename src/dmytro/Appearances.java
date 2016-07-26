package dmytro;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Appearances {

	/**
	 * Returns the number of elements that appear the same number of times in
	 * both collections.
	 * 
	 * @return number of same-appearance elements
	 */
	public static <T> int sameCount(Collection<T> a, Collection<T> b) {

		Set<T> allUniqueElements = new HashSet<>();
		allUniqueElements.addAll(a);
		allUniqueElements.addAll(b);

		int appearances = 0;
		for (T element : allUniqueElements) {
			int aFrequencies = frequency(a, element);
			int bFrequencies = frequency(b, element);
			if (aFrequencies == bFrequencies) {
				appearances++;
			}
		}

		return appearances;
	}

	private static <T> int frequency(Collection<T> a, T element) {
		int frequency = 0;
		for (T currentElement : a) {
			if (element.equals(currentElement)) {
				frequency++;
			}

		}
		return frequency;
	}

}
