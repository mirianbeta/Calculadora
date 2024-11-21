import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Calculadora extends JFrame {

    public Calculadora(){
        setTitle("Calculadora de Mirian");
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2,600);       
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) throws Exception {
        Calculadora cal = new Calculadora();
        cal.setVisible(true);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
