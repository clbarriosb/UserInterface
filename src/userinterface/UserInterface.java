/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

/**
 *
 * @author Carmen_Lucia3
 */
public class UserInterface implements Runnable {

    private JFrame frame;

    public UserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        /* it only shows the last one 
        JLabel text = new JLabel("Text field!");
        container.add(text); 
        JButton button = new JButton("Click!");
        container.add(button);
        */
        /*
        //Para hacer secciones
        container.setLayout(new BorderLayout());

        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("South"), BorderLayout.SOUTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("Center"), BorderLayout.CENTER);

        container.add(new JButton("Default (Center)"));
        */
        
        /*
        //Para hacer varias palabras horizonalmente
        BoxLayout layout = new BoxLayout(container, BoxLayout.X_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("First!\n"));
        container.add(new JLabel("Second!"));
        container.add(new JLabel("Third!"));
        */
        
        /*
        //Para hacer diferentes palabras verticalmente, solo cambia el axis
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("First!"));
        container.add(new JLabel("Second!"));
        container.add(new JLabel("Third!"));
        */
        
        //By turning one, the others turn off
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Choose meat, fish or chicken:"));

        JRadioButton meat = new JRadioButton("Meat");
        JRadioButton fish = new JRadioButton("Fish");
        JRadioButton chicken = new JRadioButton("Chicken");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(meat);
        buttonGroup.add(fish);
        buttonGroup.add(chicken);

        container.add(meat);
        container.add(fish);
        container.add(chicken);
        
    }

    public JFrame getFrame() {
        return frame;
    }

}
