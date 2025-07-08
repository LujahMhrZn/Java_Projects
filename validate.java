import java.util.Scanner;



public class validate{

     public static void validateName(String name){
    if (name == null || !name.matches("[a-zA-Z ]+")) {
        System.out.println("The name "+ name + " is not valid");
    }else{
        System.out.println("Valid name: " + name);
    }
}

public static void validateAge(String age){
    if( age == null || !age.matches("[0-9]+")){
        System.out.println("The age " + age + " is not valid");
    }else {
        System.out.println("The age is valid");
    }
}
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            validateName(name);
            System.out.println("Enter your age: ");
            String ageInput = sc.nextLine();
            validateAge(ageInput);
            sc.close();
    }               
}