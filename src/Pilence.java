public class Pilence implements PilencataNaBatko{
    @Override
    public void update(int count) {
        if(count > 5){
            System.out.println("Pew Pew! Eggs are ready, my guy!");
        }
    }
}
