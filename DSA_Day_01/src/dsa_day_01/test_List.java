
package dsa_day_01;

public class test_List {
    public static void main(String[] args) {
    Node rootNode=new Node();//x->n.x->
    rootNode. val=1000;
    rootNode.n=new Node();
    
    rootNode.n.val=200;
    rootNode.n.n=new Node();
    
    System.out.println("val:"+rootNode.val);
    System.out.println("n val:"+rootNode.n.val);
    System.out.println("n n val:"+rootNode.n.n.val);  
    
    
    
    int[] x=new int[10];//[1000,200,null,null,nul..]
    x[0]=100;
    x[1]=200;
    }
    
    
    
}
