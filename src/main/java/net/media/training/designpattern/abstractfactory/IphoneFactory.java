package net.media.training.designpattern.abstractfactory;

public class IphoneFactory implements PhoneFactory{
    public Case createPhone(){
        MotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
    
        Screen screen = new IphoneScreen();
    
        Case phoneCase = new IphoneCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
