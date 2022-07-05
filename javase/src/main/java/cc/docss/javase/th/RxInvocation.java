package cc.docss.javase.th;

import com.sun.xml.internal.ws.util.HandlerAnnotationInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZhcChen
 * @since 2022-07-04 15:26:26
 */
public class RxInvocation implements InvocationHandler {

    private Object target;

    public RxInvocation(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method before: ");
        System.out.println("proxy: " + proxy.getClass().getName());
        System.out.println("target: " + target.getClass().getName());
        Object object = method.invoke(target, args);
        System.out.println("method after: ");
        return object;
    }
}
