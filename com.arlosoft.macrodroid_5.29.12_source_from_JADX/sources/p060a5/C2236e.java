package p060a5;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p102h4.C7385h;

/* renamed from: a5.e */
/* compiled from: ResourceDecoderRegistry */
public class C2236e {

    /* renamed from: a */
    private final List<String> f6870a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C2237a<?, ?>>> f6871b = new HashMap();

    /* renamed from: a5.e$a */
    /* compiled from: ResourceDecoderRegistry */
    private static class C2237a<T, R> {

        /* renamed from: a */
        private final Class<T> f6872a;

        /* renamed from: b */
        final Class<R> f6873b;

        /* renamed from: c */
        final C7385h<T, R> f6874c;

        public C2237a(@NonNull Class<T> cls, @NonNull Class<R> cls2, C7385h<T, R> hVar) {
            this.f6872a = cls;
            this.f6873b = cls2;
            this.f6874c = hVar;
        }

        /* renamed from: a */
        public boolean mo24461a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f6872a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f6873b);
        }
    }

    @NonNull
    /* renamed from: c */
    private synchronized List<C2237a<?, ?>> m9123c(@NonNull String str) {
        List<C2237a<?, ?>> list;
        if (!this.f6870a.contains(str)) {
            this.f6870a.add(str);
        }
        list = this.f6871b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f6871b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo24457a(@NonNull String str, @NonNull C7385h<T, R> hVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m9123c(str).add(new C2237a(cls, cls2, hVar));
    }

    @NonNull
    /* renamed from: b */
    public synchronized <T, R> List<C7385h<T, R>> mo24458b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f6870a) {
            List<C2237a> list = this.f6871b.get(str);
            if (list != null) {
                for (C2237a aVar : list) {
                    if (aVar.mo24461a(cls, cls2)) {
                        arrayList.add(aVar.f6874c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo24459d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f6870a) {
            List<C2237a> list = this.f6871b.get(str);
            if (list != null) {
                for (C2237a aVar : list) {
                    if (aVar.mo24461a(cls, cls2) && !arrayList.contains(aVar.f6873b)) {
                        arrayList.add(aVar.f6873b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo24460e(@NonNull List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f6870a);
        this.f6870a.clear();
        this.f6870a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f6870a.add(str);
            }
        }
    }
}
