import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class NonVegPizzaPrice {



    static NonVegPizzaPrice p = new NonVegPizzaPrice();
    static Scanner sc = new Scanner(System.in);
   static ArrayList <DisplayNonVegPrice> al = new ArrayList<>();
   

    private  NonVegPizzaPrice() {


    }

    public static NonVegPizzaPrice getObjNonVegPizzaPrice() {

        return p;
    }

    static double totalPizzaPrice = 0.0;


    public void NonVegSupremePrice(String pizzaName) {
       
      TreeMap <String,Double> pp = new TreeMap<>();
        pp.put("Regular", 190.00);
        pp.put("Medium",325.00);
        pp.put("large", 425.00);
        System.out.println(pp);

        System.out.println("1.Regular");
        System.out.println("2.Medium");
        System.out.println("3.large");
        System.out.println("Enter Type : ");
        int type = sc.nextInt();

        TreeMap <String,Double> pp2 = new TreeMap<>();
          pp2.putAll(pp);

        if(type == 1) {

           

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


    public void chickenTikkaPrice(String pizzaName) {

        TreeMap<String,Double> ccorn = new TreeMap<>();
        ccorn.put("Regular", 210.00);
        ccorn.put("Medium",370.00);
        ccorn.put("large", 500.00);
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

    public void peperBarbecueChicken(String pizzaName) {

        TreeMap <String,Double> ptikka = new TreeMap<>();
        ptikka.put("Regular", 220.00);
        ptikka.put("Medium",380.00);
        ptikka.put("large", 525.00);
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

       
     p.addingToppingForNonVeg();
         

           al.add(new DisplayNonVegPrice(typeName, totalPizzaPrice,pizzaName,pizzaCrust));
           System.out.println("product added in your kart successfully");
                 
               
               
            }


            public void displayKart() {

                

               for(DisplayNonVegPrice pl : al) {

                  System.out.println("Pizza Name : " + pl.pizzaName);
                  System.out.println("PizzaType : " + pl.TypeName);
                  System.out.println("pizza Crust : " + pl.pizzaCrust);

                  System.out.println("===============================================");
               }

                System.out.println("Total Price : " + p.totalPizzaPrice); 
            }


    public void addingToppingForNonVeg() {


                TreeMap<String,Double> topping = new TreeMap<>();

                topping.put("Chicken Tikka", 35.00);
                topping.put("Barbeque chicken", 45.00);
                topping.put("Grilled chicken", 40.00);

                System.out.println(topping);
                
                
                System.out.println("1.Chicken Tikka");
                System.out.println("2.Barbeque chicken");
                System.out.println("3.Grilled chicken ");

                System.out.println("Enter choice : ");
                int choice = sc.nextInt();

                if(choice == 1) {

                    totalPizzaPrice += topping.get("Chicken Tikka");

                }else if(choice == 2) {

                    totalPizzaPrice += topping.get("Barbeque chicken");

                }else if(choice == 3) {

                    totalPizzaPrice += topping.get("Grilled chicken");

                }else {

                    System.out.println("Invalid choice...!");
                }

              


            }
           
    
}
