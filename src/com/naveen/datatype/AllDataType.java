package com.naveen.datatype;

public class AllDataType {

	private static final byte P = 0;

	public static void main(String[] args) {
		
		//byte
		//size : 1byte 8bit 
		// range : -128 to 127
		byte b = 10;
		b=50;
		byte c=20;
		c= 29;
		System.out.println(b+c);
		//short: 
		//size : 2byte 2X8=16 bit 
		//range : -32768 to 32767
		short s1=10;
		short s2=34;
		short s3= -300;
		System.out.println(s1+s2+s3);
		
		//int 4 byte 
		//size : 4 byte 4X8 64 bit 
		//range : -2147483648 to 2147483647
		
		int i=10;
		int age=20;
		int index= 40000;
		System.out.println(i+age+index);
		
		// long 
		// size : 8 byte 8X8=64 bit 
		// range : 
		
		long population = 11133633535352464L;
		long distance =   4233423302529579070L;
	    System.out.println(population+distance);
	    
	    //float 
	    //size : 4 byte 32 bit 
	    // range : can take up to 7 digit values 
	    float calculation = 95.876f;
	    float houseCal= 50.6677679546546999f;
	    System.out.println(calculation+houseCal);
	    
	    int x= 'a';
	    System.out.println(x);
	    
	   
	    
	    int J = 130;
	    byte N= (byte) J;// Bigger data type values assign to smaller type 
		System.out.println(N);
		
	}

}
