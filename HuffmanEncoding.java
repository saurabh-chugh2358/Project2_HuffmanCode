import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;


public class HuffmanEncoding {
	private PriorityQueue<TreeNode> PQ = new PriorityQueue<TreeNode>();
	private HashMap<Character, Integer> charFrequencies = new HashMap<Character, Integer>();
	private HashMap<Character, String> huffmanBinaryCodes = new HashMap<Character, String>();
	private TreeNode temp;
	
	public void getCharFreq(String testString) {
		
		// Calculating the frequencies of characters present in the string. 
		char [] charArray = testString.toCharArray();
		for(char ch : charArray){
			if(charFrequencies.containsKey(ch)){
				charFrequencies.put(ch, ((int) charFrequencies.get(ch))+1);
			}else{
				charFrequencies.put(ch, 1);
			}
		}
	}
	
	public void bldCharNodesPQ() {
		Iterator<Map.Entry<Character, Integer>> it = charFrequencies.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> entry = it.next();
			temp = new TreeNode();
			temp.setCharacter(entry.getKey());
			temp.setFreq(entry.getValue());
			temp.setLeftChild(null);
			temp.setRightChild(null);
			PQ.add(temp);
		}
	}
	
	public void bldHuffmanTree() {
		for (int i=1;i<charFrequencies.size();i++) {
			temp = new TreeNode();
			temp.setLeftChild(PQ.remove());
			temp.setRightChild(PQ.remove());
			temp.setFreq(temp.getLeftChild().getFreq()+temp.getRightChild().getFreq());
			PQ.add(temp);
		}
	}
	
	public TreeNode getHuffmanTreeRoot(){
		return PQ.remove();
	}
	
	public HashMap<Character, String> getHuffmanCodes(TreeNode root, String code) {
		if(root != null){
			if(root.getLeftChild()!= null && root.getRightChild()!= null ){
				getHuffmanCodes(root.getLeftChild(), code+"0");
				getHuffmanCodes(root.getRightChild(), code+"1");
			}else{
				huffmanBinaryCodes.put(root.getCharacter(), code);
			}
		}
		return huffmanBinaryCodes;
	}
}
