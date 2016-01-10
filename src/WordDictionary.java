import java.util.*;

/**
 * Created by kaijiezhou on 1/8/16.
 */
public class WordDictionary {
    private TrieNode root=new TrieNode();
    // Adds a word into the data structure.
    public void addWord(String word) {
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

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return searchChar(word, 0, root);
    }

    private boolean searchChar(String word, int index, TrieNode curNode){
        if(index==word.length()){
            if(curNode.isEnd) return true;
            else return false;
        }
        boolean find=false;
        char c=word.charAt(index);
        if(c=='.'){
            for(char key: curNode.children.keySet()){
                find=find||searchChar(word, index+1,curNode.children.get(key));
            }
        }else if(curNode.children.containsKey(c)){
            find=find||searchChar(word, index+1, curNode.children.get(c));
        }
        return find;
    }

//class TrieNode {
//    public boolean isEnd;
//    public Map<Character, TrieNode> children;
//
//    public TrieNode() {
//        isEnd = false;
//        children = new HashMap<>();
//    }
//}


//    private boolean helper(String word, int cur, boolean exist){
//        if (exist) return exist;
//        if(cur==word.length()){
//            return words.contains(word);
//        }else{
//            if(word.charAt(cur)=='.'){
//                for(int i='a'; i<='z'; i++){
//                    exist=exist || helper(word.replaceFirst(".", ""+(char)i), cur+1, exist);
//                }
//            }else{
//                exist=exist || helper(new String(word), cur+1, exist);
//            }
//        }
//        return exist;
//    }

    public static void main(String[] args) {
        WordDictionary dict=new WordDictionary();
        dict.addWord("ran");
        dict.addWord("rune");
        dict.addWord("runner");
        dict.addWord("runs");
        dict.addWord("add");
        dict.addWord("adds");
        dict.addWord("adder");
        dict.addWord("addee");
        System.out.println(dict.search("r.n"));
        System.out.println(dict.search("ru.n.e"));
        System.out.println(dict.search("add"));
        System.out.println(dict.search("add."));
        System.out.println(dict.search("adde."));
        System.out.println(dict.search(".an."));
        System.out.println(dict.search("...s"));
        System.out.println(dict.search("....e."));
        System.out.println(dict.search("......."));
        System.out.println(dict.search("..n.r"));

    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");