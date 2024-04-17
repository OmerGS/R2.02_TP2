import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CharacterSheetListener implements ActionListener, ChangeListener {

    private CharacterSheet characterSheet;

    public CharacterSheetListener(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }

    public void actionPerformed(ActionEvent e) {
        // Handle actions for buttons in the CharacterSheetToolBar
        if (e.getSource() instanceof JButton) {
            JButton sourceButton = (JButton) e.getSource();
            String buttonText = sourceButton.getText();
            
            // Check which button was clicked and perform corresponding actions
            characterSheet.getCharacterSheetStateBar().updateStatus(buttonText);
        }
    }

    public void stateChanged(ChangeEvent paramChangeEvent) {
        
    }
}
