package View;

import Logic.VarParse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FirstHomeTaskView extends JFrame{
    public FirstHomeTaskView(String s, boolean b){
        JDialog dialog = createDialogWindow(s,b);

        JTextField numberOfGenVarField = new JTextField("Поле для повторной генерации");
        JTextField data4HomeTask = new JTextField("Поле для данных к Заданию 3");
        numberOfGenVarField.setPreferredSize(new Dimension(200,20));
        data4HomeTask.setPreferredSize(new Dimension(200,20));

        numberOfGenVarField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                numberOfGenVarField.setText("");
            }
            @Override
            public void focusLost(FocusEvent e) {}
        });
        data4HomeTask.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                data4HomeTask.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });


        // Кнопки для создания диалоговых окон
        JButton button1 = new JButton("Cгенерировать ДЗ №1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean flag1 = VarParse.parseAble(numberOfGenVarField.getText()), flag2 = VarParse.parseAble4Data(data4HomeTask.getText());
                result(flag1,flag2);
            }
        });
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(numberOfGenVarField);
        contents.add(data4HomeTask);

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

    public void result(boolean flag1, boolean flag2) {
        JDialog dialog = createDialog("Результат", true);
        JPanel panel = new JPanel();
        JTextField textArea;
        if (flag1 && flag2) {
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
