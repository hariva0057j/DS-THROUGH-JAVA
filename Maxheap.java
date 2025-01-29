class Mheap {
   class Heap{
        int heapsize,maxsize;
        int a[];
        public Heap(int maxsize){
            this.maxsize = maxsize;
            heapsize = 0;
            a = new int[maxsize];
        }
        public int lchild(int i){
            return 2*i+1;
        }
        public int rchild(int i){
            return 2*i+2;
        }
        public int parent(int i){
            return (i-1)/2;
    
        }
    }
    public static void insert(Heap heap,int num){
        if(heap.heapsize == heap.maxsize){
            System.out.println("Heap Overflow");
        }
        else{
            heap.a[heap.heapsize] = num;
            int i = heap.heapsize;
            heap.heapsize++;
            while(i!=0 && heap.a[heap.parent(i)]<heap.a[i]){
                int temp = heap.a[i];
                heap.a[i] = heap.a[heap.parent(i)];
                heap.a[heap.parent(i)] = temp;
                i = heap.parent(i);
            }
        }
    }
    public static void removemax(Heap heap){
        if(heap.heapsize == 0){
            System.out.println("Heap Underflow");
        }
        else if(heap.heapsize == 1){
            heap.heapsize--;
        }
        else{
            heap.a[0] = heap.a[heap.heapsize-1];
            heap.heapsize--;
            Heapify(heap,0);
        }
    }
    public static void Heapify(Heap heap,int i){
      int l = heap.lchild(i);
      int r = heap.rchild(i);
      int largest = i;
      if(l<heap.heapsize && heap.a[l] > heap.a[largest]){
        largest = l;
      }
      if(largest != i){
        int temp = heap.a[i];
        heap.a[i] = heap.a[largest];
        heap.a[largest] = temp;
        Heapify(heap,largest);
      }
    }
    public static void dis(Heap heap){
      if(heap.heapsize == 0){
        System.out.println("No data in the heap");
      }
      else{
          System.out.println("The heap is:");
        for(int i=0;i<heap.heapsize;i++){
          System.out.println(heap.a[i]);
        }
      }
    }
    public static void main(String [] args) {
      Mheap mheap = new Mheap();
        Heap heap = mheap.new Heap(5);
        insert(heap,10);
        insert(heap,23);
        insert(heap,34);
        insert(heap,213);
        insert(heap,33);
        dis(heap);
        System.out.println();
        removemax(heap);
        System.out.println("After removing the max element ");
        dis(heap);
    }
}
