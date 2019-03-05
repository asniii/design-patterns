package decorator.pattern.starbuzz.code;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend coffee";
    }

    public double cost(){
        return .89;
    }
}
