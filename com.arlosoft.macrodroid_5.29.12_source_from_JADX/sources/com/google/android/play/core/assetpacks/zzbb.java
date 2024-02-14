package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzco;
import com.google.android.play.core.listener.zzc;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbb extends zzc {

    /* renamed from: g */
    private final zzde f51255g;

    /* renamed from: h */
    private final zzcl f51256h;

    /* renamed from: i */
    private final zzco f51257i;

    /* renamed from: j */
    private final zzbx f51258j;

    /* renamed from: k */
    private final zzco f51259k;

    /* renamed from: l */
    private final zzco f51260l;

    /* renamed from: m */
    private final zzco f51261m;

    /* renamed from: n */
    private final zzeb f51262n;

    /* renamed from: o */
    private final Handler f51263o = new Handler(Looper.getMainLooper());

    zzbb(Context context, zzde zzde, zzcl zzcl, zzco zzco, zzco zzco2, zzbx zzbx, zzco zzco3, zzco zzco4, zzeb zzeb) {
        super(new zzag("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f51255g = zzde;
        this.f51256h = zzcl;
        this.f51257i = zzco;
        this.f51259k = zzco2;
        this.f51258j = zzbx;
        this.f51260l = zzco3;
        this.f51261m = zzco4;
        this.f51262n = zzeb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59548a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f51726a.mo59806b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState i = AssetPackState.m70458i(bundleExtra, stringArrayList.get(0), this.f51259k, this.f51262n, zzbd.f51273a);
            this.f51726a.mo59805a("ListenerRegistryBroadcastReceiver.onReceive: %s", i);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f51258j.mo59694a(pendingIntent);
            }
            ((Executor) this.f51261m.zza()).execute(new zzaz(this, bundleExtra, i));
            ((Executor) this.f51260l.zza()).execute(new zzay(this, bundleExtra));
            return;
        }
        this.f51726a.mo59806b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo59618f(Bundle bundle) {
        if (this.f51255g.mo59727o(bundle)) {
            this.f51256h.mo59704a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo59619g(Bundle bundle, AssetPackState assetPackState) {
        if (this.f51255g.mo59726n(bundle)) {
            mo59620h(assetPackState);
            ((zzy) this.f51257i.zza()).mo59608c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo59620h(AssetPackState assetPackState) {
        this.f51263o.post(new zzba(this, assetPackState));
    }
}
