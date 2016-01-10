import java.util.HashMap;
import java.util.Map;

/**
 * Created by kaijiezhou on 1/8/16.
 */
class TrieNode {
    // Initialize your data structure here.
    public String word;
    public Map<Character,TrieNode> children;
    public boolean isEnd;
    public TrieNode() {
        word=null;
        children=new HashMap<>();
        isEnd=false;
    }
}

public class TrieImpl {
    private TrieNode root;

    public TrieImpl() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode cur=root;
        char[] wArray=word.toCharArray();
        for(char c: wArray){
            if(!cur.children.containsKey(c)){
                cur.children.put(c, new TrieNode());
            }
            cur=cur.children.get(c);
        }
        cur.isEnd=true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        char[] wArray=word.toCharArray();
        TrieNode cur=root;
        for(char c : wArray){
            if(!cur.children.containsKey(c)) return false;
            cur=cur.children.get(c);
        }
        if(cur.isEnd) return true;
        return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        char[] wArray=prefix.toCharArray();
        TrieNode cur=root;
        for(char c : wArray){
            if(!cur.children.containsKey(c)) return false;
            cur=cur.children.get(c);
        }
        return true;
    }

    public static void main(String[] args) {
         TrieImpl trie = new TrieImpl();
         trie.insert("somestring");
        System.out.println(trie.search("somestring"));
        System.out.println(trie.startsWith("some"));
    }
}
