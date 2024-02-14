package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzv;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
class zzal extends zzv {

    /* renamed from: a */
    final zzi f51217a;

    /* renamed from: c */
    final /* synthetic */ zzaw f51218c;

    zzal(zzaw zzaw, zzi zzi) {
        this.f51218c = zzaw;
        this.f51217a = zzi;
    }

    /* renamed from: A4 */
    public final void mo59592A4(Bundle bundle, Bundle bundle2) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: J3 */
    public void mo59593J3(Bundle bundle, Bundle bundle2) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onRequestDownloadInfo()", new Object[0]);
    }

    /* renamed from: L6 */
    public final void mo59594L6(Bundle bundle, Bundle bundle2) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: R6 */
    public void mo59595R6(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: T1 */
    public void mo59596T1(List list) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: U5 */
    public void mo59597U5(Bundle bundle, Bundle bundle2) {
        this.f51218c.f51237e.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: b5 */
    public final void mo59598b5(Bundle bundle, Bundle bundle2) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: db */
    public void mo59599db(int i, Bundle bundle) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: g0 */
    public void mo59600g0(Bundle bundle) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        int i = bundle.getInt("error_code");
        zzaw.f51231g.mo59806b("onError(%d)", Integer.valueOf(i));
        this.f51217a.mo60033d(new AssetPackException(i));
    }

    /* renamed from: i3 */
    public final void mo59601i3(Bundle bundle, Bundle bundle2) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onRemoveModule()", new Object[0]);
    }

    /* renamed from: p6 */
    public final void mo59602p6(int i, Bundle bundle) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: t0 */
    public final void mo59603t0(int i, Bundle bundle) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: v0 */
    public final void mo59604v0(Bundle bundle) {
        this.f51218c.f51236d.mo59822s(this.f51217a);
        zzaw.f51231g.mo59808d("onCancelDownloads()", new Object[0]);
    }
}
