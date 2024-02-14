package p461gf;

import android.os.Looper;

/* renamed from: gf.a */
/* compiled from: Assertions */
public final class C17170a {
    /* renamed from: a */
    public static void m100673a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Observers must subscribe from the main UI thread, but was " + Thread.currentThread());
        }
    }
}
