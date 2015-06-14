package sort;

/**
 * Created by kaijiezhou on 6/4/15.
 */
public class MergeSort {
    public void sort(int[] array){
        mergeSort(array,0,array.length-1);
    }
    private void mergeSort(int[]array,int low,int high){
        if(low<high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array,low,mid,high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {
        System.out.println("Merge "+low+" to "+high);
        int temp[]=new int[high-low+1];
        int i=low,j=mid+1;
        for(int k=0; k<temp.length;k++){
            if(j>high||array[i]<array[j]){
                temp[k]=array[i++];
            }else if(i>mid||array[i]>array[j]){
                temp[k]=array[j++];
            }
        }
        for(int a:temp){
            System.out.print(a + ", ");;
        }
        System.out.println();
        for(int k=0;k<temp.length;k++){
            array[low+k]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] array={3,5,9,6,0};
        new MergeSort().sort(array);
        for(int i:array){
            System.out.print(i + ", ");
        }
    }
}
