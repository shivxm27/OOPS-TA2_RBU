class Area{
	double radius;
	double a;
	 Area(double r){
		radius=r;
		double pi = 3.14;
		
		a = pi*r*r;	
	
	}
	
}
public class L3PartC {
	public static void main(String[]args) {
		Area myArea = new Area(9);
		System.out.println("Area is : " + myArea.a);
	}
}
