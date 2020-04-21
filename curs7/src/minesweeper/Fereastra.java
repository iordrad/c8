package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fereastra extends JFrame {
    //mostenim clasa JFrame pentru a indica faptul ca Fereastra reprezinta o fereastra grafica
    private JButton button;
    private JLabel label;
    public Fereastra(){
        setTitle("Fereastra Grafica");
        button = new JButton();
        label = new JLabel("0");
        button.setText("Apasa!");
        add(button);
        add(label, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //la un click pe buton, va fi apelata metoda de actionPerformed
                String text = label.getText();
                Integer i = Integer.parseInt(text);
                i++;
                if(i==10){
                    dispose();//inchide fereastra
                }
                label.setText(String.valueOf(i));
            }
        });
        setSize(400,500);
        //setResizable(boolean)
        setLocationRelativeTo(null); //pozitioneze fereastra pe centrul ecranului
        setVisible(true); //o fereastra este implicit invizibila
    }
}
