package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.internal.mlkit_translate.zzkk;
import com.google.android.gms.internal.mlkit_translate.zzkw;
import com.google.android.gms.internal.mlkit_translate.zzle;
import com.google.android.gms.internal.mlkit_translate.zzlf;
import com.google.android.gms.internal.mlkit_translate.zzln;
import com.google.android.gms.internal.mlkit_translate.zzps;
import com.google.android.gms.internal.mlkit_translate.zzpx;
import com.google.android.gms.internal.mlkit_translate.zzqf;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import com.google.mlkit.p229nl.translate.TranslateLanguage;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.mlkit.nl.translate.internal.zzan */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzan implements RemoteModelManagerInterface {

    /* renamed from: a */
    private final zzps f56492a = zzqf.m62200b("translate");

    /* renamed from: b */
    private final zzaa f56493b;

    /* renamed from: c */
    private final Task f56494c;

    public zzan(zzaa zzaa, zzq zzq) {
        this.f56493b = zzaa;
        this.f56494c = zzq.mo64585d();
    }

    /* renamed from: a */
    public final Task mo64515a() {
        List<String> a = TranslateLanguage.m79143a();
        ArrayList arrayList = new ArrayList(a.size());
        ArrayList arrayList2 = new ArrayList(a.size());
        com.google.android.gms.internal.mlkit_translate.zzan z = ((zzv) a).listIterator(0);
        while (z.hasNext()) {
            TranslateRemoteModel a2 = new TranslateRemoteModel.Builder((String) z.next()).mo64632a();
            arrayList.add(a2);
            arrayList2.add(mo64663b(a2));
        }
        return Tasks.m66672k(arrayList2).mo23710k(new zzah(arrayList));
    }

    /* renamed from: b */
    public final Task mo64663b(TranslateRemoteModel translateRemoteModel) {
        if (translateRemoteModel.mo64631f().equals("en")) {
            return Tasks.m66667f(Boolean.TRUE);
        }
        return this.f56494c.mo23711l(MLTaskExecutor.m79034f(), new zzal(this, translateRemoteModel)).mo23702c(new zzam(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Task mo64664c(TranslateRemoteModel translateRemoteModel, DownloadConditions downloadConditions, Task task) throws Exception {
        return this.f56493b.mo64653a(translateRemoteModel, true).mo64655b(downloadConditions);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Boolean mo64665d(TranslateRemoteModel translateRemoteModel, Task task) throws Exception {
        return Boolean.valueOf(this.f56493b.mo64653a(translateRemoteModel, false).mo64659f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Void mo64666e(TranslateRemoteModel translateRemoteModel, Task task) throws Exception {
        this.f56493b.mo64653a(translateRemoteModel, true).mo64658e();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo64667f(Task task) {
        boolean t = task.mo23719t();
        zzps zzps = this.f56492a;
        zzlf zzlf = new zzlf();
        zzkk zzkk = new zzkk();
        zzkk.mo52227b(zzln.BASE_TRANSLATE);
        zzkk.mo52226a(Boolean.valueOf(t));
        zzlf.mo52248f(zzkk.mo52228c());
        zzps.mo52444d(zzpx.m62188f(zzlf), zzle.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo64668g(Task task) {
        boolean booleanValue = ((Boolean) task.mo23715p()).booleanValue();
        zzps zzps = this.f56492a;
        zzlf zzlf = new zzlf();
        zzkw zzkw = new zzkw();
        zzkw.mo52243b(zzln.BASE_TRANSLATE);
        zzkw.mo52242a(Boolean.valueOf(booleanValue));
        zzlf.mo52250h(zzkw.mo52244c());
        zzps.mo52444d(zzpx.m62188f(zzlf), zzle.REMOTE_MODEL_IS_DOWNLOADED);
    }
}
