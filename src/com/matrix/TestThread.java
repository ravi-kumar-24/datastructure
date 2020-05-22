package com.matrix;

class SampleDemo implements Runnable {

	   private Thread t;
	   private String threadName;
	   
	   SampleDemo (String threadName){
	       this.threadName = threadName;
	   }

	   public void run() 
	   {
	       while (true)
	            System.out.print(threadName+"kjk");
	   }

	   public void startomt ()
	   {
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	public class TestThread {

	   public static void main(String args[]) {

	      SampleDemo A = new SampleDemo( "A");
	      SampleDemo B = new SampleDemo( "B");

	      B.startomt();
	      A.startomt();
	   }
	}
