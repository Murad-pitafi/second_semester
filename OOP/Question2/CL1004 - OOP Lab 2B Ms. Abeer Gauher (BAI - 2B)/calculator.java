import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private double total1 = 0.0;
    private  double total2 = 0.0;
    private char operator;
    private JPanel Panel;
    private JTextField textField1;
    private JButton btnZero;
    private JButton btnOne;
    private JButton btnSeven;
    private JButton btnFour;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnDot;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnSm;
    private JButton btnML;
    private JButton btnEq;
    private JButton btnSb;
    private JButton btnDiv;
    private JPanel panel;
    private JButton btnPow;

    private void get_operator(String btnText)
        {
            operator = btnText.charAt(0);
            total1 = total1 + Double.parseDouble(textField1.getText());
            textField1.setText("");
        }
    public calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btnOne.getText();
                textField1.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() + btnTwo.getText();
                textField1.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField1.getText() + btnThree.getText();
                textField1.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField1.getText() + btnFour.getText();
                textField1.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField1.getText() + btnFive.getText();
                textField1.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() + btnSix.getText();
                textField1.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() + btnSeven.getText();
                textField1.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() + btnEight.getText();
                textField1.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() + btnNine.getText();
                textField1.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField1.getText() + btnZero.getText();
                textField1.setText(btnZeroText);
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0.");
                } else if (textField1.getText().contains(".")) {
                    btnDot.setEnabled(false);
                } else {
                    String btnDotText = textField1.getText() + btnDot.getText();
                    textField1.setText(btnDotText);
                }
                btnDot.setEnabled(true);
            }
        });
        btnSm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                get_operator(btnSm.getText());
            }
        });
        btnSb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                get_operator(btnSb.getText());
            }
        });
        btnML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                get_operator(btnML.getText());
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                get_operator(btnDiv.getText());
            }
        });
        btnPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                get_operator(btnPow.getText());
            }
        });
        btnEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator)
                {
                    case '+':
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textField1.getText());
                        break;
                    case '^':
                            total2 = Math.pow(total1, Double.parseDouble(textField1.getText())) ;

                            break;
//                    case 'x':
//                        total2 = total1  Double.parseDouble(textField1.getText());
//                        break;
                }
                textField1.setText(Double.toString(total2));
                total1 = 0.0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0.0;
                textField1.setText("");
            }
        });
//        btnPow.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String powTextField = textField1.getText() + btnPow.getText();
//                textField1.setText(powTextField);
//            }
//        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
