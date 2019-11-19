/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat4;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kornél
 */
public class Ido extends JFrame implements ActionListener{
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;
    JLabel lb6;
    JLabel lb7;
    JLabel lb8;
    JLabel lb9;
    JLabel lb10;
    JLabel lb11;
    JLabel lb12;
    
    JButton bt;
    
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
    
    JPanel pl1, pl2, pl3;
    
    public Ido() throws HeadlessException{
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");
        
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tf3 = new JTextField(5);
        tf4 = new JTextField(5);
        tf5 = new JTextField(5);
        tf6 = new JTextField(5);
        tf7 = new JTextField(5);
        tf8 = new JTextField(5);
        tf9 = new JTextField(5);
        tf10 = new JTextField(5);
        tf11 = new JTextField(5);
        tf12 = new JTextField(5);
        
        bt = new JButton("Számol");
        
        pl1 = new JPanel();
        pl2 = new JPanel();
        pl3 = new JPanel();
        
        GridLayout gr = new GridLayout(4, 1);
        setLayout(gr);
        GridLayout gr1 = new GridLayout(2, 8);
        GridLayout gr2 = new GridLayout(1, 1);
        GridLayout gr3 = new GridLayout(1, 8);
        
        pl1.setLayout(gr1);
        pl2.setLayout(gr2);
        pl3.setLayout(gr3);
        
        bt.addActionListener(this);
        
        pl1.add(tf1);
        pl1.add(lb1);
        pl1.add(tf2);
        pl1.add(lb2);
        pl1.add(tf3);
        pl1.add(lb3);
        pl1.add(tf4);
        pl1.add(lb4);
        
        pl1.add(tf5);
        pl1.add(lb5);
        pl1.add(tf6);
        pl1.add(lb6);
        pl1.add(tf7);
        pl1.add(lb7);
        pl1.add(tf8);
        pl1.add(lb8);
        
        pl2.add(bt);
        
        pl3.add(tf9);
        pl3.add(lb9);
        pl3.add(tf10);
        pl3.add(lb10);
        pl3.add(tf11);
        pl3.add(lb11);
        pl3.add(tf12);
        pl3.add(lb12);
        
        this.add(pl1);
        this.add(pl2);
        this.add(pl3);
        
        pack();
    }
    public static void main(String[] args) {
        Ido i = new Ido();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int maradek=0, szam;
        if(e.getSource()==bt){
            szam=Integer.parseInt(tf4.getText()) + Integer.parseInt(tf8.getText());
            if(szam > 60){
                maradek=szam/60;
                tf12.setText(Integer.toString(szam/60));
            } else {
                tf12.setText(Integer.toString(szam));
            }
            szam=Integer.parseInt(tf3.getText()) + Integer.parseInt(tf7.getText());
            if(maradek>0){
                szam+=maradek;
            }
            maradek=0;
            if(szam > 60){
                maradek=szam/60;
                tf11.setText(Integer.toString(szam/60));
            } else {
                tf11.setText(Integer.toString(szam));
            }
            szam=Integer.parseInt(tf2.getText()) + Integer.parseInt(tf6.getText());
            if(maradek>0){
                szam+=maradek;
            }
            maradek=0;
            if(szam > 24){
                maradek=szam/24;
                tf10.setText(Integer.toString(szam/24));
            } else {
                tf10.setText(Integer.toString(szam));
            }
            szam=Integer.parseInt(tf1.getText()) + Integer.parseInt(tf5.getText());
            if(maradek>0){
                szam+=maradek;
            }
            tf9.setText(Integer.toString(szam));
        }
    }
}
