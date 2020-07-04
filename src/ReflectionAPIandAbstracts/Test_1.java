package ReflectionAPIandAbstracts;

public class Test_1 {
    @BeforeSuite
    public void init() {
        System.out.println("Init");
    }
    @Test(prioritize = 10)
    public void test1() {
        System.out.println("Test1_1");
    }
    @Test()
    public void test2() {
        System.out.println("Test1_2");
    }
    @Test(prioritize = 5)
    public void test3() {
        System.out.println("Test1_3");
    }
    @AfterSuite
    public void end() {
        System.out.println("Finish");
    }
}
