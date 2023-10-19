package Music;

public class BassGuitar extends Stringedinstrument{

    private String name;
    private String sound;
    private int number;
    @Override
    public String GetName() {
        return name;
    }

    @Override
    public void play() {
System.out.println(sound);
    }

    @Override
    public int numberOfStrings() {
        return number;
    }

    @Override
    public String sound() {
        return sound;
    }
    public BassGuitar(){
        name="BassGuitar";
        sound="Duum-duum-duum";
        number=4;
    }
}
