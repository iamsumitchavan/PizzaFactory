import java.util.ArrayList;
import java.util.Scanner;



public class MainPizzaF {

    static Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
        
      
   displayMenu();

      

     
      }

    public static void displayMenu() {

      PiazzaList pl = PiazzaList.gePiazzaListObj();
     PizzaPrices pr = PizzaPrices.getPizzaPricesObj();
      NonVegeterianPizzList non = NonVegeterianPizzList.getObjNonVegeterianPizzList();
      NonVegPizzaPrice np = NonVegPizzaPrice.getObjNonVegPizzaPrice();

      boolean status = true;
    

      while(true) {

        System.out.println("1.Veg Pizzas");
        System.out.println("2.Non-veg Pizza");
        System.out.println("3.Display kart");

        System.out.println("Enter Your choice.");
        int choice = sc.nextInt();
        int count = 0;
        boolean flag = false;

        if(choice == 1) {

          
          pl.diplayListOfVeganPizzas();
          flag = true;
          }else if(choice == 2) {

           non.diplayListOfNonVegPizzas();
          }else if(choice == 3) {

            pr.displayKart();

            if(!flag) {

                np.displayKart();
            }
          }
      }
    }

   
    
}
