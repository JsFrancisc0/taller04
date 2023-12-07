package gui;

import model.EventoMusical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame implements ActionListener {

    JButton registroEvento, registroAsistente, registroArtista, ventaEntradas;

    public VentanaMenu() {

        registroEvento = new JButton("Registrar Evento");
        registroEvento.addActionListener(this);

        registroArtista = new JButton("Registrar Artista");
        registroArtista.addActionListener(this);

        registroAsistente = new JButton("Registrar Asistente");
        registroAsistente.addActionListener(this);

        ventaEntradas = new JButton("Venta Entradas");
        ventaEntradas.addActionListener(this);


        this.setTitle("Menu Principal");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(registroEvento);
        this.add(registroArtista);
        this.add(registroAsistente);
        this.add(ventaEntradas);
        this.setSize(300,480);
        this.setResizable(false);
        this.setLayout(new GridLayout(4,1));
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
