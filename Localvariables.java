package com.variables;

public class Localvariables {
static int a=100;
	public static void  main(String[] args) {
	int x,y=50;
	int s=50+y;
	// TODO Auto-generated method stub
 System.out.println("Local variables:"+s);
 Localvariables lc=new Localvariables();
     lc.sum();
	}
	public void sum() {
	float m=12.65f; 
	float n=34.95f;
	float z=m+n;
	System.out.println(z);
	System.out.println(a);
	}
}

