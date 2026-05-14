public class Partecipazione {
    private Integer tempo;
    private Integer posizione;
    private Atleta atleta;
    private Corsa corsa;

    
    public Partecipazione(int tempo, int posizione, Atleta atleta, Corsa corsa) {
        this.tempo = tempo;
        this.posizione = posizione;
        this.atleta = atleta;
        this.corsa = corsa;
    }

    public Partecipazione(Atleta atleta, Corsa corsa) {
        this.tempo = null;
        this.posizione = null;
        this.atleta = atleta;
        this.corsa = corsa;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Integer getPosizione() {
        return posizione;
    }

    public void setPosizione(Integer posizione) {
        this.posizione = posizione;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public Corsa getCorsa()
    {
        return corsa;
    }

    public String toString()
    {
        return getPosizione() + " " + getAtleta().getNome() + " " + getTempo() + "\n";
    }

    

    
    
}
