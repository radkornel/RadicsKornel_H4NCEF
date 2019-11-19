/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kornél
 */
public class Számológép extends JFrame implements ActionListener{
    int jelenszám=0, újszám=0;
    JTextField tf;
    
    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21, bt22, bt23, bt24, bt25, bt26, bt27, bt28;
    
    JPanel pl1, pl2, pl3;
    
    public Számológép() throws HeadlessException{
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField();
        
        bt1 = new JButton("");
        bt2 = new JButton("Backspace");
        bt3 = new JButton("CE");
        bt4 = new JButton("C");
        bt5 = new JButton("MC");
        bt6 = new JButton("7");
        bt7 = new JButton("8");
        bt8 = new JButton("9");
        bt9 = new JButton("/");
        bt10 = new JButton("sqrt");
        bt11 = new JButton("MR");
        bt12 = new JButton("4");
        bt13 = new JButton("5");
        bt14 = new JButton("6");
        bt15 = new JButton("*");
        bt16 = new JButton("%");
        bt17 = new JButton("MS");
        bt18 = new JButton("1");
        bt19 = new JButton("2");
        bt20 = new JButton("3");
        bt21 = new JButton("-");
        bt22 = new JButton("1/x");
        bt23 = new JButton("M+");
        bt24 = new JButton("0");
        bt25 = new JButton("+/-");
        bt26 = new JButton(".");
        bt27 = new JButton("+");
        bt28 = new JButton("=");
        
        pl1 = new JPanel();
        pl2 = new JPanel();
        pl3 = new JPanel();
        
        GridLayout gr = new GridLayout(3, 1);
        setLayout(gr);
        
        GridLayout gr2 = new GridLayout(1, 1);
        GridLayout gr3 = new GridLayout(1, 4);
        GridLayout gr4 = new GridLayout(4, 6);
        
        pl1.setLayout(gr2);
        pl2.setLayout(gr3);
        pl3.setLayout(gr4);
        
        pl1.add(tf);
        
        pl2.add(bt1);
        pl2.add(bt2);
        pl2.add(bt3);
        pl2.add(bt4);
        
        pl3.add(bt5);
        pl3.add(bt6);
        pl3.add(bt7);
        pl3.add(bt8);
        pl3.add(bt9);
        pl3.add(bt10);
        pl3.add(bt11);
        pl3.add(bt12);
        pl3.add(bt13);
        pl3.add(bt14);
        pl3.add(bt15);
        pl3.add(bt16);
        pl3.add(bt17);
        pl3.add(bt18);
        pl3.add(bt19);
        pl3.add(bt20);
        pl3.add(bt21);
        pl3.add(bt22);
        pl3.add(bt23);
        pl3.add(bt24);
        pl3.add(bt25);
        pl3.add(bt26);
        pl3.add(bt27);
        pl3.add(bt28);
        
        bt27.addActionListener(this); //+
        bt28.addActionListener(this); //=
        bt24.addActionListener(this); //0
        bt18.addActionListener(this); //1
        bt19.addActionListener(this); //2
        bt20.addActionListener(this); //3
        bt12.addActionListener(this); //4
        bt13.addActionListener(this); //5
        bt14.addActionListener(this); //6
        bt6.addActionListener(this); //7
        bt7.addActionListener(this); //8
        bt8.addActionListener(this); //9
        
        this.add(pl1);
        this.add(pl2);
        this.add(pl3);
        
        pack();
    }
    
    public static void main(String[] args) {
        Számológép sz = new Számológép();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//a szam gombok mellett, a '+' es '=' mukodik
        if(e.getSource()==bt27){
            jelenszám+=újszám;
            újszám=0;
            tf.setText(Integer.toString(jelenszám));
        }
        if(e.getSource()==bt28){
            jelenszám+=újszám;
            újszám=0;
            tf.setText(Integer.toString(jelenszám));
        }
        if(e.getSource()==bt24){
            újszám*=10;
            újszám+=0;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt18){
            újszám*=10;
            újszám+=1;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt19){
            újszám*=10;
            újszám+=2;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt20){
            újszám*=10;
            újszám+=3;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt12){
            újszám*=10;
            újszám+=4;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt13){
            újszám*=10;
            újszám+=5;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt14){
            újszám*=10;
            újszám+=6;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt6){
            újszám*=10;
            újszám+=7;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt7){
            újszám*=10;
            újszám+=8;
            tf.setText(Integer.toString(újszám));
        }
        if(e.getSource()==bt8){
            újszám*=10;
            újszám+=9;
            tf.setText(Integer.toString(újszám));
        }
    }
}
