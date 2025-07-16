package com.trnifpractice;

public class Accesspecifier {
public int a=9;   // data memebr
	
	private String name="mani bvc";
	
	protected float s=10.56f;
	
	int u=9;
	
	public void display() {  // method
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		Accesspecifier p=new Accesspecifier();
		
		System.out.println(p.name);
		
		System.out.println(p.a);
		
		System.out.println(p.s);
		
		System.out.println(p.u);
		
		p.display();
	

	}

}
