import java.time.LocalDate;
import java.util.ArrayList;

public class Atleta {

    // Autogenerazione numero tessera
    private static int proxNumTessera=1;

    private int numTessera;
    private String nome;
    private LocalDate dataNascita;
    private String luogoNascita;
    private ArrayList<Trofeo> trofei;
    private ArrayList<Partecipazione> partecipazioni;

    
    // TODO Partecipazione


    public Atleta(String nome, LocalDate dataNascita, String luogoNascita) {
        this.numTessera = proxNumTessera;
        proxNumTessera++;
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.trofei = new ArrayList<>();
        this.partecipazioni = new ArrayList<>();
    }

    public int getNumTessera() {
        return numTessera;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void addTrofeo(Trofeo t)
    {
        trofei.add(t);
    }

    public void addPartecipazione(Partecipazione p)
    {
        partecipazioni.add(p);
    }

    public String stampaCorse(){
        String s = "";
        for (Partecipazione p : partecipazioni) {
           s += p.getCorsa().getNome() + " " + p.getPosizione() + "\n"; 
        }
        return s;     
    }


    

    
}
