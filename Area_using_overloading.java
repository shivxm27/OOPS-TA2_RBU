import java.util.Scanner;




public class Area {
   double radius;
   double side;
   double base;
   double height;
   double AREA;




       public Area(double radius , double side, double base , double height){
           this.radius = radius;
           this.side= side;
           this.base = base;
           this.height = height;


       }


       void cArea(double radius){
           this.AREA = 3.14 * radius * radius;




       }
       void sArea(double side){
           this.AREA = side * side;
       }
       void tArea(double base , double height){
           this.AREA = 0.5 * base * height;
       }
       void disArea(){
           System.out.println("The Area is : "+AREA);
       }


       public static void main(String [] args) {
           Scanner scanner = new Scanner(System.in);




           System.out.println("Enter Value of a Side for Square : ");
           double side = scanner.nextDouble();


           System.out.println("Enter Radius for Circle : ");
           double radius = scanner.nextDouble();


           System.out.println("Enter Base and Height for Triangle : ");
           double base = scanner.nextDouble(),height = scanner.nextDouble();








           Area myArea = new Area(side , radius , base , height);




           myArea.sArea(side);
           myArea.disArea();


           myArea.tArea(base,height);
           myArea.disArea();


           myArea.cArea(radius);
           myArea.disArea();






           scanner.close();
       }
}

