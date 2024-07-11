package java_DSA.array;

public class left_rotate {


    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] leftRotate(int[] arr , int d) {   // d is the no. of elements which will be rotated
        int temp[] = new int[d];
        for (int i = 0 ; i <temp.length ; i++){    // store the rotate place elements in the temporary array
            temp[i]=arr[i];
        }
        int n = arr.length;
        for(int i = d ; i < n; i++){         // move the rest of the elements to the front of the array
            arr[i - d] = arr[i];
        }
        int j =0;
        for(int i = n-d ; i<n ; i++){         // place the temporary array element to the last of the actual array
            arr[i]=temp[j];
            j++;
        }
        return arr;
    }



    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        printArray(leftRotate(arr, 3));

    }
}


/* 
 * left rotate array means replace no. of rotateplace elements, form left side to right side
 * ex. if the array contains [1,2,3,4,5] then after doing left rotate,
 * for one place it would be - [5,2,3,4,1]
 * for 2 place left rotation it would be - [3,4,5,1,2] 
 * for 3 place left rotation ir would be - [4,5,1,2,3]
 */
