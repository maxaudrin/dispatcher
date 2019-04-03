package fr.audr.in.persistence;

import java.util.Map;

public class DonneesMessageCleValeurOP implements DonneesMessageOP {
    private Map donnees;

    public Map getDonnees() {
        return donnees;
    }

    public void setDonnees(Map donnees) {
        this.donnees = donnees;
    }
}
