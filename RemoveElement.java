import java.util.Scanner;
public class RemoveElement {
    public static int removeElement(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the array size:");
            int n=sc.nextInt();
            int[] nums=new int[n];
            System.out.println("Enter array lements:");
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            System.out.println("enter val to remove:");
            int val=sc.nextInt();
            int k=removeElement(nums,val);
            System.out.println("Number of elements left:"+k);
            System.out.print("Updated array:");
            for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
            }
            sc.close();
        }
    }


