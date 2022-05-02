package dsa_day_05;
public class Head_Recution {

    void Head_Recursion_function(int i) {
       if(i>0){
           Head_Recursion_function(i-1); //recursion
           System.out.println(i);
       }
    }
    
}
