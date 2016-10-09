
public class TreeNode implements Comparable<TreeNode> {
	private char character;
	private int freq;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public char getCharacter() {
		return character;
	}
	public void setCharacter(char character) {
		this.character = character;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public int compareTo(TreeNode node) {
		// TODO Auto-generated method stub
		return (this.freq-node.getFreq());
	}
}
