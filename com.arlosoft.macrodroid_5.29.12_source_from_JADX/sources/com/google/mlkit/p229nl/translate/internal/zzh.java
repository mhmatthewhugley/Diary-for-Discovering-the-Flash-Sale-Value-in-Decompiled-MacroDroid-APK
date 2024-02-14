package com.google.mlkit.p229nl.translate.internal;

import android.app.DownloadManager;
import android.content.Context;
import com.google.android.gms.internal.mlkit_translate.zznv;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.ModelValidator;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;

/* renamed from: com.google.mlkit.nl.translate.internal.zzh */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzh {

    /* renamed from: a */
    private final MlKitContext f56508a;

    /* renamed from: b */
    private final Context f56509b;

    /* renamed from: c */
    private final zzr f56510c;

    /* renamed from: d */
    private final zzaf f56511d;

    /* renamed from: e */
    private final ModelFileHelper f56512e;

    /* renamed from: f */
    private final SharedPrefManager f56513f;

    public zzh(MlKitContext mlKitContext, Context context, zzr zzr, zzaf zzaf, ModelFileHelper modelFileHelper, SharedPrefManager sharedPrefManager) {
        this.f56508a = mlKitContext;
        this.f56509b = context;
        this.f56510c = zzr;
        this.f56511d = zzaf;
        this.f56512e = modelFileHelper;
        this.f56513f = sharedPrefManager;
    }

    /* renamed from: a */
    public final zzi mo64675a(TranslateRemoteModel translateRemoteModel) {
        zzr zzr = this.f56510c;
        String[] split = translateRemoteModel.mo64532e().split("_");
        zznv zznv = new zznv();
        zznv.mo52361a(split[0]);
        zznv.mo52362b(split[1]);
        zzt a = zzr.mo64689a(zznv.mo52363c());
        return new zzi(this.f56509b, new RemoteModelFileManager(this.f56508a, translateRemoteModel, (ModelValidator) null, this.f56512e, new zzag(this.f56508a, zzad.m79188e(translateRemoteModel.mo64631f()))), translateRemoteModel, this.f56511d, a, new zzu(a), (DownloadManager) this.f56509b.getSystemService("download"), this.f56512e, this.f56513f, new zzc());
    }
}
