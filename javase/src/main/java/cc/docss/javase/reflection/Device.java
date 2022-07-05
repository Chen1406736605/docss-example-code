package cc.docss.javase.reflection;

/**
 * @author ZhcChen
 * @since 2022-07-04 10:55:27
 */
public interface Device {

    String info();

    default String allInfo() {
        return "all info";
    }

    default Device getDevice() {
        return this;
    }

}
