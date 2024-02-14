package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.nearby.zznm;
import com.google.android.gms.internal.nearby.zzno;
import com.google.android.gms.internal.nearby.zznr;
import com.google.android.gms.internal.nearby.zzns;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzai extends GmsClient {

    /* renamed from: Z */
    private final zzns f47716Z = new zzns();

    /* renamed from: a0 */
    private final ClientAppContext f47717a0;

    /* renamed from: b0 */
    private final int f47718b0;

    zzai(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        super(context, looper, 62, clientSettings, connectionCallbacks, onConnectionFailedListener);
        String g = clientSettings.mo21673g();
        int t0 = m66444t0(context);
        if (messagesOptions != null) {
            this.f47717a0 = new ClientAppContext(1, g, (String) null, false, t0, (String) null);
            this.f47718b0 = messagesOptions.f47643c;
        } else {
            this.f47717a0 = new ClientAppContext(1, g, (String) null, false, t0, (String) null);
            this.f47718b0 = -1;
        }
        if (t0 == 1 && PlatformVersion.m4896a()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()});
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new zzah(activity, this, (zzag) null));
        }
    }

    /* renamed from: t0 */
    static int m66444t0(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        return context instanceof Service ? 3 : 0;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: A0 */
    public final void mo55952A0(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, @Nullable zzaa zzaa, SubscribeOptions subscribeOptions, @Nullable byte[] bArr) throws RemoteException {
        mo55953B0(listenerHolder, listenerHolder2, zzaa, subscribeOptions, (byte[]) null, this.f47717a0.f47680g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public final void mo55953B0(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, @Nullable zzaa zzaa, SubscribeOptions subscribeOptions, @Nullable byte[] bArr, int i) throws RemoteException {
        ListenerHolder.ListenerKey b = listenerHolder2.mo21376b();
        if (b != null) {
            if (!this.f47716Z.mo53038e(b)) {
                this.f47716Z.mo53036c(b, new zznm(listenerHolder2));
            }
            ((zzs) mo21626I()).mo56022Ib(new SubscribeRequest((IBinder) this.f47716Z.mo53034a(b), subscribeOptions.mo55913b(), new zzno(listenerHolder), subscribeOptions.mo55912a(), (PendingIntent) null, (byte[]) null, zzaa, false, 0, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public final void mo55954C0(ListenerHolder listenerHolder, zzae zzae) throws RemoteException {
        ((zzs) mo21626I()).mo56023Jb(new zzce(1, zzae, new zzno(listenerHolder), (String) null, (String) null, false, (ClientAppContext) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final void mo55955D0(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey b = listenerHolder2.mo21376b();
        if (b != null) {
            zzno zzno = new zzno(listenerHolder);
            if (!this.f47716Z.mo53038e(b)) {
                zzno.mo53032e1(new Status(0));
                return;
            }
            zzcb zzcb = new zzcb(zzno, (IBinder) this.f47716Z.mo53034a(b));
            zzcb.f47798f = false;
            ((zzs) mo21626I()).mo56028sb(zzcb);
            this.f47716Z.mo53037d(b);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: F */
    public final Bundle mo21623F() {
        Bundle F = super.mo21623F();
        F.putInt("NearbyPermissions", this.f47718b0);
        F.putParcelable("ClientAppContext", this.f47717a0);
        return F;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    /* renamed from: X */
    public final boolean mo21639X() {
        return true;
    }

    /* renamed from: b */
    public final void mo21640b() {
        try {
            mo55958u0(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[]{e});
            }
        }
        this.f47716Z.mo53035b();
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

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final void mo55956r0(ListenerHolder listenerHolder, PendingIntent pendingIntent) throws RemoteException {
        ((zzs) mo21626I()).mo56024Kb(new zzcg((IBinder) null, new zzno(listenerHolder), pendingIntent));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public final void mo55957s0(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey b = listenerHolder2.mo21376b();
        if (b != null) {
            zzno zzno = new zzno(listenerHolder);
            if (!this.f47716Z.mo53038e(b)) {
                zzno.mo53032e1(new Status(0));
                return;
            }
            ((zzs) mo21626I()).mo56024Kb(new zzcg((IBinder) this.f47716Z.mo53034a(b), zzno, (PendingIntent) null));
            this.f47716Z.mo53037d(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final void mo55958u0(int i) throws RemoteException {
        String str = i != 1 ? "CLIENT_DISCONNECTED" : "ACTIVITY_STOPPED";
        if (mo21641c()) {
            zzj zzj = new zzj(1, (ClientAppContext) null, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                String.format("Emitting client lifecycle event %s", new Object[]{str});
            }
            ((zzs) mo21626I()).mo56025Z8(zzj);
        } else if (Log.isLoggable("NearbyMessagesClient", 3)) {
            String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[]{str});
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: v0 */
    public final void mo55959v0(ListenerHolder listenerHolder, zzae zzae, @Nullable zzu zzu, PublishOptions publishOptions) throws RemoteException {
        mo55960w0(listenerHolder, zzae, zzu, publishOptions, this.f47717a0.f47680g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final void mo55960w0(ListenerHolder listenerHolder, zzae zzae, @Nullable zzu zzu, PublishOptions publishOptions, int i) throws RemoteException {
        ListenerHolder listenerHolder2 = listenerHolder;
        ((zzs) mo21626I()).mo56027ia(new zzbz(2, zzae, publishOptions.mo55901a(), new zzno(listenerHolder), (String) null, (String) null, false, zzu, false, (ClientAppContext) null, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return queryLocalInterface instanceof zzs ? (zzs) queryLocalInterface : new zzs(iBinder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public final void mo55961x0(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey b = listenerHolder2.mo21376b();
        if (b != null) {
            if (!this.f47716Z.mo53038e(b)) {
                this.f47716Z.mo53036c(b, new zznr(listenerHolder2));
            }
            zzcb zzcb = new zzcb(new zzno(listenerHolder), (IBinder) this.f47716Z.mo53034a(b));
            zzcb.f47798f = true;
            ((zzs) mo21626I()).mo56028sb(zzcb);
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: y0 */
    public final void mo55962y0(ListenerHolder listenerHolder, PendingIntent pendingIntent, @Nullable zzaa zzaa, SubscribeOptions subscribeOptions) throws RemoteException {
        mo55963z0(listenerHolder, pendingIntent, zzaa, subscribeOptions, this.f47717a0.f47680g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public final void mo55963z0(ListenerHolder listenerHolder, PendingIntent pendingIntent, @Nullable zzaa zzaa, SubscribeOptions subscribeOptions, int i) throws RemoteException {
        ListenerHolder listenerHolder2 = listenerHolder;
        ((zzs) mo21626I()).mo56022Ib(new SubscribeRequest((IBinder) null, subscribeOptions.mo55913b(), new zzno(listenerHolder), subscribeOptions.mo55912a(), pendingIntent, (byte[]) null, zzaa, false, 0, this.f47717a0.f47680g));
    }
}
