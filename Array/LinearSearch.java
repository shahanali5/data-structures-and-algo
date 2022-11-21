class LinearSearch
{
          public static void main(String args[])
          {
                   int[] DATA= {10, 20, 30, 40, 50};
                   int item=40;
                   for(int loc=0;loc<DATA.length;loc++) {
                 if(DATA[loc]==item){

                         System.out.println("Item found successfully at "+loc+" index position");
                                 return;
                             }
                     }
                  System.out.println("Item not found");
         }
}