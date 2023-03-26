
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DecimalFormat;

public class Regulares extends Table {

    private int count = 0;
    DecimalFormat formato = new DecimalFormat("0000");

    public boolean isLibrary(String cadena) {
        Pattern pat = Pattern.compile("#include[ ]*<(stdio.h|iostream.h|conio.h|math.h|time.h|stdlib.h)>");
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
            // System.out.println("--------------->"+cadena);
            cadena = cadena.replaceAll("[int|;]", "");
            aux = cadena.trim().split(",");
            for (int i = 0; i < aux.length; i++) {
                if (aux[i].trim().contains("=") == true) {
                    aux2 = aux[i].trim().split("=");
                    count += 4;
                    setData(aux2[0].replace(" ", ""),4,"int",aux2[1].trim(),
                            formato.format(count));
                } else {
                    count += 4;
                    setData(aux[i].trim(),4,"int","0",
                            formato.format(count));
                }
            }

            return true;
        }
        return false;
    }

    public boolean isVarDouble(String cadena) {
        String aux[], aux2[];
        Pattern pat = Pattern.compile(
                "(float|double)[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*([0-9]+.[0-9]+|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*([0-9]+.[0-9]+|[a-z,A-Z][a-z,A-Z]*))*))*;");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            cadena = cadena.replaceAll("(float|double|;)", "");
            aux = cadena.trim().split(",");
            for (int i = 0; i < aux.length; i++) {
                if (aux[i].trim().contains("=") == true) {
                    //System.out.println(aux[i] + "------------------>");
                    aux2 = aux[i].trim().split("=");
                    count += 4;
                    setData(aux2[0].trim(),4,"float",aux2[1].trim(),
                            formato.format(count));
                } else {
                    count += 4;
                    setData(aux[i].trim(),4,"float","0",
                            formato.format(count));
                }
            }

            return true;
        }
        return false;
    }

    public boolean isVarChar(String cadena) {
        String aux[], aux2[];
        Pattern pat = Pattern.compile(
                "char[ ]+[a-z,A-Z][a-z,A-Z,0-9]*[ ]*((,[ ]*[a-z,A-Z][a-z,A-Z,0-9]*[ ]*|=[ ]*('([a-z,A-Z])'|[a-z,A-Z][a-z,A-Z]*)|,[ ]*([a-z,A-Z][a-z,A-Z,0-9]*[ ]*=[ ]*('([a-z,A-Z])'|[a-z,A-Z][a-z,A-Z]*))*))*;");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            cadena = cadena.replaceAll("[char|;]", "");
            aux = cadena.trim().split(",");
            for (int i = 0; i < aux.length; i++) {
                if (aux[i].trim().contains("=") == true) {
                    aux2 = aux[i].trim().split("=");
                    count += 1;
                    setData(aux2[0].trim(),1,"char",aux2[1].trim(),
                            formato.format(count));
                } else {
                    count += 1;
                    setData(aux[i].trim(),1,"char","0",
                            formato.format(count));
                }
            }
            return true;
        }
        return false;
    }

}
