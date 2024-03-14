import java.util.*

public class ColecoCount{
        public static void main(String[] args){

   Scanner userInput = new Scanner(System.in);

   int userNumber = userInput.nextInt();


   switch(userNumber){
       case 10:
             System.out.println("10");
       case 9:
             System.out.println("9");  
       case 8:
             System.out.println("8"); 
       case 7:
             System.out.println("7");
       case 6:
             System.out.println("6");
       case 5:
             System.out.println("5");
       case 4:
             System.out.println("4");
       case 3:
             System.out.println("3");
       case 2:
             System.out.println("2");
       case 1:
             System.out.println("1");
       }
}

}