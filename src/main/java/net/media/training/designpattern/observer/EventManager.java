package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private String[] events;
    List<EventListener>listeners = new ArrayList<>();

    EventManager(String[] events){
        this.events = events;
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(String eventType) {
        for (EventListener listener : listeners) {
            if(listener.isOutdoors()){
                listener.update(eventType);
            }
        }

    }

}
