import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class CharacterSheetStats extends JPanel {
    private JPanel affichage;

    // Les labels
    private JLabel nameLabel;
    private JLabel raceLabel;
    private JLabel classLabel;

    // Les champs de texte
    private JTextField name;

    // Les boutons radios
    private JRadioButton maleButton;
    private JRadioButton femaleButton;

    // Les combobox
    private JComboBox<Races> race;
    private JComboBox<Classes> classe; // Utilisez Classes au lieu de String pour JComboBox

    public CharacterSheetStats() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridBagLayout()); // Using GridBagLayout for centering

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some spacing

        this.affichage = new JPanel();
        this.affichage.setLayout(new GridLayout(4, 2, 10, 10)); // GridLayout with gaps

        JPanel selectionPersonnage = new JPanel();

        // Ici on ajoute le nom du personnage
        // TIPS : JLabel - JTextField
        this.nameLabel = new JLabel("Nom");
        this.name = new JTextField(10); // Set preferred width

        this.raceLabel = new JLabel("Race");

        this.classLabel = new JLabel("Classe");

        this.add(selectionPersonnage, gbc);

        // Ici on ajoute la sélection de race, on souhaite utilisé l'énumeration Races
        // TIPS : Enum.values() permet de récupérer les valeurs
        Races[] table_race = Races.values();
        this.race = new JComboBox<>(table_race);
        this.race.setPreferredSize(new Dimension(100, 20)); // Set preferred size

        // Ici on ajoute la sélection de classe, on souhaite utilisé l'énumeration Classes
        Classes[] table_classe = Classes.values();
        this.classe = new JComboBox<>(table_classe);
        this.classe.setPreferredSize(new Dimension(100, 20)); // Set preferred size


        // Ici on ajoute les boutons radio H/F (attention, on ne veux pas qu'ils fassent toute la largeur)
        // TIPS : faire un JPanel qui regroupe les deux boutons, ne pas oublier ButtonGroup
        this.maleButton = new JRadioButton("Homme");
        this.femaleButton = new JRadioButton("Femme");

        ButtonGroup bg = new ButtonGroup();

        bg.add(femaleButton);
        bg.add(maleButton);

        JPanel gender = new JPanel();
        gender.add(maleButton);
        gender.add(femaleButton);

        gender.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); // Reduce spacing between buttons

        this.affichage.add(nameLabel);
        this.affichage.add(name);
        this.affichage.add(raceLabel);
        this.affichage.add(race);
        this.affichage.add(classLabel);
        this.affichage.add(classe);
        this.affichage.add(gender);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(affichage, gbc);
    }
}
