package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfnq {

    /* renamed from: a */
    private final Context f36172a;

    /* renamed from: b */
    private final Executor f36173b;

    /* renamed from: c */
    private final zzfmx f36174c;

    /* renamed from: d */
    private final zzfmz f36175d;

    /* renamed from: e */
    private final zzfnp f36176e;

    /* renamed from: f */
    private final zzfnp f36177f;

    /* renamed from: g */
    private Task f36178g;

    /* renamed from: h */
    private Task f36179h;

    @VisibleForTesting
    zzfnq(Context context, Executor executor, zzfmx zzfmx, zzfmz zzfmz, zzfnn zzfnn, zzfno zzfno) {
        this.f36172a = context;
        this.f36173b = executor;
        this.f36174c = zzfmx;
        this.f36175d = zzfmz;
        this.f36176e = zzfnn;
        this.f36177f = zzfno;
    }

    /* renamed from: e */
    public static zzfnq m50629e(@NonNull Context context, @NonNull Executor executor, @NonNull zzfmx zzfmx, @NonNull zzfmz zzfmz) {
        zzfnq zzfnq = new zzfnq(context, executor, zzfmx, zzfmz, new zzfnn(), new zzfno());
        if (zzfnq.f36175d.mo45992d()) {
            zzfnq.f36178g = zzfnq.m50631h(new zzfnk(zzfnq));
        } else {
            zzfnq.f36178g = Tasks.m66667f(zzfnq.f36176e.zza());
        }
        zzfnq.f36179h = zzfnq.m50631h(new zzfnl(zzfnq));
        return zzfnq;
    }

    /* renamed from: g */
    private static zzana m50630g(@NonNull Task task, @NonNull zzana zzana) {
        if (!task.mo23719t()) {
            return zzana;
        }
        return (zzana) task.mo23715p();
    }

    /* renamed from: h */
    private final Task m50631h(@NonNull Callable callable) {
        return Tasks.m66664c(this.f36173b, callable).mo23706g(this.f36173b, new zzfnm(this));
    }

    /* renamed from: a */
    public final zzana mo46011a() {
        return m50630g(this.f36178g, this.f36176e.zza());
    }

    /* renamed from: b */
    public final zzana mo46012b() {
        return m50630g(this.f36179h, this.f36177f.zza());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzana mo46013c() throws Exception {
        Context context = this.f36172a;
        zzamk f0 = zzana.m41917f0();
        AdvertisingIdClient.Info a = AdvertisingIdClient.m1817a(context);
        String a2 = a.mo19848a();
        if (a2 != null && a2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a2 = Base64.encodeToString(bArr, 11);
        }
        if (a2 != null) {
            f0.mo41656C0(a2);
            f0.mo41654B0(a.mo19849b());
            f0.mo41683a0(6);
        }
        return (zzana) f0.mo47341h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ zzana mo46014d() throws Exception {
        Context context = this.f36172a;
        return zzfnf.m50612a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo46015f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f36174c.mo45982c(2025, -1, exc);
    }
}
