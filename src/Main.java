import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose an assignment");
        int choose=scanner.nextInt();
        switch(choose){
            case 1:
                executeFirstTask(scanner);
                System.exit(0);
            case 2:
                executeSecondTask(scanner);
                System.exit(0);
            case 3:
                executeThirdTask(scanner);
                System.exit(0);
            case 4:
                executeFourthTask(scanner);
                System.exit(0);
            case 5:
                executeFifthTask(scanner);
                System.exit(0);
            case 6:
                executeSixthTask(scanner);
                System.exit(0);
            case 7:
                executeSeventhTask(scanner);
                System.exit(0);
            case 8:
                executeEighthTask(scanner);
                System.exit(0);
            case 9:
                executeNinthTask(scanner);
                System.exit(0);
            case 10:
                executeTenthTask(scanner);
                System.exit(0);
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
    public static void executeSixthTask(Scanner scanner){
        System.out.println("Write a number to find power");
        int a=scanner.nextInt();
        System.out.println("Write a power");
        int n=scanner.nextInt();
        int total=1;
        long startTime = System.currentTimeMillis();
        System.out.println(findPower(n,a,total));
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");
    }
    public static void executeSeventhTask(Scanner scanner){
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        long startTime = System.currentTimeMillis();
        reverseList(n, scanner);
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");
    }
    public static void executeEighthTask(Scanner scanner){
        System.out.print("Enter the string for checking it on digits");
        String s= scanner.nextLine();
        int n=s.length();
        long startTime = System.currentTimeMillis();
        System.out.println("Is "+s+"consist only digigts: " +findDigit(n-1,s));
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");

    }
    public static void executeNinthTask(Scanner scanner){
        System.out.println("To find binomial coefficient enter n an k");
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        long startTime = System.currentTimeMillis();
        System.out.println("Answer: "+binomialCoefficient(n,k));
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");
    }
    public static void executeTenthTask(Scanner scanner){
        System.out.println("To find GCD enter n an k");
        System.out.print("Enter n:");
        int n=scanner.nextInt();
        System.out.print("Enter k:");
        int k=scanner.nextInt();
        long startTime = System.currentTimeMillis();
        System.out.println("Answer: "+findGCD(n,k));
        long endTime = System.currentTimeMillis();
        long time =endTime - startTime;
        System.out.println("execution time: " + time + "ms");
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    public static Boolean findDigit(int n,String s){
        if(n>=0){
            if(!Character.isDigit(s.charAt(n))){
                return false;
            }
            n-=1;
            findDigit(n,s);
        }
        return true;
    }
    public static void reverseList(int n, Scanner scanner){
        if (n==0){
            return;
        }
        int number = scanner.nextInt();
        reverseList(n-1, scanner);
        System.out.print(number + " ");
    }

    public static int findPower(int n, int a,int total){
        if(n>0){
            total*=a;
            n-=1;
            return findPower(n,a,total);
        }
        return total;
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