package strategy.pattern.SimUDuck;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck ");
    }
}
