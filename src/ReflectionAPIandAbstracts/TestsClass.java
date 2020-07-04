package ReflectionAPIandAbstracts;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestsClass {
    static void start(Class objectClass) throws Exception {
        Object object = objectClass.getDeclaredConstructor().newInstance();
        ArrayList<Method> methods = new ArrayList<>();
        Method beforeMethod = null;
        Method afterMethod = null;
        for (Method com : objectClass.getDeclaredMethods()) {
            if (com.isAnnotationPresent(BeforeSuite.class)) {
                if (beforeMethod == null)
                    beforeMethod = com;
                else
                    throw new RuntimeException("BeforeSuite - must be present in a single copy!");
            }
            if (com.isAnnotationPresent(Test.class)) {
                methods.add(com);
            }
            if (com.isAnnotationPresent(AfterSuite.class)) {
                if (afterMethod == null)
                    afterMethod = com;
                else
                    throw new RuntimeException("AfterSuite - must be present in a single copy!");
            }
            methods.sort((s1, s2) -> s2.getAnnotation(Test.class).prioritize() - s1.getAnnotation(Test.class).prioritize());
        }

        if (beforeMethod != null)
            beforeMethod.invoke(object, (Object[]) null);
        for (Method obj : methods)
            obj.invoke(object, (Object[]) null);
        if (afterMethod != null)
            afterMethod.invoke(object, (Object[]) null);
    }
}
