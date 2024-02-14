package p060a5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p102h4.C7379d;

/* renamed from: a5.a */
/* compiled from: EncoderRegistry */
public class C2231a {

    /* renamed from: a */
    private final List<C2232a<?>> f6861a = new ArrayList();

    /* renamed from: a5.a$a */
    /* compiled from: EncoderRegistry */
    private static final class C2232a<T> {

        /* renamed from: a */
        private final Class<T> f6862a;

        /* renamed from: b */
        final C7379d<T> f6863b;

        C2232a(@NonNull Class<T> cls, @NonNull C7379d<T> dVar) {
            this.f6862a = cls;
            this.f6863b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo24449a(@NonNull Class<?> cls) {
            return this.f6862a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo24447a(@NonNull Class<T> cls, @NonNull C7379d<T> dVar) {
        this.f6861a.add(new C2232a(cls, dVar));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <T> C7379d<T> mo24448b(@NonNull Class<T> cls) {
        for (C2232a next : this.f6861a) {
            if (next.mo24449a(cls)) {
                return next.f6863b;
            }
        }
        return null;
    }
}
