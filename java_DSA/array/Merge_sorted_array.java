package java_DSA.array;

public class Merge_sorted_array{

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int j = 0 , i= 0;
        while( i< nums1Len && j<nums2Len){
            if(nums1[i] == 0){
                nums1[i] = nums2[j];
                j++;
            }
            i++;
        }
        Arrays.sort(nums1);
        */
        int i = m-1;
        int j = m + n -1;
        int k = n-1;
        while(k>= 0){
            if (i>=0 && nums1[i] > nums2[k]){
                nums1[j] = nums1[i];
                j--;
                i--;
            }
            else{
                 nums1[j] = nums2[k];
                j--;
                k--;
            }
            
        }
    }
    public static void main(String[] args) {
        
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,7};
        merge(nums1,3,nums2,3);

        for(int i = 0 ; i<nums1.length;i++){
            System.out.print(nums1[i] + " ");
        }
        }
    }