public class SimpleSelection {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {22,11,2,3,54,1,6};
        System.out.println("Массив до сортировки");
        System.out.println("------------------");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);
        System.out.println("------------------");
        System.out.println("После сортировки");
        System.out.println("------------------");
        for(int i:arr1){
            System.out.print(i+" ");

        }
        System.out.println(" ");
        System.out.println("------------------");
    }
}