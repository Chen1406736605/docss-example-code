package cc.docss.javase.th;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhcChen
 * @since 2022-07-04 14:01:39
 */
public class Main {

    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("chen");
//        stringList.add("li");
//        stringList.stream().filter(i -> i.equals("chen"));
//        System.out.println(stringList.size());
//        String s = "Chen";
//        String b = "Chen";
//        String a = s.intern();
//        System.out.println(s == b);
//        System.out.println(s == a);
        RxInterface rxInterface = new Rx();

        InvocationHandler handler = new RxInvocation(rxInterface);

        rxInterface = (RxInterface) Proxy.newProxyInstance(handler.getClass().getClassLoader(), rxInterface.getClass().getInterfaces(), handler);
        rxInterface.setName("chen");
        System.gc();
//        System.out.println(rxInterface.toString());
//        System.out.println(_rx.toString());
    }

}
