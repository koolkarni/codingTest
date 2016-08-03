import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class PlatformEngineerCodeTest {

	HashMap<String, LinkedList<String>> dependsMap = new HashMap<String, LinkedList<String>>();

	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("cmdList.txt"));
		PlatformEngineerCodeTest pt = new PlatformEngineerCodeTest();
		for (String cmd : lines) {
			String[] str = cmd.split(" ");

			if (str[0].equals("LIST")) {
				pt.LIST();
			}

			if (str[0].equals("DEPEND")) {
				pt.DEPEND(str);
			}

			if (str[0].equals("INSTALL")) {
				pt.INSTALL(str[1]);
			}

			if (str[0].equals("REMOVE")) {
				pt.REMOVE(str[1]);
			}

		}

	}

	private void REMOVE(String str) {
		// TODO Auto-generated method stub

	}

	private void INSTALL(String str) {
		// TODO Auto-generated method stub

	}

	private void DEPEND(String[] str) {
		LinkedList<String> hs = new LinkedList<String>();
		for (String tools : str) {
			tools = tools.trim();
			if (!tools.equalsIgnoreCase("DEPEND") && !tools.equals(str[str.length - 1])) {
				hs.add(tools);
			}

		}
		dependsMap.put(str[str.length - 1], hs);

		System.out.println(dependsMap);

	}

	private void LIST() {
		// TODO Auto-generated method stub

	}

	private static Node addChild(Node parent, String id) {
		Node node = new Node(parent);
		node.setTool(id);
		parent.getChildren().add(node);
		return node;
	}

	private static void printTree(Node node, String appender) {
		System.out.println(appender + node.getTool());
		for (Node each : node.getChildren()) {
			printTree(each, appender + appender);
		}
	}
}
