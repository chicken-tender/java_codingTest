package 자동차종합예제;

public class Sedan extends Car{
    String name;
    Sedan(String name) {
        carName = name;
        fuelEfficiency = 12;
        speed = 200;
        fuelTank = 45;
        seat = 4;
    }

    @Override
    public void addOption(boolean isOption) {
        if(isOption) seat += 1;
    }
}
