package p126l4;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p090f5.C7315j;

/* renamed from: l4.i */
/* compiled from: LruArrayPool */
public final class C7675i implements C7667b {

    /* renamed from: a */
    private final C7672g<C7676a, Object> f18588a = new C7672g<>();

    /* renamed from: b */
    private final C7677b f18589b = new C7677b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f18590c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C7666a<?>> f18591d = new HashMap();

    /* renamed from: e */
    private final int f18592e;

    /* renamed from: f */
    private int f18593f;

    /* renamed from: l4.i$a */
    /* compiled from: LruArrayPool */
    private static final class C7676a implements C7682l {

        /* renamed from: a */
        private final C7677b f18594a;

        /* renamed from: b */
        int f18595b;

        /* renamed from: c */
        private Class<?> f18596c;

        C7676a(C7677b bVar) {
            this.f18594a = bVar;
        }

        /* renamed from: a */
        public void mo37706a() {
            this.f18594a.mo37689c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37707b(int i, Class<?> cls) {
            this.f18595b = i;
            this.f18596c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7676a)) {
                return false;
            }
            C7676a aVar = (C7676a) obj;
            if (this.f18595b == aVar.f18595b && this.f18596c == aVar.f18596c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f18595b * 31;
            Class<?> cls = this.f18596c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f18595b + "array=" + this.f18596c + '}';
        }
    }

    /* renamed from: l4.i$b */
    /* compiled from: LruArrayPool */
    private static final class C7677b extends C7668c<C7676a> {
        C7677b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C7676a mo37687a() {
            return new C7676a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C7676a mo37712e(int i, Class<?> cls) {
            C7676a aVar = (C7676a) mo37688b();
            aVar.mo37707b(i, cls);
            return aVar;
        }
    }

    public C7675i(int i) {
        this.f18592e = i;
    }

    /* renamed from: e */
    private void m31991e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> l = m31998l(cls);
        Integer num = (Integer) l.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            l.remove(Integer.valueOf(i));
        } else {
            l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    private void m31992f() {
        m31993g(this.f18592e);
    }

    /* renamed from: g */
    private void m31993g(int i) {
        while (this.f18593f > i) {
            Object f = this.f18588a.mo37699f();
            C7315j.m30204d(f);
            C7666a h = m31994h(f);
            this.f18593f -= h.mo37680c(f) * h.mo37679b();
            m31991e(h.mo37680c(f), f.getClass());
            if (Log.isLoggable(h.mo37678a(), 2)) {
                h.mo37678a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(h.mo37680c(f));
            }
        }
    }

    /* renamed from: h */
    private <T> C7666a<T> m31994h(T t) {
        return m31995i(t.getClass());
    }

    /* renamed from: i */
    private <T> C7666a<T> m31995i(Class<T> cls) {
        C7666a<T> aVar = this.f18591d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C7674h();
            } else if (cls.equals(byte[].class)) {
                aVar = new C7671f();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f18591d.put(cls, aVar);
        }
        return aVar;
    }

    @Nullable
    /* renamed from: j */
    private <T> T m31996j(C7676a aVar) {
        return this.f18588a.mo37697a(aVar);
    }

    /* renamed from: k */
    private <T> T m31997k(C7676a aVar, Class<T> cls) {
        C7666a<T> i = m31995i(cls);
        T j = m31996j(aVar);
        if (j != null) {
            this.f18593f -= i.mo37680c(j) * i.mo37679b();
            m31991e(i.mo37680c(j), cls);
        }
        if (j != null) {
            return j;
        }
        if (Log.isLoggable(i.mo37678a(), 2)) {
            i.mo37678a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f18595b);
            sb.append(" bytes");
        }
        return i.newArray(aVar.f18595b);
    }

    /* renamed from: l */
    private NavigableMap<Integer, Integer> m31998l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f18590c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f18590c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    private boolean m31999m() {
        int i = this.f18593f;
        return i == 0 || this.f18592e / i >= 2;
    }

    /* renamed from: n */
    private boolean m32000n(int i) {
        return i <= this.f18592e / 2;
    }

    /* renamed from: o */
    private boolean m32001o(int i, Integer num) {
        return num != null && (m31999m() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo37682a(int i) {
        if (i >= 40) {
            try {
                mo37683b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m31993g(this.f18592e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo37683b() {
        m31993g(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo37684c(int i, Class<T> cls) {
        C7676a aVar;
        Integer ceilingKey = m31998l(cls).ceilingKey(Integer.valueOf(i));
        if (m32001o(i, ceilingKey)) {
            aVar = this.f18589b.mo37712e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f18589b.mo37712e(i, cls);
        }
        return m31997k(aVar, cls);
    }

    /* renamed from: d */
    public synchronized <T> T mo37685d(int i, Class<T> cls) {
        return m31997k(this.f18589b.mo37712e(i, cls), cls);
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        C7666a<?> i = m31995i(cls);
        int c = i.mo37680c(t);
        int b = i.mo37679b() * c;
        if (m32000n(b)) {
            C7676a e = this.f18589b.mo37712e(c, cls);
            this.f18588a.mo37698d(e, t);
            NavigableMap<Integer, Integer> l = m31998l(cls);
            Integer num = (Integer) l.get(Integer.valueOf(e.f18595b));
            Integer valueOf = Integer.valueOf(e.f18595b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            l.put(valueOf, Integer.valueOf(i2));
            this.f18593f += b;
            m31992f();
        }
    }
}
