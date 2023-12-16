// import javax.swing.*;
// import java.awt.*;

// public class Dialogbox {

//     public static class MyPanel extends JFrame{
//         public MyPanel (){
//             super ("Login Window");

//             setDefaultCloseOperation(EXIT_ON_CLOSE);

//             setSize(300,200);

//             setLocationRelativeTo(null);

//             setLayout(null);

//             setResizable(false);

//             addGuiComponents();
//         }

//         private void addGuiComponents(){
//             JLabel nameLabel = new JLabel("User Name");
//             add (nameLabel);

//             JTextField nameTextField = new JTextField();
//             add(nameTextField);

//             JPasswordField passLabel = new JPasswordField("Password");
//             add(passLabel);

//             JTextField passText = new JTextField();
//             add(passText);

//             JButton okay = new JButton("Okay");
//             add(okay);

//             JButton cancel = new JButton("Cancel");
//             add (cancel);

//             JButton help = new JButton("Help");
//             add(help);
//         }

        
//     }
//     public static void main (String [] args){
//         SwingUtilities.invokeLater(() ->new MyPanel().setVisible(true));
//     }

// }
import javax.swing.*;
import java.awt.*;

public class Dialogbox {

    public static class MyPanel extends JFrame {
        public MyPanel() {
            super("Login Window");

            setDefaultCloseOperation(EXIT_ON_CLOSE);

            setSize(300, 200);

            setLocationRelativeTo(null);

            setLayout(new BorderLayout()); // Set BorderLayout for the frame

            add(createGuiPanel(), BorderLayout.CENTER); // Add the panel to the center

            setResizable(false);
        }

        private JPanel createGuiPanel() {
            JPanel panel = new JPanel(new FlowLayout()); // Use FlowLayout for the panel

            JLabel nameLabel = new JLabel("User Name");
            JTextField nameTextField = new JTextField(15);

            JLabel passLabel = new JLabel("Password");
            JPasswordField passText = new JPasswordField(15);

            JButton okay = new JButton("Okay");
            JButton cancel = new JButton("Cancel");
            JButton help = new JButton("Help");

            panel.add(nameLabel);
            panel.add(nameTextField);
            panel.add(passLabel);
            panel.add(passText);
            panel.add(okay);
            panel.add(cancel);
            panel.add(help);

            return panel;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyPanel().setVisible(true));
    }
}
