package View;

import Logic.VarParse;
import PDF_Gen.CreatePDF_Z3;
import com.itextpdf.text.DocumentException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;

public class ThirdHomeTaskView extends JFrame{
    public ThirdHomeTaskView(String s, boolean b){
    JDialog dialog = createDialogWindow(s,b);

    JTextField numberOfGenVarField = new JTextField("Поле для повторной генерации");
    numberOfGenVarField.setPreferredSize(new Dimension(200,20));


    numberOfGenVarField.addFocusListener(new FocusListener() {
        public void focusGained(FocusEvent e) {
            numberOfGenVarField.setText("");
        }
        @Override
        public void focusLost(FocusEvent e) {}
    });



    // Кнопки для создания диалоговых окон
    JButton button1 = new JButton("Cгенерировать ДЗ №3");//создание кнопки
    button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {// обработка нажатия клавиши
            boolean flag1 = VarParse.parseAble(numberOfGenVarField.getText());//предварительная проверка заданного в поле значения(нужно для ускоренной проверки неправильно заданных значений)
            if (flag1){
                if (numberOfGenVarField.getText().equals("")||numberOfGenVarField.getText().equals("Поле для повторной генерации")) {//создание варианта при незадданном значении варианта
                    try {
                        CreatePDF_Z3 createPDFZ3 = new CreatePDF_Z3("","");
                    } catch (DocumentException documentException) {
                        documentException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (URISyntaxException uriSyntaxException) {
                        uriSyntaxException.printStackTrace();
                    }
                }
                else {
                    String decoded_s = (new BigInteger(numberOfGenVarField.getText(), 36)).toString();//создание варианта при заданном значении варианта
                    if (decoded_s.length()==50){
                        try {
                            CreatePDF_Z3 createPDFZ3 = new CreatePDF_Z3(decoded_s,numberOfGenVarField.getText());
                        } catch (DocumentException documentException) {
                            documentException.printStackTrace();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (URISyntaxException uriSyntaxException) {
                            uriSyntaxException.printStackTrace();
                        }
                    }else flag1 = false;
                }
            }
            result(flag1);
        }
    });
    JPanel contents = new JPanel();
    contents.add(button1);
    contents.add(numberOfGenVarField);


    dialog.add(contents);
    // Определение размера и открытие окна

    dialog.setVisible(true);
}


        private JDialog createDialog(String title, boolean modal)
        {
            JDialog dialog = new JDialog(this, title, modal);
            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            dialog.setSize(180, 100);
            return dialog;
        }

        private JDialog createDialogWindow(String title, boolean modal)
        {
            JDialog dialog = new JDialog(this, title, modal);
            dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            dialog.setSize(550, 200);
            return dialog;
        }

        public void result(boolean flag1) {
            JDialog dialog = createDialog("Результат", true);
            JPanel panel = new JPanel();
            JTextField textArea;
            if (flag1) {
                textArea = new JTextField("Готово");
                textArea.setEditable(false);
                panel.add(textArea);

            }
            else {
                textArea = new JTextField("Параметры заданы неверно");
                textArea.setEditable(false);
                panel.add(textArea);

            }

            JButton buttonOK = new JButton("ok");
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
