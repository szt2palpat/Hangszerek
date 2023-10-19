package Music;

public class Violin extends Stringedinstrument{
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
    public Violin(){
        name="Violin";
        sound="Screech";
        number=4;
    }
}
