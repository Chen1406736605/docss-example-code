package cc.docss.javase.th;

import java.lang.annotation.*;

/**
 * @author ZhcChen
 * @since 2022-07-04 14:49:34
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RxValidates.class)
public @interface RxValidate {

    String value();

}
