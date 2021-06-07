package academy.mindswap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DupeFinder<E> {
	private int count;
	private final Set<E> set;

	public DupeFinder() {
		set = new HashSet<>();
	}

	public void add(E e) {
		if (!set.add(e)) {
			count++;
//			System.out.println("Element with hashcode: " + e.hashCode() + " is duplicated");
			findDupe(e);
		}
	}

	public Iterator<E> iterator() {
		return set.iterator();
	}

	public void printSet() {
		Iterator<E> it = iterator();
		System.out.println("Hash Set: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private void findDupe(E e) {
		if (count == 1) {
			System.out.println("There is 1 duplicate in your set");
		} else {
			System.out.println("There are " + count + " duplicates in your set");
		}
		System.out.println("Element : " + e + " is already in the hashset");
	}
}
