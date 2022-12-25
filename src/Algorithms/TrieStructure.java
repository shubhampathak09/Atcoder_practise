package Algorithms;

public class TrieStructure {

    static final int alp_size=26;

    static class TrieNode
    {
        TrieNode[] child =new TrieNode[alp_size];
        boolean isEnd;

        TrieNode(){
            for(int i=0;i<alp_size;i++){
                this.child[i]=null;
            }
            this.isEnd=false;
        }
    };

    static TrieNode root;

    static void insert(String key){
        TrieNode temp=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i) - 'a';
            if(temp.child[index]==null){
                temp.child[index]=new TrieNode();
                temp=temp.child[index];
            }
        }
        temp.isEnd=true;
    }

    static boolean search(String key){
        TrieNode temp=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(temp.child[index]==null)
                return false;
            temp=temp.child[index];
        }
        return temp.isEnd==true;
    }

    public static void main(String[] args){
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};

        root=new TrieNode();

        for(int i=0;i<keys.length;i++){
            insert(keys[i]);
        }

       String swrd="cdcd";
    if(search(swrd)==true){
        System.out.println("exists in trie");
    }else
        System.out.println("does not exist in trie");
    }

}
