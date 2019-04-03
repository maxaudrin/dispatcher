package fr.audr.in.resources;

public class DonneesMessageXML implements DonnessMessage {
    private String donnees;

    public String getDonnees() {
        return donnees;
    }

    public void setDonnees(String donnees) {
        this.donnees = donnees;
    }

    @Override
    public void map(Mapper mapper) {
        mapper.apply(this);
    }
}
