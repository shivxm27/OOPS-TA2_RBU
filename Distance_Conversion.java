import java.util.Scanner;

class DistConv{
    double kmtom(double num){
        return num * 1000;
    }

    double mtocm(double num){
        return num * 100;
    }

    double cmtomm(double num){
        return num * 10;
    }
}
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DistConv d = new DistConv();

        System.out.println("Enter KM Value : ");
        double km =  scanner.nextDouble();
        System.out.println("Km to M converted value is : "+d.kmtom(km));





    }
}








