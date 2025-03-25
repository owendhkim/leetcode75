class TrieNode
{
    TrieNode[] children;
    boolean isWordCompleted;

    public TrieNode()
    {
        children = new TrieNode[26];
        isWordCompleted = false;
    }
}