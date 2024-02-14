package p050v;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import p001a0.C0006d;
import p045q.C2049c;
import p045q.C2058l;
import p051w.C2140a;

/* renamed from: v.h */
/* compiled from: MergePaths */
public class C2124h implements C2117b {

    /* renamed from: a */
    private final String f6582a;

    /* renamed from: b */
    private final C2125a f6583b;

    /* renamed from: c */
    private final boolean f6584c;

    /* renamed from: v.h$a */
    /* compiled from: MergePaths */
    public enum C2125a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: b */
        public static C2125a m8760b(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public C2124h(String str, C2125a aVar, boolean z) {
        this.f6582a = str;
        this.f6583b = aVar;
        this.f6584c = z;
    }

    @Nullable
    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        if (fVar.mo17137n()) {
            return new C2058l(this);
        }
        C0006d.m32c("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public C2125a mo24278b() {
        return this.f6583b;
    }

    /* renamed from: c */
    public String mo24279c() {
        return this.f6582a;
    }

    /* renamed from: d */
    public boolean mo24280d() {
        return this.f6584c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f6583b + '}';
    }
}
