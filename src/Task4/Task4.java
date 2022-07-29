package Task4;
//Создать свою аннотацию, которая будет содержать параметры для метода, выполнить сложение 2-х чисел.
//
//@Math(num1 = 100, num2 = 200)
//
//public void mathSum(int num1, int num2)

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Math {
    int num1();

    int num2();
}

public class Task4 {


    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);

    }

    public static void main(String[] args) {
        try {
            Task4 task4 = new Task4();
            Class<?> cl = Task4.class;

            Method method = cl.getMethod("mathSum", int.class, int.class);
            if (method.isAnnotationPresent(Math.class)) {
                Math math = method.getAnnotation(Math.class);
                method.invoke(task4, math.num1(), math.num2());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


