package vacationCalc;

public class Cruise implements expense {
    destination des;
    public void cruiseCost(destination desIN) {
        des = desIN;
        }
    public float getCost()
    {
        switch (des) {
            case Mexico:
                return 1000;
            case Japan:
                return 3000;
            case Europe:
                return 2000;
            default:return  0;
        }
    }
}