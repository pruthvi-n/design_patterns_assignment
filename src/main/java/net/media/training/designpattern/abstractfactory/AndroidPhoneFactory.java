package net.media.training.designpattern.abstractfactory;

public class AndroidPhoneFactory implements PhoneFactory{
    public Case createPhone(){
        MotherBoard motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());

        Screen screen = new AndroidScreen();
        Case phoneCase = new AndroidCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
