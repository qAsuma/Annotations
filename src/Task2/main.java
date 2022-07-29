package Task2;

import java.lang.reflect.Method;


public class main {
    public static void main(String[] args) {
        try {
            Calculator c = new Calculator();
            Class<?> cl = Calculator.class;

            Method method = cl.getMethod("add", int.class, int.class);
            Method method1 = cl.getMethod("sub", int.class, int.class);
            Method method2 = cl.getMethod("mul", int.class, int.class);
            Method method3 = cl.getMethod("div", int.class, int.class);

            if (method.isAnnotationPresent(Math.class)) {
                Math math = method.getAnnotation(Math.class);
                method.invoke(c, math.a(), math.b());
            }
            if (method1.isAnnotationPresent(Math.class)) {
                Math math = method1.getAnnotation(Math.class);
                method1.invoke(c, math.a(), math.b());
            }
            if (method2.isAnnotationPresent(Math.class)) {
                Math math = method2.getAnnotation(Math.class);
                method2.invoke(c, math.a(), math.b());
            }
            if (method3.isAnnotationPresent(Math.class)) {
                Math math = method3.getAnnotation(Math.class);
                method3.invoke(c, math.a(), math.b());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
