package org.example;

public class TestSonar {
	private int i;

	public TestSonar(int i) {
		i = i;
	}
	
	public int getValue() {
		return this.i;
	}

	@Override
	public String toString() {
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((TestSonar) obj).getValue() == this.getValue();
	}
}
