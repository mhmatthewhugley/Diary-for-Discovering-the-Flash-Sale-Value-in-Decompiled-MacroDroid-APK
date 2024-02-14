package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzam;
import com.google.android.play.core.internal.zzas;
import com.google.android.play.core.internal.zzce;
import com.google.android.play.core.internal.zzch;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzq {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final zzag f51154e = new zzag("AppUpdateService");

    /* renamed from: f */
    private static final Intent f51155f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    @VisibleForTesting
    @Nullable

    /* renamed from: a */
    zzas f51156a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f51157b;

    /* renamed from: c */
    private final Context f51158c;

    /* renamed from: d */
    private final zzs f51159d;

    zzq(Context context, zzs zzs) {
        this.f51157b = context.getPackageName();
        this.f51158c = context;
        this.f51159d = zzs;
        if (zzch.m70928b(context)) {
            this.f51156a = new zzas(zzce.m70925a(context), f51154e, "AppUpdateService", f51155f, zzk.f51142a, (zzam) null);
        }
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ Bundle m70433b(zzq zzq, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m70438h());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(zzq.f51158c.getPackageManager().getPackageInfo(zzq.f51158c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f51154e.mo59806b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ AppUpdateInfo m70435d(zzq zzq, Bundle bundle, String str) {
        Integer num;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("version.code", -1);
        int i2 = bundle2.getInt("update.availability");
        int i3 = bundle2.getInt("install.status", 0);
        if (bundle2.getInt("client.version.staleness", -1) == -1) {
            num = null;
        } else {
            num = Integer.valueOf(bundle2.getInt("client.version.staleness"));
        }
        return AppUpdateInfo.m70394e(str, i, i2, i3, num, bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), zzq.f51159d.mo59560a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Bundle m70438h() {
        Bundle bundle = new Bundle();
        bundle.putAll(PlayCoreVersion.m70767a("app_update"));
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    /* renamed from: i */
    private static Task m70439i() {
        f51154e.mo59806b("onError(%d)", -9);
        return Tasks.m71249b(new InstallException(-9));
    }

    /* renamed from: f */
    public final Task mo59559f(String str) {
        if (this.f51156a == null) {
            return m70439i();
        }
        f51154e.mo59808d("requestUpdateInfo(%s)", str);
        zzi zzi = new zzi();
        this.f51156a.mo59820q(new zzl(this, zzi, str, zzi), zzi);
        return zzi.mo60030a();
    }
}
