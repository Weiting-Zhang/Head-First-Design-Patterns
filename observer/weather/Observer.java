public interface Observer {
    public void update(float temp, float humidity, float pressure); // 这里将观测值直接传入，没有被很好的封装
}
