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
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}