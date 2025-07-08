import java.util.Scanner;

class ageException extends Exception {
    public ageException(String message) {
        super(message);
    }
}

public class CustomeValidate {
    
    static void validateName(String name) throws ageException{
    if (name == null || !name.matches("[a-zA-Z ]+")) {
        throw new ageException("The name "+ name + " is not valid");
    }else{
        System.out.println("Valid name: " + name);
    }
}
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            try{
            validateName(name);
            } catch (ageException e) {
                System.out.println("Caught exception"+e.getMessage());
            }
            sc.close();
    }
}
