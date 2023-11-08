public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int arr [] = {1,2,3};
        int arr2 [] = {3,4,5,6,7,8};

        int result [] = new int[arr.length+arr2.length];

//        arr loop
      for(int i = 0;i<arr.length;i++){
          result[i] = arr[i];
      }

//      arr2 loop
        for (int i = 0;i<arr2.length;i++){
            result[arr.length + i] = arr2[i];
        }


//        result print
      for(int j = 0; j<result.length;j++){
          System.out.print(result[j]+ " " );
      }

    }


}