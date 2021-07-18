package View;

import Constants.Constants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame{


    JButton button1;
    JButton button2;
    JButton button3;

    public MainView() {
        super(Constants.mainViewName);
        // Выход из программы при закрытии
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Поле для сгенерированного варианта

        // Кнопки для создания диалоговых окон
        button1 = new JButton(Constants.mainViewFirstButton);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FirstHomeTaskView(Constants.firstViewName,true);
            }
        });
        button2 = new JButton(Constants.mainViewSecondButton);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SecondHomeTaskView(Constants.secondViewName, true);
            }
        });
        button3 = new JButton(Constants.mainViewThirdButton);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThirdHomeTaskView(Constants.thirdViewName,true);
            }
        });
        // Создание панели содержимого с размещением кнопок
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(button2);
        contents.add(button3);
        setContentPane(contents);
        // Определение размера и открытие окна
        setSize(Constants.mainViewWidth, Constants.mainViewHeight);
        setVisible(true);
    }



    public static void main(String[] args) {
        new MainView();
    }
}
