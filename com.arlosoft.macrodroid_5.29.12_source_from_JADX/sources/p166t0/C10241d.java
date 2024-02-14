package p166t0;

import android.app.Application;
import android.content.Context;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import kotlin.jvm.internal.C13706o;

/* renamed from: t0.d */
/* compiled from: ApplicationModule.kt */
public final class C10241d {

    /* renamed from: a */
    private final MacroDroidApplication f23375a;

    public C10241d(MacroDroidApplication macroDroidApplication) {
        C13706o.m87929f(macroDroidApplication, "application");
        this.f23375a = macroDroidApplication;
    }

    /* renamed from: a */
    public final C4915a mo40850a() {
        C4934n M = C4934n.m18998M();
        C13706o.m87928e(M, "getInstance()");
        return M;
    }

    /* renamed from: b */
    public final MacroDroidRoomDatabase mo40851b() {
        return MacroDroidApplication.f9883I.mo27303b().mo27299x();
    }

    /* renamed from: c */
    public final Application mo40852c() {
        return this.f23375a;
    }

    /* renamed from: d */
    public final Context mo40853d() {
        return this.f23375a;
    }
}
