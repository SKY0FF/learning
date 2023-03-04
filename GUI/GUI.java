package GUI;
// импорты библиотек для воздание GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{//наследование класса JFRAME
    private JButton button = new JButton("Press");//создание кнопки
    private JTextField input = new JTextField("", 5);// создание поля ввода текста
    private JLabel label = new JLabel("Input: ");//создание надписи
    private JRadioButton radio1 = new JRadioButton("Select this");// создание кружочков с выбором
    private JRadioButton radio2 = new JRadioButton("Select that");// создание кружочков с выбором
    private JCheckBox check = new JCheckBox("Check", false);// создание поля с галочкой

    public GUI (){// создание окна и добавление в него элементов
        super("Simple Example");// название окна
        this.setBounds(100,100,250,100);// положение окна на экране и размеры окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// закрытие программы при нажатии на крестик

        Container container = this.getContentPane();// создание пустого поля в который позже добавим элементы
        container.setLayout(new GridLayout(3, 2, 2, 2));// каким образом расположить элементы
        container.add(label);//добавление надписи в окно
        container.add(input);// добавление поля для ввода текста в окно

        ButtonGroup group = new ButtonGroup();// группа чтобы выбрано было что-то одни
        group.add(radio1);//добавление в группу кружочек выбора 1
        group.add(radio2);//добавление в группу кружочек выбора 2
        container.add(radio1);// добавление 1 кружочка выбора в окно
        radio1.setSelected(true);// по умолчанию выбрано radio1
        container.add(radio2);// добавление 2 кружочка выбора в окно
        container.add(check);// добавление поля с галочкой в окно
        button.addActionListener(new ButtonEventListener());//что будет происходить после нажатия кнопки ButtonEventListener класс который выполняется при нажатии
        container.add(button);// добавление кнопки в окно

    }

    class ButtonEventListener implements ActionListener{// Что будет происходить по нажатию кнопки
        public void actionPerformed(ActionEvent e){// метод который выполняется при нажатии кнопки
            String message = "";// создание переменной  message в которую позже добавим текст
            message += "Button was pressed\n";// добавление текста
            message += "Text is " + input.getText() + "\n";// добавление текста и того что мы ввели в окно
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected\n";//спрашиваем радио 1 выбрано,если да то выводим радио 1, если нет то выводим радио2
            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "uncheked");//тоже спрашиваем выбрана ли галочка если да то cheked, если нет то unchecked
            JOptionPane.showMessageDialog(null/*то что новое окно*/, message/*что выводим*/, "Output"/*название окна*/, JOptionPane.PLAIN_MESSAGE/*просто сообщение*/);//показ диалогового окна
        }
    }
}
