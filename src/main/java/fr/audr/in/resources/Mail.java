package fr.audr.in.resources;

public class Mail implements Message {
    private DonnessMessage donneesMessage;

    @Override
    public DonnessMessage getDonneesMessage() {
        return donneesMessage;
    }

    public void setDonneesMessage(DonnessMessage donneesMessage) {
        this.donneesMessage = donneesMessage;
    }
}
