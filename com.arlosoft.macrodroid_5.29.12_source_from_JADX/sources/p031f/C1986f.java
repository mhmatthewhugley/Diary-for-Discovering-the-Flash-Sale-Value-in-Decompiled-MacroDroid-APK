package p031f;

import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;
import p011b.C1396a;
import p017c.C1422b;

/* renamed from: f.f */
/* compiled from: ViewBehavioursOnPageChangeListener */
public class C1986f implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    private final C1396a f6063a;

    /* renamed from: c */
    private List<C1981b> f6064c = new ArrayList();

    /* renamed from: d */
    private List<C1422b> f6065d = new ArrayList();

    /* renamed from: f */
    private List<C1980a> f6066f = new ArrayList();

    public C1986f(C1396a aVar) {
        this.f6063a = aVar;
    }

    /* renamed from: a */
    private boolean m8290a(int i) {
        return i == 0;
    }

    /* renamed from: b */
    public C1986f mo23995b(C1980a aVar) {
        this.f6066f.add(aVar);
        return this;
    }

    /* renamed from: c */
    public C1986f mo23996c(C1981b bVar) {
        this.f6064c.add(bVar);
        return this;
    }

    /* renamed from: d */
    public C1986f mo23997d(C1422b bVar) {
        this.f6065d.add(bVar);
        return this;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (m8290a(i)) {
            for (C1422b b : this.f6065d) {
                b.mo16880b(f);
            }
        } else if (this.f6063a.mo16805e(i)) {
            for (C1422b d : this.f6065d) {
                d.mo16882d(f);
            }
        } else {
            for (C1422b a : this.f6065d) {
                a.mo16879a(f);
            }
        }
        for (C1980a a2 : this.f6066f) {
            a2.mo86a(i, f);
        }
    }

    public void onPageSelected(int i) {
        for (C1981b a : this.f6064c) {
            a.mo85a(i);
        }
    }
}
