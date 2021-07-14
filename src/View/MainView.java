package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame{


    JButton button1;
    JButton button2;
    JButton button3;

    public MainView() {
        super("VarGenKTO");
        // Выход из программы при закрытии
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Поле для сгенерированного варианта

        // Кнопки для создания диалоговых окон
        button1 = new JButton("ДЗ №1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FirstHomeTaskView("VarGenKTO_HomeTask№1",true);
            }
        });
        button2 = new JButton("ДЗ №2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SecondHomeTaskView();
            }
        });
        button3 = new JButton("ДЗ №3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThirdHomeTaskView("VarGenKTO_HomeTask№3",true);
            }
        });
        // Создание панели содержимого с размещением кнопок
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(button2);
        contents.add(button3);
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


    public static void main(String[] args) {
        new MainView();
    }
}
