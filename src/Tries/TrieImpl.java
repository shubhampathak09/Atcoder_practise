package Tries;

public class TrieImpl {

    static final int sz=26;

    static class TrieNode
    {

        TrieNode[] children=new TrieNode[sz];
        boolean isEnd;

        TrieNode()
        {
            isEnd=false;
            for(int i=0;i<sz;i++)
                children[i]=null;
        }
    };

    static TrieNode root;


    static void insert(String key){
        TrieNode temp=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(temp.children[index]==null)
            {
                temp.children[index]=new TrieNode();
            }
            temp=temp.children[index];
        }
        temp.isEnd=true;
    }


    static boolean search(String key){
        TrieNode  temp=root;
        for(int i=0;i<key.length();i++){
             int index = key.charAt(i)-'a';
             if(temp.children[index]==null)
                 return false;
             temp=temp.children[index];
        }
                return temp.isEnd;
    }


    public static void main(String[] args){
        String keys[]={};

    }

}
