package lab9.UpcastingDowncasting;

public class B extends A{
    public B(){
        super();
        System.out.println("Constructed an instance of B");
    }
    public String toString(){
        return "This is B";
    }
}
