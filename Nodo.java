public class Nodo {
    private String name, tipo, valor, direccion;
    private int tamano;

    public Nodo(String name, int tamano, String tipo, String valor, String direccion){
        this.name = name;
        this.tamano = tamano;
        this.tipo = tipo;
        this.valor = valor;
        this. direccion = direccion;
    }

    public String getName(){
        return this.name;
    }

    public int getTamano(){
        return this.tamano;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getValor(){
        return this.valor;
    }

    public String getDir(){
        return this.direccion;
    }
}
