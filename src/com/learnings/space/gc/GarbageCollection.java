package com.learnings.space.gc;

/*
 * Garbage collection is the process of removing unreferenced objects from heap memory
 */
public class GarbageCollection {

	public static void main(String[] args) {
		
		GarbageCollection gc = new GarbageCollection();
		System.out.println("Fully Qualified Class Name : " + gc.getClass());
		
		gc = null;
		System.gc();
		
		GarbageCollection gc2 = new GarbageCollection();
		System.out.println("Fully Qualified Class Name : " + gc2.getClass());
		
		System.gc();
		
	}
		@Override
		protected void finalize()
	   {
	        System.out.println("Garbage collection is performed by JVM");
	   }

}
