package cc.docss.javase.th;

import lombok.Data;

/**
 * @author ZhcChen
 * @since 2022-07-04 14:55:02
 */
@Data
public class RxMain {

    @RxValidate("ddd")
    @RxValidate("ddd2")
    private String ddd;

}
