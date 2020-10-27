package ba.unsa.etf.rpr.predavanje02;

public class Sat {
   private int sati,minute,sekunde;


    Sat(int sat, int min, int sek) {
        Postavi(sat,min,sek);
    }

    public void Sljedeci() {
        sekunde=sekunde+1;
        if (sekunde==60) { sekunde=0; minute=minute+1; }
        if (minute==60) { minute=0; sati=sati+1; }
        if (sati==24) sati=0;
    }

    public void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
		else for (int i=0; i<-pomak; i++) Prethodni();
    }
    public int DajSate()  { return sati; }
    public int DajMinute()  { return minute; }
    public int DajSekunde()  { return sekunde; }
    public void Ispisi()  {
        System.out.println(sati+":"+minute+":"+sekunde);
    }


    public void Prethodni() {
        sekunde=sekunde-1;
        if (sekunde==-1) { sekunde=59; minute=minute-1; }
        if (minute==-1) { minute=59; sati=sati-1; }
        if (sati==-1) sati=23;
    }


    public void Postavi(int sat, int min, int sek) {
        sati=sat;
        minute=min;
        sekunde=sek;
    }
}
