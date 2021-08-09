package Basic;

public class Test{
	
		  public static void main(String[] args) {
			B b= new B();
			b.m1();
		}
		}



		class A
		{
		  static int a = 10;	
		}
		class B extends A 
		{
			static int a = 20;
			void m1()
			{
				int a = 30;
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(super.a);
				System.out.println(B.a);
			}
		}