import java.util.Scanner;

//Problem: Given a sorted array arr[] of n elements, write a function to search a given element x in arr[] and return the index of x in the array.

 class BinarySearch {
    
    int binarySearch(int arr[], int l, int r,int x){
        if(r>l){
            int mid = l+(r-1)/2;
            if(arr[mid]==x)
            return mid;
            
            if(arr[mid]>x)
                return binarySearch(arr,l,mid-1,x);
                
                
                return binarySearch(arr, mid+1, r,x);
            
        }
        return -1;
    }
    
    
    
    
    public static void main(String args[]) {
     BinarySearch ob = new BinarySearch();
    //  int arr[] = {2,3,4,10,40,50};
    //  int n = arr.length;
    //  int x =50;
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int arr [] = new int[size];
     for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
     }
     int x = sc.nextInt();
     int n = arr.length;

    
     int result = ob.binarySearch(arr,0,arr.length-1,x);
     if(result==-1){
         System.out.println("elemen not present");
         
     }
     else{
         System.out.println("element found at index " +  result);
     }
    }
}