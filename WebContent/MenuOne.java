package com.imm.test;

public class MenuOne {
	private int id;
	private String name;
	private String action;
	private MenuTwo menuTwo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public MenuTwo getMenuTwo() {
		return menuTwo;
	}
	public void setMenuTwo(MenuTwo menuTwo) {
		this.menuTwo = menuTwo;
	}
}
