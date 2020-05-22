package com.matrix;

interface BaseI { void method(); }

class BaseC
{
   public void method()
   {
      System.out.println("Inside BaseC::method");
   }
}

/* This is also a comment /* More comments */ 
public class ImplC extends BaseC implements BaseI
{
   public static void main(String []s)
   {
	   int mask = 0x000F;
       int value = 0x2222;
       System.out.println(value & mask);
   }
}
