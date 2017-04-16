package com.dsa.model;

public class ArraySimpleList implements SimpleList<ArrayEntry> {

	// # of positions in the list
	private int n = 0;

	// Current size of array
	private int arraySize = 10;

	public ArraySimpleList() {
		n = 0;
		arraySize = 10;

		// ArrayEntry e[];
	}

	ArrayEntry e[] = new ArrayEntry[arraySize];

	public void insertFirst(int value) {

		if (n == 0) {
			e[0] = new ArrayEntry(value, n);
			// arraySize++;
			n++;
		}

		else {

			ArrayEntry e1[] = new ArrayEntry[arraySize];
			e1 = e;

			if (n == arraySize) {

				e = new ArrayEntry[arraySize * 2];
				arraySize = arraySize * 2;
			}

			e[0] = new ArrayEntry(value, 0);
			System.arraycopy(e1, 0, e, 0, arraySize);
			for (int i = 1; i <= arraySize; i++) {
				e[i] = e1[i];
				if (i == e1.length) {

					i = arraySize + 1;
				}

				// new ArrayEntry(value,0);
				// arraySize++;
				n++;

			}

		}
	}

	public void insertLast(int value) {

		if (n == 0) {
			// System.out.println("This should be printed once: "+n);
			e[0] = new ArrayEntry(value, n);
			// arraySize++;
			n++;
		}

		else {

			// System.out.println("This is array size before inc: "+arraySize);
			// System.out.println("This is n : "+n);
			if (n == arraySize) {
				// System.out.println("This is inside if");
				// System.out.println("This is array size before inc:
				// "+arraySize);

				ArrayEntry e1[] = new ArrayEntry[arraySize];
				e1 = e;
				e = new ArrayEntry[arraySize * 2];

				// System.out.println("This is length of e1: "+e1.length);
				for (int i = 0; i < arraySize; i++) {

					e[i] = e1[i];
					if (i == e1.length) {

						i = arraySize + 1;
					}

				}
				arraySize = arraySize * 2;
				// System.out.println("This is array size after inc:
				// "+arraySize);

			}
			// System.out.println("This is length of e: "+e.length);
			// System.out.println(n);
			e[n] = new ArrayEntry(value, n);

			// arraySize++;
			n++;

		}
	}

	public ArrayEntry first() {

		return e[0];
	}

	public ArrayEntry last() {

		return e[n - 1];
	}

	public boolean isFirst(ArrayEntry p) {

		if (e[0] == p) {

			return true;
		} else
			return false;
	}

	public boolean isLast(ArrayEntry p) {

		if (e[n - 1] == p) {

			return true;
		} else
			return false;
	}

	public ArrayEntry before(ArrayEntry p) {

		int index = 0;
		if (e[0] == p) {

			// System.out.println("This is the first element");
		}

		else {

			index = p.getIndex() - 1;
		}

		return e[index];
	}

	public ArrayEntry after(ArrayEntry p) {

		int index = 0;
		if (e[n - 1] == p) {

			// System.out.println("This is the last element");
		}

		else {

			index = p.getIndex() + 1;
		}

		return e[index];

	}

	public boolean isEmpty() {

		if (n == 0)
			return true;
		else
			return false;

	}

	public int size() {

		return n;
	}

}
