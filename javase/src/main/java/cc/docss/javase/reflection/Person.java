package cc.docss.javase.reflection;

import lombok.Data;

/**
 * @author ZhcChen
 * @since 2022-07-04 10:14:34
 */
@Data
public class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;
    private Integer age;
    private Integer height;

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
