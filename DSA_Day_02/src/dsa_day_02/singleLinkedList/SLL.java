package dsa_day_02.singleLinkedList;
public class SLL {
    Node head=null;//root node
    Node tail= null;//last node
     
    public void Add(int val){
     Node nn =   new Node(val);
        if (head==null) {//empty list
            head=nn;
            tail=nn;
        }
        else{
        tail.n=nn;
        }
    }
    public  void view() {
       Node c=head;
        while (c!=null) {            
            System.out.println(c.data);
            c=c.n;
        }
    }
    public  Node get(int position){
    Node c=head;
    for(int x=1;x<position;x++){
        //System.out.println(c.data);
        c=c.n;
    }
    return c;
    }
    public void set(int position,int val){
    Node newval= new Node(val);
    Node x=get (position);
    int oldval=x.data;
    x.data=newval.data;
    
    }
    public void remove(int position){
    Node x=get(position);
    Node next=x.n;
    x.n=next;
    }
    public static void main(String[] args) {
      SLL list=new SLL(); 
      list.Add(10);
      list.Add(132);
      list.Add(4430);
      list.Add(45);
      list.Add(30); 
      
      list.set(2,11111);
      list.view();
        System.out.println(list.get(2).data);
    }
}
