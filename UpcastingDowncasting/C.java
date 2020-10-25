package lab9.UpcastingDowncasting;

public class C extends B{
    public C(){
        super();
        System.out.println("Constructed an instance of C");
    }
    public String toString(){
        return "This is C";
    }
}
