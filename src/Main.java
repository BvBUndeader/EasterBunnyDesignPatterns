public class Main{
    public static void main(String[] args) {
        EasterBunny easterBunny = EasterBunny.getInstance();
        EggFactory eggFactory = new EggFactory();
        PilencataNaBatko pilence1 = new Pilence();
        PilencataNaBatko pilence2 = new Pilence();
        PilencataNaBatko pilence3 = new Pilence();

        eggFactory.addObserver(pilence1);
        eggFactory.addObserver(pilence2);
        eggFactory.addObserver(pilence3);

        Egg egg1 = eggFactory.createEgg("chicken");
        Egg egg2 = eggFactory.createEgg("dino");
        Egg egg3 = eggFactory.createEgg("quail");
        Egg egg4 = eggFactory.createEgg("dino");
        Egg egg5 = eggFactory.createEgg("chicken");
        Egg egg6 = eggFactory.createEgg("quail");

        easterBunny.magicBag(egg1);
        easterBunny.magicBag(egg2);
        easterBunny.magicBag(egg3);
        easterBunny.magicBag(egg4);
        easterBunny.magicBag(egg5);
        easterBunny.magicBag(egg6);

        eggFactory.removeObserver(pilence1);
        eggFactory.removeObserver(pilence2);
        eggFactory.removeObserver(pilence3);
    }
}