package View;

import Constants.Constants;
import Logic.VarParse;
import PDF_Gen.CreatePDF_Z2;
import com.itextpdf.text.DocumentException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class SecondHomeTaskView extends JFrame{
    public SecondHomeTaskView(String s, boolean b){
        JDialog dialog = createDialogWindow(s,b);

        JTextField numberOfGenVarField = new JTextField(Constants.emptyFieldValue);
        numberOfGenVarField.setPreferredSize(new Dimension(200,20));

        JCheckBox checkBoxFirstTask = new JCheckBox(Constants.checkBox1);
        JCheckBox checkBoxSecondTask = new JCheckBox(Constants.checkBox2);
        JCheckBox checkBoxThirdTask = new JCheckBox(Constants.checkBox3);
        JCheckBox checkBoxFourthTask = new JCheckBox(Constants.checkBox4);
        JCheckBox checkBoxFifthTask = new JCheckBox(Constants.checkBox5);



        numberOfGenVarField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                numberOfGenVarField.setText(Constants.nothingString);
            }
            @Override
            public void focusLost(FocusEvent e) {}
        });

        Boolean[] check1 = new Boolean[1];
        check1[0] = false;
        Boolean[] check2 = new Boolean[1];
        check2[0] = false;
        Boolean[] check3 = new Boolean[1];
        check3[0] = false;
        Boolean[] check4 = new Boolean[1];
        check4[0] = false;
        Boolean[] check5 = new Boolean[1];
        check5[0] = false;



        checkBoxFirstTask.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                check1[0] = e.getStateChange()==1?true:false;
            }
        });

        checkBoxSecondTask.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                check2[0] = e.getStateChange()==1?true:false;
            }
        });

        checkBoxThirdTask.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                check3[0] = e.getStateChange()==1?true:false;
            }
        });

        checkBoxFourthTask.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                check4[0] = e.getStateChange()==1?true:false;
            }
        });

        checkBoxFifthTask.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                check5[0] = e.getStateChange()==1?true:false;
            }
        });



        // Кнопки для создания диалоговых окон
        JButton button1 = new JButton(Constants.secondViewButton);//создание кнопки
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {// обработка нажатия клавиши
                boolean flag1 = VarParse.parseAble(numberOfGenVarField.getText());//предварительная проверка заданного в поле значения(нужно для ускоренной проверки неправильно заданных значений)
                CreatePDF_Z2 createPDFZ2;
                if (flag1){
                    if (numberOfGenVarField.getText().equals(Constants.nothingString)||numberOfGenVarField.getText().equals(Constants.emptyFieldValue)) {//создание варианта при незадданном значении варианта
                        try {
                            createPDFZ2 = new CreatePDF_Z2(Constants.nothingString,Constants.nothingString, check1[0], check2[0], check3[0], check4[0], check5[0]);
                            createPDFZ2.create();
                        } catch (DocumentException documentException) {
                            documentException.printStackTrace();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (URISyntaxException uriSyntaxException) {
                            uriSyntaxException.printStackTrace();
                        }
                    }
                    else {
                        String decoded_s = VarParse.decode(numberOfGenVarField.getText());//создание варианта при заданном значении варианта
                        if (decoded_s.length() == Constants.decodedNumberDZ2){
                            try {
                                createPDFZ2 = new CreatePDF_Z2(decoded_s,numberOfGenVarField.getText(), check1[0], check2[0], check3[0], check4[0], check5[0]);
                                createPDFZ2.create();
                            } catch (DocumentException documentException) {
                                documentException.printStackTrace();
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            } catch (URISyntaxException uriSyntaxException) {
                                uriSyntaxException.printStackTrace();
                            }
                        }
                        else flag1 = false;
                    }
                }
                result(flag1);
            }
        });
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(numberOfGenVarField);
        contents.add(checkBoxFirstTask);
        contents.add(checkBoxSecondTask);
        contents.add(checkBoxThirdTask);
        contents.add(checkBoxFourthTask);
        contents.add(checkBoxFifthTask);


        dialog.add(contents);
        // Определение размера и открытие окна

        dialog.setVisible(true);
    }


    private JDialog createDialog(String title, boolean modal)
    {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(Constants.dialogViewWidth, Constants.dialogViewHeight);
        return dialog;
    }

    private JDialog createDialogWindow(String title, boolean modal)
    {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(Constants.mainViewWidth, Constants.mainViewHeight);
        return dialog;
    }

    public void result(boolean flag1) {
        JDialog dialog = createDialog(Constants.dialogViewName, true);
        JPanel panel = new JPanel();
        JTextField textArea;
        if (flag1) {
            textArea = new JTextField(Constants.goodResult);
            textArea.setEditable(false);
            panel.add(textArea);

        }
        else {
            textArea = new JTextField(Constants.badResult);
            textArea.setEditable(false);
            panel.add(textArea);

        }

        JButton buttonOK = new JButton(Constants.okButton);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        panel.add(buttonOK);

        dialog.add(panel);
        dialog.setVisible(true);
    }
}
