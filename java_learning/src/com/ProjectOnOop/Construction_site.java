package com.ProjectOnOop;

import java.util.Scanner;

public class Construction_site {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Material m = new Material();
		System.out.println("Enter material Name :");
		m.setMaterialName(sc.next());
		
		System.out.println("Enter Quantity");
		m.setQuantity(sc.nextInt());
		
		System.out.println("Enter Unit ");
		m.setUnit(sc.next());
		
		System.out.println("Enter  Price");
		m.setPrice(sc.nextDouble());
		
		MaterialDAO dao = new MaterialDAO();
		dao.addMaterial(m);
		
		MaterialDAO daoo = new MaterialDAO();
		daoo.viedMaterial();
	}
}
