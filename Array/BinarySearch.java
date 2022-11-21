/* This is binary search program this program will find an item what you want
in this program keep in mind the arry will be sorted in advance.*/
class BinarySearch
{
        public static void main(String args[])
        {
                 int[] data={10, 20, 30, 40, 50};
                 int beg=0;
                 int end=data.length-1;
                 int mid=(beg+end)/2;
                 int item=30;
                         for(beg=0;beg<=end && data[mid]!=item;beg++){
                           if(item<data[mid]){
                           end=mid-1;
                        }
                                else{
                          beg=mid+1;
                        }
                        mid=(beg+end)/2;
                    }
                         if(data[mid]==item){
                         System.out.println("Element found Successfully at "+mid+" index position");
                         }
                else{
                 System.out.println("Element not found ");
                         }
         }
}