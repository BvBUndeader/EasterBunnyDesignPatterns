public interface Koshnik {
    void addObserver(PilencataNaBatko pilence);
    void removeObserver(PilencataNaBatko pilence);
    void notifyObservers(int count);
}
