/**
 * Created by kaijiezhou on 6/14/15.
 */
public class MedianOfTwoSortedArrs {
    //TODO
   /* public double findMedianSortedArrays(int[] nums1, int[] nums2) {//only works when nums1.length==nums2.length
        int s1=0, s2=0, e1=nums1.length-1,e2=nums2.length-1;
        int length1=nums1.length, length2=nums2.length;

        if(length1==0)
            return length2%2==0?(double)(nums2[length2/2]+nums2[length2/2-1])/2:(double)nums2[length2/2];
        else if(length2==0)
            return length1%2==0?(double)(nums1[length1/2]+nums1[length1/2-1])/2:(double)nums1[length1/2];

        while(length1+length2>5){
            boolean evenLength1=(length1%2==0);
            boolean evenLength2=(length2%2==0);
            double median1=evenLength1?(double)(nums1[(s1+e1)/2]+nums1[(s1+e1)/2+1])/2:(double)nums1[(s1+e1)/2];
            double median2=evenLength2?(double)(nums2[(s2+e2)/2]+nums2[(s2+e2)/2+1])/2:(double)nums2[(s2+e2)/2];
            if(median1<median2){
                s1=evenLength1?length1/2-1:length1/2;
                e2=length2/2;
            }else{
                e1=length1/2;
                s2=evenLength2?length2/2-1:length2/2;
            }
            length1=e1-s1+1;
            length2=e2-s2+1;
        }
        int[]array=new int[length1+length2];
        for(int i=0;i<array.length;i++){
            if(s1>e1)
                array[i]=nums2[s2++];
            else if(s2>e2)
                array[i]=nums1[s1++];
            else
                array[i]=nums1[s1]>nums2[s2]?nums2[s2++]:nums1[s1++];
        }
        double median;
        if(array.length%2==0) {
            median = (double) (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
            System.out.println(median);
        }else
            median=(double)array[array.length/2];
        return median;
    }*/
    public double findMedianSortedArrays(int[]nums1, int[]nums2){
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1={1,7};
        int[] arr2={2,3,4,5,6,8};

        System.out.println(new MedianOfTwoSortedArrs().findMedianSortedArrays(arr1,arr2));
    }
}
