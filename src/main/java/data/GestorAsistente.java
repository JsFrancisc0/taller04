package data;

import model.Artista;
import model.Asistente;

import java.io.*;

public class GestorAsistente {

    public static void leerDatosAsistente(Asistente asistente) {
        String texto = "";
        try {
            File archivo = new File("datosAsistente.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                asistente.setNombre(data[0]);
                asistente.setEmail(data[1]);
                asistente.setPreferenciasMusicales(data[2]);
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal :c");
        }
    }

    public static boolean registrarDato(Object objeto) {
        boolean lineaVacia=false;
        try {
            File file = new File("datosAsistente.txt");
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