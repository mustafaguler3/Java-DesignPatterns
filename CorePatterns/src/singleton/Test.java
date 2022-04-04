package singleton;

public class Test {
    public static void main(String[] args) {
        DateUtil dateUtil = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        System.out.println(dateUtil == dateUtil2);
    }
}
