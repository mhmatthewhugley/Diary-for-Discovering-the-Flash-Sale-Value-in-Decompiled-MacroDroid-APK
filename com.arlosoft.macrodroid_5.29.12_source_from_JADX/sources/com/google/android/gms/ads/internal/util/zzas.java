package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzeag;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzfzq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.protocol.HTTP;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzas {

    /* renamed from: a */
    private final Context f2171a;

    /* renamed from: b */
    private final zzeak f2172b;

    /* renamed from: c */
    private String f2173c;

    /* renamed from: d */
    private String f2174d;

    /* renamed from: e */
    private String f2175e;
    @Nullable

    /* renamed from: f */
    private String f2176f;

    /* renamed from: g */
    private int f2177g;

    /* renamed from: h */
    private int f2178h;

    /* renamed from: i */
    private PointF f2179i;

    /* renamed from: j */
    private PointF f2180j;

    /* renamed from: k */
    private Handler f2181k;

    /* renamed from: l */
    private Runnable f2182l;

    public zzas(Context context) {
        this.f2177g = 0;
        this.f2182l = new zzar(this);
        this.f2171a = context;
        this.f2178h = ViewConfiguration.get(context).getScaledTouchSlop();
        zzt.m2909v().mo20334b();
        this.f2181k = zzt.m2909v().mo20333a();
        this.f2172b = zzt.m2908u().mo20297a();
    }

    /* renamed from: s */
    private final void m2526s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u = m2528u(arrayList, "None", true);
        int u2 = m2528u(arrayList, "Shake", true);
        int u3 = m2528u(arrayList, "Flick", true);
        zzeag zzeag = zzeag.NONE;
        int ordinal = this.f2172b.mo45122a().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? u : u3 : u2;
        zzt.m2905r();
        AlertDialog.Builder g = zzs.m2756g(context);
        AtomicInteger atomicInteger = new AtomicInteger(i);
        g.setTitle("Setup gesture");
        g.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new zzaj(atomicInteger));
        g.setNegativeButton("Dismiss", new zzak(this));
        g.setPositiveButton("Save", new zzal(this, atomicInteger, i, u2, u3));
        g.setOnCancelListener(new zzam(this));
        g.create().show();
    }

    /* renamed from: t */
    private final boolean m2527t(float f, float f2, float f3, float f4) {
        return Math.abs(this.f2179i.x - f) < ((float) this.f2178h) && Math.abs(this.f2179i.y - f2) < ((float) this.f2178h) && Math.abs(this.f2180j.x - f3) < ((float) this.f2178h) && Math.abs(this.f2180j.y - f4) < ((float) this.f2178h);
    }

    /* renamed from: u */
    private static final int m2528u(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo20276a() {
        m2526s(this.f2171a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo20277b() {
        m2526s(this.f2171a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo20278c(zzfzq zzfzq) {
        if (!zzt.m2908u().mo20306j(this.f2171a, this.f2174d, this.f2175e)) {
            zzt.m2908u().mo20300d(this.f2171a, this.f2174d, this.f2175e);
        } else {
            zzfzq.execute(new zzaf(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo20279d(zzfzq zzfzq) {
        if (!zzt.m2908u().mo20306j(this.f2171a, this.f2174d, this.f2175e)) {
            zzt.m2908u().mo20300d(this.f2171a, this.f2174d, this.f2175e);
        } else {
            zzfzq.execute(new zzaq(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo20280e() {
        zzt.m2908u().mo20299c(this.f2171a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo20281f() {
        zzt.m2908u().mo20299c(this.f2171a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo20282g() {
        this.f2177g = 4;
        mo20293r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo20283h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.f2172b.mo45132k(zzeag.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.f2172b.mo45132k(zzeag.FLICK);
            } else {
                this.f2172b.mo45132k(zzeag.NONE);
            }
        }
        mo20293r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo20284i(String str, DialogInterface dialogInterface, int i) {
        zzt.m2905r();
        zzs.m2759j(this.f2171a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo20285j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            if (!(this.f2171a instanceof Activity)) {
                zzcgp.m45228f("Can not create dialog without Activity Context");
                return;
            }
            String str = this.f2173c;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                zzt.m2905r();
                Map l = zzs.m2761l(build);
                for (String str3 : l.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) l.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            zzt.m2905r();
            AlertDialog.Builder g = zzs.m2756g(this.f2171a);
            g.setMessage(str2);
            g.setTitle("Ad Information");
            g.setPositiveButton("Share", new zzad(this, str2));
            g.setNegativeButton(HTTP.CONN_CLOSE, zzae.f2146a);
            g.create().show();
        } else if (i6 == i2) {
            zzcgp.m45224b("Debug mode [Creative Preview] selected.");
            zzchc.f28456a.execute(new zzac(this));
        } else if (i6 == i3) {
            zzcgp.m45224b("Debug mode [Troubleshooting] selected.");
            zzchc.f28456a.execute(new zzag(this));
        } else if (i6 == i4) {
            zzfzq zzfzq = zzchc.f28460e;
            zzfzq zzfzq2 = zzchc.f28456a;
            if (this.f2172b.mo45135n()) {
                zzfzq.execute(new zzan(this));
            } else {
                zzfzq2.execute(new zzao(this, zzfzq));
            }
        } else if (i6 == i5) {
            zzfzq zzfzq3 = zzchc.f28460e;
            zzfzq zzfzq4 = zzchc.f28456a;
            if (this.f2172b.mo45135n()) {
                zzfzq3.execute(new zzah(this));
            } else {
                zzfzq4.execute(new zzai(this, zzfzq3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo20286k() {
        zzaw u = zzt.m2908u();
        Context context = this.f2171a;
        String str = this.f2174d;
        String str2 = this.f2175e;
        String str3 = this.f2176f;
        boolean m = u.mo20309m();
        u.mo20304h(u.mo20306j(context, str, str2));
        if (u.mo20309m()) {
            if (!m && !TextUtils.isEmpty(str3)) {
                u.mo20301e(context, str2, str3, str);
            }
            zzcgp.m45224b("Device is linked for debug signals.");
            u.mo20305i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        u.mo20300d(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo20287l() {
        zzaw u = zzt.m2908u();
        Context context = this.f2171a;
        String str = this.f2174d;
        String str2 = this.f2175e;
        if (!u.mo20307k(context, str, str2)) {
            u.mo20305i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if (ExifInterface.GPS_MEASUREMENT_2D.equals(u.f2195f)) {
            zzcgp.m45224b("Creative is not pushed for this device.");
            u.mo20305i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(u.f2195f)) {
            zzcgp.m45224b("The app is not linked for creative preview.");
            u.mo20300d(context, str, str2);
        } else if ("0".equals(u.f2195f)) {
            zzcgp.m45224b("Device is linked for in app preview.");
            u.mo20305i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: m */
    public final void mo20288m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f2177g = 0;
            this.f2179i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f2177g;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.f2177g = 5;
                    this.f2180j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f2181k.postDelayed(this.f2182l, ((Long) zzay.m1924c().mo42663b(zzbjc.f26950O3)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !m2527t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (m2527t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f2177g = -1;
                this.f2181k.removeCallbacks(this.f2182l);
            }
        }
    }

    /* renamed from: n */
    public final void mo20289n(String str) {
        this.f2174d = str;
    }

    /* renamed from: o */
    public final void mo20290o(String str) {
        this.f2175e = str;
    }

    /* renamed from: p */
    public final void mo20291p(String str) {
        this.f2173c = str;
    }

    /* renamed from: q */
    public final void mo20292q(String str) {
        this.f2176f = str;
    }

    /* renamed from: r */
    public final void mo20293r() {
        try {
            if (!(this.f2171a instanceof Activity)) {
                zzcgp.m45228f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(zzt.m2908u().mo20298b())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != zzt.m2908u().mo20309m()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int u = m2528u(arrayList, "Ad information", true);
            int u2 = m2528u(arrayList, str, true);
            int u3 = m2528u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue();
            int u4 = m2528u(arrayList, "Open ad inspector", booleanValue);
            int u5 = m2528u(arrayList, "Ad inspector settings", booleanValue);
            zzt.m2905r();
            AlertDialog.Builder g = zzs.m2756g(this.f2171a);
            g.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzap(this, u, u2, u3, u4, u5));
            g.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.m2646l("", e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f2173c);
        sb.append(",DebugSignal: ");
        sb.append(this.f2176f);
        sb.append(",AFMA Version: ");
        sb.append(this.f2175e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f2174d);
        sb.append("}");
        return sb.toString();
    }

    public zzas(Context context, String str) {
        this(context);
        this.f2173c = str;
    }
}
