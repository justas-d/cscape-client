import javax.swing.*;
import java.net.*;
import java.awt.*;

public class GUI extends client {

	public GUI(String args[]) {
		super();
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			sign.signlink.startpriv(InetAddress.getByName(server));
			initializeClientFrame();
			init();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void initializeClientFrame() {
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JPopupMenu.setDefaultLightWeightPopupEnabled(false);
			mainFrame = new JFrame("Client");
			mainFrame.setLayout(new BorderLayout());
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gamePanel = new JPanel();
			gamePanel.setLayout(new BorderLayout());
			gamePanel.add(this);
			gamePanel.setPreferredSize(new Dimension(765, 503));
			mainFrame.getContentPane().add(gamePanel, BorderLayout.CENTER);
			mainFrame.pack();
			mainFrame.setVisible(true);
			mainFrame.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public URL getCodeBase() {
		try {
			return new URL("http://" + server + "/cache");
		} catch (Exception e) {
			return super.getCodeBase();
		}
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public JFrame mainFrame;
	public JPanel gamePanel;
}