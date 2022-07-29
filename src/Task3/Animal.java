package Task3;
//Создайте несколько классов, один класс наследует другой и использует аннотацию Inherited. Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
@Inherited
@Target(ElementType.TYPE)
@Documented
@interface MyAnnotation{
    String name() ;
    int age();
}
public class Animal {


}
