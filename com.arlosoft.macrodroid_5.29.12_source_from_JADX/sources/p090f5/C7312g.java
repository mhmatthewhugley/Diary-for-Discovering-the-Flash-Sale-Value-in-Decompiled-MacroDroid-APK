package p090f5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: f5.g */
/* compiled from: LruCache */
public class C7312g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f17888a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f17889b;

    /* renamed from: c */
    private long f17890c;

    /* renamed from: d */
    private long f17891d;

    public C7312g(long j) {
        this.f17889b = j;
        this.f17890c = j;
    }

    /* renamed from: f */
    private void m30189f() {
        mo37260m(this.f17890c);
    }

    /* renamed from: b */
    public void mo37253b() {
        mo37260m(0);
    }

    @Nullable
    /* renamed from: g */
    public synchronized Y mo37254g(@NonNull T t) {
        return this.f17888a.get(t);
    }

    /* renamed from: h */
    public synchronized long mo37255h() {
        return this.f17890c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo37256i(@Nullable Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo37257j(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    /* renamed from: k */
    public synchronized Y mo37258k(@NonNull T t, @Nullable Y y) {
        long i = (long) mo37256i(y);
        if (i >= this.f17890c) {
            mo37257j(t, y);
            return null;
        }
        if (y != null) {
            this.f17891d += i;
        }
        Y put = this.f17888a.put(t, y);
        if (put != null) {
            this.f17891d -= (long) mo37256i(put);
            if (!put.equals(y)) {
                mo37257j(t, put);
            }
        }
        m30189f();
        return put;
    }

    @Nullable
    /* renamed from: l */
    public synchronized Y mo37259l(@NonNull T t) {
        Y remove;
        remove = this.f17888a.remove(t);
        if (remove != null) {
            this.f17891d -= (long) mo37256i(remove);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo37260m(long j) {
        while (this.f17891d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f17888a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f17891d -= (long) mo37256i(value);
            Object key = next.getKey();
            it.remove();
            mo37257j(key, value);
        }
    }
}
