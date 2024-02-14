package p001a0;

import android.util.Log;
import com.airbnb.lottie.C1461c;
import com.airbnb.lottie.C1490i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a0.c */
/* compiled from: LogcatLogger */
public class C0005c implements C1490i {

    /* renamed from: a */
    private static final Set<String> f16a = new HashSet();

    /* renamed from: a */
    public void mo28a(String str, Throwable th) {
        boolean z = C1461c.f881a;
    }

    /* renamed from: b */
    public void mo29b(String str) {
        mo32e(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo30c(String str) {
        mo31d(str, (Throwable) null);
    }

    /* renamed from: d */
    public void mo31d(String str, Throwable th) {
        Set<String> set = f16a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }

    /* renamed from: e */
    public void mo32e(String str, Throwable th) {
        boolean z = C1461c.f881a;
    }
}
