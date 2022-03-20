import java.util.Scanner;
public class operators {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println(("Enter a number"));
        a=s.nextInt();
        System.out.println(("Enter second number"));
        b=s.nextInt();
        System.out.printf("%d %d %d",a+b,a-b,a*b);//arithmetic operators

        System.out.println(a/b);
        System.out.println(a%b);
        if(a==10 && b==20){              //logical and ,or
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if(a==10 || b==21){              //logical and ,or
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if(a==10 | b==2){              //bitwise and ,or
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if(a==10 & b==20){              //bitwise and ,or
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        //unary operator(post increment==>first it will return the value and it increase) and pre increment)
        int d=13;
        int e=15;
        System.out.printf("d:%d e:%d",d++,++e);
        System.out.printf("d:%d ",d++ +e++);
        System.out.printf("d:%d",d++ + e++);

        //left shift and right shift
        System.out.printf("%d %d",a<<1,b>>2);//a<<1=10*2^1=20.b>>2=20/2^2=5
    }
}

