package ReflectionAPIandAbstracts;

public class Main {
    public static void main(String[] args) {
        Class<Test_1> ob_1 = Test_1.class;
        Class<Test_2> ob_2 = Test_2.class;
        Class<Test_3> ob_3 = Test_3.class;
        Class<Test_4> ob_4 = Test_4.class;
        try {
            TestsClass.start(ob_1);
            TestsClass.start(ob_2);
            TestsClass.start(ob_3);
            TestsClass.start(ob_4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
