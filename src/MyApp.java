import javax.swing. *;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class MyApp extends JFrame{

    public MyApp(){
        super("Application java");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize( 600, 400);
        this.setLocationRelativeTo(null);

        JPanel conteneurPrincipal = (JPanel) this.getContentPane();
        conteneurPrincipal.add(createToolBar(), BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(new JTree());
        scrollPane.setPreferredSize(new Dimension(200,0));
        conteneurPrincipal.add(scrollPane, BorderLayout.WEST);

        JTextArea texteConteneur = new JTextArea("Le contenu bpppppppp  laal   blab  lbl ablba");
        JScrollPane scrol = new JScrollPane(texteConteneur);
        conteneurPrincipal.add(scrol);

        conteneurPrincipal.add(createRightPanel(), BorderLayout.EAST);

        conteneurPrincipal.add(createStatutBar(), BorderLayout.SOUTH);

    }

    private  JToolBar createToolBar(){
        JToolBar toolBar = new JToolBar();

        JButton btn = new JButton("CLiquez ");
        toolBar.add(btn);

        JButton cliquez = new  JButton("CLiquez Blablablablablabalbalba");
        toolBar.add(cliquez);

        JTextField editME = new JTextField("Edit ME");
        editME.setPreferredSize(new Dimension(140, 30));
        toolBar.add(editME);

        JCheckBox cochez = new JCheckBox("Cochez");
        toolBar.add(cochez);

        return toolBar;

    }

    private JPanel createStatutBar(){
        JPanel statutBar = new JPanel(new  FlowLayout(FlowLayout.LEFT ));

        JLabel statut1 = new JLabel("Message 1 ");
        statut1.setPreferredSize(new Dimension(100, 30));
        statutBar.add(statut1);

        JLabel statut2 = new JLabel("Message 2 ");
        statut2.setPreferredSize(new Dimension(100, 30));
        statutBar.add(statut2);

        JLabel statut3 = new JLabel("Message 3 ");
        statut3.setPreferredSize(new Dimension(100, 30));
        statutBar.add(statut3);

        return  statutBar;
    }

    private JPanel createRightPanel(){
        JPanel panel = new JPanel(new GridLayout(4,1));
        panel.add(new JButton("Bouton 1 "));
        panel.add(new JButton("Bouton 2 "));
        panel.add(new JButton("Bouton 3"));
        panel.add(new JButton("Bouton 4 "));
        return  panel;
    }


    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        MyApp maFenetre = new MyApp();
        maFenetre.setVisible(true);
    }
}
