package Task2;
//Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
//Сделать полную документацию всех полей, методов, конструкторов класса используя аннотацию Documented, либо же документационные комментарии.

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
/**
  @author Yaroslav Deneha
  @since 26.07.2022
 **/

/**
 * @set values of Calculator
 */
@interface Math {
    int a();


    int b();
}
/**
 @author Yaroslav Deneha
 @since 26.07.2022
 **/
public class Calculator {

    /**
     * field with variables
     */
    public int a, b;



    /**
     *  addition parameters
     */
    @Math(a = 9, b = 3)
    public void add(int a, int b) {
        System.out.println(a + b);
    }


    /**
     * subtraction parameters
     */
    @Math(a = 9, b = 3)
    public void sub(int a, int b) {
        System.out.println(a - b);
    }


    /**
     * multiplication parameters
     */
    @Math(a = 9, b = 3)
    public void mul(int a, int b) {
        System.out.println(a * b);
    }


    /**
     *  division parameters ,and catches a divide-by-zero error
     */
    @Math(a = 9, b = 3)
    public void div(int a, int b) {

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }


    }


}







