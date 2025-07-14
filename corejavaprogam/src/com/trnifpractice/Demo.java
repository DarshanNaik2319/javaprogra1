package com.trnifpractice;

public class Demo{
	
		
		int serialnumber; // data memebrs or proprties
		String name;
		int age;
		
		void show() {
		System.out.println(serialnumber +" "+name+" "+age);
		}

		
public static void main(String[] args) {
	 {
	
			Demo e=new Demo ();
			
			e.serialnumber=1;
			e.name="rashmi";
			e.age=25;
			
			e.show();
		}
}
}
