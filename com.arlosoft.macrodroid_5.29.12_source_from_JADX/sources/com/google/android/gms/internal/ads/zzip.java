package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzip implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzyd, zzns, zzuj, zzri, zzgp, zzgl, zzkh, zzhb {

    /* renamed from: a */
    final /* synthetic */ zzit f37499a;

    /* synthetic */ zzip(zzit zzit, zzio zzio) {
        this.f37499a = zzit;
    }

    /* renamed from: O */
    public final void mo47619O(boolean z) {
        this.f37499a.m53756n0();
    }

    /* renamed from: a */
    public final void mo47621a(zzgs zzgs) {
        this.f37499a.f37553q.mo47810a(zzgs);
        this.f37499a.f37514L = null;
        this.f37499a.f37522T = null;
    }

    /* renamed from: a0 */
    public final void mo47622a0(String str) {
        this.f37499a.f37553q.mo47816f(str);
    }

    /* renamed from: b */
    public final void mo47623b(zzgs zzgs) {
        this.f37499a.f37522T = zzgs;
        this.f37499a.f37553q.mo47817g(zzgs);
    }

    /* renamed from: c */
    public final void mo47624c(Exception exc) {
        this.f37499a.f37553q.mo47820j(exc);
    }

    /* renamed from: d */
    public final void mo47625d(zzaf zzaf, @Nullable zzgt zzgt) {
        this.f37499a.f37514L = zzaf;
        this.f37499a.f37553q.mo47825q(zzaf, zzgt);
    }

    /* renamed from: e */
    public final void mo47626e(long j) {
        this.f37499a.f37553q.mo47824p(j);
    }

    /* renamed from: f */
    public final void mo47627f(Exception exc) {
        this.f37499a.f37553q.mo47821k(exc);
    }

    /* renamed from: g */
    public final void mo47628g(int i, long j) {
        this.f37499a.f37553q.mo47826s(i, j);
    }

    /* renamed from: h */
    public final void mo47629h(zzaf zzaf, @Nullable zzgt zzgt) {
        this.f37499a.f37513K = zzaf;
        this.f37499a.f37553q.mo47813d(zzaf, zzgt);
    }

    /* renamed from: h0 */
    public final void mo47630h0(String str) {
        this.f37499a.f37553q.mo47814d0(str);
    }

    /* renamed from: i */
    public final void mo47631i(long j, int i) {
        this.f37499a.f37553q.mo47818h(j, i);
    }

    /* renamed from: i1 */
    public final void mo47632i1(boolean z) {
        zzit zzit = this.f37499a;
        if (zzit.f37526X != z) {
            zzit.f37526X = z;
            zzdt w0 = this.f37499a.f37547k;
            w0.mo44968d(23, new zzim(z));
            w0.mo44967c();
        }
    }

    /* renamed from: j */
    public final void mo47633j(zzgs zzgs) {
        this.f37499a.f37553q.mo47827v(zzgs);
        this.f37499a.f37513K = null;
        this.f37499a.f37521S = null;
    }

    /* renamed from: k */
    public final void mo47634k(zzgs zzgs) {
        this.f37499a.f37521S = zzgs;
        this.f37499a.f37553q.mo47822l(zzgs);
    }

    /* renamed from: l */
    public final void mo47635l(String str, long j, long j2) {
        this.f37499a.f37553q.mo47823n(str, j, j2);
    }

    /* renamed from: m */
    public final void mo47636m(int i, long j, long j2) {
        this.f37499a.f37553q.mo47828x(i, j, j2);
    }

    /* renamed from: n */
    public final void mo47637n(Exception exc) {
        this.f37499a.f37553q.mo47811b(exc);
    }

    /* renamed from: o */
    public final void mo47638o(String str, long j, long j2) {
        this.f37499a.f37553q.mo47812c(str, j, j2);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzit.m53734E(this.f37499a, surfaceTexture);
        this.f37499a.m53749g0(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f37499a.m53752j0((Object) null);
        this.f37499a.m53749g0(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f37499a.m53749g0(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public final void mo47643p(Object obj, long j) {
        this.f37499a.f37553q.mo47806A(obj, j);
        zzit zzit = this.f37499a;
        if (zzit.f37516N == obj) {
            zzdt w0 = zzit.f37547k;
            w0.mo44968d(26, zzij.f37493a);
            w0.mo44967c();
        }
    }

    /* renamed from: s0 */
    public final void mo47644s0(zzda zzda) {
        this.f37499a.f37533c0 = zzda;
        zzdt w0 = this.f37499a.f37547k;
        w0.mo44968d(25, new zzin(zzda));
        w0.mo44967c();
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f37499a.m53749g0(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f37499a.m53749g0(0, 0);
    }
}
