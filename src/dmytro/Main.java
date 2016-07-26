package dmytro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 4, 4, 4, 2, 5));
		List<Integer> b = new ArrayList<>(Arrays.asList(3, 1, 4, 4, 1, 4, 5));
		System.out.println(Appearances.sameCount(a, b));
	}
}
