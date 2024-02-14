package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzaj extends zzah {

    /* renamed from: c */
    final /* synthetic */ int f51209c;

    /* renamed from: d */
    final /* synthetic */ String f51210d;

    /* renamed from: f */
    final /* synthetic */ String f51211f;

    /* renamed from: g */
    final /* synthetic */ int f51212g;

    /* renamed from: o */
    final /* synthetic */ zzi f51213o;

    /* renamed from: p */
    final /* synthetic */ zzaw f51214p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaj(zzaw zzaw, zzi zzi, int i, String str, String str2, int i2, zzi zzi2) {
        super(zzi);
        this.f51214p = zzaw;
        this.f51209c = i;
        this.f51210d = str;
        this.f51211f = str2;
        this.f51212g = i2;
        this.f51213o = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51214p.f51236d.mo59819e()).mo59903e9(this.f51214p.f51233a, zzaw.m70515k(this.f51209c, this.f51210d, this.f51211f, this.f51212g), zzaw.m70511g(), new zzan(this.f51214p, this.f51213o));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59806b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f51210d, this.f51211f, Integer.valueOf(this.f51212g), Integer.valueOf(this.f51209c));
            this.f51213o.mo60033d(new RuntimeException(e));
        }
    }
}
