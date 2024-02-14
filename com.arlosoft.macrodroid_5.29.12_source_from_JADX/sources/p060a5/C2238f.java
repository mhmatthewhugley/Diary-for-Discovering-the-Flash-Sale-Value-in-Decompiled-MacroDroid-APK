package p060a5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p102h4.C7386i;

/* renamed from: a5.f */
/* compiled from: ResourceEncoderRegistry */
public class C2238f {

    /* renamed from: a */
    private final List<C2239a<?>> f6875a = new ArrayList();

    /* renamed from: a5.f$a */
    /* compiled from: ResourceEncoderRegistry */
    private static final class C2239a<T> {

        /* renamed from: a */
        private final Class<T> f6876a;

        /* renamed from: b */
        final C7386i<T> f6877b;

        C2239a(@NonNull Class<T> cls, @NonNull C7386i<T> iVar) {
            this.f6876a = cls;
            this.f6877b = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo24464a(@NonNull Class<?> cls) {
            return this.f6876a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo24462a(@NonNull Class<Z> cls, @NonNull C7386i<Z> iVar) {
        this.f6875a.add(new C2239a(cls, iVar));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <Z> C7386i<Z> mo24463b(@NonNull Class<Z> cls) {
        int size = this.f6875a.size();
        for (int i = 0; i < size; i++) {
            C2239a aVar = this.f6875a.get(i);
            if (aVar.mo24464a(cls)) {
                return aVar.f6877b;
            }
        }
        return null;
    }
}
