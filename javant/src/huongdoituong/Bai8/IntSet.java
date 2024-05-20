package huongdoituong.Bai8;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;

    public IntSet() {
        this.set = new TreeSet<>();
    }

    public IntSet(int[] a) {
        this.set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            this.set.add(a[i]);
        }
    }

    public IntSet union(IntSet a) {
        IntSet res = new IntSet();
        res.set.addAll(this.set);
        res.set.addAll(a.set);
        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int x : this.set) {
            res.append(x).append(" ");
        }
        return res.toString().trim();
    }
}
