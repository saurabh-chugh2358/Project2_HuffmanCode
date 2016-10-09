import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HuffmanCodingTest {
	public static HashMap<Character, String> huffmanBinaryCodes = new HashMap<Character, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterator<Map.Entry<Character, String>> it;
		TreeNode root;
		String testString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdfffgiiijccjj";
		
		HuffmanEncoding huffEncd1 = new HuffmanEncoding();
		huffEncd1.getCharFreq(testString);
		huffEncd1.bldCharNodesPQ();
		huffEncd1.bldHuffmanTree();
		root = huffEncd1.getHuffmanTreeRoot();
		huffmanBinaryCodes = huffEncd1.getHuffmanCodes(root, new String());
		
		System.out.println("Huffman Codes for the First String.....:");
		it = huffmanBinaryCodes.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, String> entry = (Map.Entry<Character, String>) it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println("\n");
		
		testString = "gghhiajjjjjkabbbbcccakjlabcjsdbhcjhsbdjchbdsjchbdsjhbcsdhbcjkhsbdcjhbsdjbcjksdhbcjhbsdcjhbsdjchbsdjhbcjdshbcjkdshbjchbsdjhbcjsdhbcjdshbcjkhbsdjchbsdjbcjdsksnckjsdnckjnsdkcjndskjcndsknjsdkjcnksdjncksdnckjnsdkcnsdkcnanfcdaaeeeefaaaaabbccdabbbdascknakcsaclkasjcbkmas  dddfffgiiijccjj";
		HuffmanEncoding huffEncd2 = new HuffmanEncoding();
		huffEncd2.getCharFreq(testString);
		huffEncd2.bldCharNodesPQ();
		huffEncd2.bldHuffmanTree();
		root = huffEncd2.getHuffmanTreeRoot();
		huffmanBinaryCodes = huffEncd2.getHuffmanCodes(root, new String());
		
		System.out.println("Huffman Codes for the Second String.....:");
		it = huffmanBinaryCodes.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, String> entry = (Map.Entry<Character, String>) it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println("\n");
	}
}
