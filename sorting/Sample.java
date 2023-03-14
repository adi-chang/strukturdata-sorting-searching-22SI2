package sorting;


public class Sample {

   public static void main(String[] args) {
      int[] source = { 10, 1, 3, 5, 4, 2, 7, 6, 8, 9 };
      System.out.println("data source: " + convertToString(source));
      System.out.println("count: " + source.length);
      // System.out.println("Sort array using bubblesort algorithm");
      // bubbleSort(source);
      // System.out.println("Sort array using selectionsort algorithm");
      // selectionSort(source);
      // System.out.println("Sort array using insertionsort algorithm");
      // insertionSort(source);
      // System.out.println("Sort array using mergesort algorithm");
      // mergeSort(source, 0, source.length-1);
      System.out.println("data source after sort: " + convertToString(source));
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

   // pengurutan dengan algoritma bubble sort
   public static void bubbleSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
               // swap arr[j] and arr[j+1]
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
   }

   // pengurutan dengan algoritma selection sort
   public static void selectionSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) {
         int min_idx = i;
         for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {
               min_idx = j;
            }
         }
         // swap arr[i] with the smallest element
         int temp = arr[i];
         arr[i] = arr[min_idx];
         arr[min_idx] = temp;
      }
   }

   // pengurutan dengan algoritma insertion sort
   public static void insertionSort(int[] arr) {
      int n = arr.length;
      for (int i = 1; i < n; i++) {
         int key = arr[i];
         int j = i - 1;
         while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = key;
      }
   }

   // pengurutan dengan algoritma merge sort
   public static void mergeSort(int[] arr, int left, int right) {
      if (left < right) {
         int mid = (left + right) / 2;
         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);
         merge(arr, left, mid, right);
      }
   }

   public static void merge(int[] arr, int left, int mid, int right) {
      int n1 = mid - left + 1;
      int n2 = right - mid;
      int[] L = new int[n1];
      int[] R = new int[n2];
      for (int i = 0; i < n1; i++) {
         L[i] = arr[left + i];
      }
      for (int j = 0; j < n2; j++) {
         R[j] = arr[mid + 1 + j];
      }
      int i = 0, j = 0;
      int k = left;
      while (i < n1 && j < n2) {
         if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
         } else {
            arr[k] = R[j];
            j++;
         }
         k++;
      }
      while (i < n1) {
         arr[k] = L[i];
         i++;
         k++;
      }
      while (j < n2) {
         arr[k] = R[j];
         j++;
         k++;
      }
   }

}