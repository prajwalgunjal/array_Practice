package com.bridgelabz.array;
import java.util.Scanner;
public class arrayOperations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter elements of array :");
        for(int i=0;i<arr.length;i++)
        {
            int element = sc.nextInt();
            arr[i]=element;
        }

        System.out.println("\t ********************");
        System.out.println("all elements in array :");
        System.out.println("********************");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        int biggest = arr[0];
        for (int i = 1;i<arr.length;i++)
        {
            if(biggest<arr[i])
            {
                biggest=arr[i];
            }
        }
        System.out.println("********************");
        System.out.println("Biggest number from the array is :-" +biggest);
        System.out.println("********************");
        int smallest = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element from the array is "+smallest);

        System.out.println("********************");
        System.out.println("Element which are present on even location");
        System.out.println("********************");
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                System.out.print(" "+arr[i]);
            }
        }
        System.out.println("********************");
        System.out.println("Print array in reverse order:- ");
        System.out.println("********************");
        for(int i=arr.length-1;i>arr[0];i--)
        {
            System.out.println(" "+arr[i]);
        }
        System.out.println("********************");
        System.out.println("Printing odd position number:- ");
        System.out.println("********************");
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0) {
                System.out.print(" "+arr[i]);
            }
        }
        System.out.println("********************");
        System.out.println("Duplicate element of aray :- ");
        System.out.println("********************");


        for(int i=1;i<=arr.length;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {

                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i] + "is a duplicate entry in tthe array");
                    }
            }
        }
        System.out.println("********************");
        System.out.println("Sorting of array");
        System.out.println("********************");
        int temp =0;
        int a,b;
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("after sorting array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("second largest element of the array is " +arr[arr.length-2]);

    }
}
