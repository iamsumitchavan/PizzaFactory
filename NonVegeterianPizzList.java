import java.util.ArrayList;
import java.util.Scanner;

public final class NonVegeterianPizzList {



    static NonVegeterianPizzList non = new NonVegeterianPizzList();
    static Scanner sc = new Scanner(System.in);
    ArrayList al = new ArrayList<>();

    NonVegPizzaPrice n = NonVegPizzaPrice.getObjNonVegPizzaPrice();


    private NonVegeterianPizzList() {


    }


    public static NonVegeterianPizzList getObjNonVegeterianPizzList() {


        return non;

    }
    

    
  int count = 0;

    public void diplayListOfNonVegPizzas() {

        count++;
       if(count == 1) {

      

       al.add("1. NonVegSupreme");
       al.add("2. ChickenTikka");
       al.add("3. PepperBarbecueChicken");

       }

      System.out.println(al);

      System.out.println("Enter PizzaName : ");
      String pizzaName = sc.next();
        
      non.userEnterNonVegPizzaName(pizzaName);
      

    }

   
    public void userEnterNonVegPizzaName(String pizzaName) {

        switch(pizzaName) {

            case "NonVegSupreme": 
                n.NonVegSupremePrice(pizzaName);
                break;

            case "ChickenTikka" : 
                    n.chickenTikkaPrice(pizzaName);
                    break;

            case "PepperBarbecueChicken" :
                    n.peperBarbecueChicken(pizzaName);
                    break;
                    
             default : 
                    System.out.println("Invalid choice");  
                    break;     

        }
    }
       

       
}
