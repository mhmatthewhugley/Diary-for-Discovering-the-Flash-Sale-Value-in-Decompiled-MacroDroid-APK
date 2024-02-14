package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C1721R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbxx extends zzbyf {

    /* renamed from: c */
    private final Map f27938c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f27939d;

    /* renamed from: e */
    private final String f27940e = m44643l("description");

    /* renamed from: f */
    private final long f27941f = m44642k("start_ticks");

    /* renamed from: g */
    private final long f27942g = m44642k("end_ticks");

    /* renamed from: h */
    private final String f27943h = m44643l("summary");

    /* renamed from: i */
    private final String f27944i = m44643l("location");

    public zzbxx(zzcmp zzcmp, Map map) {
        super(zzcmp, "createCalendarEvent");
        this.f27938c = map;
        this.f27939d = zzcmp.mo43756i();
    }

    /* renamed from: k */
    private final long m44642k(String str) {
        String str2 = (String) this.f27938c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: l */
    private final String m44643l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f27938c.get(str)) ? "" : (String) this.f27938c.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Intent mo43196i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f27940e);
        data.putExtra("eventLocation", this.f27944i);
        data.putExtra("description", this.f27943h);
        long j = this.f27941f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f27942g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: j */
    public final void mo43197j() {
        if (this.f27939d == null) {
            mo43218c("Activity context is not available.");
            return;
        }
        zzt.m2905r();
        if (!new zzbim(this.f27939d).mo42643b()) {
            mo43218c("This feature is not available on the device.");
            return;
        }
        zzt.m2905r();
        AlertDialog.Builder g = zzs.m2756g(this.f27939d);
        Resources d = zzt.m2904q().mo43491d();
        g.setTitle(d != null ? d.getString(C1721R.string.f1785s5) : "Create calendar event");
        g.setMessage(d != null ? d.getString(C1721R.string.f1786s6) : "Allow Ad to create a calendar event?");
        g.setPositiveButton(d != null ? d.getString(C1721R.string.f1783s3) : "Accept", new zzbxv(this));
        g.setNegativeButton(d != null ? d.getString(C1721R.string.f1784s4) : "Decline", new zzbxw(this));
        g.create().show();
    }
}
