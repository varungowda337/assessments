import java.util.*;
public class maingame {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int copies;
        boolean a=true;
        System.out.println("Choose a number ");
        System.out.println("1. Call of Warfare - ₹1500");
        System.out.println("2.Speed Racers - ₹1200");
        System.out.println("3.Mystery Mansion - ₹1000");
        System.out.println("4.Pixel Adventure - ₹800\r");
        System.out.println("5.Puzzle Mania - ₹500");
        System.out.println("6 exit");
        int number=scan.nextInt();
        while(a=true){
            switch(number){
                case 1:{
                    System.out.println("1. Call of Warfare - ₹1500");
                    System.out.println("enter the copies required");
                    copies=scan.nextInt();
                    
                break;
                }
                case 2:{
                    System.out.println("2.Speed Racers - ₹1200");
                    System.out.println("enter the copies required");
                    copies=scan.nextInt();
            
                    break;
                }
                case 3:{
                    System.out.println("3.Mystery Mansion - ₹1000");
                    System.out.println("enter the copies required");
                    copies=scan.nextInt();
                   
                    break;
                }
                case 4:{
                    System.out.println("4.Pixel Adventure - ₹800\r");
                    System.out.println("enter the copies required");
                    copies=scan.nextInt();
                   
                    break;
                }
                case 5:{
                    System.out.println("5.Puzzle Mania - ₹500");
                    System.out.println("enter the copies required");
                    copies=scan.nextInt();
                    break;
                }
                case 6:{
                    a=false;
                    break;
                }
                default:System.out.println("Enter a valid number");
            }
          
        }
    }
    }
    

