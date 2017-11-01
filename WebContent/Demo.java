package com.imm.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Demo {
	public static void main(String[] args) {
		MenuOne menu1=new MenuOne();
		MenuOne menu2=new MenuOne();
		MenuOne menu3=new MenuOne();
		MenuTwo two1=new MenuTwo();
		MenuTwo two2=new MenuTwo();
		MenuTwo two3=new MenuTwo();
		menu1.setId(1);
		menu1.setAction("1");
		menu1.setName("1");
		menu2.setId(2);
		menu2.setAction("2");
		menu2.setName("2");
		menu3.setId(3);
		menu3.setAction("3");
		menu3.setName("3");
		System.out.println(menu1);
		two1.setOne_id(menu1.getId());
		two2.setOne_id(menu2.getId());
		two3.setOne_id(menu3.getId());
		two1.setTwo_name("1");
		two2.setTwo_name("2");
		two3.setTwo_name("3");
		two1.setTwo_action("1");
		two2.setTwo_action("2");
		two3.setTwo_action("3");
		System.out.println(two1);
		System.out.println(two2);
		System.out.println(two3);
		menu1.setMenuTwo(two1);
		menu2.setMenuTwo(two2);
		menu3.setMenuTwo(two3);
		List<MenuOne> list=new ArrayList<>();
		list.add(menu1);
		list.add(menu2);
		list.add(menu3);
		JSONArray jsonList = JSONArray.fromObject(list);
		JSONArray json=JSONArray.fromObject(jsonList);
		System.out.println(json);
	}
}
