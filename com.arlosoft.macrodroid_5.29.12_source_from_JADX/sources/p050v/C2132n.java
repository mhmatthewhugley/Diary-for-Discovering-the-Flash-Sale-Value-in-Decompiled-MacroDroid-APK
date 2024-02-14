package p050v;

import com.airbnb.lottie.C1472f;
import java.util.Arrays;
import java.util.List;
import p045q.C2049c;
import p045q.C2050d;
import p051w.C2140a;

/* renamed from: v.n */
/* compiled from: ShapeGroup */
public class C2132n implements C2117b {

    /* renamed from: a */
    private final String f6623a;

    /* renamed from: b */
    private final List<C2117b> f6624b;

    /* renamed from: c */
    private final boolean f6625c;

    public C2132n(String str, List<C2117b> list, boolean z) {
        this.f6623a = str;
        this.f6624b = list;
        this.f6625c = z;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2050d(fVar, aVar, this);
    }

    /* renamed from: b */
    public List<C2117b> mo24314b() {
        return this.f6624b;
    }

    /* renamed from: c */
    public String mo24315c() {
        return this.f6623a;
    }

    /* renamed from: d */
    public boolean mo24316d() {
        return this.f6625c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f6623a + "' Shapes: " + Arrays.toString(this.f6624b.toArray()) + '}';
    }
}
