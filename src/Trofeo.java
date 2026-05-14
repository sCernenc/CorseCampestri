public class Trofeo
{
    private String descrizione;
    private String targhetta;
    private String materiale;

    public Trofeo(String descrizione, String targhetta, String materiale) {
        this.descrizione = descrizione;
        this.targhetta = targhetta;
        this.materiale = materiale;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTarghetta() {
        return targhetta;
    }

    public void setTarghetta(String targhetta) {
        this.targhetta = targhetta;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

}