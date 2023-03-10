package mycode1;

/**
 * @author fujiwo
 * @version 0.0.1
 */
public class BubbleSort{
    public static void main(String[] args) {
        
        //定义随机数组
        int[] arr = new int[]{12,32,45,43,8};
        //定义随机数组结束

        //冒泡排序
        for(int i = 0 ; i < arr.length - 1 ; i ++){

            for(int j = 0 ; j < arr.length - 1 - i ; j ++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //冒泡排序结束

        //重新遍历
        for(int m = 0 ; m < arr.length ; m ++){
            System.out.println(arr[m]);
        }
        //重新遍历结束

    }
}