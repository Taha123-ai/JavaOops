public class mergetwoarray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 5, 3, 34 };
        for(int i=0;i<arr1.length;i++){
            int freq=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    freq++;
                }
            }
            System.out.println(arr1[i]+"frequency"+freq);
        }
    }
}