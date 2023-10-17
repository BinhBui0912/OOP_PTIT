package J04021;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;

    public TreeSet<Integer> getSet() {
        return set;
    }
    
    public IntSet(){
        set = new TreeSet<>();
    }
    
    public IntSet(int a[]){
        set = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
    }
    
    public IntSet union(IntSet a){
        IntSet b = new IntSet();
        for(Integer x : a.getSet()){
            b.getSet().add(x);
        }
        for(Integer x : this.set){
            b.getSet().add(x);
        }
        return b;
    }
    
    @Override
    public String toString(){
        String tmp = "";
        for(Integer x : this.set){
            tmp += x.toString()+" ";
        }
        return tmp;
    }
    
}
