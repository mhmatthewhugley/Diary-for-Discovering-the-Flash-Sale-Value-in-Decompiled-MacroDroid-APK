package p046r;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p050v.C2122g;
import p050v.C2130l;

/* renamed from: r.g */
/* compiled from: MaskKeyframeAnimation */
public class C2080g {

    /* renamed from: a */
    private final List<C2068a<C2130l, Path>> f6439a;

    /* renamed from: b */
    private final List<C2068a<Integer, Integer>> f6440b;

    /* renamed from: c */
    private final List<C2122g> f6441c;

    public C2080g(List<C2122g> list) {
        this.f6441c = list;
        this.f6439a = new ArrayList(list.size());
        this.f6440b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f6439a.add(list.get(i).mo24275b().mo24228a());
            this.f6440b.add(list.get(i).mo24276c().mo24228a());
        }
    }

    /* renamed from: a */
    public List<C2068a<C2130l, Path>> mo24171a() {
        return this.f6439a;
    }

    /* renamed from: b */
    public List<C2122g> mo24172b() {
        return this.f6441c;
    }

    /* renamed from: c */
    public List<C2068a<Integer, Integer>> mo24173c() {
        return this.f6440b;
    }
}
