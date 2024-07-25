/*================================================================================================
Study Center....: Universidad TÃ©cnica Nacional
Campus..........: PacÃ­fico (JRMP)
College career..: IngenierÃ­a en TecnologÃ­as de InformaciÃ³n
Period..........: 2C-2024
Course..........: ITI-221 - ProgramaciÃ³n I
Document........: class_06 - functions.java
Goals...........: Functions set to create synthetic data for an example database
Professor.......: Jorge Ruiz (york)
Student.........: Megan Castro Ramirez
================================================================================================*/

//Call external libreries
import java.util.Date;

public class cls_individuo { ;
    private String ocupacion;
    private String generomusical;
    private String religion;
    private String alimentacion;
    private String genero;


    //Default constructor
    public cls_individuo(int i, String dato, String s, String string, char c, char charAt, Date date) {
    }

    //Parametrized constructor, all required
    public cls_individuo(int i, String ocupacion, String generomusical, String religion, String alimentacion, String genero) {
        this.ocupacion = ocupacion;
        this.generomusical = generomusical;
        this.religion = religion;
        this.alimentacion = alimentacion;
        this.genero = genero;
    }

    public cls_individuo() {

    }

    //------------------------------------------------------
    //Create Getter and Setter functions for all properties
    //------------------------------------------------------
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getGeneromusical() {
        return generomusical;
    }

    public void setGeneromusical(String generomusical) {
        this.generomusical = generomusical;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


