import java.io.File;
import java.util.Scanner;
import java.io.*;

class CleanCode {
  // ******************************
  String[] lineaCodigo(String cad, String[] todo) {
    String[] com1 = new String[30];
    int pos = 0;
    String renglon = "";
    int limite = 0;
    boolean flagComent = false;
    try {
      File ptr2 = new File(cad);
      BufferedReader obj = new BufferedReader(new FileReader(ptr2));
      while ((renglon = obj.readLine()) != null) {
        // borrado de espacios en blanco
        String result = renglon.trim();
        // elimina cadenas en blanco
        if (result.length() > 1) {
          limite = result.length();
          com1 = result.split("");

          if (!com1[0].equals("/") && !com1[1].equals("/") && flagComent == false) {
            todo[pos] = result;
            pos++;
          } else if ((result.charAt(limite - 1) == '/') && (result.charAt(limite - 2) == '*')) {
            flagComent = false;
          } else if ((result.charAt(0) == '/') && (result.charAt(1) == '*')) {
            flagComent = true;
            
          } // else comentario multiples lineas

        } // if si hay algo escrito

        else {
          if (result.length() == 1 && flagComent == false) {
            todo[pos] = result;
            pos++;
          }
        }
      } // while
    } // try
    catch (Exception e) {
      e.printStackTrace();
    }
    return todo;
  }// lineaCodigo

}