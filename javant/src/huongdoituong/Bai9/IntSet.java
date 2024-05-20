package huongdoituong.Bai9;

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
        for (int x : this.set) {
            if (a.set.contains(x)) {
                res.set.add(x);
            }
        }
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
