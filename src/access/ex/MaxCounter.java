package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        //실행로직 :: 검증이 완료 되어야 실행이된다
        count++;
    }

    public int getCount() {
        return count;
    }

}
