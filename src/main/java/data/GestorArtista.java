package data;

import model.Artista;

import java.io.*;

public class GestorArtista {

    public static void leerDatosArtista(Artista artista) {
        String texto = "";
        try {
            File archivo = new File("datosArtista.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                artista.setNombre(data[0]);
                artista.setGeneroMusical(data[1]);
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal :c");
        }
    }

    public static boolean registrarDato(Object objeto) {
        boolean lineaVacia=false;
        try {
            File file = new File("datosArtista.txt");
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