import java.util.List;

public class Node {
	public String name;
	public List<Node> children;
	
	public Node(String name, List<Node> children)
	{
		this.name = name;
		this.children = children;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setChildren(List<Node> children)
	{
		this.children = children;
	}
	
	public List<Node> getChildren()
	{
		return children;
	}
}
