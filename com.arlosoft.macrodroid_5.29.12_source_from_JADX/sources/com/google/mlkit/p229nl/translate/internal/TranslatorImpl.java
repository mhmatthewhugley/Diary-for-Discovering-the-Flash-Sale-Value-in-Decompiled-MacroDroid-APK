package com.google.mlkit.p229nl.translate.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzam;
import com.google.android.gms.internal.mlkit_translate.zzs;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.inject.Provider;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;
import com.google.mlkit.p229nl.translate.Translator;
import com.google.mlkit.p229nl.translate.TranslatorOptions;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.mlkit.nl.translate.internal.TranslatorImpl */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class TranslatorImpl implements Translator {

    /* renamed from: A */
    public static final /* synthetic */ int f56447A = 0;

    /* renamed from: z */
    private static final DownloadConditions f56448z = new DownloadConditions.Builder().mo64524a();

    /* renamed from: a */
    private final TranslatorOptions f56449a;

    /* renamed from: c */
    private final Provider f56450c;

    /* renamed from: d */
    private final AtomicReference f56451d;

    /* renamed from: f */
    private final zzt f56452f;

    /* renamed from: g */
    private final Executor f56453g;

    /* renamed from: o */
    private final Task f56454o;

    /* renamed from: p */
    private final CancellationTokenSource f56455p = new CancellationTokenSource();

    /* renamed from: s */
    private CloseGuard f56456s;

    @KeepForSdk
    /* renamed from: com.google.mlkit.nl.translate.internal.TranslatorImpl$Factory */
    /* compiled from: com.google.mlkit:translate@@17.0.1 */
    public static class Factory {

        /* renamed from: a */
        private final Provider f56457a;

        /* renamed from: b */
        private final zzj f56458b;

        /* renamed from: c */
        private final zzr f56459c;

        /* renamed from: d */
        private final zzaf f56460d;

        /* renamed from: e */
        private final ExecutorSelector f56461e;

        /* renamed from: f */
        private final zzq f56462f;

        /* renamed from: g */
        private final CloseGuard.Factory f56463g;

        public Factory(Provider provider, zzj zzj, zzr zzr, zzaf zzaf, ExecutorSelector executorSelector, zzq zzq, CloseGuard.Factory factory) {
            this.f56461e = executorSelector;
            this.f56462f = zzq;
            this.f56457a = provider;
            this.f56459c = zzr;
            this.f56458b = zzj;
            this.f56460d = zzaf;
            this.f56463g = factory;
        }

        @NonNull
        /* renamed from: a */
        public final Translator mo64652a(@NonNull TranslatorOptions translatorOptions) {
            TranslatorOptions translatorOptions2 = translatorOptions;
            TranslatorImpl translatorImpl = new TranslatorImpl(translatorOptions2, this.f56457a, (TranslateJni) this.f56458b.mo64548b(translatorOptions), this.f56459c.mo64689a(translatorOptions.mo64636a()), this.f56461e.mo64547a(translatorOptions.mo64642f()), this.f56462f, (zzas) null);
            TranslatorImpl.m79168c(translatorImpl, this.f56463g, this.f56460d);
            return translatorImpl;
        }
    }

    /* synthetic */ TranslatorImpl(TranslatorOptions translatorOptions, Provider provider, TranslateJni translateJni, zzt zzt, Executor executor, zzq zzq, zzas zzas) {
        this.f56449a = translatorOptions;
        this.f56450c = provider;
        this.f56451d = new AtomicReference(translateJni);
        this.f56452f = zzt;
        this.f56453g = executor;
        this.f56454o = zzq.mo64585d();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m79168c(TranslatorImpl translatorImpl, CloseGuard.Factory factory, zzaf zzaf) {
        translatorImpl.f56456s = factory.mo64546a(translatorImpl, 1, new zzap(translatorImpl));
        ((TranslateJni) translatorImpl.f56451d.get()).mo64562d();
        translatorImpl.f56452f.mo64714z();
        zzaf.mo64661b();
    }

    @NonNull
    /* renamed from: B1 */
    public final Task<Void> mo64633B1(@NonNull DownloadConditions downloadConditions) {
        return this.f56454o.mo23713n(MLTaskExecutor.m79034f(), new zzao(this, downloadConditions));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Task mo64649b(DownloadConditions downloadConditions, Task task) throws Exception {
        Preconditions.m4481d(MLTaskExecutor.m79033b().mo64549a());
        zzs k = zzv.m62252k();
        zzam h = zzad.m79186c(this.f56449a.mo64639d(), this.f56449a.mo64640e()).iterator();
        while (h.hasNext()) {
            k.mo52481d(((zzaa) this.f56450c.get()).mo64653a(new TranslateRemoteModel.Builder((String) h.next()).mo64632a(), true).mo64655b(downloadConditions));
        }
        return Tasks.m66668g(k.mo52482e());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void close() {
        this.f56456s.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo64650e() {
        CancellationTokenSource cancellationTokenSource = this.f56455p;
        AtomicReference atomicReference = this.f56451d;
        Executor executor = this.f56453g;
        cancellationTokenSource.mo56134a();
        TranslateJni translateJni = (TranslateJni) atomicReference.getAndSet((Object) null);
        Preconditions.m4493p(translateJni != null);
        translateJni.mo64564f(executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo64651f(String str, boolean z, long j, Task task) {
        this.f56452f.mo64690A(str, z, SystemClock.elapsedRealtime() - j, task);
    }

    @NonNull
    /* renamed from: y1 */
    public final Task<String> mo64635y1(@NonNull String str) {
        Preconditions.m4489l(str, "Input can't be null");
        TranslateJni translateJni = (TranslateJni) this.f56451d.get();
        Preconditions.m4494q(translateJni != null, "Translator has been closed");
        return translateJni.mo64559a(this.f56453g, new zzaq(translateJni, str), this.f56455p.mo56135b()).mo23702c(new zzar(this, str, !translateJni.mo64560b(), SystemClock.elapsedRealtime()));
    }
}
