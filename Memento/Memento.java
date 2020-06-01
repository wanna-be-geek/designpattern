package pattern.Memento;

/**
 * 在不破坏封装性的前提下，
 * 捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态。
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state= state;
    }
    public String getState(){
        return state;
    }
}
