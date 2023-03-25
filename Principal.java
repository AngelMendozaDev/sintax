public class Principal {
    public static void main(String[] args) {
        String cad;
        int pos = 0, con = 0;
        String[] todo = new String[100];
        char[] letras = new char[30];
        cad = args[0]; // desde consola al ejecutar

        CleanCode ptr = new CleanCode();//Instanciacion de clase
        Regulares rege_x = new Regulares();
        
        todo = ptr.lineaCodigo(cad, todo);
        System.out.println(todo[0]);
        System.out.println("*****************************");

        while (todo[con] != null) {
            cad = todo[con];
            if(rege_x.isLibrary(cad) == true){
                System.out.print("----->Tabla");
            }
            else if(rege_x.isVarInt(cad) == true){
                System.out.print("----->Tabla");
            }
            else if(rege_x.isVarChar(cad) == true){
                System.out.print("----->Tabla");
            }
            else if(rege_x.isVarDouble(cad) == true){
                System.out.print("----->Tabla");
            }
            System.out.println(": " + todo[con]);
            con++;
        }
        rege_x.printTable();
    }
}