package BehaviouralPatterns.State;

public class TrafficLight {
    TrafficLightScale state;

    TrafficLight(){
        state = new RedLight();
    }
    public void next(){
        state.next(this);
    }
    public void show(){
        state.show();
    }
    public void setState(TrafficLightScale light){
        this.state = light;
    }
}
