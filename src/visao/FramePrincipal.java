package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import visao.utils.Cor;

/**
 *
 * @author lucas
 */
public class FramePrincipal extends JFrame {
    
    private Container container;
    private Cor cor;
    
    public FramePrincipal() {
        
//        setSize(1024, 720);
        setSize(960, 360);
        
        container = getContentPane();
        
        initComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
    }

    private void initComponentes() {
        
        cor = new Cor();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Arquivo");
        JMenu menu2 = new JMenu("Opção2");
        JMenu menu3 = new JMenu("Opção3");
        JMenuItem menuItem1 = new JMenuItem("Sair");
        JPanel painelCentral = new JPanel();
        JPanel painelStatus = new JPanel();
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menu1.add(menuItem1);
        
        painelCentral.setBackground(Color.decode(cor.getCor()));
        painelCentral.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
        
        painelStatus.setBackground(Color.decode(cor.getCor()));
        painelStatus.add(new JLabel("status"));
        
        container.setLayout(new BorderLayout());
        
        container.add(menuBar, BorderLayout.NORTH);
        container.add(painelCentral, BorderLayout.CENTER);
        container.add(painelStatus, BorderLayout.SOUTH);
    }
}
