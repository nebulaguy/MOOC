package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private int onSwitch;
    public TemperatureSensor() {
        this.onSwitch = 0;
    }
    
    @Override
    public boolean isOn() {
        if(onSwitch == 0) {
            return false;
        }  
        return true;
    }

    @Override
    public void setOn() {
        this.onSwitch = 1;
    }

    @Override
    public void setOff() {
        this.onSwitch = 0;
    }

    @Override
    public int read() {
        if(this.onSwitch == 0) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }

}
