public class Finder {
    public static void main(String[] args)
    {
       Integer[] arr = {20, 10, 20, 4, 100};
       findMax(arr);
       findMin(arr);

    }

    public static Integer findMax(Integer[] arr){
       if(arr == null || arr.length == 0) return null;
      int max = Integer.MIN_VALUE;
      for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
        return max;
    }

    public static Integer findMin(Integer[] arr){
     if(arr == null || arr.length == 0) return null;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]<min) min = arr[i];
    }
        System.out.println(min);
        return min;
    }
}
