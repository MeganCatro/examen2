import java.io.*;

public class cls_indu {
    static functions funcs = new functions();
    static String Direc = System.getProperty("user.dir") + "\\data\\cls_indu.txt";

    public static void main(String args[]) {
        // Self instance local
        cls_indu exec = new cls_indu();

        exec.createFile(1000, false);
        exec.print_formatFields();
    }

    // Create flat file and populate it with data
    private void createFile(int totalRows, boolean append) {
        PrintWriter pw = null;
        String Expre = "";
        try {
            // Open file to write static length record
            pw = new PrintWriter(new FileWriter(Direc, append));

            // Create data set
            for (int i = 1; i <= totalRows; i++) {
                // Create each record
                Expre = funcs.Cedula() + ";" +
                        funcs.Nombre() + ";" +
                        funcs.Apellido() + ";" +
                        funcs.Apellido() + ";" +
                        funcs.Sexo() + ";" +
                        funcs.estCivil() + ";" +
                        funcs.fecNac();

                // Write record
                pw.println(Expre);

                // Clean local variable
                Expre = "";
            }
            // Close flat file
            pw.close();
        } catch (IOException e) {
            // Print stack errors
            e.printStackTrace();
        }
    }

    // Print all data function field by field, with format
    private void print_formatFields() {
        String datos[], Expre;
        int regi = 0;
        System.out.printf("%-9s │ %-15s │ %-15s │ %-15s │ %-4s │ %-8s │ %-10s\n", "Cédula", "Nombre", "Apellido P", "Apellido M", "Sexo", "E. Civil", "Nacido el");
        funcs.impLinea(95, '=');
        try {
            // Create reader object from file
            BufferedReader br = new BufferedReader(new FileReader(Direc));

            // Print each record from buffer
            while ((Expre = br.readLine()) != null) {
                datos = Expre.split(";");

                // Ensure datos array has at least 6 elements to avoid ArrayIndexOutOfBoundsException
                if (datos.length >= 6) {
                    System.out.printf("%s │ %-15s │ %-15s │ %-15s │ %-4s │ %-8s │ %-10s\n", datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                    regi++;
                }
            }

            funcs.impLinea(95, 'a');
            System.out.println("Registros impresos: " + regi);

            // Close buffer
            br.close();
        } catch (IOException ex) {
            // Print stack errors
            ex.printStackTrace();
        }
    }
}
