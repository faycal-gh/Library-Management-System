package Tools_For_Form;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;

public class ExitButton extends JButton {

    public ExitButton() {
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.black);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(230,1,1));
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.red);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
    }
}
