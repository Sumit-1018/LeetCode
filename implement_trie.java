public class implement_trie {
    public Trie(){
        root = new TrieNode();
        
    }
    public void insert(String word){
        TrieNode current = root;
        for(char c: word.toCharArray()){
            if(current.children[c-'a'] == null){
                current.children[c-'a'] = new TrieNode();
            }
            current = current.children[c-'a'];
        }
        current.isEndOfWord = true;
    }
    public boolean search(String word){
        TrieNode current = root;
        for(char c: word.toCharArray()){
            if(current.children[c-'a'] == null){
                return false;
            }
            current = current.children[c-'a'];
        }
        return current!=null && current.isEndOfWord;
    }
    public boolean startsWith(String prefix){
        TrieNode current = root;
        for(char c: prefix.toCharArray()){
            if(current.children[c-'a'] == null){
                return false;
            }
            current = current.children[c-'a'];
        }
        return true;
    }
}
