import java.util.ArrayList;
import java.util.List;

public class EggFactory implements Koshnik{
    private List<PilencataNaBatko> pilenca;
    private int eggsCount;

    public EggFactory(){
        pilenca = new ArrayList<>();
        eggsCount = 0;
    }

    public Egg createEgg(String type){
        switch (type){
            case "chicken":
                eggsCount++;
                notifyObservers(eggsCount);
                return new ChickenEgg();
            case "quail":
                eggsCount++;
                notifyObservers(eggsCount);
                return new QuailEgg();
            case "dino":
                eggsCount++;
                notifyObservers(eggsCount);
                return new DinoEgg();
            default:
                throw new IllegalArgumentException("Invalid egg type!");
        }
    }

    @Override
    public void addObserver(PilencataNaBatko pilence) {
        pilenca.add(pilence);
    }

    @Override
    public void removeObserver(PilencataNaBatko pilence) {
        pilenca.remove(pilence);
    }

    @Override
    public void notifyObservers(int count) {
        for(PilencataNaBatko pilence : pilenca){
            pilence.update(count);
        }
    }
}
