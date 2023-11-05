 //Invoking the constructor of parent class
 import java.util.*;
 class sd {
    sd(){
        System.out.println("Non-Parameterised constructor of sd class");
    }
    sd(int a,int b){
        System.out.println("Parameterised constructor of sd class"+(a+b));
    }
    void help(){
        System.out.println("Help method of sd class");
    }
}
class a3 extends sd{
    a3(){
        super(10,15);
        System.out.println("Non-Parameterised constructor of A3 class");
    }
    a3(int a,int b){
        System.out.println("Parameterised constructor of A3"+(a+b));
    }
    public static void main(String[] args) {
        a3 ob=new a3(2,4);
    }
}
