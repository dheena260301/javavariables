package operaters;

public class Unaryoperaters {

	
	public static void main(String[] args) {
	int i=100;
	int j=300;
	int a=35;
	int b=-100;
	System.out.println("Unary value");
	
	System.out.println("prefix");
	
	System.out.println("++i");
	
	System.out.println(++i);//100+1=101(101)
	System.out.println(++i);//101+1=102(102)
	System.out.println(++i);//102+1=103(103)
	System.out.println(++i);//103+1=104(104)
	
	System.out.println("--i");
	
	System.out.println(--i);//104-1=103(103)
	System.out.println(--i);//103-1=102(102)
	System.out.println(--i);//102-1=101(101)
	System.out.println(--i);//101-1=100(100)
	
	
	System.out.println("post fix");
	
	System.out.println("j++");
	
	System.out.println(j++);//300(301)
	System.out.println(j++);//300+1=301(301)
	System.out.println(j++);//301+1=302
	System.out.println(j++);//302+1=303
	
	System.out.println("j--");
	
	
	System.out.println(j--);//30
	System.out.println(j--);
	System.out.println(j--);
	System.out.println(j--);
	
	
	
System.out.println("left and right sift");
  System.out.println(i<<2);//100*2^2=100*4=400(sift left=mult)
  System.out.println(i>>2);//100/2^2=100/4=25(shift right)
  System.out.println(i>>>2);//
  
	if(a<35)
	System.out.println("true");
	else
		System.out.println("false");
	
	if(a>35)
		System.out.println("true");
		else
			System.out.println("false");
  
	if(a<=35)
		System.out.println("true");
		else
			System.out.println("false");  
	if(a>=35)
		System.out.println("true");
		else
			System.out.println("false");
			
	if(a==35)//equal to
			System.out.println("true");
			else
				System.out.println("false");
	if(a!=100)//not equal to
		System.out.println("true");
		else
			System.out.println("false");
			
	System.out.println(~a);//a=35,a+1=36,36~=-36
	System.out.println(~b);//b=-100,b-1=99,99~=+99
	
	}
	

}


	
	