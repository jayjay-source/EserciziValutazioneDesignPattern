public class Allarme implements Observer{

    private String name;
    
    public Allarme(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "Allarme attivato da " + message);
    }

    

}
