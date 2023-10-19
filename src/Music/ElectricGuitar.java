package Music;

public class ElectricGuitar extends Stringedinstrument{
private String name;
private String sound;
private int numberOfstrings;
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
        return numberOfstrings ;
    }

    public ElectricGuitar() {
        name="ElectricGuitar";
        sound="Twang";
        numberOfstrings=6;
    }

    @Override
    public String sound() {
return sound;

    }
}
