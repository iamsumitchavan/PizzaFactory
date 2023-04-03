import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public final class PiazzaList {

static PiazzaList pl = new PiazzaList();

private PiazzaList() {


}


public static PiazzaList gePiazzaListObj() {

    return pl;
}


  
   
  
  ArrayList al = new ArrayList<>();
 PizzaPrices p1 = PizzaPrices.getPizzaPricesObj();
 static Scanner sc = new Scanner(System.in);
 

 
  int count = 0;

    public void diplayListOfVeganPizzas() {

        count++;
       if(count == 1) {

      

       al.add("1. DeluxeVeggie");
       al.add("2. CheeseAndCorn");
       al.add("3.  PaneerTikka");

       }

      System.out.println(al);

      System.out.println("Enter PizzaName : ");
      String pizzaName = sc.next();
        
      pl.userEnterVegPizzaName(pizzaName);
      

    }

   
    public void userEnterVegPizzaName(String pizzaName) {

        switch(pizzaName) {

            case "DeluxeVeggie": 
                p1.deluxePizzaPrice(pizzaName);
                break;

            case "CheeseAndCorn" : 
                    p1.cheeseCornPizzaPrice(pizzaName);
                    break;

            case "PaneerTikka" :
                    p1.paneerTikkaPrice(pizzaName);
                    break;
                    
             default : 
                    System.out.println("Invalid choice");  
                    break;     

        }
    }
       

       


    
}
