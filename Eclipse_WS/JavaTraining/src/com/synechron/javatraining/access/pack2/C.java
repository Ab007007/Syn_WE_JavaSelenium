package com.synechron.javatraining.access.pack2;

import com.synechron.javatraining.access.pack1.A;

public class C extends A
{
	public static void main(String[] args) 
	{
		C c = new C();
		System.out.println(c.protectedVariable);
		System.out.println(c.publicVariable);
	}
}
