import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica extends Container {
    private JPanel panel1;
    private JButton Hola;
    private JButton Adios;
    private JTextField TextField1;

    public InterfazGrafica() {
        Hola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField1.setText("Hola");
            }
        });
        Adios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField1.setText("Adios");
            }
        });
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setContentPane(new InterfazGrafica().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}


