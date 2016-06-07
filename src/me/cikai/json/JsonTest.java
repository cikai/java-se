package me.cikai.json;

import com.google.gson.Gson;

public class JsonTest {

	public static void main(String[] args) {

		Model model = new Model();
		model.setId(1);
		model.setName("cikai");
		model.setGender("male");
		model.setAddr("shenyang");
		
		Gson gson = new Gson();
		
		System.out.println(gson.toJson(model));
		
		
	}

}
