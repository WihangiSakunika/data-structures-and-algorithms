package dsa_day_05;
public class Trail_Recution {

    void Trail_Recursion_function(int i) {
         if(i>0){
             System.out.println(i);
                Trail_Recursion_function(i-1); //recursion
         }
           
    }
    
}
