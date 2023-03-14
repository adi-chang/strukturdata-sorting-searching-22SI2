/*
 QUESTION:
 LENGKAPI METHOD SORT AGAR DAPAT BERFUNGSI DENGAN BAIK
 */

package latihan;


public class Latihan01 {

   // READONLY - JANGAN DIUBAH ISI FUNGSI MAIN INI
   public static void main(String[] args) {
      String[] arrNama = {"Budi", "Katty", "Susan", "Juliana", "Andi", "Linda", "Rose"};
      // create arraylist object 
      var list = new ArrayList();
      // add some item to arraylist
      for (String item : arrNama) {
         System.out.println("add item dengan nama: " + item);
         list.add(item);
      }
      System.out.println();
      System.out.println("list items:");
      System.out.println(list);

      // sort items in arraylist
      list.sort();

      // after sorting arraylist ? 
      System.out.println("list items after sorting:");
      System.out.println(list);

   }  

}


class ArrayList {
   
   private String[] arr;
   private int capacity;
   private int count;

   private final int INITIAL_CAPACITY = 10;

   public ArrayList() {
      capacity = INITIAL_CAPACITY;
      arr = new String[capacity];
      count = 0;
   }

   public boolean isEmpty() { return count == 0; }
   public boolean isFull() { return count == capacity; }

   public void add(String nama) {
      if (!isFull()) { 
         arr[count++] = nama;
      }
   }

   // lengkapi method sort ini, 
   // untuk bisa melakukan sorting terhadap elemen data dalam list 
   public void sort() {
      // your code here
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      if (!isEmpty()) {
         for (int i = 0; i < count; i++) {
            sb.append(String.format("%2d. %s\n", i+1, arr[i]));
         }
      }
      return sb.toString();
   }

}


