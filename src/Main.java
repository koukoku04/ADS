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

            case 5:

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
//        long startTime = currentTimeMillis();
//long endTime   = currentTimeMillis();
//System.out.println(endTime - startTime);
        for (int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        System.out.println(findMin(n,array,index,min));
    }
    public static void executeSecondTask(Scanner scanner){
        System.out.println("Write a length of list");
        int n=scanner.nextInt();
        int index=0;
        int total=0;
        System.out.println("Iterate a list");
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i]=scanner.nextInt();
            total=total+array[i];
        }
        System.out.println(total/n);
    }
    public static void executeThirdTask(Scanner scanner){
        System.out.println("Write a number to check it on prime");
        int n=scanner.nextInt();
        int temp=0;
        for (int i=2; i<=n/2;i++){
            if(n%i==0){
                temp+=1;
            }
        }
        if(temp>0){
            System.out.println(n+" is a composite number");
        }
        else System.out.println(n+" is a prime number");
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