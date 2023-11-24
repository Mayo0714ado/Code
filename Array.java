
package ArrayClass;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        countryArray();
    }
    
    public static void countryArray(){
        Scanner scanner = new Scanner(System.in);
        
        
        String[] countries = {
            "Malaysia", "Indonesia", "India", "Japan", "Thailand", "South Korea", "China", "Myanmar", 
            "Philippines", "Nepal", "Vietnam", "Singapore", "Cambodia", "Laos", "Kazakhstan", 
        };
        
        System.out.print("Search for your country: ");
        String search = scanner.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < countries.length; i++){
            if(countries[i].toLowerCase().contains(search.toLowerCase())){
                System.out.printf("Your country: %s is Top %d ", countries[i], i + 1);
                found = true;
            }
        }
        if(!found){
            System.out.println("Your country: " + search + " is not on the list");
            System.out.println("Here's a list for 15 asian countries");
            
            for(int j = 0; j < countries.length; j++){
                System.out.printf("Top %d: %s%n", j + 1, countries[j]);
            }
        }
    }
    
}
