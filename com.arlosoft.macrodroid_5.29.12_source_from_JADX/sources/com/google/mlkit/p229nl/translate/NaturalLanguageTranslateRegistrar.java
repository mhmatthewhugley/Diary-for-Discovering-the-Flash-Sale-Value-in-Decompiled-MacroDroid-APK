package com.google.mlkit.p229nl.translate;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p229nl.translate.internal.TranslatorImpl;
import com.google.mlkit.p229nl.translate.internal.zzaa;
import com.google.mlkit.p229nl.translate.internal.zzaf;
import com.google.mlkit.p229nl.translate.internal.zzan;
import com.google.mlkit.p229nl.translate.internal.zzh;
import com.google.mlkit.p229nl.translate.internal.zzj;
import com.google.mlkit.p229nl.translate.internal.zzq;
import com.google.mlkit.p229nl.translate.internal.zzr;
import com.google.mlkit.p229nl.translate.internal.zzz;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.mlkit.nl.translate.NaturalLanguageTranslateRegistrar */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class NaturalLanguageTranslateRegistrar implements ComponentRegistrar {
    @NonNull
    public final List getComponents() {
        Class<zzh> cls = zzh.class;
        Class<zzz> cls2 = zzz.class;
        Class<zzj> cls3 = zzj.class;
        Class<zzan> cls4 = zzan.class;
        Class<zzq> cls5 = zzq.class;
        Class<zzaa> cls6 = zzaa.class;
        Class<zzaf> cls7 = zzaf.class;
        Class<ModelFileHelper> cls8 = ModelFileHelper.class;
        Class<zzr> cls9 = zzr.class;
        return zzv.m62260w(Component.m6343c(cls4).mo22880b(Dependency.m6427j(cls6)).mo22880b(Dependency.m6427j(cls5)).mo22884f(zza.f56550a).mo22882d(), Component.m6346k(RemoteModelManager.RemoteModelManagerRegistration.class).mo22880b(Dependency.m6428k(cls4)).mo22884f(zzb.f56551a).mo22882d(), Component.m6343c(cls5).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6427j(cls8)).mo22884f(zzc.f56552a).mo22881c().mo22882d(), Component.m6343c(cls3).mo22880b(Dependency.m6427j(cls7)).mo22880b(Dependency.m6427j(cls8)).mo22880b(Dependency.m6427j(cls9)).mo22884f(zzd.f56553a).mo22882d(), Component.m6343c(TranslatorImpl.Factory.class).mo22880b(Dependency.m6428k(cls6)).mo22880b(Dependency.m6427j(cls3)).mo22880b(Dependency.m6427j(cls9)).mo22880b(Dependency.m6427j(cls7)).mo22880b(Dependency.m6427j(ExecutorSelector.class)).mo22880b(Dependency.m6427j(cls5)).mo22880b(Dependency.m6427j(CloseGuard.Factory.class)).mo22884f(zze.f56554a).mo22882d(), Component.m6343c(cls9).mo22884f(zzf.f56555a).mo22882d(), Component.m6343c(cls7).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6427j(cls9)).mo22880b(Dependency.m6427j(cls8)).mo22884f(zzg.f56556a).mo22882d(), Component.m6343c(cls2).mo22884f(zzh.f56557a).mo22882d(), Component.m6343c(cls).mo22880b(Dependency.m6427j(MlKitContext.class)).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6427j(cls9)).mo22880b(Dependency.m6427j(cls7)).mo22880b(Dependency.m6427j(cls8)).mo22880b(Dependency.m6427j(SharedPrefManager.class)).mo22884f(zzi.f56558a).mo22882d(), Component.m6343c(cls6).mo22880b(Dependency.m6427j(cls)).mo22880b(Dependency.m6427j(cls2)).mo22884f(zzj.f56559a).mo22882d());
    }
}
