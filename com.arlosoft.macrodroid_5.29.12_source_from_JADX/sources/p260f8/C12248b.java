package p260f8;

import java.util.ArrayList;

/* renamed from: f8.b */
/* compiled from: ExpandableListPosition */
public class C12248b {

    /* renamed from: e */
    private static ArrayList<C12248b> f58758e = new ArrayList<>(5);

    /* renamed from: a */
    public int f58759a;

    /* renamed from: b */
    public int f58760b;

    /* renamed from: c */
    int f58761c;

    /* renamed from: d */
    public int f58762d;

    private C12248b() {
    }

    /* renamed from: a */
    private static C12248b m82957a() {
        synchronized (f58758e) {
            if (f58758e.size() > 0) {
                C12248b remove = f58758e.remove(0);
                remove.m82959c();
                return remove;
            }
            C12248b bVar = new C12248b();
            return bVar;
        }
    }

    /* renamed from: b */
    public static C12248b m82958b(int i, int i2, int i3, int i4) {
        C12248b a = m82957a();
        a.f58762d = i;
        a.f58759a = i2;
        a.f58760b = i3;
        a.f58761c = i4;
        return a;
    }

    /* renamed from: c */
    private void m82959c() {
        this.f58759a = 0;
        this.f58760b = 0;
        this.f58761c = 0;
        this.f58762d = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12248b bVar = (C12248b) obj;
        if (this.f58759a == bVar.f58759a && this.f58760b == bVar.f58760b && this.f58761c == bVar.f58761c && this.f58762d == bVar.f58762d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f58759a * 31) + this.f58760b) * 31) + this.f58761c) * 31) + this.f58762d;
    }

    public String toString() {
        return "ExpandableListPosition{groupPos=" + this.f58759a + ", childPos=" + this.f58760b + ", flatListPos=" + this.f58761c + ", type=" + this.f58762d + '}';
    }
}
