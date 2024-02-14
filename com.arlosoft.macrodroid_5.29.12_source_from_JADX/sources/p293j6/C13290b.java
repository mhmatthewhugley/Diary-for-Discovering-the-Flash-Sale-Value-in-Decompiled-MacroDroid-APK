package p293j6;

import android.os.Looper;
import androidx.annotation.RestrictTo;
import java.util.Objects;
import p414v9.C16741n;
import p448z9.C17072c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: j6.b */
/* compiled from: Preconditions */
public final class C13290b {
    /* renamed from: a */
    public static boolean m85614a(C16741n<?> nVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        nVar.onSubscribe(C17072c.m100418b());
        nVar.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
        return false;
    }

    /* renamed from: b */
    public static void m85615b(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }
}
