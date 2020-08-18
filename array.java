import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
class array{
    private static void check(int[] arr, int toCheckValue){
        boolean test = IntStream.of(arr).anyMatch(x -> x == toCheckValue);
        if (test == true){
            System.out.println(toCheckValue+" is found at index "+findIndex(arr, toCheckValue));
        }else{
            System.out.println(toCheckValue+" is not found in the array");
        }
    }
    public static int findIndex(int arr[], int toCheckValue){
          if (arr == null) { 
            return -1; 
        } 
        int len = arr.length; 
        int i = 0; 
        while (i < len) { 
            if (arr[i] == toCheckValue) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    }
    public static void main(String[] args) {
    int arr[]=new int[15];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements");
        for(int i=0; i<15;i++){
          arr[i]=sc.nextInt();
        }
    System.out.println("index : ");
    int toCheckValue = sc.nextInt();
    System.out.println("Array:" + Arrays.toString(arr));
    check(arr, toCheckValue);

    System.out.println("Original Array:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + "  ");
     
    System.out.println();
     
    
    System.out.println("Original Array printed in reverse order:");
         for(int i=arr.length-1;i>=0;i--)
         System.out.print(arr[i] + "  ");

    int summation = 0;
    int prod = 1;
        for (int i: arr){
            summation += i;
            prod *= i;
        }
    System.out.println("\n the sum of the array is :"+summation);
    System.out.println("\n the product of the array is :"+prod);
    System.out.println("\n Enter no to be checked if palindrome : ");
    int r,sum=0,temp;
    Scanner bc =new Scanner(System.in);
    int n = bc.nextInt();
    temp=n;    
        while(n>0){    
            r=n%10; 
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        if(temp==sum){  
            System.out.println("The number is a palindrome ");    
        }else{
            System.out.println("The number is not a palindrome"); 
        }   
  } 
}