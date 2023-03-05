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
    }
}