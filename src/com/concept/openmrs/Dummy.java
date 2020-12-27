package com.concept.openmrs;

import java.util.LinkedList;
import java.util.Queue;

public class Dummy {
	
	private int id;
	
	private String name;
	
	public Dummy(int id, String name) {
		super();
		this.id=id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dummy [Id = " + id + ", Name = " + name + "]";
	}
	
	public <E extends Number> void myfunction(E[] s) {
		for (E x : s) {
			System.out.println(x);
		}
	}
	public void queapi() {
		Queue<String> univ = new LinkedList<String>();
		univ.add("Minister");
	}
	
}
