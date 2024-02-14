package p191x4;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x4.f */
/* compiled from: TranscoderRegistry */
public class C10384f {

    /* renamed from: a */
    private final List<C10385a<?, ?>> f23604a = new ArrayList();

    /* renamed from: x4.f$a */
    /* compiled from: TranscoderRegistry */
    private static final class C10385a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f23605a;

        /* renamed from: b */
        private final Class<R> f23606b;

        /* renamed from: c */
        final C10383e<Z, R> f23607c;

        C10385a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull C10383e<Z, R> eVar) {
            this.f23605a = cls;
            this.f23606b = cls2;
            this.f23607c = eVar;
        }

        /* renamed from: a */
        public boolean mo41064a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f23605a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f23606b);
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <Z, R> C10383e<Z, R> mo41061a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C10386g.m40718b();
        }
        for (C10385a next : this.f23604a) {
            if (next.mo41064a(cls, cls2)) {
                return next.f23607c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo41062b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C10385a<?, ?> a : this.f23604a) {
            if (a.mo41064a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo41063c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull C10383e<Z, R> eVar) {
        this.f23604a.add(new C10385a(cls, cls2, eVar));
    }
}
