import java.util.*;
class Item{
  int profit,weight;
  double ratio;
  Item(int profit,int weight){
    this.weight = weight;
    this.profit = profit;
    ratio = (double)profit/weight;
  }
}
class Knapsack{
  public static double ourProfit(Item[] items,int m){
    double profit = 0.0;
  Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
  for(Item item : items){
      if(item.weight<=m){
        profit+=item.profit;
        m-=item.weight;
      }
      else{
        double fraction = (double)m/item.weight;
        profit+=item.profit*fraction;
        break;
      }
    }
    return profit;
  }
  public static void main (String[] args) {
    Item[] items = {new Item(25,18),new Item(24,15),new Item(15,10)};
    int m = 20;
    System.out.println("All items are inserted in to the bag");
    System.out.println("The maximum profit obtained is :");
    double maxprofit = ourProfit(items,m);
    System.out.println(maxprofit);
  }
}
