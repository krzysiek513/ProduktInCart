import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProduktInCartTest {
    static final Comparator<ProduktInCart> NAZWA_ORDER =
            new Comparator<ProduktInCart>() {
                public int compare(ProduktInCart p1, ProduktInCart p2) {
                    return p1.getNazwa().compareTo(p2.getNazwa());
                }
            };
    static final Comparator<ProduktInCart> ILOSC_ORDER =
            new Comparator<ProduktInCart>() {
                public int compare(ProduktInCart p1, ProduktInCart p2) {
                    return (p1.getIlosc() < p2.getIlosc() ? -1 :
                            (p1.getIlosc() == p2.getIlosc() ? 0 : 1)); }
            };
    static final Comparator<ProduktInCart> CENA_ORDER =
            new Comparator<ProduktInCart>() {
                public int compare(ProduktInCart p1, ProduktInCart p2) {
                    return (p1.getCena() < p2.getCena() ? -1 :
                            (p1.getCena() == p2.getCena() ? 0 : 1)); }
            };
    static final Comparator<ProduktInCart> VAT_ORDER =
            new Comparator<ProduktInCart>() {
                public int compare(ProduktInCart p1, ProduktInCart p2) {
                    return (p1.getStawkaVat() < p2.getStawkaVat() ? -1 :
                            (p1.getStawkaVat() == p2.getStawkaVat() ? 0 : 1));
                }
            };
    static final Comparator<ProduktInCart> CENAILO_ORDER =
            new Comparator<ProduktInCart>() {
                public int compare(ProduktInCart p1, ProduktInCart p2) {
                    return ((p1.getIlosc() * p1.getCena())< (p2.getIlosc() * p2.getCena())) ? -1 :
                            ((p1.getIlosc() * p1.getCena()) == (p2.getIlosc() * p2.getCena()) ? 0 : 1);
                }
            };

    public static void main(String[] args) {
        ProduktInCart jeden = new ProduktInCart("cebuka",3 , 1f, 0.08f);
        ProduktInCart dwa = new ProduktInCart("Ogórek", 33, 13.1f, 0.04f);
        ProduktInCart jeden1 = new ProduktInCart();
        ProduktInCart trzy = new ProduktInCart("Ziemniak", 8, 0.4f , 0.04f);
        ProduktInCart jeden2 = new ProduktInCart();
        ProduktInCart cztery = new ProduktInCart("Windows 5", 132, 555f);
        ProduktInCart piec = new ProduktInCart("Sony", 4, 8f);

        List<ProduktInCart> anotherList = new ArrayList<ProduktInCart>();
        anotherList.add(jeden);
        anotherList.add(dwa);
        anotherList.add(jeden);
        anotherList.add(trzy);
        anotherList.add(jeden);
        anotherList.add(cztery);
        anotherList.add(jeden1);
        anotherList.add(piec);
        anotherList.add(jeden2);

        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie po ilości produktów");
        System.out.println("---------------");
        Collections.sort(anotherList, ILOSC_ORDER);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie po cenie produktu");
        System.out.println("---------------");
        Collections.sort(anotherList, CENA_ORDER);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie po VAT");
        System.out.println("---------------");
        Collections.sort(anotherList, VAT_ORDER);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie po ilości*VAT produktów");
        System.out.println("---------------");
        Collections.sort(anotherList, CENAILO_ORDER);
        anotherList.forEach(System.out::println);
    }
}
