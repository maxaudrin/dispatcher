package fr.audr.in.mapping;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import fr.audr.in.persistence.DonneesMessageCleValeurOP;
import fr.audr.in.persistence.MailOP;
import fr.audr.in.resources.DonneesMessageCleValeur;
import fr.audr.in.resources.Mail;

public class MailMapping {
    private MailMappeur mailMappeur;

    @Before
    public void setUp() {
        this.mailMappeur = new MailMappeur();
    }

    @Test
    public void mapToOP() throws Exception {
        Mail mail = new Mail();
        mail.setDonneesMessage(new DonneesMessageCleValeur());
        MailOP mailOP = mailMappeur.mapTo(mail);
        Assert.assertNotNull(mailOP);
        Assert.assertNotNull(mailOP.getDonneesMessage());
        Assert.assertTrue(mailOP.getDonneesMessage() instanceof DonneesMessageCleValeurOP);
    }
}
