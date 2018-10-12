public class PegeonAdapter implements Quackable{
    Pegeon pegeon;

    public PegeonAdapter(Pegeon pegeon) {
        this.pegeon = pegeon;
    }

    public void quack(){
        pegeon.coo();
    }
}
