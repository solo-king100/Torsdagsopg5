package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
   private ArrayList<String> coffeeMenu;
   Cafe(){

       this.coffeeMenu=new ArrayList<>();
   }
   public void loadMenuData() {
       File file = new File("coffees.txt");


       try {
           Scanner scan = new Scanner(file);
           while(scan.hasNext()){
               coffeeMenu.add(scan.nextLine());
           }

       } catch (FileNotFoundException e) {
           System.out.println("File not found, Check path and filename");

       }
   }
}
