import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class MaFentreBrderLayt extends JFrame{

    public MaFentreBrderLayt(){
    //le titre est mis dans le constructeur de la classe
    super("Application java");

    //Fermer la fenetre
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    //Préciser la taille de la fenetre
    this.setSize( 600, 400);

    //Choisir une position pour notre fenetre sur le moniteur de manière relative
    //Pointeur null == le bureau
    //L'ordre de cette méthode est obligatoire. D'abord on précise la taille, en suite on place la position

    this.setLocationRelativeTo(null);

        /*

            nous avons principalement trois Zones pour une fenetre qui s'affiche

            1. Bandeau supérieur où est placé et afficher les boutons agrandir, quitter , controlé par l'os,
            mais on peut lui associer certaines informations par rapport aux icones...

            2. La barre de Menu : elle ne fait pas partie des autres element graphiques
            getJMenuBar()

            3. Le reste de composants : de la tool bar jusqu'à ma zone de statut juste en bas
            getContaintPane() : il renvoie un objet de type conteneur qui va contenir d'autres éléments graphiques
            par defaut c'est un JPanel


            Nous creons donc le type par defaut en appliquant un castingavec JPanel

         */



    JPanel conteneurPrincipal = (JPanel) this.getContentPane();

        /*
        La stratégie de positionnemnt est primordiale pour une interface graphique, elle indique
        comment les éléments devront se placer sur le contenneur

        1. null permet de retirer la tratégie  de positionnement
           ex : serLayout(null)
           Les composants sont positionnés les uns sur les autres et invisibles
           car ils ont une taille 0.0 et positionnés au point 0.0

        2. on peut ajouter des composante ne y inserant des précisions telle que la méthode setBounds ()
        :  * Height : la hauteur du composant
           * width : la largueur

         NB: Cette tratégie de positionnement n'est pas pratique dans la mesure  les composatans ne
         s'adaptent pas auc changements

         3. La premiere strtégie de positionnement c'est le Flowlayout ( les éléments en ligne)
            Les composants sont placés avec les dimmensions justes du contenu
            on peut préciser les la taiile d'un compvsant dans le FlowLayout avec la methvde setPreferedSize(new Dimension());

            *** Sur un FLowLayout on peut préciser l'alignement  new FlowLayout.RIGTH Et précisez la marche***


         4. La stratégie GridLayout est une stratégie qui permet de positionner les éléments
            Dans une gille,
            les précision sur les dimmensisons d'un compaosant son t ignorés
            on la cree en utilisant la précision avec GridLayout(ligne, colonne, margeentrecomposantsLargueur, margeentrecomposantsHauteur)

         5. BorderLayout : c'est le mode par defaut , il divise le conteneur en 5 zones :
            * le Nord
            * le sud
            * L'est
            * L'ouest
            * et le centre





        */


    //on veut ajouter des éléments graphiques

    //on ajoute des composants

    JButton btn = new JButton("CLiquez ");
  //  btn.setBounds(200,20, 160, 30);
    conteneurPrincipal.add(btn, BorderLayout.NORTH);

    JButton cliquez = new  JButton("CLiquez Blablablablablabalbalba");
 //   cliquez.setBounds(200, 70, 160, 40);
        cliquez.setPreferredSize(new Dimension(100, 0));
    conteneurPrincipal.add(cliquez, BorderLayout.WEST);


    JCheckBox cochez = new JCheckBox("Cochez");
  //  cochez.setBounds(200, 120, 160, 30);
    conteneurPrincipal.add(cochez, BorderLayout.SOUTH);


    JTextField saisissez = new JTextField("Saisissez quelque chose");
    // saisissez.setBounds(200, 170, 160, 30);
    // saisissez.setPreferredSize(new Dimension(200, 50));
    conteneurPrincipal.add(saisissez);



}

    public static void main(String[] args) {

        //on peut choisir le look de sa fenêtre
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        //on crée un objet de type fenetre  masi qui ne va pas s'afficher lors du lancement du programme
        MaFentreBrderLayt maFenetre = new MaFentreBrderLayt();

        //on affiche la fenetre, mais le processu ne s'interromp pas a la fermetture, la solution est dan sle constructeur
        maFenetre.setVisible(true);
    }
}
