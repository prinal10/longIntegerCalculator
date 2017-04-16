package com.dsa.model;

public abstract class Position {
	private int value;

	// public Position(){}
	public Position(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
