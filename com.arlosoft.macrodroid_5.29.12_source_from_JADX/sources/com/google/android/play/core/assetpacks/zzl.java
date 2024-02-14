package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.common.zza;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzco;
import com.google.android.play.core.splitinstall.zzs;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.zzi;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzl implements AssetPackManager {

    /* renamed from: l */
    private static final zzag f51608l = new zzag("AssetPackManager");

    /* renamed from: a */
    private final zzbh f51609a;

    /* renamed from: b */
    private final zzco f51610b;

    /* renamed from: c */
    private final zzbb f51611c;

    /* renamed from: d */
    private final zzs f51612d;

    /* renamed from: e */
    private final zzde f51613e;

    /* renamed from: f */
    private final zzco f51614f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzbx f51615g;

    /* renamed from: h */
    private final zzco f51616h;

    /* renamed from: i */
    private final zza f51617i;

    /* renamed from: j */
    private final zzeb f51618j;

    /* renamed from: k */
    private final Handler f51619k = new Handler(Looper.getMainLooper());

    zzl(zzbh zzbh, zzco zzco, zzbb zzbb, zzs zzs, zzde zzde, zzco zzco2, zzbx zzbx, zzco zzco3, zza zza, zzeb zzeb) {
        this.f51609a = zzbh;
        this.f51610b = zzco;
        this.f51611c = zzbb;
        this.f51612d = zzs;
        this.f51613e = zzde;
        this.f51614f = zzco2;
        this.f51615g = zzbx;
        this.f51616h = zzco3;
        this.f51617i = zza;
        this.f51618j = zzeb;
    }

    /* renamed from: h */
    private final void m70746h() {
        ((Executor) this.f51616h.zza()).execute(new zzi(this));
    }

    /* access modifiers changed from: package-private */
    @AssetPackStatus
    @VisibleForTesting
    /* renamed from: a */
    public final int mo59779a(@AssetPackStatus int i, String str) {
        if (!this.f51609a.mo59641g(str) && i == 4) {
            return 8;
        }
        if (!this.f51609a.mo59641g(str) || i == 4) {
            return i;
        }
        return 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo59780c() {
        this.f51609a.mo59633L();
        this.f51609a.mo59631J();
        this.f51609a.mo59632K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo59781d(String str, zzi zzi) {
        if (this.f51609a.mo59638d(str)) {
            zzi.mo60032c((Object) null);
            ((zzy) this.f51610b.zza()).mo59612z1(str);
            return;
        }
        zzi.mo60031b(new IOException(String.format("Failed to remove pack %s.", new Object[]{str})));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo59782f() {
        Task f = ((zzy) this.f51610b.zza()).mo59611f(this.f51609a.mo59629H());
        zzbh zzbh = this.f51609a;
        zzbh.getClass();
        f.mo60019e((Executor) this.f51616h.zza(), new zzg(zzbh));
        f.mo60017c((Executor) this.f51616h.zza(), zzf.f51599a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo59783g(boolean z) {
        boolean e = this.f51611c.mo59914e();
        this.f51611c.mo59912c(z);
        if (z && !e) {
            m70746h();
        }
    }
}
