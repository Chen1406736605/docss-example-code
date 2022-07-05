package cc.docss.javase.th;

/**
 * @author ZhcChen
 * @since 2022-07-04 15:32:46
 */
public class Rx implements RxInterface {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rx{" +
                "name='" + name + '\'' +
                '}';
    }

}
