
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);
    }
    public static int smallest(int[] array){
    int smallest=array[0];
        for(int i=1;i<array.length;i++){  
        if(array[i] < smallest){
        smallest=array[i];
            }
        }
    return smallest;
    }
    public static int indexOfSmallest(int[] array){
    // write your code here
    int index=0;
    for(int i=1;i<array.length;i++){
    if(array[i] < array[index]){
        index=i;
        }
    }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
    int smallestfrom=startIndex;
    for(int i=startIndex;i<table.length;i++){
        if(table[smallestfrom]>table[i]){
            smallestfrom=i;
        }
    }
    return smallestfrom;
    }
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int swap=array[index1];
            array[index1]=array[index2];
            array[index2]=swap;
        }
    public static void sort(int[] array) {
        int startIndex=0;
    
        while (startIndex < array.length) {
            System.out.println(Arrays.toString(array));
        int indexOfSmallest=indexOfSmallestFrom(array,startIndex);
        swap(array,startIndex,indexOfSmallest);
        startIndex++;
}
    }
}
