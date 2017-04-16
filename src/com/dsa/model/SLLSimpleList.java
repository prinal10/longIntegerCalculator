package com.dsa.model;

public class SLLSimpleList implements SimpleList<SLLNode> {

	private SLLNode head;
	private SLLNode tail;

	public SLLSimpleList() {
		head = null;
		tail = null;
	}

	public void insertFirst(int value) {

		SLLNode node = new SLLNode(value);
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			SLLNode temp;
			temp = head;
			head = node;
			head.setNext(temp);

		}
	}

	public void insertLast(int value) {

		SLLNode node = new SLLNode(value);
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public SLLNode first() {
		return head;
	}

	public SLLNode last() {
		return tail;
	}

	public boolean isFirst(SLLNode p) {
		if (head == p)
			return true;
		else
			return false;
	}

	public boolean isLast(SLLNode p) {
		if (tail == p)
			return true;
		else
			return false;
	}

	public SLLNode before(SLLNode p) {
		SLLNode temp;
		temp = head;
		if (head == p) {
			// System.out.println("Error: Node is at the first position");
		} else {
			while (temp.getNext() != p) {
				temp = temp.getNext();
			}
		}
		return temp;
	}

	public SLLNode after(SLLNode p) {
		SLLNode temp;
		temp = head;
		if (tail == p) {
			// System.out.println("Error: Node is at the last position");
		} else if (temp == p) {
			temp = temp.getNext();
			return temp;
		} else {
			while (temp.getNext() != p) {
				temp = temp.getNext();
			}
		}
		temp = temp.getNext();
		temp = temp.getNext();
		return temp;
	}

	public boolean isEmpty() {
		if (head == null && tail == null) {
			return true;
		} else
			return false;
	}

	public int size() {
		int counter = 0;
		SLLNode temp;
		temp = head;
		if (!this.isEmpty()) {
			while (temp.getNext() != null) {
				counter = counter + 1;
				temp = temp.getNext();
			}
			counter = counter + 1;
			return counter;
		} else
			return counter;
	}
}
