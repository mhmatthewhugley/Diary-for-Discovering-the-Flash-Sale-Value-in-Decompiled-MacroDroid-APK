package p164s4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import p102h4.C7377b;

/* renamed from: s4.p */
/* compiled from: HardwareConfigState */
final class C10215p {

    /* renamed from: c */
    private static final File f23336c = new File("/proc/self/fd");

    /* renamed from: d */
    private static volatile C10215p f23337d;

    /* renamed from: a */
    private volatile int f23338a;

    /* renamed from: b */
    private volatile boolean f23339b = true;

    private C10215p() {
    }

    /* renamed from: a */
    static C10215p m40188a() {
        if (f23337d == null) {
            synchronized (C10215p.class) {
                if (f23337d == null) {
                    f23337d = new C10215p();
                }
            }
        }
        return f23337d;
    }

    /* renamed from: b */
    private synchronized boolean m40189b() {
        boolean z = true;
        int i = this.f23338a + 1;
        this.f23338a = i;
        if (i >= 50) {
            this.f23338a = 0;
            int length = f23336c.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f23339b = z;
            if (!this.f23339b && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + TypedValues.Transition.TYPE_DURATION);
            }
        }
        return this.f23339b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo40813c(int i, int i2, BitmapFactory.Options options, C7377b bVar, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && m40189b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
