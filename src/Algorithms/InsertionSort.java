package Algorithms;

public class InsertionSort {




    public static void main(String[] args){

        int [] a ={ 2 ,3,1,4,5,7,8,0};

        int i,key,j;
        for(i =1 ; i < a.length ;i++ ){

             key = a[i];
             j = i-1;

            while(j>=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;
        }

        for(i =0 ;i< a.length ;i++){
            System.out.println(a[i]);
        }

    }
}
