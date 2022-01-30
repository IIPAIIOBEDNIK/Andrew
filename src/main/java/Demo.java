import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javax.swing.JOptionPane.*;

public class Demo {
    public static void main(String[] args) {
        //
        String msg = "Текст синего цвета";
        String txt = "Текст красного цвета";
        //
        JLabel label = new JLabel(msg);
        //
        label.setHorizontalAlignment(JLabel.CENTER);
        //
        label.setForeground(Color.blue);
        //
        Font F = new Font("Arial", Font.ITALIC, 18);
        //
        label.setFont(F);
        //
        label.setBorder(BorderFactory.createEtchedBorder());
        //
        MouseAdapter handler = new MouseAdapter() {
            //
            //
            public void mouseEntered(MouseEvent e){
                label.setText(txt);
                //
                label.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent e){
                label.setText(msg);
                //
                label.setForeground(Color.blue);
            }
        };
        //
        label.addMouseListener(handler);
        showMessageDialog(null, //
                label, //
                "Сообщение", //
                PLAIN_MESSAGE//
        );
    }
}
