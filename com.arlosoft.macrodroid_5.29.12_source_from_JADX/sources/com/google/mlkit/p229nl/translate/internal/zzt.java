package com.google.mlkit.p229nl.translate.internal;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_translate.zzks;
import com.google.android.gms.internal.mlkit_translate.zzku;
import com.google.android.gms.internal.mlkit_translate.zzlc;
import com.google.android.gms.internal.mlkit_translate.zzld;
import com.google.android.gms.internal.mlkit_translate.zzle;
import com.google.android.gms.internal.mlkit_translate.zzlf;
import com.google.android.gms.internal.mlkit_translate.zzlj;
import com.google.android.gms.internal.mlkit_translate.zzne;
import com.google.android.gms.internal.mlkit_translate.zznf;
import com.google.android.gms.internal.mlkit_translate.zznx;
import com.google.android.gms.internal.mlkit_translate.zzoo;
import com.google.android.gms.internal.mlkit_translate.zzpj;
import com.google.android.gms.internal.mlkit_translate.zzps;
import com.google.android.gms.internal.mlkit_translate.zzpu;
import com.google.android.gms.internal.mlkit_translate.zzpv;
import com.google.android.gms.internal.mlkit_translate.zzpw;
import com.google.android.gms.internal.mlkit_translate.zzpx;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;

