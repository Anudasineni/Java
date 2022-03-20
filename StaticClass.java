public class StaticClass {
    static String s="curry";
    int age=22;
    //Static class
    static class SampleStatic{
        //static int age=22;
        public void disp(){
            System.out.println(s);//only static variables can access inside the static class.
            //System.out.println(age);we cannot access non-static variable of outer class in static class.
        }
        public static void main(String args[]){
            SampleStatic object=new SampleStatic();
            object.disp();
            System.out.println(s);

        }
    }

}

