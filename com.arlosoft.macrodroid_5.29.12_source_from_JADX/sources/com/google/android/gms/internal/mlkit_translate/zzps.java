package com.google.android.gms.internal.mlkit_translate;

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
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzps {
    @Nullable

    /* renamed from: k */
    private static zzv f44429k;

    /* renamed from: l */
    private static final zzy f44430l = zzy.m62269d("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    private final String f44431a;

    /* renamed from: b */
    private final String f44432b;

    /* renamed from: c */
    private final zzpr f44433c;

    /* renamed from: d */
    private final SharedPrefManager f44434d;

    /* renamed from: e */
    private final Task f44435e;

    /* renamed from: f */
    private final Task f44436f;

    /* renamed from: g */
    private final String f44437g;

    /* renamed from: h */
    private final int f44438h;

    /* renamed from: i */
    private final Map f44439i = new HashMap();

    /* renamed from: j */
    private final Map f44440j = new HashMap();

    public zzps(Context context, SharedPrefManager sharedPrefManager, zzpr zzpr, String str) {
        this.f44431a = context.getPackageName();
        this.f44432b = CommonUtils.m79028a(context);
        this.f44434d = sharedPrefManager;
        this.f44433c = zzpr;
        zzrf.m62243a();
        this.f44437g = str;
        this.f44435e = MLTaskExecutor.m79033b().mo64550c(new zzpn(this));
        MLTaskExecutor b = MLTaskExecutor.m79033b();
        sharedPrefManager.getClass();
        this.f44436f = b.mo64550c(new zzpo(sharedPrefManager));
        zzy zzy = f44430l;
        this.f44438h = zzy.containsKey(str) ? DynamiteModule.m5095c(context, (String) zzy.get(str)) : -1;
    }

    @NonNull
    /* renamed from: g */
    private static synchronized zzv m62160g() {
        synchronized (zzps.class) {
            zzv zzv = f44429k;
            if (zzv != null) {
                return zzv;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzs zzs = new zzs();
            for (int i = 0; i < locales.size(); i++) {
                zzs.mo52481d(CommonUtils.m79029b(locales.get(i)));
            }
            zzv e = zzs.mo52482e();
            f44429k = e;
            return e;
        }
    }

    /* renamed from: h */
    private final zznp m62161h(String str, String str2) {
        String str3;
        zznp zznp = new zznp();
        zznp.mo52338b(this.f44431a);
        zznp.mo52339c(this.f44432b);
        zznp.mo52344h(m62160g());
        zznp.mo52343g(Boolean.TRUE);
        zznp.mo52348l(str);
        zznp.mo52346j(str2);
        if (this.f44436f.mo23719t()) {
            str3 = (String) this.f44436f.mo23715p();
        } else {
            str3 = this.f44434d.mo64574h();
        }
        zznp.mo52345i(str3);
        zznp.mo52340d(10);
        zznp.mo52347k(Integer.valueOf(this.f44438h));
        return zznp;
    }

    @WorkerThread
    /* renamed from: i */
    private final String m62162i() {
        if (this.f44435e.mo23719t()) {
            return (String) this.f44435e.mo23715p();
        }
        return LibraryVersion.m4468a().mo21718b(this.f44437g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ String mo52441a() throws Exception {
        return LibraryVersion.m4468a().mo21718b(this.f44437g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo52442b(zzpj zzpj, zzle zzle, String str) {
        zzpj.mo52432b(zzle);
        zzpj.mo52433c(m62161h(zzpj.mo52434d(), str));
        this.f44433c.mo52436a(zzpj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo52443c(zzpj zzpj, zzpw zzpw, RemoteModel remoteModel) {
        zzpj.mo52432b(zzle.MODEL_DOWNLOAD);
        zzpj.mo52433c(m62161h(zzpw.mo52425e(), m62162i()));
        zzpj.mo52435e(zzqh.m62201a(remoteModel, this.f44434d, zzpw));
        this.f44433c.mo52436a(zzpj);
    }

    /* renamed from: d */
    public final void mo52444d(zzpj zzpj, zzle zzle) {
        mo52445e(zzpj, zzle, m62162i());
    }

    /* renamed from: e */
    public final void mo52445e(zzpj zzpj, zzle zzle, String str) {
        MLTaskExecutor.m79034f().execute(new zzpp(this, zzpj, zzle, str));
    }

    /* renamed from: f */
    public final void mo52446f(zzpj zzpj, RemoteModel remoteModel, zzpw zzpw) {
        MLTaskExecutor.m79034f().execute(new zzpq(this, zzpj, zzpw, remoteModel));
    }
}
