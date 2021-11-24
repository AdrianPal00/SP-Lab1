package main;

public class AlignRight implements AllignStrategy{
    @Override
    public void render(String str) {
        System.out.println("This is a right alignment");
        System.out.println(str + "##");
    }
}
