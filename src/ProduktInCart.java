public class ProduktInCart implements Comparable<ProduktInCart>{
    private String nazwa2;
    private String nazwa;
    private int ilosc;
    private float cena;
    private float stawkaVat;

    public ProduktInCart() {
        this.nazwa = "Blad";
        this.ilosc = 0;
        this.cena = 0.0f;
        this.stawkaVat = 0.0f;
        this.nazwa2 = "błąd";
    }

    public ProduktInCart(String nazwa, int ilosc, float cena, float stawkaVat) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
        this.stawkaVat = stawkaVat;
        this.nazwa2 = "błąd";
    }

    public ProduktInCart(String nazwa, int ilosc, float cena) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
        this.stawkaVat = 0.07f;
        this.nazwa2 = "błąd";
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public float getStawkaVat() {
        return stawkaVat;
    }

    public void setStawkaVat(float stawkaVat) {
        this.stawkaVat = stawkaVat;
    }

    @Override
    public String toString() {
        return "ProduktInCart{" +
                "nazwa='" + nazwa + '\'' +
                ", ilosc=" + ilosc +
                ", cena=" + cena +
                ", stawkaVat=" + (int)(stawkaVat * 100) +
                "% }";
    }

    @Override
    public int compareTo(ProduktInCart produktInCart) {
        int lastCmp = nazwa.compareTo(produktInCart.nazwa);
        return (lastCmp != 0 ? lastCmp : nazwa2.compareTo(produktInCart.nazwa2));
    }

}

//Umożliwić sortowanie po wszystkich polach, Jak i całkowitej cenie ilość*cena, wysokości płaconego VAT'u.