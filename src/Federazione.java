import java.time.LocalDateTime;
import java.util.ArrayList;

public class Federazione {
    private String nome;
    private ArrayList<Atleta> atleti;
    private ArrayList<Corsa> corse;

    public Federazione(String nome)
    {
        this.nome = nome;
        atleti = new ArrayList<>();
        corse = new ArrayList<>();
    }

    public void addCorsa(Corsa c)
    {
        corse.add(c);
    }

    public void tesseraAtleta(Atleta a)
    {
        // TODO: sarebbe carino fare una verifica sui dati anagrafici per evitare duplicazioni
        atleti.add(a);
    }

    public static void main(String[] args) {
        // Creo la federazione e aggiungo corse ed atleti
        Federazione fidal = new Federazione("FIDAL");
        // Inserisco le corse
        fidal.addCorsa(new Corsa("cinque mulini", "Parma", LocalDateTime.of(2025,11,24,9,30)));
        fidal.addCorsa(new Corsa("campaccio", "Parma", LocalDateTime.of(2025,11,24,9,30)));
        fidal.addCorsa(new Corsa("campionato italiano", "Parma", LocalDateTime.of(2025,11,24,9,30)));
        // Tessero gli atletica
        fidal.tesseraAtleta(new Atleta("Yeman Crippa", null,"Milano"));
        fidal.tesseraAtleta(new Atleta("Nadia Battocletti", null,"Piacenza"));
        fidal.tesseraAtleta(new Atleta("Salvatore Antibo", null,"Catania"));
        // Far partecipare atleti a corse
        fidal.corse.get(1).addPartecipante(fidal.atleti.get(1), 130, 3);
        fidal.corse.get(1).addPartecipante(fidal.atleti.get(0), 100, 1);
        fidal.corse.get(1).addPartecipante(fidal.atleti.get(2), 110, 2);
        fidal.atleti.get(0).addTrofeo(new Trofeo("coppa", "bravo hai vinto", "adamantio"));
        // Stampa la classifica di una gare
        System.out.println(fidal.corse.get(1).classifica());
        // Dato un atleta voglio stampare l'elenco delle sue partecipazioni
        
        
        //fidal.stampaCorse(fidal.atleti.get(0));
        System.out.println(fidal.atleti.get(0).stampaCorse());
;
        




    }

    
}
