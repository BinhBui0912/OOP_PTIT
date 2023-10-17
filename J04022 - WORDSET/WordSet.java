package J04022;

import java.util.TreeSet;

class WordSet {
    private TreeSet<String> set;
    
    public WordSet(){
        set = new TreeSet<>();
    }
    
    public WordSet(String s){
        set = new TreeSet<>();
        String arr[] = s.split("\\s+");
        for(String x : arr){
            set.add(x.toLowerCase());
        }
    }
    
    public WordSet union(WordSet a){
        WordSet result = new WordSet();
        for(String x : this.set){
            result.set.add(x);
        }
        for(String x : a.set){
            result.set.add(x);
        }
        return result;
    }
    
    public WordSet intersection(WordSet a){
        WordSet result = new WordSet();
        for(String x : this.set){
            if(a.set.contains(x)){
                result.set.add(x);
            }
        }
        return result;
    }
    
    @Override
    public String toString(){
        String tmp = "";
        for(String x : this.set){
            tmp += x + " ";
        }
        return tmp;
    }
}
