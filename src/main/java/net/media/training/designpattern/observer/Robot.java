package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 10:16:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Robot implements EventListener{
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;

    @Override
    public void update(String eventType){
        if(eventType == "set"){
            this.notifySunSet();
        }
        else{
            this.notifySunRose();
        }
    }

    public boolean isOutdoors() {
        return outdoors;
    }

    public void notifySunRose() {
        feelingWarm = true;
    }

    public void notifySunSet() {
        feelingWarm = false;
        if (outdoors)
            feelingTired = true;
    }

    public void goOutdoors() {
        outdoors = true;
    }

    public void goIndoors() {
        outdoors = false;
    }

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public boolean isFeelingTired() {
        return feelingTired;
    }
}
