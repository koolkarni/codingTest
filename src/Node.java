import java.util.ArrayList;
import java.util.List;

public class Node {
	private String tool;
	private final List<Node> children = new ArrayList<>();
	private final Node parent;

	public Node(Node parent) {
		this.parent = parent;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public List<Node> getChildren() {
		return children;
	}

	public Node getParent() {
		return parent;
	}

	
}