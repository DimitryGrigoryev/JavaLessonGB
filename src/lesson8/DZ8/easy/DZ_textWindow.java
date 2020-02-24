package lesson8.DZ8.easy;

import javax.swing.*;
import java.awt.*;

public class DZ_textWindow {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500, 250, 400, 150);
            setTitle("Text Field");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JLabel label = new JLabel("Ввод текста и вывод в консоль по нажатию кнопки.");
            JPanel jpanel = new JPanel();
            add(jpanel, BorderLayout.NORTH);
            jpanel.add(label);
            JTextField field = new JTextField();
            add(field);
            JButton button = new JButton("Press to ");
            add(button, BorderLayout.PAGE_END);
            button.addActionListener(e -> {
                System.out.println(field.getText());
                field.setText(null);
            });
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        new MyWindow();
    }

}