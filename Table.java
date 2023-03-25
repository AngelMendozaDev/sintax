import java.util.ArrayList;

public class Table {
    ArrayList tabla = new ArrayList<>();

    public void setData(String info){
        this.tabla.add(info);
    }

    public void printTable(){
        System.out.println("Nombre | Tamaño | Tipo | Valor | Dirección");
        for(int i = 0; i < tabla.size(); i++){
            System.out.println(tabla.get(i));
        }
    }
}
