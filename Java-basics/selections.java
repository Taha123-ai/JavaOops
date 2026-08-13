public class selections {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    min=j;
                }
            }
            if(min==i){
                continue;
            }
            
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;   
        }

        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}