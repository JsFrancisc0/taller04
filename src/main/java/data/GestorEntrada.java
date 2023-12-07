package data;

import model.Asistente;
import model.Entrada;

import java.io.*;

public class GestorEntrada {

    public static void leerDatosEntrada(Entrada entrada) {
        String texto = "";
        try {
            File archivo = new File("datosEntrada.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                entrada.setPrecioGeneral(Integer.parseInt(data[0]));
                entrada.setPrecioVip(Integer.parseInt(data[1]));
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal :c");
        }
    }

    public static boolean registrarDato(Object objeto) {
        boolean lineaVacia=false;
        try {
            File file = new File("datosEntrada.txt");
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);

            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato!!!");
            return false;
        }
    }
}