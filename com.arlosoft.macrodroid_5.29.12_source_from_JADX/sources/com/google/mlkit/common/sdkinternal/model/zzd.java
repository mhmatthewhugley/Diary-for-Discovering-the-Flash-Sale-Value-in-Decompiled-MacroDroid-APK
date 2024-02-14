package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.mlkit_common.zziy;
import com.google.android.gms.internal.mlkit_common.zzje;
import com.google.android.gms.internal.mlkit_common.zzmh;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmr;
import com.google.android.gms.internal.mlkit_common.zzms;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;

@WorkerThread
/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzd extends BroadcastReceiver {

    /* renamed from: a */
    private final long f56392a;

    /* renamed from: b */
    private final TaskCompletionSource f56393b;

    /* renamed from: c */
    final /* synthetic */ RemoteModelDownloadManager f56394c;

    /* synthetic */ zzd(RemoteModelDownloadManager remoteModelDownloadManager, long j, TaskCompletionSource taskCompletionSource, zzc zzc) {
        this.f56394c = remoteModelDownloadManager;
        this.f56392a = j;
        this.f56393b = taskCompletionSource;
    }

    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        if (longExtra == this.f56392a) {
            Integer e = this.f56394c.mo64607e();
            synchronized (this.f56394c) {
                try {
                    this.f56394c.f56371c.mo64554b().unregisterReceiver(this);
                } catch (IllegalArgumentException e2) {
                    RemoteModelDownloadManager.f56367m.mo21709i("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e2);
                }
                this.f56394c.f56369a.remove(this.f56392a);
                this.f56394c.f56370b.remove(this.f56392a);
            }
            if (e != null) {
                if (e.intValue() == 16) {
                    zzmq r = this.f56394c.f56375g;
                    zzmh g = zzmt.m61529g();
                    RemoteModelDownloadManager remoteModelDownloadManager = this.f56394c;
                    RemoteModel o = remoteModelDownloadManager.f56373e;
                    Long valueOf = Long.valueOf(longExtra);
                    r.mo52011e(g, o, false, remoteModelDownloadManager.mo64608f(valueOf));
                    this.f56393b.mo56138b(this.f56394c.m79118v(valueOf));
                    return;
                } else if (e.intValue() == 8) {
                    zzmq r2 = this.f56394c.f56375g;
                    zzmh g2 = zzmt.m61529g();
                    RemoteModel o2 = this.f56394c.f56373e;
                    zzmr h = zzms.m61520h();
                    h.mo51980b(zziy.NO_ERROR);
                    h.mo51983e(true);
                    h.mo51982d(this.f56394c.f56373e.mo64531d());
                    h.mo51979a(zzje.SUCCEEDED);
                    r2.mo52013g(g2, o2, h.mo51985g());
                    this.f56393b.mo56139c(null);
                    return;
                }
            }
            this.f56394c.f56375g.mo52011e(zzmt.m61529g(), this.f56394c.f56373e, false, 0);
            this.f56393b.mo56138b(new MlKitException("Model downloading failed", 13));
        }
    }
}
