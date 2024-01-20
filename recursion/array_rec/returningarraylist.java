package recursion.array_rec;

import java.util.ArrayList;

public class returningarraylist {
    public static void main(String[] args) {
        
    }
    static ArrayList findallindex(int[] arr , int target,int index, ArrayList<Integer> list){
        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

           findallindex(arr, target, index +1);

    }
}
