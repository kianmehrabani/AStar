import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class Tile extends JPanel {
	private final Node node;

	public Tile(Node n) {
		super();
		node = n;
		reset();
		setBorder(new MatteBorder(n.y == 0 ? 1 : 0, n.x == 0 ? 1 : 0, 1, 1, new Color(64, 64, 64)));
	}

	public Node getNode() {
		return node;
	}

	public void reset() {
		Color c = Color.WHITE;
		switch(node.getType()) {
			case 1:
				c = new Color(0, 230, 0);
				break;
			case 2:
				c = new Color(230, 0, 0);
				break;
			case 3:
				c = Color.BLACK;
				break;
		}
		setBackground(c);
	}
}