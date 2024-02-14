package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzif;
import com.google.android.gms.internal.mlkit_common.zzip;
import com.google.android.gms.internal.mlkit_common.zziz;
import com.google.android.gms.internal.mlkit_common.zzja;
import com.google.android.gms.internal.mlkit_common.zzji;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop;
import com.google.mlkit.common.sdkinternal.model.ModelValidator;
import com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzg implements RemoteModelManagerInterface {

    /* renamed from: a */
    private final MlKitContext f56255a;

    /* renamed from: b */
    private final zzmq f56256b;

    public zzg(MlKitContext mlKitContext) {
        zzmq b = zznb.m61542b("common");
        this.f56255a = mlKitContext;
        this.f56256b = b;
    }

    /* renamed from: f */
    private final RemoteModelDownloadManager m78996f(CustomRemoteModel customRemoteModel) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(this.f56255a, customRemoteModel, (ModelValidator) null, new ModelFileHelper(this.f56255a), new zza(this.f56255a, customRemoteModel.mo64532e()));
        MlKitContext mlKitContext = this.f56255a;
        return RemoteModelDownloadManager.m79108g(mlKitContext, customRemoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.mo64553a(ModelInfoRetrieverInterop.class));
    }

    /* renamed from: a */
    public final Task<Set<CustomRemoteModel>> mo64515a() {
        return Tasks.m66666e(new MlKitException("Custom Remote model does not support listing downloaded models", 12));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Boolean mo64516b(CustomRemoteModel customRemoteModel) throws Exception {
        return Boolean.valueOf(m78996f(customRemoteModel).mo64609h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo64517c(CustomRemoteModel customRemoteModel, TaskCompletionSource taskCompletionSource) {
        try {
            new ModelFileHelper(this.f56255a).mo64589a(ModelType.CUSTOM, (String) Preconditions.m4488k(customRemoteModel.mo64529b()));
            taskCompletionSource.mo56139c(null);
        } catch (RuntimeException e) {
            taskCompletionSource.mo56138b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo64518d(Task task) {
        boolean t = task.mo23719t();
        zzmq zzmq = this.f56256b;
        zzja zzja = new zzja();
        zzif zzif = new zzif();
        zzif.mo51867b(zzji.CUSTOM);
        zzif.mo51866a(Boolean.valueOf(t));
        zzja.mo51884e(zzif.mo51868c());
        zzmq.mo52010d(zzmt.m61528f(zzja), zziz.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo64519e(Task task) {
        boolean booleanValue = ((Boolean) task.mo23715p()).booleanValue();
        zzmq zzmq = this.f56256b;
        zzja zzja = new zzja();
        zzip zzip = new zzip();
        zzip.mo51876b(zzji.CUSTOM);
        zzip.mo51875a(Boolean.valueOf(booleanValue));
        zzja.mo51886g(zzip.mo51877c());
        zzmq.mo52010d(zzmt.m61528f(zzja), zziz.REMOTE_MODEL_IS_DOWNLOADED);
    }
}
