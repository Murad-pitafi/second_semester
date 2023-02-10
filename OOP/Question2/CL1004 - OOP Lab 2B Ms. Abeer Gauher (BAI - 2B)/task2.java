import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 {
    private JTextField Input;
    //private JButton button1;
    private JPanel panel1;
    private JTextField Output;
    private JButton sButton;
    private JButton rButton;
    private JButton fButton;
    private void getFrequency(char Output)
    {
        int x = 0;
        for(int i =0; i <= Input.getText().length(); i++)
        {
            if(Output == Input.getText().charAt(i))
            {
              x++;
            }
        }
        Input.setText(Double.toString(x));
    }
    private void getSearchWord(String Output)
    {
        int i = 0;
        for (i = 0; i < Input.getText().length(); i++)
        {
            if (Output == Input.getText().charAt(i));
        }
    }
    private void getReverse(String Output)
    {
        for (int i = Input.getText().length(); i > 0; i--)
        {
            System.out.println(Input.getText().charAt(i));
        }
    }

    task2() {
        fButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = Output.getText();
                getFrequency(text1);
            }

        });

        rButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getReverse(Input.getText());
            }
        });
        sButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getSearchWord(Output.getText());
            }
        });


        
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("COnversion");
        frame.setContentPane(new task2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
