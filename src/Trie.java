class Trie
{
    TrieNode root;

    public Trie()
    {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode newRoot = root;
        for(char c : word.toCharArray())
        {
            int idx = c - 'a';
            if(newRoot.children[idx] == null)
            {
                newRoot.children[idx] = new TrieNode();
            }
            newRoot = newRoot.children[idx];
        }
        newRoot.isWordCompleted = true;
    }

    public boolean search(String word) {
        TrieNode newRoot = root;
        for(char c : word.toCharArray())
        {
            int idx = c - 'a';
            if(newRoot.children[idx] == null)
            {
                return false;
            }
            newRoot = newRoot.children[idx];
        }
        if(newRoot.isWordCompleted == true) return true;
        return false;
    }

    public boolean startsWith(String prefix) {
        TrieNode newRoot = root;
        for(char c : prefix.toCharArray())
        {
            int idx = c - 'a';
            if(newRoot.children[idx] == null)
            {
                return false;
            }
            newRoot = newRoot.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */