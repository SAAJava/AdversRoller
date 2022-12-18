package company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame{
    public int res = 0;
    public App(){
        setTitle("AdversRoller");
        JPanel panel = new JPanel();
        JButton roll1 = new JButton("Roll");
        JLabel result = new JLabel("Результат");
        JLabel sila1 = new JLabel("ПАРАМЕТР");
        JLabel Navik1 = new JLabel("НАВЫК");
        JLabel equals = new JLabel("=");
        JLabel equals1 = new JLabel("=");
        JTextField Param = new JTextField("Параметр");
        JTextField Navik = new JTextField("Навык");
        JButton add = new JButton("+");
        JTextField ParamName = new JTextField("ПАРАМЕТР");
        JTextField NavikName = new JTextField("НАВЫК");
        ActionListener listeneradd = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ActionListener listenerroll1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int x = Integer.parseInt(Param.getText());
                int y = Integer.parseInt(Navik.getText());
                int z = rand.nextInt((10) + 1);
                res = x + y + z;
                result.setText(String.valueOf(res));

            }
        };
        roll1.addActionListener(listenerroll1);
        panel.setSize(new Dimension(900,250));
        add(panel);
        panel.add(sila1);
        panel.add(ParamName);
        panel.add(equals1);
        panel.add(Param);
        panel.add(Navik1);
        panel.add(NavikName);
        panel.add(equals);
        panel.add(Navik);
        panel.add(roll1);
        panel.add(result);
        panel.add(add);
        setPreferredSize(new Dimension(900, 900));
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();

    }

}