public class insertion {
    public static void main(String[] args) {
        int[] arr={'b','d','v','d','s'};

        for(int i=0;i<arr.length;i++){
           int j=i;
           while(j>0 && arr[j-1]> arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
           }
           
        }
        for (int i : arr) {
            System.out.print((char) i +",");
        }
    }
}
