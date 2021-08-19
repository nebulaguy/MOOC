package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
           
    @Override
    public boolean isOn() {       
        if (!sensors.stream().noneMatch((sensor) -> (!sensor.isOn()))) {
            return false;
        }       
        return true;
        
    }

    @Override
    public void setOn() {
        sensors.forEach((sensor) -> {
            sensor.setOn();
        });
    }

    @Override
    public void setOff() {
        sensors.forEach((sensor) -> {
            sensor.setOff();
        });
    }

    @Override
    public int read() {
        int total = 
            sensors.stream()
                .map(sensor -> sensor.read())
                .reduce(0, (a, b) -> a + b);
        
        int temp = total/this.sensors.size();
        this.readings.add(temp);
        return temp;
    }
    
    

}
