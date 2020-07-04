package ReflectionAPIandAbstracts;

public class Test_4 {
    @BeforeSuite
    public void init() {
        System.out.println("Init");
    }
    @Test(prioritize = 5)
    public void test1() {
        System.out.println("Test4_1");
    }
    @Test(prioritize = 7)
    public void test2() {
        System.out.println("Test4_2");
    }
    @AfterSuite
    public void end() {
        System.out.println("Finish");
    }
}
