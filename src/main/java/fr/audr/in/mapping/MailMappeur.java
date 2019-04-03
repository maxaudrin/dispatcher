package fr.audr.in.mapping;

import fr.audr.in.persistence.DonneesMessageOP;
import fr.audr.in.persistence.MailOP;
import fr.audr.in.resources.Mail;

import java.util.Optional;

public class MailMappeur {


    MailOP mapTo(Mail mail) throws Exception {
        MailOP mailOP = new MailOP();
        DonneesMessageMappeurImpl donneesMessageMappeurImpl = DonneesMessageMappeurImpl.createDonneesMessageMappeurImpl();
        mail.getDonneesMessage().map(donneesMessageMappeurImpl);
        Optional<DonneesMessageOP> mappingResult = donneesMessageMappeurImpl.getMappingResult();
        mappingResult.ifPresent(donneesMessageOP -> mailOP.setDonneesMessage(donneesMessageOP));
        return mailOP;
    }
}
