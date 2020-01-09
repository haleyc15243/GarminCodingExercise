import java.util.ArrayList;

public class TreeSearch {

	private final static String searchName = "FindMe";
	private static boolean searching = true;
	
	public static Node search(Node tree)
	{
		while (searching) {
			String name = tree.getName();
			System.out.println(name);
			if (name.equals(searchName)) {
				searching = false;
				return tree;
			} else {
				if (tree.getChildren() != null) {
					for (Node child : tree.getChildren())
						search(child);
				}
			}
			return null;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Node e1 = new Node("E1", null);
		ArrayList<Node> D1 = new ArrayList<Node>();
		D1.add(e1);
		Node d1 = new Node("D1", D1);
		
		Node findMe = new Node("FindMe", null);
		ArrayList<Node> B1 = new ArrayList<Node>();
		B1.add(findMe);
		Node b1 = new Node("B1", B1);
		
		Node c1 = new Node("C1", null);
		ArrayList<Node> B2 = new ArrayList<Node>();
		B2.add(c1);
		Node b2 = new Node("B2", B2);
		
		ArrayList<Node> A1 = new ArrayList<Node>();
		A1.add(d1);
		Node a1 = new Node("A1", A1);
		
		ArrayList<Node> A2 = new ArrayList<Node>();
		A2.add(b1);
		A2.add(b2);
		Node a2 = new Node("A2", A2);
		
		ArrayList<Node> Start = new ArrayList<Node>();
		Start.add(a1);
		Start.add(a2);
		Node start = new Node("Start", Start);
		
		search(start);
	}
}
