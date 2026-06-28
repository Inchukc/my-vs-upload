import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String[] array= new String[size];
        int toLength=0;
        for(int i=0;i<size;i++){
            System.out.println("Enter the string "+ (i + 1) + ": ");
            array[i]=sc.next();
            toLength +=array[i].length();
        }
        System.out.println(toLength);
        sc.close();
    }
    
}
