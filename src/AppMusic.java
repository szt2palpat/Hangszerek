import Music.*;

public class AppMusic {
    public static void main(String[] args) {
        BassGuitar bassGuitar=new BassGuitar();
printinstrument(bassGuitar);
        }
        private static void printinstrument(Stringedinstrument insti){
        System.out.println(insti.GetName()+"\n"+insti.sound()+"\n"+insti.numberOfStrings());
        }
    }
