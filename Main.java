import java.util.Scanner;

public class brocode_lec_7 {
        public static void main(String [] args){
                Scanner scanner = new Scanner(System.in);

                String name;
                int age;
                boolean isStudent;



                System.out.print("Enter your name : ");
                name = scanner.nextLine();

                System.out.print("Enter your age : ");
                age = scanner.nextInt();

                System.out.print("Are you a Student? (true/false) :");
                isStudent = scanner.nextBoolean();





                //checking if name prompt was left empty using isEmpty inbuilt function

                if(name.isEmpty()){
                    System.out.println("You did not enter your name");
                }

                while(name.isEmpty()){
                    System.out.println("Enter your name : ");
                    name = scanner.nextLine();

                    System.out.print("Enter your age : ");
                    age = scanner.nextInt();

                }

                //age
                System.out.println("Hello "+ name);
                if(age >= 18){
                    System.out.println("You are a Adult 🧑");
                }
                else if(age >= 65){
                    System.out.println("You are a Senior");

                }
                else if(age == 0){
                    System.out.println("You are a baby");
                }
                else if(age < 18){
                    System.out.println("You are a teenager");
                }
                else{
                    System.out.println("You haven't been born yet");
                }



                //boolean
                if(isStudent){
                    System.out.println("You are a Student");
                }
                else{
                    System.out.println("Not a Student");
                }
















                scanner.close();
        }
}
