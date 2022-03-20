public class InheritanceExample {
    //let assume InheritanceExample is Employer
    /*single,multilevel,hierarchy inheritance
     *single=>base->derived
     * multilevel=>base->derived(parent,child)->derived1
     * hierarchy=>base->derived,derived1
     */
    String Company="hcl";
    private String role="Software Engineer";
    void show(){
        System.out.println("Role is "+role);
    }

}
class Employee extends InheritanceExample{

       int empid=524412;
       String name="anusha";

    public static void main(String args[]){
        Employee obj=new Employee();
        System.out.printf("%s working in %s and her employee id is %d",obj.name,obj.Company,obj.empid);
        obj.show();
       // System.out.println("Role is "+obj.role);//cant access private variable

    }
}
