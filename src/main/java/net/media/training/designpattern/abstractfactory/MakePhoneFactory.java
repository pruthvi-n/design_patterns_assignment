package net.media.training.designpattern.abstractfactory;

public class MakePhoneFactory {
    
    PhoneFactory createPhoneFactory(String phoneType){
        if(phoneType.equals("Android")){
            return new AndroidPhoneFactory();
        }
        else{
            return new IphoneFactory();
        }
    }
}
