package data;

import model.Entrada;
import model.EventoMusical;

import java.io.*;

public class GestorEvento {


    public static void leerDatosEvento(EventoMusical evento) {
        String texto = "";
        try {
            File archivo = new File("datosEvento.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                evento.setNombre(data[0]);
                evento.setFecha(data[1]);
                evento.setLugar(data[2]);
                //evento.setArtistasAsociados(data[3]);
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal :c");
        }
    }

    public static boolean registrarDato(Object objeto) {
        boolean lineaVacia=false;
        try {
            File file = new File("datosEvento.txt");
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