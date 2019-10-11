
package Tugas;

import java.util.Scanner;


public class AplicationScan {

   
    public static void main(String[] args) {
       String name,address,FavColour,birthday,IdNumber;;
       
       
       Scanner a,b,c,d,e;
       
       a = new Scanner(System.in);
       b = new Scanner(System.in);
       c = new Scanner(System.in);
       d = new Scanner(System.in);
       e = new Scanner(System.in);
       
       System.out.println("Student Data Collection");
       System.out.println("##Personal Information##");
       System.out.println("What is your name?");
       name = a.nextLine();
       
       System.out.println("When is your birthday?");
       birthday = b.nextLine();
       
       System.out.println("Where is your address?");
       address = c.nextLine();
       
       System.out.println("What is your Student Id Number?");
       IdNumber = d.nextLine();
       
       System.out.println("What is your favorite colour?");
       FavColour = e.nextLine();
       
       System.out.println("#-----------------------------------#");
       System.out.println("Student Name       : " + name);
       System.out.println("Date of Birth      : " + birthday);
       System.out.println("Address            : " + address);
       System.out.println("Student Id Number  : " + IdNumber);
       System.out.println("Favorite Colour    : " + FavColour);
       
       
       
       
        
        
    }
    
}
