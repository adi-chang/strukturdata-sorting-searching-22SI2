package searching;

public class Sample {

   public static void main(String[] args) {
      int[] source = { 10, 1, 3, 5, 4, 2, 7, 6, 8, 9 };
      System.out.println("data source: " + convertToString(source));
      System.out.println("count: " + source.length);
      // search item 9, 7, 11
      System.out.println("cari item: 9, 7, 11");
      for (int x : new int[] { 9, 7, 11 }) {
         if (sequentialSearch(source, x)) { // change to binarySearch method to using binary search algorithm 
            System.out.println("item: " + x + " ditemukan");
         } else {
            System.out.println("item: " + x + " tidak ditemukan");
         }
      }
   }

   // algoritma binary search
   public static boolean sequentialSearch(int[] arr, int item) {
      boolean result = false;
      for (int x : arr) {
         if (x == item)
            result = true;
      }
      return result;
   }

   // algoritma binary search
   public static boolean binarySearch(int[] arr, int target) {
      
      var temparr = arr.clone();

      sort(temparr);
      
      int left = 0;
      int right = temparr.length - 1;

      while (left <= right) {
         int mid = left + (right - left) / 2;

         if (temparr[mid] == target) {
            return true;
         } else if (temparr[mid] < target) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }
      }

      return false;
   }

   private static void sort(int[] arr) {
      for (int i = 0; i < arr.length-1; i++) {
         for (int j = i+1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
   }

   public static String convertToString(int... data) {
      StringBuilder sb = new StringBuilder();
      for (int x : data) {
         if (sb.length() == 0)
            sb.append(x);
         else
            sb.append(", " + x);
      }
      return sb.toString();
   }

}
