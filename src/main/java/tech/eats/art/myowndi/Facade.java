package tech.eats.art.myowndi;

/**
 * Created by John on 9/26/16.
 */
public class Facade {

    @TimeOfDay(TimeOfDay.DayTime.MORNING)
    private Service service;

    public void invokeService() {
        service.serve();
    }

    @Override
    public String toString() {
        return "Facade{" +
                "service=" + service +
                ", somethingElse='"  + '}';
    }

    public Service getService() {
        return service;
    }
}
