import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public final class PizzaPrices {


    static PizzaPrices p = new PizzaPrices();
    PiazzaList pl = PiazzaList.gePiazzaListObj();
    static Scanner sc = new Scanner(System.in);
   static ArrayList <DisplayVeganPizzaPrice> al = new ArrayList<>();

   

    private PizzaPrices() {


    }

    public static PizzaPrices getPizzaPricesObj() {

        return p;
    }

    static double totalPizzaPrice;

   
   
       

  


    public void deluxePizzaPrice(String pizzaName) {

    

       
       
       TreeMap<String,Double> pp = new TreeMap<>();
        pp.put("Regular", 150.00);
        pp.put("Medium",200.00);
        pp.put("large", 225.00);
        System.out.println(pp);

        System.out.println("1.Regular");
        System.out.println("2.Medium");
        System.out.println("3.large");
        System.out.println("Enter Type : ");
        int type = sc.nextInt();

        TreeMap <String,Double> pp2 = new TreeMap<>();
          pp2.putAll(pp);

        if(type == 1) {

            System.out.println(pp.get("Regular"));

                totalPizzaPrice += pp.get("Regular");
                veganTotalPizzaPrice(pp2,"Regular",totalPizzaPrice,pizzaName);
                
                
        }else if(type == 2) {

            totalPizzaPrice += pp.get("Medium");
            System.out.println(pp.get("Medium"));
            veganTotalPizzaPrice(pp2,"Medium",totalPizzaPrice,pizzaName);
            
        }else if(type == 3) {

            totalPizzaPrice += pp.get("large");
            System.out.println(pp.get("large"));
            veganTotalPizzaPrice(pp2,"large",totalPizzaPrice,pizzaName);
            
        }else {

            System.out.println("Invalid choice");
        }
    }


    public void cheeseCornPizzaPrice(String pizzaName) {

        TreeMap<String,Double> ccorn = new TreeMap<>();
        ccorn.put("Regular", 175.00);
        ccorn.put("Medium",375.00);
        ccorn.put("large", 475.00);
        System.out.println(ccorn);

        System.out.println("1.Regular");
        System.out.println("2.Medium");
        System.out.println("3.large");
        System.out.println("Enter Type : ");
        int type = sc.nextInt();

        TreeMap <String,Double> ccorn2 = new TreeMap<>();
        
        if(type == 1) {

            System.out.println(ccorn.get("Regular"));

                totalPizzaPrice += ccorn.get("Regular");
                veganTotalPizzaPrice(ccorn,"Regular",totalPizzaPrice,pizzaName);
                
                
        }else if(type == 2) {

            totalPizzaPrice += ccorn.get("Medium");
            System.out.println(ccorn.get("Medium"));
            veganTotalPizzaPrice(ccorn,"Medium",totalPizzaPrice,pizzaName);
            
        }else if(type == 3) {

            totalPizzaPrice += ccorn.get("large");
            System.out.println(ccorn.get("large"));
            veganTotalPizzaPrice(ccorn,"large",totalPizzaPrice,pizzaName);
            
        }else {

            System.out.println("Invalid choice");
        }
        
         
    }

    public void paneerTikkaPrice(String pizzaName) {

        TreeMap <String,Double> ptikka = new TreeMap<>();
        ptikka.put("Regular", 160.00);
        ptikka.put("Medium",290.00);
        ptikka.put("large", 340.00);
        System.out.println(ptikka);

        
        System.out.println("1.Regular");
        System.out.println("2.Medium");
        System.out.println("3.large");
        System.out.println("Enter Type : ");
        int type = sc.nextInt();

        TreeMap <String,Double> ptikka2 = new TreeMap<>();


        if(type == 1) {

            System.out.println(ptikka.get("Regular"));

                totalPizzaPrice += ptikka.get("Regular");
                veganTotalPizzaPrice(ptikka2,"Regular",totalPizzaPrice,pizzaName);
                
                
        }else if(type == 2) {

            totalPizzaPrice += ptikka.get("Medium");
            System.out.println(ptikka.get("Medium"));
            veganTotalPizzaPrice(ptikka2,"Medium",totalPizzaPrice,pizzaName);
            
        }else if(type == 3) {

            totalPizzaPrice += ptikka.get("large");
            System.out.println(ptikka.get("large"));
            veganTotalPizzaPrice(ptikka2,"large",totalPizzaPrice,pizzaName);
            
        }else {

            System.out.println("Invalid choice");
    
            }


    }



    //this method display all details about pizza which selected by user

   public static void veganTotalPizzaPrice(TreeMap pp2,String typeName,double totalPizzaPrice,String pizzaName) {

       
    System.out.println("You can add only one Crust for each pizza");

    System.out.println("1.New hand tossed");
    System.out.println("2.Wheat thin Crust");
    System.out.println("3.Cheese Burst");
    System.out.println("4.Fresh Pan Pizza");
    System.out.println("Enter Crust for pizza : ");
    String pizzaCrust = sc.next();

    String [] crust = {"New hand tossed","Wheat thin Crust","Cheese Burst","Fresh Pan pizza"};

     for(int i=0; i<crust.length; i++) {

        if(crust[i].equals(pizzaCrust)) {

            pizzaCrust = crust[i];
        }
     }
         
        p.addingToppingsForVegans();

       
       

           al.add(new DisplayVeganPizzaPrice(typeName, totalPizzaPrice,pizzaName,pizzaCrust));
           System.out.println("product added in your kart successfully");
                 
               
               
            }


            public void displayKart() {

               for(DisplayVeganPizzaPrice pl : al) {

                  System.out.println("Pizza Name : " + pl.pizzaName);
                  System.out.println("PizzaType : " + pl.TypeName);
                  System.out.println("Pizza Crust : " + pl.pizzaCrust);

                  System.out.println("===============================================");
               }

               System.out.println("Total Price : " + p.totalPizzaPrice);
            }
           

 public void addingToppingsForVegans() {

    TreeMap<String,Double> topping = new TreeMap<>();

    topping.put("Black Olive", 20.00);
    topping.put("Capsicum", 25.00);
    topping.put("Paneer", 35.00);
    topping.put("Mushroom", 30.00);
    topping.put("Fresh Tomato", 10.00);

    System.out.println(topping);

    System.out.println("1.Balck Olive");
    System.out.println("2. Capsicum");
    System.out.println("3. Paneer");
    System.out.println("4.Mushroom");
    System.out.println("5.Fresh tomato");

    System.out.println("Enter Choice : ");
    int choice = sc.nextInt();

    if(choice == 1) {

       totalPizzaPrice += topping.get("Black Olive");
        System.out.println(topping.get("Black Olive"));
       
        }else if(choice == 2) {

            totalPizzaPrice += topping.get("Capsicum");
        }else if(choice == 3) {

            totalPizzaPrice += topping.get("Paneer");
        }else if(choice == 4) {

            totalPizzaPrice += topping.get("Mushroom");
        }else if(choice == 5) {

            totalPizzaPrice += topping.get("Fresh tomato");
        }else {

            System.out.println("Invalid choice...!");
        }


 }





 
        

            
 
    
}
