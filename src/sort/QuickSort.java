/**
 * Created by kaijiezhou on 6/4/15.
 */
package sort;
public class QuickSort {
    public void quickSort(int[] array){
        quickSortPart(array, 0, array.length - 1);
    }

    private void quickSortPart(int[] array, int low, int high) {
        if(low>=high) return;
        int pivotIndex=chasePartition(array, low, high);
        quickSortPart(array,low,pivotIndex-1);
        quickSortPart(array,pivotIndex+1,high);
    }

    private int crossPartition(int[] array, int low, int high) {
        int pivot=array[high];
        int i=low,j=high-1;
        while(i<=j){
            if(array[i]<=pivot) {
                ++i;
                //System.out.println("i->"+i);
            }else if(array[j]>=pivot) {
                --j;
               // System.out.println("j->"+j);
            }else{
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                ++i;
                --j;
               // System.out.println("i->"+i+"; j->"+j);
            }
        }
        array[high]=array[i];
        array[i]=pivot;
        return  i;
    }

    private int chasePartition(int[]array, int low, int high){
       // System.out.println("Partitioning "+low+" to "+high);;
        int pivot=array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
           // System.out.println("j->"+j);
            if(array[j]<pivot){
                ++i;
                //System.out.println("i->"+i);;
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        ++i;
        array[high]=array[i];
        array[i]=pivot;
        return i;
    }

    public static void main(String[] args) {
        int[]array={4,2,5,6,3,9,0};
        new QuickSort().quickSort(array);
        for(int i:array){
            System.out.print(i + ", ");
        }
    }
}
