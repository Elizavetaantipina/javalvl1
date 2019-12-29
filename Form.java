package geekbrainshomework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    public Form() throws HeadlessException {
        setTitle("Chat emulator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 600);
        JButton[] jButtons = new JButton[2];

        setLayout(new GridLayout(2, 2));
        JTextArea textField = new JTextArea(10, 10);
        textField.setEditable(true);
        JScrollPane sp = new JScrollPane(textField);
        add(sp);

        JTextArea textField1 = new JTextArea();
        add(textField1);
        JScrollPane sp1 = new JScrollPane(textField1);
        add(sp1);

        jButtons[0] = new JButton("Send");
        jButtons[0].addActionListener(actionEvent -> read_and_clear(textField, textField1));
        add(jButtons[0]);

        jButtons[1] = new JButton("Clear history");
        jButtons[1].addActionListener(actionEvent -> textField1.setText(""));
        add(jButtons[1]);
        setVisible(true);
    }
    public void read_and_clear(JTextArea message_area, JTextArea chat_area){
        chat_area.append(message_area.getText() + "\n");
        message_area.setText("");
    }
}

class AppStart {
    public static void main(String[] args) {
        Form form = new Form();
    }
}
