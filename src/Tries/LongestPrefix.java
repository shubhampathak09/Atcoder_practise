package Tries;

public class LongestPrefix {

    static class Trie{
        Trie[] child=new Trie[26];
        int freq;
        boolean isEnd;
        Trie(){
            freq=1;
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            isEnd=false;
        }
    }
    static Trie root;

    static void insert(String str){
        int len=str.length();
        Trie temp=root;
        for(int i=0;i<len;i++){
            int index=str.charAt(i)-'a';
            if(temp.child[index]==null){
                temp.child[index]=new Trie();
            }else{
                temp.freq++;
            }
            temp=temp.child[index];
        }
        temp.isEnd=true;
    }
    static void prefixUtil(Trie root,String curr,int indx){
        if(root==null)
            return;

        if(root.freq==1){
            System.out.println(curr);
            return;
        }
        for(int i=0;i<26;i++){
            if(root.child[i]!=null){
                curr=curr +  ('a'+i);
                prefixUtil(root.child[i],curr,indx);
            }
        }
    }
    static void findPrefix(){
        root=new Trie();
        root.freq=0; // to handle all unique characters
        insert("abc");
        insert("aac");
        String curr="";
        prefixUtil(root,curr,0);
    }

    public static void main(String[] args){

      findPrefix();
    }
}
