class Solution {
    
     public  int findMaxRectangle(int []a){



        int n=a.length;
        int[]left=new int[n];
        int[]right=new int[n];

        int mx=Integer.MIN_VALUE;

        left[0]=-1;

        Stack<Integer>s=new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++){

            while(!s.empty()&&a[i]<=a[s.peek()]){
                s.pop();


            }
            if(s.empty()){
                left[i]=-1;

            }else
            {
                left[i]=s.peek();

            }
            s.push(i);
        }


        s.clear();

        right[n-1]=n;
        s.push(n-1);

        for(int i=n-2;i>=0;i--){

            while(!s.empty()&&a[i]<=a[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                right[i]=n;
            }else
            {
                right[i]=s.peek();
            }
            s.push(i);
        }


        for(int i=0;i<n;i++){

            mx=Math.max((right[i]-left[i]-1)*a[i],mx);

        }

//         for(int i=0;i<a.length;i++)
//             System.out.print(a[i]+" ");
//             System.out.print(mx);



//         System.out.println();

//         for(int i=0;i<n;i++)
//             System.out.print(left[i]+" ");
//         System.out.println();

//         for(int i=0;i<n;i++)
//             System.out.print(right[i]+" ");

//         System.out.println();

         return mx;

    }
    
    
    public int maximalRectangle(char[][] matrix) {
        
        
          int n=matrix.length;
        int m=matrix[0].length;


         int[][] mat=new int[n][m];



        for(int i=0;i< n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1')
                    mat[i][j]=1;
                else
                    mat[i][j]=0;
            }
        }

      for(int i=1;i<n;i++){
          for(int j=0;j<m;j++){

              if(mat[i][j]==0)
              mat[i][j]=0;
              else
              mat[i][j]+=mat[i-1][j];
          }



      }

     int mx=0;
      for(int i=0;i<n;i++){

          mx=Math.max(mx,findMaxRectangle(mat[i]));

      }
       
        return mx;
    }
}
