package fr.audr.in.resources;

import java.util.Map;

public class DonneesMessageCleValeur implements DonnessMessage {
    private Map donnees;

    public Map getDonnees() {
        return donnees;
    }

    public void setDonnees(Map donnees) {
        this.donnees = donnees;
    }

    @Override
    public void map(Mapper mapper) {
        mapper.apply(this);
    }
}
