package main;

public class AlignLeft implements AllignStrategy{
    @Override
    public void render(String str) {
        System.out.println("This is a left alignment");
        System.out.println("##" + str);
    }
}
