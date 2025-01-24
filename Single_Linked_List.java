import java.util.*;
class SLL{
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static class Linkedlist{
    Node headnode = null;
    Node tailnode = null;
    
  //-------------------------------------------
    
    public void insertAtend(int data){
      Node node = new Node(data);
      if(headnode == null){
        headnode = node;
        tailnode = node;
      }
      else{
        tailnode.next = node;
        tailnode = node;
      }
    }
    
  //-------------------------------------------  
    
    public void insertAtstart(int data){
      Node node = new Node(data);
      if(headnode == null){
        headnode = node;
        tailnode = node;
      }
      else{
        node.next = headnode;
        headnode = node;
      }

    }
    
  //-------------------------------------------  
   public void deleteAtstart() {
    if (headnode == null) {
        System.out.println("Nothing to delete");
        return;
    }
    headnode = headnode.next;
    if (headnode == null) {
        tailnode = null; 
    }
    System.out.println("Node deleted at the start");
}

  //---------------------------------------------
  public void deleteAtend(){
    if(headnode == null){
      System.out.println("Nothing to delete");
    }
    if(headnode.next == null){
      headnode = null;
      tailnode = null;
    }
    else{
      Node temp = headnode;
      while(temp.next != null && temp.next.next != null){
        temp = temp.next;
      }
      temp.next = null;
      tailnode = temp;
    }
    System.out.println("Node deleted at end");
  }

  //-----------------------------------------------

    public void display(){
        System.out.print("The List  : ");
      if(headnode == null){
          System.out.println("Empty.");
        }
      else{
      Node temp;
      temp = headnode;
      while(temp != null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("end");
  }
 }
}

//-------------------------------------------

  public static void main(String args[]){
    Linkedlist ll = new Linkedlist();
    Scanner sc = new Scanner(System.in);
    char ch;
    do{
    System.out.println("Do you want to proceed :");
    ch = sc.next().charAt(0);
    System.out.println("Choose any of the following:\n 0.display LL\n 1.InsertAtStart of LL \n 2.InsertAtEnd of LL \n 3.DeleteAtStart.\n 4.DeleteAtEnd");
    System.out.print("CHOOSE :");
    int n = sc.nextInt();
    switch(n){
      case 0 -> ll.display();
      case 1 -> {
          System.out.println("Enter number:");
          int num = sc.nextInt();
          ll.insertAtstart(num);
          System.out.println("Entered..");
            }
       case 2 -> {
           System.out.println("Enter number:");
           int num1 = sc.nextInt();
           ll.insertAtend(num1);
           System.out.println("Entered..");
            }
        case 3 -> ll.deleteAtstart();
        case 4 -> ll.deleteAtend();
      }
    }while(ch == 'Y' || ch == 'y');
  }
}
