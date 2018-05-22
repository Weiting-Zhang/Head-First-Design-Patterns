public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(); // 当主题状态改变时，这个方法会被调用，以通知所有的观察者
}
