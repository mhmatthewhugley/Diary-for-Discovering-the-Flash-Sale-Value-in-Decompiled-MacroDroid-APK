package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeiq implements zzehc {

    /* renamed from: a */
    private final Context f34120a;

    /* renamed from: b */
    private final zzdmh f34121b;

    /* renamed from: c */
    private final Executor f34122c;

    /* renamed from: d */
    private final zzfdj f34123d;

    public zzeiq(Context context, Executor executor, zzdmh zzdmh, zzfdj zzfdj) {
        this.f34120a = context;
        this.f34121b = zzdmh;
        this.f34122c = executor;
        this.f34123d = zzfdj;
    }

    @Nullable
    /* renamed from: d */
    private static String m48887d(zzfdk zzfdk) {
        try {
            return zzfdk.f35557w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        Context context = this.f34120a;
        return (context instanceof Activity) && zzbka.m43635g(context) && !TextUtils.isEmpty(m48887d(zzfdk));
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        String d = m48887d(zzfdk);
        return zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzeio(this, d != null ? Uri.parse(d) : null, zzfdw, zzfdk), this.f34122c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45324c(Uri uri, zzfdw zzfdw, zzfdk zzfdk, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzc zzc = new zzc(build.intent, (zzx) null);
            zzchh zzchh = new zzchh();
            zzdlh c = this.f34121b.mo44335c(new zzczt(zzfdw, zzfdk, (String) null), new zzdlk(new zzeip(zzchh), (zzcmp) null));
            zzchh.mo43574c(new AdOverlayInfoParcel(zzc, (zza) null, c.mo44325h(), (zzz) null, new zzcgv(0, 0, false, false, false), (zzcmp) null, (zzdkn) null));
            this.f34123d.mo45596a();
            return zzfzg.m51414i(c.mo44326i());
        } catch (Throwable th) {
            zzcgp.m45227e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
