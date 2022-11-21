class BubbleSort
{
        public static void main(String args[])
        {
                 int[] DATA= new int[5];
                 DATA[0]=50;
                 DATA[1]=30;
                 DATA[2]=20;
                 DATA[3]=40;
                 DATA[4]=10;
          int N=DATA.length-1;
          int temp;
           for(int k=0;k<N;k++){
           for(int PTR=0;PTR<N;PTR++){

            if(DATA[PTR]>DATA[PTR+1]){
            temp=DATA[PTR];
            DATA[PTR]=DATA[PTR+1];
            DATA[PTR+1]=temp;
              }          
                }
                  }
              for(int i=0;i<N+1;i++){
               System.out.print(DATA[i]+" ");
               }
          }
 } 