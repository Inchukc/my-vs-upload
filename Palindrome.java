 import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int left=0;
        int right=A.length()-1;
        boolean string=true;
        while(left<right){
            if(A.charAt(left)  != A.charAt(right)){
                string=false;
                break;
            }
                left++;
                right--;
        }if(string){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }
    }
}
    

