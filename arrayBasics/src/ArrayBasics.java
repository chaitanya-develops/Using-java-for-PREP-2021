public class ArrayBasics {
    public static void main(String[] args){

        // declaration of array.
        int[] basicArray;
        // allocating memory for 3 integer elements.
        basicArray = new int[3];
        for (int i = 0;i < basicArray.length;i++){
            // initialization.
            basicArray[i] = i^2;
            // accessing.
            System.out.println(basicArray[i]);
        }

        int[] arr = {1,2,3};
        // iterating over the array
        // method 1.
        for (int i = 0;i < arr.length;i++){
            arr[i]++;
            System.out.println(arr[i]);
        }
        System.out.println();

        // method 2 (cannot be used for updating elements)
        for (int x : arr){
            System.out.println(x + " ");
        }
        System.out.println();

        // iterating over 2d array.

        // Method 1.
        int[][] arr2d = {{1,2,3},{4,5},{6,7,8,9},{10,11,12,13,14}};

        for (int i = 0;i<arr2d.length;i++){
            for (int j = 0;j<arr2d[i].length;j++){
                arr2d[i][j]++;
                System.out.println(arr2d[i][j]);
            }
        }
        System.out.println();

        // Method 2 (Cannot be used for updating elements)
        for (int[] x : arr2d){
            for (int x1 : x){
                System.out.println(x1);
            }
        }
        System.out.println();
    }
}
