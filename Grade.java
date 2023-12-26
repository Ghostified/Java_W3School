import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grade {
    public static void main (String[] args){
        JFrame frame = new JFrame("Grading System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        placeComponents(frame.getContentPane());

        frame.setSize(300,200);
        frame.setVisible(true);
    }
    private static void placeComponents(Container container){
        JLabel regLabel = new JLabel("Registration");
        JTextField regText = new JTextField(10);

        JLabel marksLabel = new JLabel("Marks");
        JTextField marksText = new JTextField(10);

        JLabel gradeLabel = new JLabel("Grade:");
        JTextField gradeText = new JTextField(10);

        JButton gradeButton = new JButton("Find Grade");
        gradeButton.addActionListener((ActionEvent e) -> {
            int mark = Integer.parseInt(marksText.getText());
            gradeText.setText(calculateGrade(mark));

        });
        container.add(regLabel);
        container.add(regText);
        container.add(marksLabel);
        container.add(marksText);
        container.add(gradeLabel);
        container.add(gradeText);
        container.add(gradeButton);

    }

    private static String calculateGrade(int mark) {
        if (mark >= 90){
            return "PASS";
        } else if (mark >= 80) {
            return "AVERAGE";
        } else {
            return "Fail";
        }

    }
    
}
