abstract public class EggDecorator implements Egg {
    protected Egg egg;
    public EggDecorator(Egg egg){
        this.egg = egg;
    }
    @Override
    public String eggType() {
        return egg.eggType();
    }

    @Override
    public String decorationType() {
        return egg.decorationType();
    }
}
