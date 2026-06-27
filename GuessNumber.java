import java.util.Scanner;
public class GuessNumber{
    public static void guess(){
        Scanner sc=new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int k=7;
        System.out.println("generate a random number between a predifined range 1 to 100");
        System.out.println("you have "+ k +" attempts to guess the correct number ");
        for(int i=0;i<k;i++){
            System.out.print("Enter your guess: ");
            int guess=sc.nextInt();
            if(guess==number){
                System.out.println("you win");
                sc.close();
                return;//we have to exit if u guess correctly
            }else if(guess>number){
                System.out.println("your guess is higher");
            }else{
                System.out.println("your guess is lower");
            }
        }
        System.out.println("all attempts are exhausted, the game reveals the correct number:"+number);
        sc.close();            
        }
        public static void main(String[] args){
            guess();
        }


    }
    

