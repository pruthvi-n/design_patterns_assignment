package net.media.training.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class File implements FileComponent{
    private final String name;
    private int size;
    private FileComponent parent;
    private List<FileComponent> components = new ArrayList<>();


    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    @Override
    public void setParent(FileComponent parent) {
        this.parent = parent;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getSize() {
        return size;
    }
    
    @Override
    public FileComponent getParent() {
        return parent;
    }

    public List<FileComponent> getComponents(){
        return components;
    }

    public void removeEntry(FileComponent directoryToDelete){

    }

    public void delete(){

    }

    public boolean componentExist(String fileName){
        return name == fileName;
    }
}
