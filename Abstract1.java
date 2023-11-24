//Implementing the abstract class and calling the abstract method in main class
abstract class A {
    int a=10;
    void disp(){
        System.out.println("Normal or concrete method");
    }
    abstract void help();
}
//Name of file should be saved where main method is present
class Abstract1 extends A{
    void help(){
        System.out.println("Abstract method help");
    }
    public static void main(String[] args) {
        Abstract1 ob=new Abstract1();
        ob.help();
        ob.disp();
    }
}
