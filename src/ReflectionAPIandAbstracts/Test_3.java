package ReflectionAPIandAbstracts;

public class Test_3 {
    @BeforeSuite
    public void init() {
        System.out.println("Init");
    }
    @Test(prioritize = 10)
    public void test1() {
        System.out.println("Test3_1");
    }
    @Test(prioritize = 5)
    public void test2() {
        System.out.println("Test3_2");
    }
    @Test
    public void test3() {
        System.out.println("Test3_3");
    }
    @Test(prioritize = 8)
    public void test4() {
        System.out.println("Test3_4");
    }
    @AfterSuite
    public void end() {
        System.out.println("Finish");
    }
}
