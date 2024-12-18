class Stack{
    public int[] sarray ;
    public int top;
    public int size;
    Stack(int size){
        this.size = size;
        sarray = new int[size];
        top = -1;
    }
    void push(int data){
        if(top == size-1){
            System.out.println("Stack is full!!!");
        }
        else{
            top = top + 1;
            sarray[top] = data;
            System.out.println(data +" is inserted.");
        }
    }
  int pop() {
        if (top == -1) {   
            System.out.println("No elements found. Stack underflow");
            return -1;
        } 
        else {
            int poppedValue = sarray[top];  
            top--;
            return poppedValue;
            
        }
    }
    void display(){
      System.out.println("The Stack is :");
        if(top == -1){
            System.out.println("Stack is empty.");
        }
        else{
             int peek=top;
            while(peek >= 0){
                System.out.println(sarray[peek]);
                peek = peek-1;
            }
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.display();


    }
}
