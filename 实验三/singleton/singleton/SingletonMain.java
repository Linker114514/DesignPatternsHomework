final class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Pattern Singleton: only one engine");
        OnlyEngine engine = OnlyEngine.getInstance();
        OnlyVehicle vehicle = OnlyVehicle.getInstance();

        vehicle.move();
        System.out.println(String.format(
            "OnlyEngine:'%s', equals with vehicle:'%s'",
            engine, vehicle.getEngine().equals(engine)));
    }
}
