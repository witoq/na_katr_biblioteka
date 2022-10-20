public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka1 = new Biblioteka();
        Czytelnik os1 = new Czytelnik("Jan",  "Paweł","II",1);
        Czytelnik os2 = new Czytelnik("Jakoś",  "sie","nazywa",2);
        Bibliotekarz bib1 = new Bibliotekarz("bibliotekarz1","Nwm", "20.05.2022", "kiedyś na pewno");
        Ksiazka ks1= new Ksiazka("BMW","Niemcy", false);
        Ksiazka ks2= new Ksiazka("VW","Niemcy", true);
        Ksiazka ks3= new Ksiazka("Audi","Niemcy", false);

        biblioteka1.dodajBibliotekarzaDoBiblioteki(bib1);
        biblioteka1.dodajCzytelnikaDoBiblioteki(os1);
        biblioteka1.dodajCzytelnikaDoBiblioteki(os1);
        biblioteka1.dodajCzytelnikaDoBiblioteki(os2);
        biblioteka1.dodajKsiazkeDoBioblioteki(ks1);
        biblioteka1.dodajKsiazkeDoBioblioteki(ks1);
        biblioteka1.dodajKsiazkeDoBioblioteki(ks2);
        biblioteka1.dodajKsiazkeDoBioblioteki(ks3);

        System.out.println(biblioteka1);

        biblioteka1.wypozyczKsiazke(os1, ks2);
        biblioteka1.wypozyczKsiazke(os1, ks1);
        biblioteka1.wypozyczKsiazke(os1, ks3);

        System.out.println(os1);
        System.out.println(ks1);

        biblioteka1.ileKsiazekMaCzytelnik(os1);
        biblioteka1.ileKsiazekMaCzytelnik(os2);

        System.out.println(biblioteka1);


    }
}