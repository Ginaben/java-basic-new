package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다. (아래 주석)
        //MathArrayutils mathArraysUtils = new MathArrayUtils(); <- 생성 막기
    }

    public static int sum(int[] values) {

        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        //소숫점이 나올 수 있기때므ㅜㄴ에 더블로
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if(value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

}
