package cc.docss.javase.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 * @author ZhcChen
 * @since 2022-07-04 10:14:03
 */
public class Demo {

    public static void main(String[] args) {
//        Person person;
//        try {
//            person = (Person) Class.forName("cc.docss.javase.reflection.Person").getConstructor(new Class[]{String.class}).newInstance("Chen");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(personStr(person));

        Person person = new Person("chen");
        Person person1 = new Person("chen");
        System.out.println(Objects.equals(person, person1));

//        Device device = new Phone();
//        System.out.println(device.getDevice() instanceof Phone);

//        String

//        Integer i0 = 100;
//        int _i0 = 100;
//        System.out.println(i0 == _i0);
//        System.out.println(i0.equals(_i0));
//
//        Integer i1 = 200;
//        int _i1 = 200;
//        System.out.println(i1 == _i1);
//        System.out.println(i1.equals(_i1));
//
//        System.out.println((Object)_i1 instanceof Integer);
    }

    public static String personStr(Person person) {
        return person.toString();
    }

}
