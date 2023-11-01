public class ExceptionalHandling {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println("Before Exception");
        try{
            int c=a/b;
        }
        // finally{
        //     System.out.println("Finally Block");
        // }
        
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        //Exception is super class of all Exceptions
        catch(Exception e){
            System.out.println(e);
            System.out.println("Last Exception block");
        }
        System.out.println("After Exception");
    }
}
