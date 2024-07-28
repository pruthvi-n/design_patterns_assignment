package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileComponent{
    private final String name;
    private List<FileComponent> components;
    private FileComponent parent;

    public Directory(String name, List<FileComponent> components) {
        this.name = name;
        this.components = components;

        for (FileComponent component : components) {
            component.setParent(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return getSize(this);
    }

    public void setParent(FileComponent directory) {
        this.parent = directory;
    }

    public FileComponent getParent() {
        return parent;
    }


    public int getSize(Directory directoryToSize) {
        int sum = 0;

        for(FileComponent component : components){
            sum += component.getSize();
        }

        return sum;
    }

    public List<FileComponent> getComponents(){
        return components;
    }

    public void removeEntry(FileComponent component) {
        components.remove(component);
    }
    
    
    public void delete() {
        delete(this);
    }

    
    public void delete(FileComponent directoryToDelete) {
        while (directoryToDelete.getComponents().size() > 0) {
            FileComponent component = directoryToDelete.getComponents().get(0);
            if(component.getParent() != null){
                component.getParent().removeEntry(component);
            }
            delete(component);
        }

        if(directoryToDelete.getParent() != null){
            directoryToDelete.getParent().removeEntry(directoryToDelete);
        }
    }



    public void add(FileComponent component) {
        components.add(component);
    }

    private boolean componentExist(String name, FileComponent directoryToSearch) {
        if (directoryToSearch.getName().equals(name))
            return true;
        for (FileComponent component : directoryToSearch.getComponents()) {
            if (component.getName().equals(name)) {
                return true;
            }
            if(componentExist(name,component)){
                return true;
            }
        }
        return false;
    }

    public boolean componentExist(String name) {
        return componentExist(name, this);
    }

}
