
package UI.Images;
import java.awt.*;
import javax.swing.JButton;

public class Buttonround extends JButton{
    private final int arc = 40; // Corner radius

    public Buttonround(){
        setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
        super.paintComponent(g2);
        g2.dispose();
    }
    
}
