import java.util.ArrayList;

public class Czytelnik extends Osoba {
    private int nrCzytelnika;
    private ArrayList<Ksiazka> wypozyczoneKsiazki = new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, String dataUr, int nrCzytelnika) {
        super(imie, nazwisko, dataUr);
        this.nrCzytelnika = nrCzytelnika;
    }

    public int getNrCzytelnika() {
        return nrCzytelnika;
    }

    public void setNrCzytelnika(int nrCzytelnika) {
        this.nrCzytelnika = nrCzytelnika;
    }

    public ArrayList<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void setWypozyczoneKsiazki(Ksiazka ksiazka) {
        this.wypozyczoneKsiazki.add(ksiazka);
    }

    @Override
    public String toString() {
        return "Czytelnik{ imie: " +getImie()+" nazwisko: "+getNazwisko()+" data urodzenie:"+getDataUr()+
                " nrCzytelnika: " + nrCzytelnika +
                ", wypozyczoneKsiazki: " + wypozyczoneKsiazki +
                '}';
    }
}
