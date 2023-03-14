/*
 QUESTION:
 LENGKAPI METHOD SORT AGAR DAPAT BERFUNGSI DENGAN BAIK
 */

package latihan;

public class Latihan02 {
   
   // READONLY - JANGAN DIUBAH ISI FUNGSI MAIN INI
   public static void main(String[] args) {
      String[] arrNama = {"Budi", "Katty", "Susan", "Juliana", "Andi", "Linda", "Rose"};
      // create doublelinkedlist object 
      var list = new DoubleLinkedList();
      // add some item to doublelinkedlist
      for (String item : arrNama) {
         System.out.println("add item dengan nama: " + item);
         list.add(item);
      }
      System.out.println();
      System.out.println("list items:");
      System.out.println(list);

      // sort items in doublelinkedlist
      list.sort();

      // after sorting doublelinkedlist ? 
      System.out.println("list items after sorting:");
      System.out.println(list);

   }  
}


class DoubleLinkedList {

   private Node head;
   private Node tail;
   private int count; 

   public DoubleLinkedList() {
      head = tail = null;
      count = 0;
   }

   public Node getHead() {
      return head;
   }

   public Node getTail() {
      return tail;
   }

   public int getCount() {
      return count;
   }

   public boolean isEmpty() { return count == 0; }

   public void add(String nama) {
      Node node = new Node(nama);
      if (isEmpty()) {
         head = node;
         tail = node;
      }
      else {
         tail.setNext(node);
         node.setPrev(tail);
         tail = node;
      } 
      count++;
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
         Node p = head;
         int idx = 1;
         while (p != null) {
            sb.append(String.format("%2d. %s\n", idx++, p.getNama()));
            p = p.getNext();            
         }
      }
      return sb.toString();
   }

}


class Node {

   private String nama;
   private Node prev;
   private Node next;

   public Node(String nama) { 
      this.nama = nama; 
      this.prev = null;
      this.next = null;
   }

   public String getNama() {
      return nama;
   }

   public Node getPrev() {
      return prev;
   }

   public Node getNext() {
      return next;
   }
   
   public void setNama(String nama) {
      this.nama = nama;
   }

   public void setPrev(Node prev) {
      this.prev = prev;
   }

   public void setNext(Node next) {
      this.next = next;
   }

   @Override
   public String toString() {
      return this.nama;
   }

}
