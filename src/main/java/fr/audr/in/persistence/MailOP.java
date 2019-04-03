package fr.audr.in.persistence;

public class MailOP implements MessageOP {
    DonneesMessageOP donneesMessage;

    @Override
    public DonneesMessageOP getDonneesMessage() {
        return donneesMessage;
    }

    public void setDonneesMessage(DonneesMessageOP donneesMessage) {
        this.donneesMessage = donneesMessage;
    }
}
