package tech.eats.art.myowndi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by John on 9/29/16.
 */
public class LoggingAspect implements InvocationHandler {

    private Object target;

    public LoggingAspect(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        try {
            System.out.println("Before method: " + method);
            return  method.invoke(this.target, args);
        } finally {
            System.out.println(method + " invoked in " + (System.nanoTime() - start) + " ns");
        }
    }
}
