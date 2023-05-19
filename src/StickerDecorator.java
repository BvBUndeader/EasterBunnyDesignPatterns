public class StickerDecorator extends EggDecorator{
    public StickerDecorator(Egg egg) {
        super(egg);
    }

    @Override
    public String decorationType() {
        return " with sticker decoration";
    }
}

