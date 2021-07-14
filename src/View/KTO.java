package View;

import Logic.T1Z1Random;
import PDF_Gen.CreatePDF;
import com.itextpdf.text.DocumentException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

public class KTO extends JFrame
{

    private static final long serialVersionUID = 1L;
    private int modalFlag = 0;

    public KTO() {
        super("КТО Генератор");
        // Выход из программы при закрытии
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Поле для сгенерированного варианта
        JTextField numberOfGenVarField = new JTextField();
        numberOfGenVarField.setPreferredSize(new Dimension(200,20));
        // Кнопки для создания диалоговых окон
        JButton button1 = new JButton("Сгенерировать № варианта");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modalFlag=1;
                numberOfGenVarField.setText(String.valueOf(T1Z1Random.gen()));
            }
        });
        JButton button2 = new JButton("Cгенерировать задания");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(modalFlag != 0)
                try {
                    CreatePDF path = new CreatePDF(numberOfGenVarField.getText());
                } catch (DocumentException documentException) {
                    documentException.printStackTrace();
                } catch (IOException ioException) {
                        ioException.printStackTrace();
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();
                }
                result(modalFlag);

            }
        });
        // Создание панели содержимого с размещением кнопок
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(numberOfGenVarField);
        contents.add(button2);
        setContentPane(contents);
        // Определение размера и открытие окна
        setSize(550, 200);
        setVisible(true);
    }

    private JDialog createDialog(String title, boolean modal)
    {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(180, 100);
        return dialog;
    }

    public static void main(String[] args)
    {
        new KTO();
    }

    public void result(int modalFlag) {
        JDialog dialog = createDialog("Результат", true);
        JPanel panel = new JPanel();
        JTextField textArea;
        if (modalFlag == 0) {
            textArea = new JTextField("Сгенерируйте вариант");
            textArea.setEditable(false);
            panel.add(textArea);
        }
        else if(modalFlag == 1) {
            textArea = new JTextField("Готово");
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



