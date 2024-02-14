package p260f8;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import java.util.List;

/* renamed from: f8.a */
/* compiled from: ExpandableList */
public class C12247a {

    /* renamed from: a */
    public List<? extends ExpandableGroup> f58756a;

    /* renamed from: b */
    public boolean[] f58757b;

    public C12247a(List<? extends ExpandableGroup> list) {
        this.f58756a = list;
        this.f58757b = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f58757b[i] = false;
        }
    }

    /* renamed from: e */
    private int m82952e(int i) {
        if (this.f58757b[i]) {
            return ((ExpandableGroup) this.f58756a.get(i)).mo66994a() + 1;
        }
        return 1;
    }

    /* renamed from: a */
    public ExpandableGroup mo68564a(C12248b bVar) {
        return (ExpandableGroup) this.f58756a.get(bVar.f58759a);
    }

    /* renamed from: b */
    public int mo68565b(C12248b bVar) {
        int i = bVar.f58759a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += m82952e(i3);
        }
        return i2;
    }

    /* renamed from: c */
    public C12248b mo68566c(int i) {
        int i2 = i;
        for (int i3 = 0; i3 < this.f58756a.size(); i3++) {
            int e = m82952e(i3);
            if (i2 == 0) {
                return C12248b.m82958b(2, i3, -1, i);
            }
            if (i2 < e) {
                return C12248b.m82958b(1, i3, i2 - 1, i);
            }
            i2 -= e;
        }
        throw new RuntimeException("Unknown state");
    }

    /* renamed from: d */
    public int mo68567d() {
        int i = 0;
        for (int i2 = 0; i2 < this.f58756a.size(); i2++) {
            i += m82952e(i2);
        }
        return i;
    }
}
