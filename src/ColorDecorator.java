public class ColorDecorator extends EggDecorator {

    public ColorDecorator(Egg egg) {
        super(egg);
    }


    @Override
    public String decorationType(){
        return " with a color decoration";
    }
}
