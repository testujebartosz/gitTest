public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę cieżarówką bardzo wolno tylko " + speed); }

    @Override
    public void stop() {
        System.out.println("Hamuję cięzarówką!"); }

    @Override
    public String info() {
        return "Ciężarówka";
    }
}
