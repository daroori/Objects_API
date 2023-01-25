package Exception;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {
        File file = new File("resources/nonexistant");
        Scanner fileRead1 = null;
        try{
            file.createNewFile();
            Scanner fileRead = new Scanner(file);
            while(fileRead.hasNext()) {
                System.out.println(fileRead.nextDouble());
            }
        }
        catch (IOException e){
            System.out.println("Invalid PAth : " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Format Mismatch: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            fileRead1.close();
        }

    }
}
