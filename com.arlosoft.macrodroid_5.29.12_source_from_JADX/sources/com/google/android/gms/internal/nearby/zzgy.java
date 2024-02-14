package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.zza;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzgy extends GmsClient {

    /* renamed from: Z */
    private final long f44684Z = ((long) hashCode());

    /* renamed from: a0 */
    private final Set f44685a0 = new ArraySet();

    /* renamed from: b0 */
    private final Set f44686b0 = new ArraySet();

    /* renamed from: c0 */
    private final Set f44687c0 = new ArraySet();

    /* renamed from: d0 */
    private final Set f44688d0 = new ArraySet();

    /* renamed from: e0 */
    private final Set f44689e0 = new ArraySet();

    /* renamed from: f0 */
    private zzlt f44690f0;

    public zzgy(Context context, Looper looper, ClientSettings clientSettings, @Nullable ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zzmd.m62749c(context.getCacheDir());
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public static Status m62516w0(int i) {
        return new Status(i, ConnectionsStatusCodes.m66287a(i));
    }

    /* renamed from: x0 */
    private final void m62517x0() {
        for (zzgg b : this.f44685a0) {
            b.mo52725b();
        }
        for (zzgk c : this.f44686b0) {
            c.mo52720c();
        }
        for (zzgk c2 : this.f44687c0) {
            c2.mo52720c();
        }
        for (zzgk c3 : this.f44688d0) {
            c3.mo52720c();
        }
        for (zzgk c4 : this.f44689e0) {
            c4.mo52720c();
        }
        this.f44685a0.clear();
        this.f44686b0.clear();
        this.f44687c0.clear();
        this.f44688d0.clear();
        this.f44689e0.clear();
        zzlt zzlt = this.f44690f0;
        if (zzlt != null) {
            zzlt.mo52904e();
            this.f44690f0 = null;
        }
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return new Feature[]{zza.f47878f, zza.f47855A, zza.f47858D, zza.f47857C, zza.f47859E, zza.f47856B, zza.f47879g};
    }

    /* renamed from: A0 */
    public final void mo52738A0(BaseImplementation.ResultHolder resultHolder, long j) throws RemoteException {
        zzfl zzfl = new zzfl();
        zzfl.mo52706b(new zzgv(resultHolder));
        zzfl.mo52705a(j);
        ((zzkd) mo21626I()).mo52782Z8(zzfl.mo52707c());
    }

    /* renamed from: B0 */
    public final void mo52739B0(String str) throws RemoteException {
        zzjj zzjj = new zzjj();
        zzjj.mo52767a(str);
        ((zzkd) mo21626I()).mo52785sb(zzjj.mo52768b());
    }

    /* renamed from: C0 */
    public final void mo52740C0(BaseImplementation.ResultHolder resultHolder, String str) throws RemoteException {
        zzme zzme = new zzme();
        zzme.mo52943b(new zzgv(resultHolder));
        zzme.mo52942a(str);
        ((zzkd) mo21626I()).mo52774Ib(zzme.mo52944c());
    }

    /* renamed from: D0 */
    public final void mo52741D0(BaseImplementation.ResultHolder resultHolder, @Nullable String str, String str2, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.f44688d0.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.mo52958i(new zzgv(resultHolder));
        zzmi.mo52955f(str);
        zzmi.mo52957h(str2);
        zzmi.mo52951b(zzfx);
        ((zzkd) mo21626I()).mo52775Jb(zzmi.mo52959j());
    }

    /* renamed from: E0 */
    public final void mo52742E0(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.f44688d0.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.mo52958i(new zzgv(resultHolder));
        zzmi.mo52953d(bArr);
        zzmi.mo52957h(str);
        zzmi.mo52951b(zzfx);
        ((zzkd) mo21626I()).mo52775Jb(zzmi.mo52959j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo21623F() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.f44684Z);
        return bundle;
    }

    /* renamed from: F0 */
    public final void mo52743F0(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.f44688d0.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.mo52958i(new zzgv(resultHolder));
        zzmi.mo52955f(str);
        zzmi.mo52957h(str2);
        zzmi.mo52951b(zzfx);
        zzmi.mo52956g(connectionOptions);
        ((zzkd) mo21626I()).mo52775Jb(zzmi.mo52959j());
    }

    /* renamed from: G0 */
    public final void mo52744G0(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.f44688d0.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.mo52958i(new zzgv(resultHolder));
        zzmi.mo52953d(bArr);
        zzmi.mo52957h(str);
        zzmi.mo52951b(zzfx);
        zzmi.mo52956g(connectionOptions);
        ((zzkd) mo21626I()).mo52775Jb(zzmi.mo52959j());
    }

    /* renamed from: H0 */
    public final void mo52745H0(BaseImplementation.ResultHolder resultHolder, String[] strArr, Payload payload, boolean z) throws RemoteException {
        Pair pair;
        String str;
        try {
            int g = payload.mo55683g();
            if (g == 1) {
                zzlz zzlz = new zzlz();
                zzlz.mo52917d(payload.mo55681e());
                zzlz.mo52926m(payload.mo55683g());
                byte[] a = payload.mo55678a();
                if (a == null || a.length <= 32768) {
                    zzlz.mo52914a(a);
                } else {
                    zzlv zzlv = new zzlv();
                    zzlv.mo52907a(a);
                    zzlz.mo52924k(zzlv.mo52908b());
                    zzlz.mo52914a(Arrays.copyOf(a, 32768));
                }
                pair = Pair.create(zzlz.mo52927n(), zzsc.m62979c());
            } else if (g == 2) {
                Payload.File b = payload.mo55679b();
                zzsg.m62985c(b, "File cannot be null for Payload.Type.FILE");
                File a2 = b.mo55687a();
                if (a2 == null) {
                    str = null;
                } else {
                    str = a2.getAbsolutePath();
                }
                zzlz zzlz2 = new zzlz();
                zzlz2.mo52917d(payload.mo55681e());
                zzlz2.mo52926m(payload.mo55683g());
                zzlz2.mo52915b(b.mo55688b());
                zzlz2.mo52919f(str);
                zzlz2.mo52920g(b.mo55689c());
                zzlz2.mo52921h(payload.mo55682f());
                zzlz2.mo52918e(payload.mo55686m());
                zzlz2.mo52923j(0);
                zzlz2.mo52916c(payload.mo55684k());
                zzlz2.mo52922i(payload.mo55685l());
                pair = Pair.create(zzlz2.mo52927n(), zzsc.m62979c());
            } else if (g == 3) {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                zzlz zzlz3 = new zzlz();
                zzlz3.mo52917d(payload.mo55681e());
                zzlz3.mo52926m(payload.mo55683g());
                zzlz3.mo52915b(createPipe[0]);
                zzlz3.mo52925l(createPipe2[0]);
                zzlz3.mo52921h(payload.mo55682f());
                zzlz3.mo52923j(0);
                pair = Pair.create(zzlz3.mo52927n(), zzsc.m62980d(Pair.create(createPipe[1], createPipe2[1])));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", new Object[]{Long.valueOf(payload.mo55681e()), Integer.valueOf(payload.mo55683g())}));
                Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                throw illegalArgumentException;
            }
            zzmm zzmm = new zzmm();
            zzmm.mo52967c(new zzgv(resultHolder));
            zzmm.mo52966b(strArr);
            zzmm.mo52965a((zzmb) pair.first);
            ((zzkd) mo21626I()).mo52776Kb(zzmm.mo52968d());
            if (((zzsc) pair.second).mo53222b()) {
                Pair pair2 = (Pair) ((zzsc) pair.second).mo53221a();
                this.f44690f0.mo52903d(payload.mo55680c().mo55690a(), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.first), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.second), (zzmb) pair.first, payload.mo55681e());
            }
        } catch (IOException e) {
            Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", new Object[]{Long.valueOf(payload.mo55681e())}), e);
            throw e;
        } catch (IOException e2) {
            Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
            resultHolder.mo21038a(m62516w0(8013));
        }
    }

    /* renamed from: I0 */
    public final void mo52746I0(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.f44688d0.add(zzfx);
        zzmq zzmq = new zzmq();
        zzmq.mo52980g(new zzgx(resultHolder));
        zzmq.mo52978e(str);
        zzmq.mo52981h(str2);
        zzmq.mo52979f(advertisingOptions);
        zzmq.mo52975b(zzfx);
        ((zzkd) mo21626I()).mo52777Lb(zzmq.mo52982i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final /* bridge */ /* synthetic */ void mo21631P(@NonNull IInterface iInterface) {
        super.mo21631P((zzkd) iInterface);
        this.f44690f0 = new zzlt();
    }

    /* renamed from: R */
    public final void mo21633R(int i) {
        if (i == 1) {
            m62517x0();
            i = 1;
        }
        super.mo21633R(i);
    }

    /* renamed from: X */
    public final boolean mo21639X() {
        return true;
    }

    /* renamed from: b */
    public final void mo21640b() {
        if (mo21641c()) {
            try {
                ((zzkd) mo21626I()).mo52784ia(new zzfp());
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        m62517x0();
        super.mo21640b();
    }

    /* renamed from: i */
    public final boolean mo21647i() {
        return Nearby.m66237b(mo21621D());
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* renamed from: r0 */
    public final void mo52747r0(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.f44688d0.add(zzfx);
        zzmq zzmq = new zzmq();
        zzmq.mo52980g(new zzgx(resultHolder));
        zzmq.mo52977d(bArr);
        zzmq.mo52981h(str);
        zzmq.mo52979f(advertisingOptions);
        zzmq.mo52975b(zzfx);
        ((zzkd) mo21626I()).mo52777Lb(zzmq.mo52982i());
    }

    /* renamed from: s0 */
    public final void mo52748s0(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) throws RemoteException {
        zzgg zzgg = new zzgg(listenerHolder);
        this.f44685a0.add(zzgg);
        zzmu zzmu = new zzmu();
        zzmu.mo52991d(new zzgv(resultHolder));
        zzmu.mo52992e(str);
        zzmu.mo52990c(discoveryOptions);
        zzmu.mo52988a(zzgg);
        ((zzkd) mo21626I()).mo52778Mb(zzmu.mo52993f());
    }

    /* renamed from: t0 */
    public final void mo52749t0() throws RemoteException {
        ((zzkd) mo21626I()).mo52779Nb(new zzmy());
    }

    /* renamed from: u0 */
    public final void mo52750u0() throws RemoteException {
        ((zzkd) mo21626I()).mo52780Ob(new zzna());
    }

    /* renamed from: v0 */
    public final void mo52751v0() throws RemoteException {
        ((zzkd) mo21626I()).mo52781Pb(new zznc());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return queryLocalInterface instanceof zzkd ? (zzkd) queryLocalInterface : new zzkd(iBinder);
    }

    /* renamed from: z0 */
    public final void mo52752z0(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzgu zzgu = new zzgu(mo21621D(), listenerHolder, this.f44690f0);
        this.f44686b0.add(zzgu);
        zzfh zzfh = new zzfh();
        zzfh.mo52698e(new zzgv(resultHolder));
        zzfh.mo52697d(str);
        zzfh.mo52696c(zzgu);
        ((zzkd) mo21626I()).mo52783g8(zzfh.mo52699f());
    }
}
