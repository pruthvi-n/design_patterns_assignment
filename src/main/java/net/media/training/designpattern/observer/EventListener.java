package net.media.training.designpattern.observer;

public interface EventListener {
    void update(String eventType);
    boolean isOutdoors();
}
