package com.qa.main;

public class Runner {

	public static void main(String[] args) {

		Animal cow = new Animal();

		cow.setEyes(17);
		System.out.println(cow.getEyes());

		Animal chicken = new Animal();
		System.out.println(chicken.getEyes());
		chicken.setEyes(54236);
		System.out.println(chicken.getEyes());
		System.out.println("i SEE DEAD PEOPLE");
	}

}
