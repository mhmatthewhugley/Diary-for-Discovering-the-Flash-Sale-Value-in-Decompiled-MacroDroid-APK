package com.google.mlkit.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzao;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.internal.model.zzg;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.util.List;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @NonNull
    public final List getComponents() {
        Class<zzg> cls = zzg.class;
        Class<Cleaner> cls2 = Cleaner.class;
        Class<RemoteModelManager.RemoteModelManagerRegistration> cls3 = RemoteModelManager.RemoteModelManagerRegistration.class;
        Class<MlKitContext> cls4 = MlKitContext.class;
        return zzao.m61163n(SharedPrefManager.f56332b, Component.m6343c(ModelFileHelper.class).mo22880b(Dependency.m6427j(cls4)).mo22884f(zza.f56257a).mo22882d(), Component.m6343c(MlKitThreadPool.class).mo22884f(zzb.f56258a).mo22882d(), Component.m6343c(RemoteModelManager.class).mo22880b(Dependency.m6429l(cls3)).mo22884f(zzc.f56259a).mo22882d(), Component.m6343c(ExecutorSelector.class).mo22880b(Dependency.m6428k(MlKitThreadPool.class)).mo22884f(zzd.f56260a).mo22882d(), Component.m6343c(cls2).mo22884f(zze.f56261a).mo22882d(), Component.m6343c(CloseGuard.Factory.class).mo22880b(Dependency.m6427j(cls2)).mo22884f(zzf.f56262a).mo22882d(), Component.m6343c(cls).mo22880b(Dependency.m6427j(cls4)).mo22884f(zzg.f56263a).mo22882d(), Component.m6346k(cls3).mo22880b(Dependency.m6428k(cls)).mo22884f(zzh.f56264a).mo22882d());
    }
}
