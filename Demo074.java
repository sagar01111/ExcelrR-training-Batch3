public class Demo074 {
    public static void main(String[] args) {
        
       public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++){
        for(int j = i+1; j < arr.length; j++){
            int temp = 0;
            if(arr[i] > arr[j]) {
                temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
       }
    for(int j = 0; j < arr.length; j++) {
        System.out.println(arr[j]);
    }
}
}