import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Principal {
    public static void main(String[] args) {
        String cad;
        int pos = 0, con = 0;
        String[] todo = new String[100];
        char[] letras = new char[30];
        cad = args[0]; // desde consola al ejecutar

        CleanCode ptr = new CleanCode();// Instanciacion de clase
        Regulares rege_x = new Regulares();

        todo = ptr.lineaCodigo(cad, todo);
        System.out.println(todo[0]);
        System.out.println("*****************************");
        try {
            /***
             * Creacion de fichero para usar en Python:
             * Angel Mendoza
             */
            File file = new File("temp.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            while (todo[con] != null) {
                cad = todo[con];
                if (rege_x.isLibrary(cad) == true) {
                    System.out.print("-");
                } else if (rege_x.isVarInt(cad) == true) {
                    System.out.print("-");
                } else if (rege_x.isVarChar(cad) == true) {
                    System.out.print("-");
                } else if (rege_x.isVarDouble(cad) == true) {
                    System.out.print("-");
                }
                //System.out.println(": " + todo[con]);
                bw.write(todo[con]+"\n");
                con++;
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Tabla de Caracteres:");
        System.out.println("**************************************************");
        rege_x.printTable();
        System.out.println("\n\n");
    }
}