import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;
import java.io.*;
//import org.apache.commons.lang3.time.StopWatch;
//long startTime = currentTimeMillis();
//long endTime   = currentTimeMillis();
//System.out.println(endTime - startTime);

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose an assignment");
        int choose=scanner.nextInt();
        switch(choose){
            case 1:
                executeFirstTask(scanner);
            case 2:
                executeSecondTask(scanner);
            case 3:
                executeThirdTask(scanner);
            case 4:
                executeFourthTask(scanner);
            case 5:
                executeFifthTask(scanner);
            case 6:

            case 7:

            case 8:

            case 9:

            case 10:

        }


    }
    public static void executeFirstTask(Scanner scanner){
        System.out.println("Write a length of list");
        int n=scanner.nextInt();
        int index=0;
        System.out.println("Iterate a list");
        int[] array = new int[n];


        for (int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        long startTime = System.currentTimeMillis();
        System.out.println(findMin(n,array,index,min));
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");
    }
    public static void executeSecondTask(Scanner scanner){
        System.out.println("Write a length of list");
        int n=scanner.nextInt();
        int total=0;
        System.out.println("Iterate a list");
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        long startTime = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            total=total+array[i];
        }
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");
        System.out.println(total/n);
    }
    public static void executeThirdTask(Scanner scanner){
        System.out.println("Write a number to check it on prime");
        int n=scanner.nextInt();
        int temp=0;
        long startTime = System.currentTimeMillis();
        for (int i=2; i<=n/2;i++){
            if(n%i==0){
                temp+=1;
            }
        }
        if(temp>0){
            System.out.println(n+" is a composite number");
            long endTime = System.currentTimeMillis();
            long time =endTime - startTime;
            System.out.println("execution time: " + time + "ms");
        }
        else{
            System.out.println(n+" is a prime number");
            long endTime = System.currentTimeMillis();
            long time =endTime - startTime;
            System.out.println("execution time: " + time + "ms");
        }
    }
    public static void executeFourthTask(Scanner scanner){
        System.out.println("Write a number to check find factorial");
        int n=scanner.nextInt();
        int total=1;
        long startTime = System.currentTimeMillis();
        System.out.println(findFactorial(n,total));
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");

    }
    public static void executeFifthTask(Scanner scanner){
        System.out.println("Write a number to find n-th elements in Fibonacci sequence");
        int n=scanner.nextInt();
        long startTime = System.currentTimeMillis();
        int fibNumber = findFibonacciNumber(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fibNumber);
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");
    }
    public static int findFibonacciNumber(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacciNumber(n - 1) + findFibonacciNumber(n - 2);
        }
    }
    public static int findFactorial(int n,int total){
        if(n>0){
            total=total*n;
            n-=1;
            return findFactorial(n,total);
        }
        return total;
    }

    public static int findMin(int n,int[] array,int index,int min){
        if(index!=n){
            if(array[index]<min){
                min=array[index];
            }
            index=index+1;
            return findMin(n,array,index,min);
        }
        return min;
    }
}