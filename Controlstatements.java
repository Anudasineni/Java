import java.util.Scanner;

public class Controlstatements {
    public static void main(String args[]) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks");
        a = s.nextInt();
        if (a >= 75) {
            System.out.println("passed in first class");
        } else if (a > 50 && a < 75) {
            System.out.println("passed in second class");
        } else {
            System.out.println("just passed");
        }
        int i;
        int sum = 0;
        for (i = 0; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            sum = sum + i;
        }
        System.out.printf("The total sum is %d", sum);
        int j = 1;
        switch(j) {
            case 1:
                System.out.println(j);
                break;
            case 2:
                System.out.println(j);
                break;
            case 3:
                System.out.println((j));
                break;

        }
        //while loop
       while(j<4) {
           System.out.println("hi");
           j++;
       }
       //for-each
        String[] cities={"london","texas","florida","sydney"};
       int[] numbers={1,2,3,4,5,6};
        for(int city:numbers){
            System.out.println(city);
        }
        }
    }


