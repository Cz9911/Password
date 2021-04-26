import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String password = "@enter.com";
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter Your password below.");
    String passInput = scanner.next();
    if(passInput.equals(password)){
      System.out.println("Welcome");
    }
    else{
      System.out.println("Get atta here!");
    }

    
    scanner.close(); 
  }
}