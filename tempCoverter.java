import java.util.Scanner;

public class tempCoverter{

   public static void main(String[] args){
      
      //Delcaring variables
      Scanner scan = new Scanner(System.in);
      String answer;  
      String answer2; 
      double temp;   
      
      //Starting question to determine what conversion is needed
      System.out.println("Is the starting temperature in Kelvin, Celsius, or Fahrenheit?");
      answer=scan.nextLine();
      
      //Input validation
      while(!answer.equalsIgnoreCase("Celsius") && !answer.equalsIgnoreCase("Fahrenheit") && !answer.equalsIgnoreCase("Kelvin")){
            System.out.println("Error. Try again.");
            answer=scan.nextLine();
         }
         
      //Starting unit in Kelvin
      if (answer.equalsIgnoreCase("Kelvin")){
         System.out.println("Are you converting to Celsius or Fahrenheit?");
         answer2=scan.nextLine();
         
         //Input validation
         while(!answer2.equalsIgnoreCase("Celsius") && !answer2.equalsIgnoreCase("Fahrenheit")){
                  System.out.println("Error. Try again."); 
                  answer2=scan.nextLine();
               }
               
            //Kelvin to Calsius
            if(answer2.equalsIgnoreCase("Celsius")){
               System.out.println("What is the temperature?");
               temp=scan.nextDouble();
               System.out.println("The temperature in Celsius is "+kelvinToCelsius(temp)); 
            }
            
            //Kelvin to Fahrenheit
            else if(answer2.equalsIgnoreCase("Fahrenheit")){
               System.out.println("What is the temperature?");
               temp=scan.nextDouble();
               System.out.println("The temperature in Fahrenheit is "+kelvinToFahrenheit(temp));
            }                 
      }
      
      //Starting unit in Celsius      
      else if(answer.equalsIgnoreCase("Celsius")){
         System.out.println("Are you converting to Kelvin or Fahnrenheit?");
         answer2=scan.nextLine();
         
         //Input validation
         while(!answer2.equalsIgnoreCase("Kelvin") && !answer2.equalsIgnoreCase("Fahrenheit")){
               System.out.println("Error. Try again.");
               answer2=scan.nextLine();
            }
            
         //Celsius to Kelvin
         if(answer2.equalsIgnoreCase("Kelvin")){
            System.out.println("What is the temperature?");
            temp=scan.nextDouble();
            System.out.println("The temperature in Kelvin is "+celsiusToKelvin(temp));
         }
         
         //Celsius to Fahrenheit
         else if (answer2.equalsIgnoreCase("Fahrenheit")){
            System.out.println("What is the temperature?");
            temp=scan.nextDouble();
            System.out.println("The temperature in Fahrenheit is "+celsiusToFahrenheit(temp));
         }
      }
      
      //Starting unit in Fahrenheit
      else if(answer.equalsIgnoreCase("Fahrenheit")){
         System.out.println("Are you converting to Kelvin or Celsius?");
         answer2=scan.nextLine();
         
         //Input validation
         while(!answer2.equalsIgnoreCase("Kelvin") && !answer2.equalsIgnoreCase("Celsius")){
            System.out.println("Error. Try again.");
            answer2=scan.nextLine();
         }
         
         //Fahrenheit to Kelvin
         if(answer2.equalsIgnoreCase("Kelvin")){
            System.out.println("What is the temperature?");
            temp=scan.nextDouble();
            System.out.println("The temperature in Kelvin is "+fahrenheitToKelvin(temp));
         }
         
         //Fahrenheit to Celsius
         else if(answer2.equalsIgnoreCase("Celsius")){
            System.out.println("What is the temperature?");
            temp=scan.nextDouble();
            System.out.println("The temperature in Celsius is "+fahrenheitToCelsius(temp));
         }
      }
   }

   //Static method to convert Fahrenheit to Celsius
   public static double fahrenheitToCelsius(double f){
   
      return ((f-32)*5)/9;
   
   }
   
   //Static method to convert Fahrenheit to Kelvin
   public static double fahrenheitToKelvin(double f){
   
      return (((f-32)*5)/9) + 273.15;
   
   }
   
   //Static method to convert Celsius to Fahrenheit
   public static double celsiusToFahrenheit(double c){
   
      return ((c*9)/5)+32;
   
   }
   
   //Static method to convert Celsius to Kelvin
   public static double celsiusToKelvin(double c){
   
      return c+273.15;
   
   }
   
   //Static method to convert Kelvin to Fahrenheit
   public static double kelvinToFahrenheit(double k){
   
      return (((k-273.15)*9)/5)+32;
   
   }
   
   //Static method to convert Kelvin to Celsius
   public static double kelvinToCelsius(double k){
   
      return k-273.15;
   
   }

}

/** Sample Output:
Is the starting temperature in Kelvin, Celsius, or Fahrenheit?
Kelvin
Are you converting to Celsius or Fahrenheit?
Fahrenheit
What is the temperature?
45
The temperature in Fahrenheit is -378.66999999999996
**/
