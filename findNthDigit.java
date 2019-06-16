//Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

//Note:
//n is positive and will fit within the range of a 32-bit signed integer (n < 2^31).

class Solution {
    public int findNthDigit(int m) {
    long n=m; // convert int to long 
    long start=1,  len=1,  count=9;
 
    while(n>len*count){
        n=n-len*count;
        len++;
        count=count*10;
        start=start*10;
    }
 
    // identify the number
    start = start + (n-1)/len;
 
    // identify the digit
    return String.valueOf(start).charAt((int)((n-1)%len))-'0';
}
}
