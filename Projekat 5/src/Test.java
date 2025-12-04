import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.List;

public class Test extends JFrame {

    private JTextField tfIme;
    private JTextField tfZdravlje;
    private JTextField tfX;
    private JTextField tfY;
    private JComboBox<String> cbKolajder;
    private JTextArea taLog;
    private JTextField tfCSV;

    public Test() {
        setTitle("Game Setup");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel glavni = new JPanel(new BorderLayout());
        JPanel forma = new JPanel(new GridLayout(0, 2, 10, 15));
        forma.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        tfIme = new JTextField();
        tfZdravlje = new JTextField();
        tfX = new JTextField();
        tfY = new JTextField();
        tfCSV = new JTextField("enemies.csv");

        cbKolajder = new JComboBox<>(new String[]{"Rectangle", "Circle"});

        forma.add(new JLabel("Ime"));
        forma.add(tfIme);

        forma.add(new JLabel("Health (0–100)"));
        forma.add(tfZdravlje);

        forma.add(new JLabel("X pozicija"));
        forma.add(tfX);

        forma.add(new JLabel("Y pozicija"));
        forma.add(tfY);

        forma.add(new JLabel("Kolajder"));
        forma.add(cbKolajder);

        JButton pokreni = new JButton("Pokreni igru");

        JPanel donjiPanel = new JPanel(new BorderLayout());
        donjiPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        donjiPanel.add(pokreni, BorderLayout.NORTH);

        taLog = new JTextArea();
        taLog.setEditable(false);
        JScrollPane scroll = new JScrollPane(taLog);

        donjiPanel.add(scroll, BorderLayout.CENTER);

        glavni.add(forma, BorderLayout.NORTH);
        glavni.add(donjiPanel, BorderLayout.CENTER);

        add(glavni);

        pokreni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pokreniIgru();
            }
        });
    }

    private void pokreniIgru() {
        try {
            String ime = tfIme.getText().trim();
            int zdravlje = Integer.parseInt(tfZdravlje.getText().trim());
            int x = Integer.parseInt(tfX.getText().trim());
            int y = Integer.parseInt(tfY.getText().trim());

            Kolizibilno kolajder;
            if (cbKolajder.getSelectedItem().equals("Rectangle"))
                kolajder = new PravougaoniKolajder(x, y, 32, 32);
            else
                kolajder = new KruzniKolajder(x, y, 16);

            Igrac igrac = new Igrac(ime, zdravlje, x, y, kolajder);

            List<Neprijatelj> lista = Game.ucitajCSV("enemies.csv");
            Game igra = new Game(igrac);
            for (Neprijatelj n : lista) igra.dodajNeprijatelja(n);

            igra.obradiKolizije();

            StringBuilder sb = new StringBuilder();
            for (String s : igra.getLog()) sb.append(s).append("\n");

            taLog.setText(sb.toString());

            if (igrac.getZdravlje() <= 0)
                JOptionPane.showMessageDialog(this, "Igrač je poražen!");
            else
                JOptionPane.showMessageDialog(this, "Igrač je preživio!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greška: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Test().setVisible(true));
    }
}
