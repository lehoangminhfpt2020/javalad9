package lab9.PolymorphismEG2;

public class StoneMonster extends Monster{

    public StoneMonster(String name) {
        super(name);
    }
    public String attack(){
        return "Attack with stones!";
    }
}
