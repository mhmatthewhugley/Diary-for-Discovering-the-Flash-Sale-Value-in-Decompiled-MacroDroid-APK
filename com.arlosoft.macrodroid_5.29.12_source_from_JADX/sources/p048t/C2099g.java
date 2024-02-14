package p048t;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.C1463d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: t.g */
/* compiled from: LottieCompositionCache */
public class C2099g {

    /* renamed from: b */
    private static final C2099g f6515b = new C2099g();

    /* renamed from: a */
    private final LruCache<String, C1463d> f6516a = new LruCache<>(20);

    @VisibleForTesting
    C2099g() {
    }

    /* renamed from: b */
    public static C2099g m8665b() {
        return f6515b;
    }

    @Nullable
    /* renamed from: a */
    public C1463d mo24221a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f6516a.get(str);
    }

    /* renamed from: c */
    public void mo24222c(@Nullable String str, C1463d dVar) {
        if (str != null) {
            this.f6516a.put(str, dVar);
        }
    }
}
