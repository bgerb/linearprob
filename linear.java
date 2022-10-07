import java.util.ArrayList;
public class linear {
    int[] arr;
    public linear(int size){
        arr = new int[size];
        for(int i =0; i<size; ++i){
            arr[i] = -1;
        }
    }
    public void insert(int key) throws RuntimeException{ // Throws an exception
        int i=0;
        boolean spots = true;
        while(i<arr.length && spots){
            int spot = hashmult(key,i);
            if(arr[spot] == -1){
                arr[spot] =key;
                spots = false;
            }
            ++i;
        }
        if(spots) throw new RuntimeException("full list");


    }
    public int hashmult(int acc, int toadd){
        return((acc*3)%10)+toadd;
    }
    public int search(int key){
        // searchs through arraylist
        // returns -1 if not in the arraylist
        // will return the position of the element
        for(int i = 0; i<arr.length; ++i){
            if(arr[i] == key) return i;
        }
        return -1;
    }


}
