public class StaticBlock {
    /*STATIC BLOCK==>class can have multiple static blocks .
     * static block will execute in the same sequence in which they have written(e order lo rasthe aa order lone print avvuthai)
     *single static block
     */
    static  int num; //static var
    static  String str;
    //1st static block (used to initiliaze  static variables)
    static {
        System.out.println("block1");
        num=2;
        str="anu";
    }
    //block 2
    static {
        System.out.println("block2");
        num=11;
        str="anusha";
    }

    public static void main(String args[]){
        System.out.println(num + str); //block 1 values over written by second block which means the block 1 will execute first before second block execute.

    }
}
