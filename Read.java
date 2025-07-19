import java.io.*;
public class Read {
    public static void main(String[] args) {
        String fileName = "input.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            System.out.println("Reading from file: " + fileName);
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            }catch(IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }
    }

