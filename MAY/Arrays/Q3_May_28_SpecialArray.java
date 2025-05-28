public class Q3_May_28_SpecialArray {
    public static boolean isSpecialArr(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] % 2 == arr[i+1] % 2){ //if first place nums and second place nums is even
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        System.out.println(isSpecialArr(arr));
    }
}
