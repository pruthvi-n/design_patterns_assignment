package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    EventManager events;

    public Sun(String []events) {
        this.events = new EventManager(events);
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;
        events.notify("set");
    }

    public void rise() {
        isUp = true;
        events.notify("rise");
    }
}