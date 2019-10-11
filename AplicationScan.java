package Scan;

import java.util.Scanner;


public class AplicationScan {

   
    public static void main(String[] args) {
       String name,address,strength,Age,University;
       
       
       Scanner a;
       
       a = new Scanner(System.in);
       
       System.out.println("Interview");

       
       System.out.println("Boss : What is your name?");
       name = a.nextLine();
       System.out.println("You : My name is " + name);
       
        System.out.println("\t");
       
       System.out.println("Boss : How old are you right now?");
       Age = a.nextLine();
       System.out.println("You : I am " + Age + " years old");
       
        System.out.println("\t");
        
       System.out.println("Boss : Where do you live?");
       address = a.nextLine();
       System.out.println("You : I live on " + address);
       
        System.out.println("\t");
        
       System.out.println("Boss : What university did you graduate from?");
       University = a.nextLine();
       System.out.println("You : I graduated from " + University);
       
        System.out.println("\t");
        
       System.out.println("Boss : What is your strength in what?");
       strength = a.nextLine();
       System.out.println("You : My strength in the field " + strength);
       
        System.out.println("\t");
        
        System.out.println("Boss : Alright we will consider");
        System.out.println("Boss : Please Wait for further information");
       
       
       
       
        
        
    }
    
}