package com.google.android.gms.internal.mlkit_translate;

import com.google.mlkit.common.model.RemoteModel;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzpq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzps f44425a;

    /* renamed from: c */
    public final /* synthetic */ zzpj f44426c;

    /* renamed from: d */
    public final /* synthetic */ zzpw f44427d;

    /* renamed from: f */
    public final /* synthetic */ RemoteModel f44428f;

    public /* synthetic */ zzpq(zzps zzps, zzpj zzpj, zzpw zzpw, RemoteModel remoteModel) {
        this.f44425a = zzps;
        this.f44426c = zzpj;
        this.f44427d = zzpw;
        this.f44428f = remoteModel;
    }

    public final void run() {
        this.f44425a.mo52443c(this.f44426c, this.f44427d, this.f44428f);
    }
}
