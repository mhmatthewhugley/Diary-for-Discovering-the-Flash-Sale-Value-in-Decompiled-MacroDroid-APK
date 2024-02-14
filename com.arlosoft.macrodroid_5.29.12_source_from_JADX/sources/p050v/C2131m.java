package p050v;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import p045q.C2049c;
import p045q.C2053g;
import p049u.C2102a;
import p049u.C2105d;
import p051w.C2140a;

/* renamed from: v.m */
/* compiled from: ShapeFill */
public class C2131m implements C2117b {

    /* renamed from: a */
    private final boolean f6617a;

    /* renamed from: b */
    private final Path.FillType f6618b;

    /* renamed from: c */
    private final String f6619c;
    @Nullable

    /* renamed from: d */
    private final C2102a f6620d;
    @Nullable

    /* renamed from: e */
    private final C2105d f6621e;

    /* renamed from: f */
    private final boolean f6622f;

    public C2131m(String str, boolean z, Path.FillType fillType, @Nullable C2102a aVar, @Nullable C2105d dVar, boolean z2) {
        this.f6619c = str;
        this.f6617a = z;
        this.f6618b = fillType;
        this.f6620d = aVar;
        this.f6621e = dVar;
        this.f6622f = z2;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2053g(fVar, aVar, this);
    }

    @Nullable
    /* renamed from: b */
    public C2102a mo24308b() {
        return this.f6620d;
    }

    /* renamed from: c */
    public Path.FillType mo24309c() {
        return this.f6618b;
    }

    /* renamed from: d */
    public String mo24310d() {
        return this.f6619c;
    }

    @Nullable
    /* renamed from: e */
    public C2105d mo24311e() {
        return this.f6621e;
    }

    /* renamed from: f */
    public boolean mo24312f() {
        return this.f6622f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f6617a + '}';
    }
}
