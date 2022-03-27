//Object Array holds different type of objects.
class person{
    int h;
    int w;

    public person(int i, int i1) {
        h=i;
        w=i1;
    }

    public String toString(){
    return  "height:"+ h +" " +"weight:"+w;
    }
}
class Product {
   public int rate;
  public   int discount;

    public Product(int rate, int discount) {
        this.rate=rate;
        this.discount=discount;
    }

    public String toString(){
        return ("Rate:"+this.rate+"Discount:"+this.discount);
    }
}

public class ObjectArray {
    public static void main(String args[]){
        person obj1=new person(5,50);
        Product obj2=new Product(500,50);
        person obj3;
        obj3=new person(6,80);
        Object[] arr={obj1,obj2,obj3};
        for (Object o: arr) {

            System.out.println(o);
        }
    }
}
