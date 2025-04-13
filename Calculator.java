import java.util.Scanner;


        interface Add{
            int addNum(int a , int b);
        }
        interface Sub{
            int subNum(int a , int b);
        }
        interface Mul{
            int mulNum(int a , int b);
        }
        interface Div{
            double divNum(int a , int b);
        }
        interface Large{
            int largestNum(int a , int b);
        }

class Calculator implements Add,Sub,Mul,Div,Large{
    public int addNum(int a , int b) {
		int c = a + b;
		return c;
	}
	
	public int subNum(int a , int b) {
		int c = a - b;
		return c;
	}
	
	public int mulNum(int a , int b) {
		int c = a * b;
		return c;
	}
	
	public double divNum(int a , int b) {
		double c = a /  b;
		return c;
	}
	
	public int largestNum(int a , int b) {
		if ( a > b ) {
			return a;
		}
		else 
			return b;
	}
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator myCalc = new Calculator();
        
        System.out.println("Enter Two Numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("Addition = "+myCalc.addNum(a,b));
        System.out.println("Subtraction = "+myCalc.subNum(a,b));
        System.out.println("Multplication = "+myCalc.mulNum(a,b));
        System.out.println("Division = "+myCalc.divNum(a,b));
        System.out.println("The Larger Number is = "+myCalc.largestNum(a,b));
        
        
        
        
        
        
        
        
        scanner.close();
        
        
    }
}
