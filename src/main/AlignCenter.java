package main;

public class AlignCenter implements AllignStrategy{
    @Override
    public void render(String str) {
        System.out.println("this is a center alignment");
        System.out.println("##" + str + "##");
    }
}
