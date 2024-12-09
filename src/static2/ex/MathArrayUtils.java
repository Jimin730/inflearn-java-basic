package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //외부에서 MathArrayUtils 객체를 생성하지 못하게 private로 막아버린다.
    }

    public static int sum(int[] array){
        int result = 0;
        for(int i: array)
            result += i;
        return result;
    }

    public static double average(int[] array){
        int result = 0;
        for(int i: array)
            result += i;
        result /= array.length;
        return result;
    }

    public static int min(int[] array){
        int minNum = 0;

        for(int i: array){
            minNum = Math.min(array[0],i);
        }
        return minNum;
    }

    public static int max(int[] array){
        int maxNum = 0;

        for(int i: array){
            maxNum = Math.max(array[0],i);
        }
        return maxNum;
    }
}
