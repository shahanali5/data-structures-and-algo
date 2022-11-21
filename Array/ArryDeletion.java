class ArryDeletion
{
         public static void main(String args[])
         {
              int la[]=new int[5];
              la[0]=10;
              la[1]=20;
              la[2]=30;
              la[3]=40;
              la[4]=50;
                int n=4;int k=2;int item=la[k];
                  for(int j=k;j<n;j++){
                    la[j]=la[j+1];        
              }
                n=n-1;
                  for(int i=0;i<=n;i++){
                    System.out.print(la[i]+" ");
                }
          }
}