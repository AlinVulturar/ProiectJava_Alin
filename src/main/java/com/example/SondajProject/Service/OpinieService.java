package com.example.SondajProject.Service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SondajProject.Model.Autor;
import com.example.SondajProject.Model.Opinie;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OpinieService {

    @Autowired
    private OpinieRepository opinieRepository;
    @Autowired
    private AutorRepository autorRepository;

    @PostConstruct
    public void populateDB() {
        Autor autor1 = new Autor("Flavius", "Calin");
        Opinie opinie1 = new Opinie("Seria Harry Potter cucerit inimile spectatorilor prin povestea sa " +
                "plină de magie și aventuri care te transportă într-un univers fascinant.");
        opinie1.setAutor(autor1);

        opinieRepository.save(opinie1);
        autorRepository.save(autor1);
        Autor autor2 = new Autor("Maria", "Brancusi");
        Opinie opinie2 = new Opinie("Un aspect remarcabil este modul în care personajele evoluează de-a lungul seriei, " +
                "de la copii timizi la tineri curajoși și puternici.");
        opinie2.setAutor(autor2);

        opinieRepository.save(opinie2);
        autorRepository.save(autor2);

        Autor autor3 = new Autor("Damian", "Marc");
        Opinie opinie3 = new Opinie("Detaliile minuțioase ale lumi magice, de la Castelul Hogwarts la creaturile fantastice, " +
                "au fost redată într-un mod vizual impresionant.");
        opinie3.setAutor(autor3);

        opinieRepository.save(opinie3);
        autorRepository.save(autor3);

        Autor autor4 = new Autor("Elena", "Bancart");
        Opinie opinie4 = new Opinie("Seria explorează teme precum prietenia, curajul și puterea de a înfrunta obstacolele, " +
                "oferind mesaje puternice pentru publicul tânăr.");
        opinie4.setAutor(autor4);

        opinieRepository.save(opinie4);
        autorRepository.save(autor4);

        Autor autor5 = new Autor("Florin", "Mustac");
        Opinie opinie5 = new Opinie("Universul Harry Potter aduce împreună o varietate de personaje unice, " +
                "fiecare aducând cu sine trăsături și background-uri diferite.");
        opinie5.setAutor(autor5);

        opinieRepository.save(opinie5);
        autorRepository.save(autor5);

        Autor autor6 = new Autor("Camelia", "Dumbrava");
        Opinie opinie6 = new Opinie("Seria de filme a fost nevoită să taie sau să comprime multe detalii din cărți, " +
                "ceea ce poate fi dezamăgitor pentru fanii care apreciază profunzimea poveștii originale.");
        opinie6.setAutor(autor6);

        opinieRepository.save(opinie6);
        autorRepository.save(autor6);

        Autor autor7 = new Autor("Augustin", "Pavel");
        Opinie opinie7 = new Opinie("În primele filme, performanțele actorilor copii pot părea puțin rigide sau neprelucrate," +
                " însă s-au îmbunătățit odată cu înaintarea în serii.");
        opinie7.setAutor(autor7);

        opinieRepository.save(opinie7);
        autorRepository.save(autor7);

        Autor autor8 = new Autor("Peter", "Mucenic");
        Opinie opinie8 = new Opinie("Anumite părți ale cărților au fost adaptate în filme într-un mod care a dus la o " +
                "înțelegere mai puțin coerentă a evenimentelor.");
        opinie8.setAutor(autor8);

        opinieRepository.save(opinie8);
        autorRepository.save(autor8);

        Autor autor9 = new Autor("Simona", "Antohe");
        Opinie opinie9 = new Opinie("Pe măsură ce seria a progresat, tonalitatea a devenit mai întunecată, ceea ce poate fi dezorientant pentru cei care " +
                "au început cu filmele mai luminoase și pline de aventuri.");
        opinie9.setAutor(autor9);

        opinieRepository.save(opinie9);
        autorRepository.save(autor9);

        Autor autor10 = new Autor("Simona", "Antohe");
        Opinie opinie10 = new Opinie(" Ultimul film a fost considerat de unii ca având un final prea grăbit și lipsit de" +
                " explicații detaliate pentru anumite aspecte ale poveștii.");
        opinie10.setAutor(autor10);

        opinieRepository.save(opinie10);
        autorRepository.save(autor10);
    }

    public List<Opinie> getAll() {
        return opinieRepository.findAll();
    }

    public Opinie findOpinieById(long id) {
        if (!opinieRepository.existsById(id)) {
            throw new RuntimeException("Opinie with id [" + id + "] does not exist");
        }
        return opinieRepository.findOpinieById(id);
    }

    public void deleteOpinieById(long opinieId) {
        if (!opinieRepository.existsById(opinieId)) {
            throw new RuntimeException("Opinie with id [" + opinieId + "] does not exist");
        }
        Opinie opinie = opinieRepository.findOpinieById(opinieId);
        opinieRepository.delete(opinie);
    }

    public Opinie createOpinie(String opinie, String numeAutor, String prenumeAutor) {
        Opinie newOpinion = new Opinie(opinie, new Autor(numeAutor, prenumeAutor));
        opinieRepository.save(newOpinion);
        return newOpinion;
    }
}
