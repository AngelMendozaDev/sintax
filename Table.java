import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

//ArrayList tabla = new ArrayList<>();
public class Table {
    List<Nodo> tabla = new ArrayList<>();

    public void setData(String name, int tamano, String tipo, String valor, String direccion) {
        this.tabla.add(new Nodo(name, tamano, tipo, valor, direccion));
    }

    public void printTable() {
        System.out.format("%10s %5s %10s %10s %10s", "Nombre", "Tamaño", "Tipo", "Valor", "Dirección");
        System.out.println();
        for (Nodo nodo : tabla) {
            System.out.format("%10s %5d %10s %10s %10s",
                    nodo.getName(), nodo.getTamano(), nodo.getTipo(), nodo.getValor(), nodo.getDir());
            System.out.println();
        }

        try {
            File file = new File("vars.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Nodo nodo : tabla) {
                bw.write(nodo.getName() + "," + nodo.getTamano() + "," + nodo.getTipo() + "," + nodo.getValor() + ","
                        + nodo.getDir() + "\n");
            }

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
