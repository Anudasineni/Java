import java.util.Scanner;

class Rectangle{
    int len;
    int bre;
    void setDetails(int length,int breadth){
     len=length;
     bre=breadth;
    }
    public void displayDetails(){
        System.out.println(len*bre);
    }
}

public class ObjectArrayExample {
    public static void main(String args[]) {
        Rectangle[] rect = new Rectangle[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("rectangle " + (i + 1));
            System.out.println("Enter length");
            int length = s.nextInt();
            System.out.println("Enter breadth");
            int breadth = s.nextInt();
            rect[i] = new Rectangle();
            rect[i].setDetails(length, breadth);
        }
        for (int i=0;i<2;i++){
            rect[i].displayDetails();
        }
    }
}
