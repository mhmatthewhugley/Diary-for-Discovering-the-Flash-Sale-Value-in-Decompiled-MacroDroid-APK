package p411v6;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.work.WorkRequest;
import p402u6.C16642e;

/* renamed from: v6.b */
/* compiled from: IonBitmapCache */
public class C16715b {

    /* renamed from: a */
    Resources f67638a;

    /* renamed from: b */
    DisplayMetrics f67639b;

    /* renamed from: c */
    C16716c f67640c;

    /* renamed from: d */
    C16642e f67641d;

    /* renamed from: e */
    long f67642e = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    /* renamed from: f */
    double f67643f = 0.14285714285714285d;

    public C16715b(C16642e eVar) {
        Context applicationContext = eVar.mo79545f().getApplicationContext();
        this.f67641d = eVar;
        this.f67639b = new DisplayMetrics();
        ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.f67639b);
        this.f67638a = new Resources(applicationContext.getAssets(), this.f67639b, applicationContext.getResources().getConfiguration());
        this.f67640c = new C16716c(m99248a(applicationContext) / 7);
    }

    /* renamed from: a */
    private static int m99248a(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 1024 * 1024;
    }
}
