import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){
        setVisible(true);
        setLocation(450, 700);
        setSize( 300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel( new GridLayout(1,1));
        JPanel panel2 = new JPanel( new GridLayout(1,1));

        JButton btn1 = new JButton("Выход");
        ActionListener exitListener = new CloseActionListener();
        btn1.addActionListener(exitListener);
        panel.add(btn1);
        JButton btn2 = new JButton("Кнопка2");
        panel.add(btn2);
        JButton btn3 = new JButton("Кнопка3");
        panel2.add(btn3);
        JButton btn4 = new JButton("Кнопка4");
        panel2.add(btn4);
        add(panel, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
    }
}