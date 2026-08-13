public class ss{
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int max=i;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[max]>arr[j]){
                    max=j;
                }
            }
            count++;
            int temp=arr[i];
                    arr[i]=arr[max];
                    arr[max]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");    
        }
        System.out.println(count);
    }
}