/* renamed from: com.google.mlkit.nl.translate.internal.zzt */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzt {

    /* renamed from: a */
    private final zzps f56539a;

    /* renamed from: b */
    private final zzpu f56540b;

    /* renamed from: c */
    private final zznx f56541c;

    /* synthetic */ zzt(zzps zzps, zzpu zzpu, zznx zznx, zzs zzs) {
        this.f56539a = zzps;
        this.f56541c = zznx;
        this.f56540b = zzpu;
    }

    /* renamed from: B */
    private final zzne m79241B(zzku zzku) {
        zzne zzne = new zzne();
        zzne.mo52315e(this.f56541c);
        zzne.mo52312b(zzku);
        return zzne;
    }

    /* renamed from: a */
    private final void m79242a(zzne zzne, zzle zzle) {
        zzps zzps = this.f56539a;
        zzlf zzlf = new zzlf();
        zzlf.mo52247e(zzlc.TYPE_THICK);
        zzlf.mo52252j(zzne.mo52319j());
        zzps.mo52444d(zzpx.m62188f(zzlf), zzle);
    }

    /* renamed from: b */
    private final void m79243b(zznf zznf, zzle zzle) {
        zzne zzne = new zzne();
        zzne.mo52315e(this.f56541c);
        zzne.mo52317g(zznf);
        m79242a(zzne, zzle);
    }

    /* renamed from: A */
    public final void mo64690A(String str, boolean z, long j, Task task) {
        zzoo.m62085f("translate-inference").mo52368c(j);
        zzld zzld = task.mo23719t() ? zzld.NO_ERROR : zzld.UNKNOWN_ERROR;
        zzks zzks = new zzks();
        zzks.mo52235a(Long.valueOf(j));
        zzks.mo52237c(Boolean.valueOf(z));
        zzks.mo52236b(zzld);
        zzne B = m79241B(zzks.mo52238d());
        B.mo52313c(Integer.valueOf(str.length()));
        B.mo52316f(Integer.valueOf(task.mo23719t() ? ((String) task.mo23715p()).length() : -1));
        Exception o = task.mo23714o();
        if (o != null) {
            if (o.getCause() instanceof zzl) {
                B.mo52314d(Integer.valueOf(((zzl) o.getCause()).mo64686a()));
            } else if (o.getCause() instanceof zzn) {
                B.mo52318h(Integer.valueOf(((zzn) o.getCause()).mo64687a()));
            }
        }
        m79242a(B, zzle.ON_DEVICE_TRANSLATOR_TRANSLATE);
        long currentTimeMillis = System.currentTimeMillis();
        this.f56540b.mo52448c(24605, zzld.zza(), currentTimeMillis - j, currentTimeMillis);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo64691c(RemoteModel remoteModel, zzld zzld, boolean z, ModelType modelType, zzlj zzlj) {
        zzps zzps = this.f56539a;
        zzpj g = zzpx.m62189g();
        zzpv h = zzpw.m62180h();
        h.mo52418f(true);
        h.mo52416d(modelType);
        h.mo52414b(zzld);
        h.mo52413a(zzlj);
        zzps.mo52446f(g, remoteModel, h.mo52419g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo64692d(RemoteModel remoteModel, boolean z, int i) {
        zzps zzps = this.f56539a;
        zzpj g = zzpx.m62189g();
        zzpv h = zzpw.m62180h();
        h.mo52418f(true);
        h.mo52416d(remoteModel.mo64531d());
        h.mo52413a(zzlj.FAILED);
        h.mo52414b(zzld.DOWNLOAD_FAILED);
        h.mo52415c(i);
        zzps.mo52446f(g, remoteModel, h.mo52419g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo64693e() {
        m79243b(zznf.DOWNLOAD_MANAGER_CANNOT_RESUME, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo64694f() {
        m79243b(zznf.DOWNLOAD_MANAGER_DEVICE_NOT_FOUND, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo64695g() {
        m79243b(zznf.DOWNLOAD_MANAGER_FILE_ALREADY_EXISTS, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo64696h() {
        m79243b(zznf.DOWNLOAD_MANAGER_FILE_ERROR, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo64697i() {
        m79243b(zznf.DOWNLOAD_MANAGER_HTTP_DATA_ERROR, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo64698j(int i) {
        zznf b = zznf.m62015b(i);
        if (b == zznf.NO_ERROR) {
            m79243b(zznf.DOWNLOAD_MANAGER_HTTP_UNKNOWN_STATUS, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
        } else {
            m79243b(b, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo64699k() {
        m79243b(zznf.DOWNLOAD_MANAGER_INSUFFICIENT_SPACE, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo64700l() {
        m79243b(zznf.DOWNLOAD_MANAGER_SERVICE_MISSING, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo64701m() {
        m79243b(zznf.DOWNLOAD_MANAGER_TOO_MANY_REDIRECTS, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo64702n() {
        m79243b(zznf.DOWNLOAD_MANAGER_UNHANDLED_HTTP_CODE, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo64703o() {
        m79243b(zznf.DOWNLOAD_MANAGER_UNKNOWN_ERROR, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo64704p() {
        m79243b(zznf.NO_ERROR, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* renamed from: q */
    public final void mo64705q(long j, @Nullable Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        zzoo.m62085f("translate-load").mo52368c(elapsedRealtime);
        zzks zzks = new zzks();
        zzks.mo52235a(Long.valueOf(elapsedRealtime));
        if (exc != null) {
            zzks.mo52236b(zzld.UNKNOWN_ERROR);
        }
        zzne B = m79241B(zzks.mo52238d());
        if (exc != null && (exc.getCause() instanceof zzl)) {
            B.mo52314d(Integer.valueOf(((zzl) exc.getCause()).mo64686a()));
        }
        m79242a(B, zzle.ON_DEVICE_TRANSLATOR_LOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo64706r() {
        m79243b(zznf.METADATA_FILE_UNAVAILABLE, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo64707s() {
        m79243b(zznf.METADATA_HASH_NOT_FOUND, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo64708t() {
        m79243b(zznf.METADATA_JSON_INVALID, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo64709u() {
        m79243b(zznf.METADATA_ENTRY_NOT_FOUND, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo64710v() {
        m79243b(zznf.POST_DOWNLOAD_MOVE_FILE_FAILED, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo64711w() {
        m79243b(zznf.POST_DOWNLOAD_FILE_NOT_FOUND, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo64712x() {
        m79243b(zznf.POST_DOWNLOAD_UNZIP_FAILED, zzle.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo64713y() {
        m79243b(zznf.RAPID_RESPONSE_COULD_NOT_BE_WRITTEN, zzle.ON_DEVICE_TRANSLATOR_LOAD);
    }

    /* renamed from: z */
    public final void mo64714z() {
        m79242a(m79241B(new zzks().mo52238d()), zzle.ON_DEVICE_TRANSLATOR_CREATE);
    }
}
