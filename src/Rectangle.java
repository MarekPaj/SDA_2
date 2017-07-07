/**
 * Created by marekp on 07.07.2017.
 */
public class Rectangle {
    private int pole = 0;

 public Rectangle(int x, int y){
     pole = add(x,y);
 }

 public Rectangle(int x, int y, int z){
     pole = add(x,y,z);
 }
    public int getPole(){
     return pole;
    }

    private int add(int... x){
        int wynik = 0;
        for (int i=0; i < x.length; i++)
            wynik = wynik + x[i];
        return wynik;
    }

    private double add(double... x){
        double wynik = 0;
        for (int i=0; i < x.length; i++)
            wynik = wynik + x[i];
        return wynik;
    }
}
