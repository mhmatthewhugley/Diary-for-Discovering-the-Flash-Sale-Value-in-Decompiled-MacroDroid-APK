package p060a5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p090f5.C7314i;

/* renamed from: a5.d */
/* compiled from: ModelToResourceClassCache */
public class C2235d {

    /* renamed from: a */
    private final AtomicReference<C7314i> f6868a = new AtomicReference<>();

    /* renamed from: b */
    private final ArrayMap<C7314i, List<Class<?>>> f6869b = new ArrayMap<>();

    @Nullable
    /* renamed from: a */
    public List<Class<?>> mo24455a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        C7314i andSet = this.f6868a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C7314i(cls, cls2, cls3);
        } else {
            andSet.mo37267a(cls, cls2, cls3);
        }
        synchronized (this.f6869b) {
            list = this.f6869b.get(andSet);
        }
        this.f6868a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo24456b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f6869b) {
            this.f6869b.put(new C7314i(cls, cls2, cls3), list);
        }
    }
}
