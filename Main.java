import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        super("Ekran Logowania");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel panelGlowny = new JPanel();
        panelGlowny.setLayout(new GridLayout(2, 2));
        panelGlowny.add(new JLabel("Użytkownik: "));
        panelGlowny.add(new JTextField(15));
        panelGlowny.add(new JLabel("Hasło: "));
        panelGlowny.add(new JPasswordField(15));
        add(panelGlowny, BorderLayout.CENTER);
        JPanel panelPrzyciski = new JPanel();
        panelPrzyciski.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelPrzyciski.add(new JButton("Zaloguj"));
        panelPrzyciski.add(new JButton("Anuluj"));
        add(panelPrzyciski, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
