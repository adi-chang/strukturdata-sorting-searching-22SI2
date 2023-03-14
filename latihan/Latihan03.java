package latihan;

import java.util.Scanner;

public class Latihan03 {
   
   // READONLY - JANGAN DIUBAH ISI FUNGSI MAIN INI
   public static void main(String[] args) {
      String[] arrNama = {"Budi", "Katty", "Susan", "Juliana", "Andi", "Linda", "Rose"};
      // create SinglyLinkedList object 
      var list = new SinglyLinkedList();
      // add some item to SinglyLinkedList
      for (String item : arrNama) {
         System.out.println("add item dengan nama: " + item);
         list.add(item);
      }
      System.out.println();
      System.out.println("list items:");
      System.out.println(list);

      Scanner sc = new Scanner(System.in);

      System.out.print("Nama ? ");
      String nama = sc.nextLine();

      // check apakah nama is exists ? 
      if (list.contain(nama)) { 
         int idx = list.findIndex(nama);
         System.out.println(nama + " ditemukan pada no. urut: " + (idx+1));
      }
      else {
         System.out.println(nama + " tidak ditemukan");
      }
      System.out.println();

      sc.close();

   }

}


class SinglyLinkedList {

   private Data head;
   private Data tail;
   private int count; 

   public SinglyLinkedList() {
      head = tail = null;
      count = 0;
   }

   public Data getHead() {
      return head;
   }

   public Data getTail() {
      return tail;
   }

   public int getCount() {
      return count;
   }

   public boolean isEmpty() { return count == 0; }

   public void add(String nama) {
      Data node = new Data(nama);
      if (isEmpty()) {
         head = node;
         tail = node;
      }
      else {
         tail.setNext(node);
         tail = node;
      } 
      count++;
   }

   // lengkapi method contain ini, 
   // untuk bisa melakukan searching terhadap elemen data dalam list 
   // return true if nama is found, otherwise, return false 
   public boolean contain(String nama) {
      // your code here
      return false;
   }

   // lengkapi method findIndex ini, 
   // untuk bisa melakukan searching index terhadap elemen data dalam list 
   // return item index if nama is found, otherwise, return -1 
   public int findIndex(String nama) {
      // your code here
      return -1;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      if (!isEmpty()) { 
         Data p = head;
         int idx = 1;
         while (p != null) {
            sb.append(String.format("%2d. %s\n", idx++, p.getNama()));
            p = p.getNext();            
         }
      }
      return sb.toString();
   }

}

class Data {

   private String nama;
   private Data next;

   public Data(String nama) { 
      this.nama = nama; 
      this.next = null;
   }

   public String getNama() {
      return nama;
   }

   public Data getNext() {
      return next;
   }
   
   public void setNama(String nama) {
      this.nama = nama;
   }

   public void setNext(Data next) {
      this.next = next;
   }

   @Override
   public String toString() {
      return this.nama;
   }

}


