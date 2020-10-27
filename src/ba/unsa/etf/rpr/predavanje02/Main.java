package ba.unsa.etf.rpr.predavanje02;

public class Main {

    public static void main(String[] args) {
        Sat s=new Sat(15,30,45);
        s.DajMinute();
        s.DajSate();
        s.DajSekunde();
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(15,45,30);
        s.Ispisi();

    }
}
