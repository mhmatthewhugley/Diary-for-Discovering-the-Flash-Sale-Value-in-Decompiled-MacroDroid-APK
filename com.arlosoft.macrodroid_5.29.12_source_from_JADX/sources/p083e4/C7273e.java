package p083e4;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.C6685j;
import java.util.List;
import java.util.Map;
import p063b5.C2252e;
import p063b5.C2253f;
import p067c5.C2275e;
import p067c5.C2279i;
import p126l4.C7667b;

/* renamed from: e4.e */
/* compiled from: GlideContext */
public class C7273e extends ContextWrapper {
    @VisibleForTesting

    /* renamed from: j */
    static final C7281j<?, ?> f17738j = new C7270b();

    /* renamed from: a */
    private final C7667b f17739a;

    /* renamed from: b */
    private final Registry f17740b;

    /* renamed from: c */
    private final C2275e f17741c;

    /* renamed from: d */
    private final C2253f f17742d;

    /* renamed from: e */
    private final List<C2252e<Object>> f17743e;

    /* renamed from: f */
    private final Map<Class<?>, C7281j<?, ?>> f17744f;

    /* renamed from: g */
    private final C6685j f17745g;

    /* renamed from: h */
    private final boolean f17746h;

    /* renamed from: i */
    private final int f17747i;

    public C7273e(@NonNull Context context, @NonNull C7667b bVar, @NonNull Registry registry, @NonNull C2275e eVar, @NonNull C2253f fVar, @NonNull Map<Class<?>, C7281j<?, ?>> map, @NonNull List<C2252e<Object>> list, @NonNull C6685j jVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f17739a = bVar;
        this.f17740b = registry;
        this.f17741c = eVar;
        this.f17742d = fVar;
        this.f17743e = list;
        this.f17744f = map;
        this.f17745g = jVar;
        this.f17746h = z;
        this.f17747i = i;
    }

    @NonNull
    /* renamed from: a */
    public <X> C2279i<ImageView, X> mo37158a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f17741c.mo24594a(imageView, cls);
    }

    @NonNull
    /* renamed from: b */
    public C7667b mo37159b() {
        return this.f17739a;
    }

    /* renamed from: c */
    public List<C2252e<Object>> mo37160c() {
        return this.f17743e;
    }

    /* renamed from: d */
    public C2253f mo37161d() {
        return this.f17742d;
    }

    @NonNull
    /* renamed from: e */
    public <T> C7281j<?, T> mo37162e(@NonNull Class<T> cls) {
        C7281j<?, T> jVar = this.f17744f.get(cls);
        if (jVar == null) {
            for (Map.Entry next : this.f17744f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    jVar = (C7281j) next.getValue();
                }
            }
        }
        return jVar == null ? f17738j : jVar;
    }

    @NonNull
    /* renamed from: f */
    public C6685j mo37163f() {
        return this.f17745g;
    }

    /* renamed from: g */
    public int mo37164g() {
        return this.f17747i;
    }

    @NonNull
    /* renamed from: h */
    public Registry mo37165h() {
        return this.f17740b;
    }

    /* renamed from: i */
    public boolean mo37166i() {
        return this.f17746h;
    }
}
