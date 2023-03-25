
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulares extends Table {

    public boolean isLibrary(String cadena) {

        /*
         * EJEMPLO 1 PARES ROMANOS
         * String cadena="I";
         * Pattern pat =Pattern.compile("X|I(I|V)|V(I|I{3})");
         * Matcher mat =pat.matcher(cadena);
         * if (mat.matches())
         * System.out.println("VALOR CORRECTO");
         * else
         * System.out.println("VALOR INCORRECTO");
         * 
         * EJEMPLO 2 CORREO
         * String cadena="ai8eeu@tec.mx";
         * Pattern pat =Pattern.compile("(a|e|i|o|u){2}[0-9](a|e|i|o|u){3}@tec.mx");
         * Matcher mat =pat.matcher(cadena);
         * if (mat.matches())
         * System.out.println("VALOR CORRECTO");
         * else
         * System.out.println("VALOR INCORRECTO");
         * 
         * EJEMPLO 3 LONGITUD IMPAR
         * String cadena="1111111";
         * Pattern pat =Pattern.compile("1|(11)+1");
         * Matcher mat =pat.matcher(cadena);
         * if (mat.matches())
         * System.out.println("VALOR CORRECTO");
         * else
         * System.out.println("VALOR INCORRECTO");
         * 
         * ID= [a-z,A-Z][a-z,A-Z,0-9]*
         */

        // *******************************************************ENTEROS***********************************************************
        /*
         * String cadena="int r=a, r=1,r, r=w;";
         * //Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((=([0-9]+|[a-z,A-Z][a-z,A-Z]*))|(,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*(=([0-9]|[a-z,A-Z][a-z,A-Z]*))*)+);"
         * );
         * Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*([0-9]+|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*([0-9]+|[a-z,A-Z][a-z,A-Z]*))*))*;"
         * );
         * //Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*(=([0-9]+|[a-z,A-Z][a-z,A-Z,0-9]*))*;"
         * );
         * //Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*([ ],[ ]*[a-z,A-Z][a-z,A-Z,0-9]*(=([0-9]|[a-z,A-Z][a-z,A-Z]*))*)+;"
         * );
         * Matcher mat =pat.matcher(cadena);
         * if (mat.matches())
         * System.out.println("VALOR CORRECTO");
         * else
         * System.out.println("VALOR INCORRECTO");
         */

        // *******************************************************DOUBLE*****************************************************************
        /*
         * String cadena="float r=10.0,r, d=5.5;";
         * Pattern pat =Pattern.
         * compile("(float|double)[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*([0-9]+.[0-9]+|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*([0-9]+.[0-9]+|[a-z,A-Z][a-z,A-Z]*))*))*;"
         * );
         * //Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*(=([0-9]+|[a-z,A-Z][a-z,A-Z,0-9]*))*;"
         * );
         * // Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*([ ]*,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*+(=([0-9]|[a-z,A-Z][a-z,A-Z]*))*)+;"
         * );
         * Matcher mat =pat.matcher(cadena);
         * if (mat.matches())
         * System.out.println("VALOR CORRECTO");
         * else
         * System.out.println("VALOR INCORRECTO");
         */
        // *******************************************************CHAR*****************************************************************
        /*
         * String cadena="char palabra, letra, frase='a';";
         * Pattern pat =Pattern.
         * compile("char[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*('([a-z,A-Z])'|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*('([a-z,A-Z])'|[a-z,A-Z][a-z,A-Z]*))*))*;"
         * );
         * //Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*(=([0-9]+|[a-z,A-Z][a-z,A-Z,0-9]*))*;"
         * );
         * // Pattern pat =Pattern.
         * compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*([ ]*,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*+(=([0-9]|[a-z,A-Z][a-z,A-Z]*))*)+;"
         * );
         * Matcher mat =pat.matcher(cadena);
         * if (mat.matches())
         * System.out.println("VALOR CORRECTO");
         * else
         * System.out.println("VALOR INCORRECTO");
         */
        Pattern pat = Pattern.compile("#include[ ]*<(stdio.h|iostream.h|conio.h|math.h|time.h|stdlib.h)>");
        // Pattern pat =Pattern.compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[
        // ]*(=([0-9]+|[a-z,A-Z][a-z,A-Z,0-9]*))*;");
        // Pattern pat =Pattern.compile("int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*([ ]*,[
        // ]*[a-z,A-Z][a-z,A-Z,0-9]*+(=([0-9]|[a-z,A-Z][a-z,A-Z]*))*)+;");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isVarInt(String cadena) {
        String aux[], aux2[];
        Pattern pat = Pattern.compile(
                "int[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*([0-9]+|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*([0-9]+|[a-z,A-Z][a-z,A-Z]*))*))*;");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            aux = cadena.split("=");
            for(int i = 0; i< aux.length; i++){
                aux2 = aux[i].split(" ");
                setData(aux2[1]+"\t 4\t int\t 0\t 0004");
                for(int j = 0; j < aux2.length; j++){
                    System.out.println(aux2[j]+"j");
                }
            }
            
            return true;
        }
        return false;
    }

    public boolean isVarDouble(String cadena) {
        Pattern pat = Pattern.compile(
            "(float|double)[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*([0-9]+.[0-9]+|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*([0-9]+.[0-9]+|[a-z,A-Z][a-z,A-Z]*))*))*;");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            return true;
        }
        return false;
    }

    public boolean isVarChar(String cadena) {
        Pattern pat = Pattern.compile(
            "char[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*('([a-z,A-Z])'|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*('([a-z,A-Z])'|[a-z,A-Z][a-z,A-Z]*))*))*;");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            return true;
        }
        return false;
    }

}
