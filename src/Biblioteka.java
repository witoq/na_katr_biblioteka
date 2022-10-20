import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Czytelnik> czytelnicy = new ArrayList<>();
    private ArrayList<Bibliotekarz> bibliotekarze = new ArrayList<>();
    private ArrayList<Ksiazka> ksiazki = new ArrayList<>();

    public Biblioteka() {
    }

    public ArrayList<Czytelnik> getCzytelnicy() {
        return czytelnicy;
    }

    public void setCzytelnicy(ArrayList<Czytelnik> czytelnicy) {
        this.czytelnicy = czytelnicy;
    }

    public ArrayList<Bibliotekarz> getBibliotekarze() {
        return bibliotekarze;
    }

    public void setBibliotekarze(ArrayList<Bibliotekarz> bibliotekarze) {
        this.bibliotekarze = bibliotekarze;
    }

    public ArrayList<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(ArrayList<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }
    private boolean czyKsiazkaWBibliotece(Ksiazka ksiazka){
        if(ksiazki.contains(ksiazka))
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void dodajKsiazkeDoBioblioteki(Ksiazka ksiazka){
        if(czyKsiazkaWBibliotece(ksiazka))
        {
            System.out.println("ksiazka jest juz w bibliotece");
        }
        else
        {
            ksiazki.add(ksiazka);
        }
    }
    public boolean czyKsiazkaWypozyczona(Ksiazka ksiazka)
    {
        if(ksiazka.isCzyWypozyczona(ksiazka))
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void wypozyczKsiazke(Czytelnik czytelnik, Ksiazka ksiazka){
        if(czyKsiazkaWypozyczona(ksiazka)){
            System.out.println("ksiazka "+ksiazka.getTytul()+" jest już wypożyczona");
        }
        else{
            ksiazka.setCzyWypozyczona(true);
            czytelnik.setWypozyczoneKsiazki(ksiazka);
        }
    }
    private boolean czyCzytelnikWBibliotece(Czytelnik czytelnik){
        if(czytelnicy.contains(czytelnik)){
            return true;
        }
        else{
            return false;
        }
    }
    public void dodajCzytelnikaDoBiblioteki(Czytelnik czytelnik){
        if(czyCzytelnikWBibliotece(czytelnik)){
            System.out.println("czytelnik "+czytelnik.getImie()+" "+czytelnik.getNazwisko()+" jest już w bibliotece");
        }
        else{
            czytelnicy.add(czytelnik);
        }
    }
    private boolean czyBibliotekarzWBibliotece(Bibliotekarz bibliotekarz){
        if(bibliotekarze.contains(bibliotekarz)){
            return true;
        }
        else{
            return false;
        }
    }
    public void dodajBibliotekarzaDoBiblioteki(Bibliotekarz bibliotekarz){
        if(czyBibliotekarzWBibliotece(bibliotekarz)){
            System.out.println("Bibliotekarz "+bibliotekarz.getImie()+" "+bibliotekarz.getNazwisko()+" jest już w bibliotece");
        }
        else{
            bibliotekarze.add(bibliotekarz);
        }
    }
     public void ileKsiazekMaCzytelnik(Czytelnik czytelnik){
         System.out.println(czytelnik.getImie()+" "+czytelnik.getNazwisko()+" ma wypozyczone "+czytelnik.getWypozyczoneKsiazki().size()+" ksiazki");
     }
    @Override
    public String toString() {
        return "Biblioteka{" +
                " czytelnicy=" + czytelnicy +
                ", bibliotekarze=" + bibliotekarze +
                ", ksiazki=" + ksiazki +
                '}';
    }
}
