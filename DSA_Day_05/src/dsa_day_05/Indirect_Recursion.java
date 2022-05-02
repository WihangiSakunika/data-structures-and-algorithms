package dsa_day_05;
public class Indirect_Recursion {
   public void Function_1(int x){
    System.out.println("Function 1: "+x);
   Function_2(x-1);
   } 
   
   public void Function_2(int y){
    System.out.println("Function 2: "+y);
   Function_3(y);
   } 
   public void Function_3(int z){
       Function_1(z);
    System.out.println("Function 3: "+z);
   
   } 

    public static void main(String[] args) {
        new Indirect_Recursion().Function_1(10);
    }
}
