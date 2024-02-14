package p011b;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import p000a.C0000a;
import p000a.C0002c;

/* renamed from: b.a */
/* compiled from: SlidesAdapter */
public class C1396a extends FragmentStatePagerAdapter {

    /* renamed from: a */
    private ArrayList<C0002c> f713a = new ArrayList<>();

    public C1396a(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    /* renamed from: d */
    private boolean m609d() {
        if (this.f713a.size() > 0) {
            ArrayList<C0002c> arrayList = this.f713a;
            if (arrayList.get(arrayList.size() - 1) instanceof C0000a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo16802a(C0002c cVar) {
        this.f713a.add(mo16807g(), cVar);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public C0002c getItem(int i) {
        return this.f713a.get(i);
    }

    /* renamed from: c */
    public int mo16804c() {
        return mo16807g() - 1;
    }

    /* renamed from: e */
    public boolean mo16805e(int i) {
        return i == mo16807g() - 1;
    }

    /* renamed from: f */
    public boolean mo16806f(int i) {
        return i == mo16807g();
    }

    /* renamed from: g */
    public int mo16807g() {
        if (m609d()) {
            return this.f713a.size() - 1;
        }
        return this.f713a.size();
    }

    public int getCount() {
        return this.f713a.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C0002c cVar = (C0002c) super.instantiateItem(viewGroup, i);
        this.f713a.set(i, cVar);
        return cVar;
    }
}
