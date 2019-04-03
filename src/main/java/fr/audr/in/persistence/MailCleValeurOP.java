package fr.audr.in.persistence;

public class MailCleValeurOP implements MessageOP {
    DonneesMessageCleValeurOP donneesMessage;

    @Override
    public DonneesMessageCleValeurOP getDonneesMessage() {
        return donneesMessage;
    }

    public void setDonneesMessage(DonneesMessageCleValeurOP donneesMessage) {
        this.donneesMessage = donneesMessage;
    }
}
