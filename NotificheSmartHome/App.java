public class App {
    public static void main(String[] args) throws Exception {
        AppleSensor appleSensor = new AppleSensor();


        Luci luce1 = (new Luci("luci1"));
        AdattatoreLuci luceAdattata = new AdattatoreLuci(luce1);

        Allarme allarme1 = new Allarme("allarme casa = ");

        appleSensor.addObserver(luceAdattata);
        appleSensor.addObserver(allarme1);


        appleSensor.changeState("-Rilevati movimenti in casa!-");

    }
}
