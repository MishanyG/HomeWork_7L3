package ReflectionAPIandAbstracts;

public class Test_2 {
    @BeforeSuite
    public void init() {
        System.out.println("Init");
    }
    @Test(prioritize = 2)
    public void test1() {
        System.out.println("Test2_1");
    }
    @Test(prioritize = 3)
    public void test2() {
        System.out.println("Test2_2");
    }
    @Test(prioritize = 8)
    public void test3() {
        System.out.println("Test2_3");
    }
    @Test(prioritize = 5)
    public void test4() {
        System.out.println("Test2_4");
    }
    @Test(prioritize = 10)
    public void test5() {
        System.out.println("Test2_5");
    }
    @Test(prioritize = 2)
    public void test6() {
        System.out.println("Test2_6");
    }
    @AfterSuite
    public void end() {
        System.out.println("Finish");
    }
}
