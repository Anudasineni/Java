public class StringBufferExample {
    public static void main(String args[]){
        StringBuffer str=new StringBuffer("hcl");
        StringBuffer str1=new StringBuffer("hcl");
        System.out.println(str==str1);//prints fasle.because both str and str1 references pointing to the different object.

        System.out.println(str.equals(str1));//prints false.In StringBuffer class equals() method is used to check address or location of object.

        System.out.println( str.append(" company"));//hcl company
        System.out.println( str.insert(3,"tech"));//hcltech comapany
        System.out.println( str.delete(3,7));//hcl company
        System.out.println( str.replace(4,6,"tech"));//hcl techmpany
        System.out.println( str.insert(8," co"));//hcl tech company
        System.out.println(str.substring(3));//tech company
        System.out.println(str.subSequence(0,8));
        System.out.println( str.reverse());


    }
}
