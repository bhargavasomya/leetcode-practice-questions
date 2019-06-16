import java.io.*; 
class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = (arr.length - 1); i >= 0; i--) { 
            if(arr[i]==0 && i!= arr.length - 1)
            {for (int j = (arr.length - 2); j >= i+1; j--)
                {
                    arr[j+1] = arr[j];
                }
             arr[i+1] = 0;
            }

    //array[0] = temp;
    }
}
}
