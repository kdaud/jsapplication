package com.concept.openmrs;


public class College<S> {
	
	private S s;
	
	/**
	 * @param s
	 */
	public College(S s) {
		super();
		this.s=s;
	}
	
	public S getS() {
	return s;
}
}
