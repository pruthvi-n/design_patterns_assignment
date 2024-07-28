package net.media.training.designpattern.composite;

import java.util.List;

public interface FileComponent {
    public String getName();
    public int getSize();
    public void setParent(FileComponent parent);
    public FileComponent getParent();
    public List<FileComponent> getComponents();
    public void removeEntry(FileComponent component);
    public void delete();
    public boolean componentExist(String fileName);
}
