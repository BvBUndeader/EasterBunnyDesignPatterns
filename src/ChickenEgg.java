public class ChickenEgg implements Egg{
    @Override
    public String eggType() {
        return "A chicken egg";
    }

    @Override
    public String decorationType() {
        return null;
    }
}
