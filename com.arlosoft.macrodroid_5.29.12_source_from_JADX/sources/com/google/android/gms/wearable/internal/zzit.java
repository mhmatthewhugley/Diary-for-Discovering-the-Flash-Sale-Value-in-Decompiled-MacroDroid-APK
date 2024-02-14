package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzit extends zzez {

    /* renamed from: a */
    private ListenerHolder f48408a;

    /* renamed from: c */
    private ListenerHolder f48409c;

    /* renamed from: d */
    private ListenerHolder f48410d;

    /* renamed from: f */
    private ListenerHolder f48411f;

    /* renamed from: g */
    private ListenerHolder f48412g;

    /* renamed from: o */
    private final IntentFilter[] f48413o;

    /* renamed from: p */
    private final String f48414p;

    private zzit(IntentFilter[] intentFilterArr, String str) {
        this.f48413o = (IntentFilter[]) Preconditions.m4488k(intentFilterArr);
        this.f48414p = str;
    }

    /* renamed from: A1 */
    public static zzit m67157A1(ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) {
        zzit zzit = new zzit(intentFilterArr, (String) null);
        zzit.f48411f = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        return zzit;
    }

    /* renamed from: Lb */
    private static void m67160Lb(ListenerHolder listenerHolder) {
        if (listenerHolder != null) {
            listenerHolder.mo21375a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Mb */
    public static void m67161Mb(zzev zzev, boolean z, byte[] bArr) {
        try {
            zzev.mo56409g8(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableListenerStub", "Failed to send a response back", e);
        }
    }

    /* renamed from: Z8 */
    public static zzit m67162Z8(ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) {
        zzit zzit = new zzit(intentFilterArr, (String) null);
        zzit.f48408a = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        return zzit;
    }

    /* renamed from: g8 */
    public static zzit m67163g8(ListenerHolder listenerHolder, String str, IntentFilter[] intentFilterArr) {
        zzit zzit = new zzit(intentFilterArr, (String) Preconditions.m4488k(str));
        zzit.f48411f = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        return zzit;
    }

    /* renamed from: ia */
    public static zzit m67164ia(ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) {
        zzit zzit = new zzit(intentFilterArr, (String) null);
        zzit.f48409c = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        return zzit;
    }

    /* renamed from: sb */
    public static zzit m67165sb(ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) {
        zzit zzit = new zzit(intentFilterArr, (String) null);
        zzit.f48410d = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        return zzit;
    }

    /* renamed from: t1 */
    public static zzit m67166t1(ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) {
        zzit zzit = new zzit(intentFilterArr, (String) null);
        zzit.f48412g = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        return zzit;
    }

    /* renamed from: Ba */
    public final void mo56411Ba(zzbf zzbf) {
        ListenerHolder listenerHolder = this.f48411f;
        if (listenerHolder != null) {
            listenerHolder.mo21377c(new zzis(zzbf));
        }
    }

    /* renamed from: G1 */
    public final void mo56412G1(zzfx zzfx) {
        ListenerHolder listenerHolder = this.f48409c;
        if (listenerHolder != null) {
            listenerHolder.mo21377c(new zzip(zzfx));
        }
    }

    /* renamed from: Ib */
    public final IntentFilter[] mo56518Ib() {
        return this.f48413o;
    }

    /* renamed from: Ta */
    public final void mo56413Ta(zzgm zzgm) {
    }

    /* renamed from: V0 */
    public final void mo56414V0(DataHolder dataHolder) {
        ListenerHolder listenerHolder = this.f48408a;
        if (listenerHolder != null) {
            listenerHolder.mo21377c(new zzio(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    /* renamed from: a7 */
    public final void mo56415a7(zzi zzi) {
    }

    /* renamed from: b1 */
    public final void mo56416b1(List list) {
    }

    /* renamed from: jb */
    public final void mo56417jb(zzgm zzgm) {
    }

    /* renamed from: p */
    public final void mo56519p() {
        m67160Lb(this.f48408a);
        this.f48408a = null;
        m67160Lb(this.f48409c);
        this.f48409c = null;
        m67160Lb(this.f48410d);
        this.f48410d = null;
        m67160Lb(this.f48411f);
        this.f48411f = null;
        m67160Lb(this.f48412g);
        this.f48412g = null;
    }

    /* renamed from: q */
    public final String mo56520q() {
        return this.f48414p;
    }

    /* renamed from: ra */
    public final void mo56418ra(zzl zzl) {
    }

    /* renamed from: u5 */
    public final void mo56419u5(zzfx zzfx, zzev zzev) {
        ListenerHolder listenerHolder = this.f48410d;
        if (listenerHolder != null) {
            listenerHolder.mo21377c(new zzir(zzfx, zzev, (byte[]) null));
        }
    }

    /* renamed from: ua */
    public final void mo56420ua(zzao zzao) {
        ListenerHolder listenerHolder = this.f48412g;
        if (listenerHolder != null) {
            listenerHolder.mo21377c(new zzin(zzao));
        }
    }
}
