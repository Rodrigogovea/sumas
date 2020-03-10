package miventana;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class laVentana extends JFrame
{
    private JLabel lblText;
    private JTextArea display;
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0,botonigual,btnmultiplicar,btnsumar,btndividir,btnrestar;
    private operaciones misOperaciones;
    private int op;
    
 
    laVentana()    
    {
        super();
        this.setTitle("Mi Calculadora");
        this.setSize(220,290);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public void inicializarComponentes()
   {
       misOperaciones = new operaciones();
       misOperaciones.setX(0);
       misOperaciones.setY(0);
       
       op = 0;
       
       lblText = new JLabel();
       lblText.setText("Mi calculadora");
       lblText.setBounds(0,5,90,11);
       lblText.setBackground(Color.RED);
       this.add(lblText);
       
       display = new JTextArea();
       display.setToolTipText("Aquí se muestra el resultado");
       display.setBounds(0, 25, 205, 20);
       display.setEditable(false);
       display.setFont(new Font("Calibri",Font.BOLD,18));
       display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       this.add(display);
       
       //botones
       boton1 = new JButton();
       boton1.setText("1");
       boton1.setFont(new Font("Calibri",Font.BOLD,25));
       boton1.setBounds(0, 50, 50, 50);
       boton1.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"1");
           }
       });
       this.add(boton1);
       
       boton2 = new JButton();
       boton2.setText("2");
       boton2.setFont(new Font("Calibri",Font.BOLD,25));
       boton2.setBounds(51, 50, 50, 50);
       boton2.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"2");
           }
       });
       this.add(boton2);
       
       boton3 = new JButton();
       boton3.setText("3");
       boton3.setFont(new Font("Calibri",Font.BOLD,25));
       boton3.setBounds(102, 50, 50, 50);
       boton3.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"3");
           }
       });
       this.add(boton3);
       
       btnmultiplicar = new JButton();
       btnmultiplicar.setText("*");
       btnmultiplicar.setBounds(155, 50, 50, 50);
       btnmultiplicar.setFont(new Font("Calibri",Font.BOLD,25));
       
       btnmultiplicar.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               misOperaciones.setX(Integer.valueOf(display.getText()));
               display.setText("");
               op = 1;
           }
       });
       
       this.add(btnmultiplicar);
       
       boton4 = new JButton();
       boton4.setText("4");
       boton4.setFont(new Font("Calibri",Font.BOLD,25));
       boton4.setBounds(0, 101, 50, 50);
       boton4.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"4");
           }
       });
       this.add(boton4);
       
       boton5 = new JButton();
       boton5.setText("5");
       boton5.setFont(new Font("Calibri",Font.BOLD,25));
       boton5.setBounds(51, 101, 50, 50);
       boton5.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"5");
           }
       });
       this.add(boton5);
       
       boton6 = new JButton();
       boton6.setText("6");
       boton6.setFont(new Font("Calibri",Font.BOLD,25));
       boton6.setBounds(102, 101, 50, 50);
       boton6.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"6");
           }
       });
       this.add(boton6);
       
       btnsumar = new JButton();
       btnsumar.setText("+");
       btnsumar.setFont(new Font("Calibri",Font.BOLD,25));
       btnsumar.setBounds(155, 101, 50, 50);
       this.add(btnsumar);
       
       boton7 = new JButton();
       boton7.setText("7");
       boton7.setFont(new Font("Calibri",Font.BOLD,25));
       boton7.setBounds(0, 152, 50, 50);
       boton7.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"7");
           }
       });
       this.add(boton7);
       
       boton8 = new JButton();
       boton8.setText("8");
       boton8.setFont(new Font("Calibri",Font.BOLD,25));
       boton8.setBounds(51, 152, 50, 50);
       boton8.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"8");
           }
       });
       this.add(boton8);
       
       boton9 = new JButton();
       boton9.setText("9");
       boton9.setFont(new Font("Calibri",Font.BOLD,25));
       boton9.setBounds(102, 152, 50, 50);
       boton9.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"9");
           }
       });
       this.add(boton9);
       
       btndividir = new JButton();
       btndividir.setText("/");
       btndividir.setFont(new Font("Calibri",Font.BOLD,25));
       btndividir.setBounds(155, 152, 50, 50);
       btndividir.addActionListener(new ActionListener()
       {
           @Override
            public void actionPerformed(ActionEvent e)
            {
                misOperaciones.setX(Integer.valueOf(display.getText()));
                op=2;
                display.setText("");
            }
       });
       this.add(btndividir);
       
       boton0 = new JButton();
       boton0.setText("0");
       boton0.setFont(new Font("Calibri",Font.BOLD,25));
       boton0.setBounds(0, 203, 50, 50);
       boton0.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               //JOptionPane.showMessageDialog(null,"Me haz hecho clic!!!");
               display.setText(display.getText()+"0");
           }
       });
       this.add(boton0);
       
       botonigual = new JButton();
       botonigual.setText("=");
       botonigual.setFont(new Font("Calibri",Font.BOLD,25));
       botonigual.setBounds(102, 203, 50, 50);
       
       botonigual.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               if(display.getText()=="")
               {
                   JOptionPane.showMessageDialog(null,"Nada que hacer...","Error",JOptionPane.ERROR_MESSAGE);
               }
               else
               {
                   misOperaciones.setY(Integer.valueOf(display.getText()));
                   if(op==1)
                   {
                       misOperaciones.multiplicacion();
                       display.setText(Integer.toString(misOperaciones.getResultado()));
                       misOperaciones.setX(0);
                       misOperaciones.setY(0);
                   }
                   if(op==2)
                   {
                       misOperaciones.division();
                       display.setText(Integer.toString(misOperaciones.getResultado()));
                       misOperaciones.setX(0);
                       misOperaciones.setY(0);
                   }
               }
           }
       });
       
       this.add(botonigual);
       
       btnrestar = new JButton();
       btnrestar.setText("-");
       btnrestar.setFont(new Font("Calibri",Font.BOLD,25));
       btnrestar.setBounds(155, 203, 50, 50);
       this.add(btnrestar);
   }
}
