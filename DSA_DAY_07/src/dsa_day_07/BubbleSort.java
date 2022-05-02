package dsa_day_07;
public class BubbleSort {
    public void bubbleSort(int[]array){
     int n=array.length;//get array lenght
     System.out.println("array lenght: "+n);
     
     for(int i=0;i<(n-1);i++){
     System.out.println(array[i]);}
    }
    
    
    public static void main(String[] args) {
        int[] data=new int[]{4,5,3,424,433,345,33};
       BubbleSort b= new BubbleSort();
       b.bubbleSort(data);
    }
}
