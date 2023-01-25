package Override_methods;

public class Square extends Rectangle{

    @Override
    public double perimeter(){
        return (sides * length);
    }
    public void print(String text){
        System.out.println("this is an example with string " + text);
    }
}
