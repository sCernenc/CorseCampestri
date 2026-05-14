import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Corsa {
    private String nome;
    private String luogo;
    private LocalDateTime dataOra;

    private ArrayList<Partecipazione> partecipanti;

    public Corsa(String nome, String luogo, LocalDateTime dataOra) {
        this.nome = nome;
        this.luogo = luogo;
        this.dataOra = dataOra;
        partecipanti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public boolean addPartecipante(Atleta a, int tempo, int posizione)
    {
        for (Partecipazione partecipazione : partecipanti) 
            if (partecipazione.getAtleta() == a)
                return false;

        Partecipazione p = new Partecipazione(tempo,posizione,a,this);
        partecipanti.add(p);
        a.addPartecipazione(p);
        return true;
    }

    public String classifica()
    {
        partecipanti.sort((p1,p2)->Integer.compare(p1.getPosizione(), p2.getPosizione()));
        String sClassifica = "";
        for (Partecipazione p : partecipanti) sClassifica += p.toString();
        return sClassifica;

    }

    



    

    
}
