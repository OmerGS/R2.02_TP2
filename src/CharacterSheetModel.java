import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

enum Races { // On peut en ajouter d'autres
    Elfe, Hobbit, Homme, Nain
}

enum Classes { // On peut en ajouter d'autres
    Barde, Mage, Paladin, Ranger
}

public class CharacterSheetModel {

    private String CharacterName;
    private String CharacterGender;
    private String CharacterRace;
    private String CharacterClass;

    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public CharacterSheetModel() {
        this.initValues();
    }

    private void initValues() {
        this.CharacterName = new String();
        this.CharacterGender = new String();
        this.CharacterRace = new String();
        this.CharacterClass = new String();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
