public class Main {

    public static void main(String[] args) {

        Klient klient=new Klient("jan","kowalski",35);
        System.out.println(klient.getImie());

        System.out.println(klient.getNazwisko());

        System.out.println(klient.getWiek());

        Powiesc powiesc = new Powiesc();
        Ksiazka ksiazka;
        ksiazka = (Ksiazka)powiesc;
        powiesc.czytajPowiesc();
        ksiazka.tekstKsiazki = "Zawartość książki";
        ksiazka.czytaj();
    }
}