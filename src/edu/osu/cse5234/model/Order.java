package edu.osu.cse5234.model;

import java.util.ArrayList;

public class Order {

	//Item[] items;
	ArrayList<Item> items; // = new ArrayList<>();

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}