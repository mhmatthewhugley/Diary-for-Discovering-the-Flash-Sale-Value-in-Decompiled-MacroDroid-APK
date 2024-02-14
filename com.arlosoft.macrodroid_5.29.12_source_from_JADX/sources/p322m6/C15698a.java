package p322m6;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p401te.C16633g;

/* renamed from: m6.a */
/* compiled from: AndroidThreeTen */
public final class C15698a {

    /* renamed from: a */
    private static final AtomicBoolean f64986a = new AtomicBoolean();

    /* renamed from: a */
    public static void m94925a(Application application) {
        m94926b(application);
    }

    /* renamed from: b */
    public static void m94926b(Context context) {
        m94927c(context, "org/threeten/bp/TZDB.dat");
    }

    /* renamed from: c */
    public static void m94927c(Context context, String str) {
        if (!f64986a.getAndSet(true)) {
            C16633g.m99047c(new C15699b(context, str));
        }
    }
}
