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

// Call external libraries
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ocupacion {
    // Refill with zeros on the left side of the expression, only if required
    public String ponCeros(String Expre, int tam){
        String local = "";
        for(int i = 0; i < (tam-Expre.length()); i++){
            local = local.concat("0");
        }
        return local.concat(Expre);
    }

    // Print horizontal line, applying length and custom character
    public void impLinea(int largo, char tipo){
        for(int i = 1; i <= largo; i++){
            System.out.print(tipo);
        }
        System.out.println();
    }

    // Returns a random single first name
    public String ocupaciones(){
        Random rnd = new Random();
        String ocupaciones[] = {
                "Ingeniero","Bombero","Policia","Doctor","Veterinario","Piloto",
                "Electrisista","Carpintero","Abogado","Profesor"
        };
        return ocupaciones[rnd.nextInt(ocupaciones.length)];
    }

    // Returns a random last name
    public String generomusical(){
        Random rnd = new Random();
        String generomusical[] = {
             "Indie","Rock","Metal","Bachata","Reggue","Pop"
        };
        return generomusical[rnd.nextInt(generomusical.length)];
    }

    // Creates a religion
    public String religion(){
        Random rnd = new Random();
        String religion[] = {
                "Budista","Agnostico","Cristiano","Evangelico","Judio"
        };
        return religion[rnd.nextInt(religion.length)];
    }

    // Select a random biological sex
    public String alimentacion(){
        Random rnd = new Random();
        String alimentacion[] = {
                "Carniboro","Vegetariano","Vegano","umami","acido"
        };
        return alimentacion[rnd.nextInt(alimentacion.length)];
    }

    // Creates a civil status
    public String genero(){
        Random rnd = new Random();
        String genero[] = {
                "No binario","Transgenero","Genero fluido","Cisgenero","Pangenero"
        };
        return genero[rnd.nextInt(genero.length)];
    }



    //To use in random file access returning text data from clsindividuo object
    public String indtoText(cls_individuo ind){
        String exp = "";
        exp = String.valueOf(ind.getOcupacion()) + ";" +
                ind.getGeneromusical() + ";" +
                ind.getReligion() + ";" +
                ind.getAlimentacion() + ";" +
                String.valueOf(ind.getGenero());
        return exp;
    }

    //To use in random file access returning clsPersona object
    public cls_individuo texttoPers(String Expre){
        try{
            String datos[] = Expre.split(";");
            return new cls_individuo(Integer.parseInt(datos[0]),datos[1],datos[2],datos[3],datos[4],datos[5]);
        }catch (Exception ex){
            return null;
        }

    }//To use in random file access returning text data from clsPersona object

}
