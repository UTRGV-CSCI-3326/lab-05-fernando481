import java.util.Scanner;



public class input{
    public static void main(String[] args){


        		
		Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double weight;
        boolean smoker;
        
    
        System.out.println(" answer the following questions:");

        System.out.println(" Name ");
        name = scanner.nextLine();

        System.out.println(" age ");
        age = scanner.nextInt();

        System.out.println(" weight");
        weight = scanner.nextDouble();


        System.out.println(" are you a smoker True/False  ");
        smoker = scanner.nextBoolean();

        System.out.println( " name " + name);
        System.out.println("age " + age );
        System.out.println( " weight " + weight );
        System.out.println("smoker " + smoker );
        
        scanner.close();
        


        


        












    }
}
