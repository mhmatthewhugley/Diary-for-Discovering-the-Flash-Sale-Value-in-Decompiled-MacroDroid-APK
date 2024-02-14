package p060a5;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C6683i;
import com.bumptech.glide.load.engine.C6704q;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p090f5.C7314i;
import p191x4.C10386g;

/* renamed from: a5.c */
/* compiled from: LoadPathCache */
public class C2234c {

    /* renamed from: c */
    private static final C6704q<?, ?, ?> f6865c = new C6704q(Object.class, Object.class, Object.class, Collections.singletonList(new C6683i(Object.class, Object.class, Object.class, Collections.emptyList(), new C10386g(), (Pools.Pool<List<Throwable>>) null)), (Pools.Pool<List<Throwable>>) null);

    /* renamed from: a */
    private final ArrayMap<C7314i, C6704q<?, ?, ?>> f6866a = new ArrayMap<>();

    /* renamed from: b */
    private final AtomicReference<C7314i> f6867b = new AtomicReference<>();

    /* renamed from: b */
    private C7314i m9117b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C7314i andSet = this.f6867b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C7314i();
        }
        andSet.mo37267a(cls, cls2, cls3);
        return andSet;
    }

    @Nullable
    /* renamed from: a */
    public <Data, TResource, Transcode> C6704q<Data, TResource, Transcode> mo24452a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C6704q<Data, TResource, Transcode> qVar;
        C7314i b = m9117b(cls, cls2, cls3);
        synchronized (this.f6866a) {
            qVar = this.f6866a.get(b);
        }
        this.f6867b.set(b);
        return qVar;
    }

    /* renamed from: c */
    public boolean mo24453c(@Nullable C6704q<?, ?, ?> qVar) {
        return f6865c.equals(qVar);
    }

    /* renamed from: d */
    public void mo24454d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C6704q<?, ?, ?> qVar) {
        synchronized (this.f6866a) {
            ArrayMap<C7314i, C6704q<?, ?, ?>> arrayMap = this.f6866a;
            C7314i iVar = new C7314i(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f6865c;
            }
            arrayMap.put(iVar, qVar);
        }
    }
}
