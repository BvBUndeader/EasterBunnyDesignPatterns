import java.util.*;
public class EasterBunny {

    private static EasterBunny instance;

    private EasterBunny(){

    }

    public static EasterBunny getInstance(){
        if(instance == null){
            instance = new EasterBunny();
        }
        return instance;
    }

    public static void magicBag(Egg egg){
        EggFactory eggFactory = new EggFactory();
        Random random = new Random();
        int randomNum = random.nextInt(2);
        if(randomNum == 0){
            new ColorDecorator(egg);
        }else{
            new StickerDecorator(egg);
        }

    }
}
