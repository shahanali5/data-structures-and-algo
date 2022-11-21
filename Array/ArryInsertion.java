class ArryInsertion
{
         public static void main(String args[]){
                    int la[]=new int[5];
                    la[0]=10;
                    la[1]=20;
                    la[2]=30;
                    la[3]=40;
                    int n=3; int k=2;int item=200;
                     for(int j=n;j>=k;j--){
                             la[j+1]=la[j];        
                     }
                 la[k]=item;
                        n=n+1;
              for(int i=0;i<n;i++) {
                    System.out.println(la[i]+" ");
               }  
          }
}