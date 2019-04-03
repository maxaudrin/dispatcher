package fr.audr.in.mapping;

import fr.audr.in.persistence.DonneesMessageCleValeurOP;
import fr.audr.in.persistence.DonneesMessageOP;
import fr.audr.in.persistence.DonneesMessageXMLOP;
import fr.audr.in.resources.DonneesMessageCleValeur;
import fr.audr.in.resources.DonneesMessageXML;
import fr.audr.in.resources.Mapper;

import java.util.Optional;

public class DonneesMessageMappeurImpl implements Mapper {

    private Optional<DonneesMessageOP> result = Optional.empty();

    private DonneesMessageMappeurImpl() {
    }

    public static DonneesMessageMappeurImpl createDonneesMessageMappeurImpl() {
        return new DonneesMessageMappeurImpl();
    }

    @Override
    public void apply(DonneesMessageCleValeur donneesMessageCleValeur) {
        DonneesMessageCleValeurOP donneesMessageCleValeurOP = new DonneesMessageCleValeurOP();
        this.result = Optional.of(donneesMessageCleValeurOP);
    }

    @Override
    public void apply(DonneesMessageXML donneesMessageXML) {
        DonneesMessageXMLOP donneesMessageXMLOP = new DonneesMessageXMLOP();
        this.result = Optional.of(donneesMessageXMLOP);
    }

    public Optional<DonneesMessageOP> getMappingResult() {
        return result;
    }
}
