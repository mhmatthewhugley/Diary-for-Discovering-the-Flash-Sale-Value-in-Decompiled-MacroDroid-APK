package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.p007os.ConfigurationCompat;
import androidx.core.p007os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzmq {
    @Nullable

    /* renamed from: k */
    private static zzao f43041k;

    /* renamed from: l */
    private static final zzar f43042l = zzar.m61171c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    private final String f43043a;

    /* renamed from: b */
    private final String f43044b;

    /* renamed from: c */
    private final zzmp f43045c;

    /* renamed from: d */
    private final SharedPrefManager f43046d;

    /* renamed from: e */
    private final Task f43047e;

    /* renamed from: f */
    private final Task f43048f;

    /* renamed from: g */
    private final String f43049g;

    /* renamed from: h */
    private final int f43050h;

    /* renamed from: i */
    private final Map f43051i = new HashMap();

    /* renamed from: j */
    private final Map f43052j = new HashMap();

    public zzmq(Context context, SharedPrefManager sharedPrefManager, zzmp zzmp, String str) {
        this.f43043a = context.getPackageName();
        this.f43044b = CommonUtils.m79028a(context);
        this.f43046d = sharedPrefManager;
        this.f43045c = zzmp;
        zzne.m61545a();
        this.f43049g = str;
        this.f43047e = MLTaskExecutor.m79033b().mo64550c(new zzml(this));
        MLTaskExecutor b = MLTaskExecutor.m79033b();
        sharedPrefManager.getClass();
        this.f43048f = b.mo64550c(new zzmm(sharedPrefManager));
        zzar zzar = f43042l;
        this.f43050h = zzar.containsKey(str) ? DynamiteModule.m5095c(context, (String) zzar.get(str)) : -1;
    }

    @NonNull
    /* renamed from: h */
    private static synchronized zzao m61503h() {
        synchronized (zzmq.class) {
            zzao zzao = f43041k;
            if (zzao != null) {
                return zzao;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzal zzal = new zzal();
            for (int i = 0; i < locales.size(); i++) {
                zzal.mo51743d(CommonUtils.m79029b(locales.get(i)));
            }
            zzao e = zzal.mo51744e();
            f43041k = e;
            return e;
        }
    }

    /* renamed from: i */
    private final zzle m61504i(String str, String str2) {
        String str3;
        zzle zzle = new zzle();
        zzle.mo51942b(this.f43043a);
        zzle.mo51943c(this.f43044b);
        zzle.mo51948h(m61503h());
        zzle.mo51947g(Boolean.TRUE);
        zzle.mo51952l(str);
        zzle.mo51950j(str2);
        if (this.f43048f.mo23719t()) {
            str3 = (String) this.f43048f.mo23715p();
        } else {
            str3 = this.f43046d.mo64574h();
        }
        zzle.mo51949i(str3);
        zzle.mo51944d(10);
        zzle.mo51951k(Integer.valueOf(this.f43050h));
        return zzle;
    }

    @WorkerThread
    /* renamed from: j */
    private final String m61505j() {
        if (this.f43047e.mo23719t()) {
            return (String) this.f43047e.mo23715p();
        }
        return LibraryVersion.m4468a().mo21718b(this.f43049g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ String mo52007a() throws Exception {
        return LibraryVersion.m4468a().mo21718b(this.f43049g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo52008b(zzmh zzmh, zziz zziz, String str) {
        zzmh.mo51998b(zziz);
        zzmh.mo52001e(m61504i(zzmh.mo52000d(), str));
        this.f43045c.mo52002a(zzmh);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo52009c(zzmh zzmh, zzms zzms, RemoteModel remoteModel) {
        zzmh.mo51998b(zziz.MODEL_DOWNLOAD);
        zzmh.mo52001e(m61504i(zzms.mo51991e(), m61505j()));
        zzmh.mo51999c(zznc.m61543a(remoteModel, this.f43046d, zzms));
        this.f43045c.mo52002a(zzmh);
    }

    /* renamed from: d */
    public final void mo52010d(zzmh zzmh, zziz zziz) {
        MLTaskExecutor.m79034f().execute(new zzmn(this, zzmh, zziz, m61505j()));
    }

    /* renamed from: e */
    public final void mo52011e(zzmh zzmh, RemoteModel remoteModel, boolean z, int i) {
        zzmr h = zzms.m61520h();
        h.mo51984f(false);
        h.mo51982d(remoteModel.mo64531d());
        h.mo51979a(zzje.FAILED);
        h.mo51980b(zziy.DOWNLOAD_FAILED);
        h.mo51981c(i);
        mo52013g(zzmh, remoteModel, h.mo51985g());
    }

    /* renamed from: f */
    public final void mo52012f(zzmh zzmh, RemoteModel remoteModel, zziy zziy, boolean z, ModelType modelType, zzje zzje) {
        zzmr h = zzms.m61520h();
        h.mo51984f(z);
        h.mo51982d(modelType);
        h.mo51980b(zziy);
        h.mo51979a(zzje);
        mo52013g(zzmh, remoteModel, h.mo51985g());
    }

    /* renamed from: g */
    public final void mo52013g(zzmh zzmh, RemoteModel remoteModel, zzms zzms) {
        MLTaskExecutor.m79034f().execute(new zzmo(this, zzmh, zzms, remoteModel));
    }
}
