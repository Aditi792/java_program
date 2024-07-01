

class jagged_array{
public static void main(String[] args){
    int j_arr[][] = new int[3][];
    j_arr[0]= new int[2];
    j_arr[1]= new int[4];
    j_arr[2]= new int[3];

    int count= 0;
    for(int i=0; i<= j_arr.length;i++){
        for(int j=0; j<= j_arr[i].length;j++){
            j_arr[i][j]=count++;
        }
    }

    for(int i=0; i<= j_arr.length;i++){
        for(int j=0; j<= j_arr[i].length;j++){
            System.out.println(j_arr[i][j]+ " ");
        }
    }
}

}