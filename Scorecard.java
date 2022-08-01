package operaters;

public class Scorecard {

	public static void main(String[] args) {
		
 String name1="dheena";
	String name2="dhoni";
	String name3="sachin";
	String name4="jadeja";
	String name5="bhuvi";
	String name6="ashwin";
	String name7="bumrah";
	double a =67;
	double b=87;
	double c=98;
	double d=35;
	double e=3;
    double f=4;
	double g=3;
	double h=1;
	System.out.println("india tour t20" );
	
	System.out.println(" captain "  +name1 );
	
	System.out.println(name1 + "score" +"  "+a );
	System.out.println(name2 + "score" +"  "+ b );
	System.out.println(name3 + "score" + "   "+c );
	System.out.println(name4 + "score" + "   " +d );
	
	
	System.out.println(name4 + "wickets" + "   "+e );
	System.out.println(name5 + "wickets" + "   "+f );
	System.out.println(name6 + "wickets" +"   " + g );
	System.out.println(name7 + "score" +"   "+ h );
	
	
	System.out.println("partnership1 = "+" dheena & dhoni" +"="  + (a+b));
	System.out.println("partnership2="+ " sachin & jadeja" + "=" + (c+d));
	
System.out.println(name1+" " +"strike rate="+((a/120)*100));
System.out.println(name2+" " +"strike rate="+((b/120)*100));
System.out.println(name3+" "+"strike rate="+((c/120)*100));
System.out.println(name4+" "+"strike rate="+((d/120)*100));

System.out.println("bowling economy = "+ " jadeja " + "=" +(e/11));
System.out.println("bowling economy = "+ " bhuvi " + "=" +(f/11));
System.out.println("bowling economy = "+ " ashwin " + "=" +(g/11));
System.out.println("bowling economy = "+ " bumrah " +  "=" +(h/11));

System.out.println("total score");
System.out.println(+(a+b+c+d));

System.out.println("total wickets");
System.out.println(+(e+f+g+h));

System.out.println("current run rate");
System.out.println(+(a+b+c+d)/20);


	}

}
