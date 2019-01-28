package Test;

import org.junit.jupiter.api.Test;

import com.simon.Classepersonnage.Personnage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class PersonnageTest {

    private LocalDate outContent;

    @org.junit.Test

    public void GivenFalseTypeToRentrerUneValeur() {
       System.setIn(new BufferedInputStream());
        Personnage Perso= new Personnage();
        Perso.rentrerunevaleur(1,3,"Cara");
        String output = outContent.toString().replace("\r\n", "\n");
        Integer borneinf=1;
        Integer bornesup=3;
        String caracteristique= "Cara";
        assertEquals(output ,"Veuillez mettre " + caracteristique + " compris entre " + borneinf + " et " + bornesup+"\n" , true);
        //assertEquals(output.length() > ("Veuillez mettre " + caracteristique + " compris entre " + borneinf + " et " + bornesup"/n").length(), true);
        }
}