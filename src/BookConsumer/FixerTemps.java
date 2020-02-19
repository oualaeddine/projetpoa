package BookConsumer;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


import javax.swing.JLabel;

import javax.swing.JTextField;

import Bean.livre;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FixerTemps {

    public JFrame frame;
    private JTextField tmp;

    public livre l = new livre();
    /**
     * Launch the application.
     */


    /**
     * Create the application.
     *
     * @param text
     */
    public FixerTemps(String text) {
        initialize();
        this.tmp.setText(text);
    }

    public FixerTemps() {

        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 590, 495);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnValider = new JButton("Valider");
        btnValider.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (tmp.getText().equals("")) {

                } else {


                }

            }
        });

        btnValider.setForeground(Color.WHITE);
        btnValider.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
        btnValider.setBackground(new Color(220, 20, 60));
        btnValider.setBounds(179, 300, 200, 50);
        frame.getContentPane().add(btnValider);

        tmp = new JTextField();
        tmp.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
        tmp.setBounds(322, 180, 200, 50);
        frame.getContentPane().add(tmp);
        tmp.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Temps d'attente du consommateur");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
        lblNewLabel_1.setBounds(41, 180, 248, 50);
        frame.getContentPane().add(lblNewLabel_1);


        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setForeground(SystemColor.windowBorder);
        lblNewLabel.setIcon(new ImageIcon("E:\\INFORMATIQUE_M2_GL\\S1\\POAg\\JACAMO\\lol\\img\\universe-2947500_960_720.jpg"));
        lblNewLabel.setOpaque(false);
        lblNewLabel.setBounds(-10, 11, 574, 457);
        frame.getContentPane().add(lblNewLabel);


    }
}

