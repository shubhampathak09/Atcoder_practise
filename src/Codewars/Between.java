package Codewars;

    public class Between {

        public static int[] between(int a, int b) {
            int [] res =new int[b-a+1];
            int j=0;
            for(int i=a;i<=b;i++){
                res[j]=i;
                j++;
            }
            return res;
        }
    }

