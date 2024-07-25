/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


class Node
{
       private Node next,pre;
 private Customer customer; 
    public Node(Node next, Node pre, Customer customer) {
        this.next = next;
        this.pre = pre;
        this.customer = customer;
    }

    public Node() {
    next=null;
    pre=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
             
        

}

public class LinkedList {

    Node head,tail;
    
    public LinkedList() {
       this.head=null;
       this.tail=null;
    
    }
    
    
    
     public void insert(Customer customer)
     {
            Node node= new Node();
             node.setCustomer(customer);
       
         if(head==null||tail==null)
       {
              head=node;
              tail=node;
       
       }       
       else
       {
             head.setNext(node);
             node.setPre(head);
             head=node;
       }
     }
     
    
    public int size()
     {
           Node temp=head;
           int size=0;
           while(temp!=null)
           {
              size++;
               temp=temp.getPre();
           
           }
           return size;
     
     }
    
     public String allData()
     {
           Node temp=head;
           String data="";
           while(temp!=null)
           {
               data+=temp.getCustomer().toString()+"\n";
               temp=temp.getPre();
           
           }
           return data;
     
     }

    boolean isExist(String text) {
      Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getNic()))
               {
                   return true;
               }
               temp=temp.getPre();
           
           }
           return false;
    }

    String nicInfo(String text) {
         Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getNic()))
               {
                   return "\nNIC                           ="+temp.getCustomer().getNic()
                         +"\nName                          ="+temp.getCustomer().getName()
                         +"\nPIN                           ="+temp.getCustomer().getPin()                        
                         +"\nBalance                       ="+temp.getCustomer().getBalance();
                                 
               }
               temp=temp.getPre();
           
           }
           return "";
    }

    String Deposit(String text, double amount) {
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getNic()))
               {
                   temp.getCustomer().deposit(amount);
                   
                  return ""; 
               }
               
               temp=temp.getPre();
           
           }
           return "";
    
    }

    void Withraw(Customer cuss) {
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(cuss.getNic().equals(temp.getCustomer().getNic()))
               {
                   temp.setCustomer(cuss);
                   break;
               }
               
               temp=temp.getPre();
           
           }
    
    }

    
    
    Customer checkPInCard(String text) {
    
    
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getPin()+"")){
                   return temp.getCustomer();
               }
               
               temp=temp.getPre();
           
           }
           return null;
    
    }
    
}
