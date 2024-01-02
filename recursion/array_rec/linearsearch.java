package recursion.array_rec;

import recursion.revrec;

public class linearsearch {
    public static void main(String[] args) {

        int[] arr  = {2,3,1,4,5};
        System.out.println(ls(arr, 4, 0));
        
    }
     static boolean ls(int[] arr,int target,int index){
      if( index == arr.length) {
        return false;
      }
      return arr[index] == target || ls(arr, target, index + 1);
     }

    //   static int findindex(int[] arr,int target,int index){
    //   if( index == arr.length) {
    //     return -1;
    //   }
    //   if(arr.length == target){
    //     return index;
    //   }
    // else{
    //     return findindex(arr, target, index + 1);
    //  }
    // }
}
