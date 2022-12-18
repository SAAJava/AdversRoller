package company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame{
    Box box = Box.createVerticalBox();
    JFrame theFrame = new JFrame("SmallExample");
    public App(){
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("AdversRoller");
        JPanel panel = new ContentPanel();
        JButton roll1 = new JButton("Roll");
        JLabel result = new JLabel("Результат");
        JLabel sila1 = new JLabel("ПАРАМЕТР");
        JLabel Navik1 = new JLabel("НАВЫК");
        JTextField Param = new JTextField("Параметр");
        JTextField Navik = new JTextField("Навык");
        JButton add = new JButton("+");
        ActionListener listenerAdd = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JPanel panelToAdd = new ContentPanel();

                JLabel generalLabelSila = new JLabel("ПАРАМЕТР");
                JTextField generalTxtFieldParam = new JTextField("Параметр");
                JLabel generalLabelNavik = new JLabel("НАВЫК");
                JTextField generalTxtFieldNavik = new JTextField("Навык");
                JButton generalButtonRoll = new JButton("Roll");

                JLabel generalLabelResult = new JLabel("Результат");
                ActionListener listenerGeneralButtonRoll = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CalculateResult(generalTxtFieldParam, generalTxtFieldNavik, generalLabelResult);
                    }
                };

                generalButtonRoll.addActionListener(listenerGeneralButtonRoll);
                panelToAdd.add(generalLabelSila);
                panelToAdd.add(generalTxtFieldParam);
                panelToAdd.add(generalLabelNavik);
                panelToAdd.add(generalTxtFieldNavik);
                panelToAdd.add(generalButtonRoll);
                panelToAdd.add(generalLabelResult);
                box.add(panelToAdd);
                theFrame.invalidate();
                theFrame.validate();
                theFrame.repaint();
            }
        };
        ActionListener listenerroll1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculateResult(Param, Navik, result);

            }
        };
        roll1.addActionListener(listenerroll1);
        add.addActionListener(listenerAdd);
        panel.add(sila1);
        panel.add(Param);
        panel.add(Navik1);
        panel.add(Navik);
        panel.add(roll1);
        panel.add(result);
        panel.add(add);
        box.add(panel);

        theFrame.add( box );
        theFrame.setSize(500, 400);
        theFrame.setLocationRelativeTo( null );
        theFrame.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }
    @SuppressWarnings("serial")
    class ContentPanel extends JPanel
    {
        public ContentPanel()
        {
            setPreferredSize(new Dimension(100,50));
            Dimension max = getMaximumSize();
            max.height = getPreferredSize().height;
            setMaximumSize( max );
        }  // constructor ContentPanel()
    } // class ContentPanel extends JPanel
    private void CalculateResult(JTextField Param, JTextField Navik, JLabel result) {
        Random rand = new Random();
        int x = Integer.parseInt(Param.getText());
        int y = Integer.parseInt(Navik.getText());
        int z = rand.nextInt((10) + 1);
        result.setText(String.valueOf(x + y + z));
    }

}