package tech.eats.art.myowndi;

import java.util.Date;

/**
 * Created by John on 9/28/16.
 */
public class ServiceImpl implements Service {
    public void serve() {
        System.out.println("Served from impl!" + new Date());
    }
}
