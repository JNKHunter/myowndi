package tech.eats.art.myowndi;

import java.lang.reflect.Proxy;

/**
 * Created by John on 9/29/16.
 */
//This gives us an opportunity to inject more functionality into the object to be decorated
public class Decorator {

    public static Object decorate(Object toDecorate) {
        Class<?> clazz = toDecorate.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new LoggingAspect(toDecorate));
    }
}
