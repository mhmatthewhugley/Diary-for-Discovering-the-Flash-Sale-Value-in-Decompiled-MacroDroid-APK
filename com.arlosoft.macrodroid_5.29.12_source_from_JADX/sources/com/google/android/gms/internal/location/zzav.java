package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzav {

    /* renamed from: a */
    private final zzbg<zzam> f41090a;

    /* renamed from: b */
    private final Context f41091b;

    /* renamed from: c */
    private boolean f41092c = false;

    /* renamed from: d */
    private final Map<ListenerHolder.ListenerKey<LocationListener>, zzau> f41093d = new HashMap();

    /* renamed from: e */
    private final Map<ListenerHolder.ListenerKey, zzas> f41094e = new HashMap();

    /* renamed from: f */
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, zzar> f41095f = new HashMap();

    public zzav(Context context, zzbg<zzam> zzbg) {
        this.f41091b = context;
        this.f41090a = zzbg;
    }

    /* renamed from: a */
    public final Location mo50538a(String str) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        return ((zzh) this.f41090a).mo50640a().mo50518Z(str);
    }

    @Deprecated
    /* renamed from: b */
    public final Location mo50539b() throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        return ((zzh) this.f41090a).mo50640a().mo50525k();
    }

    /* renamed from: c */
    public final LocationAvailability mo50540c() throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        return ((zzh) this.f41090a).mo50640a().mo50514H7(this.f41091b.getPackageName());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50541d(com.google.android.gms.location.LocationRequest r12, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> r13, com.google.android.gms.internal.location.zzai r14) throws android.os.RemoteException {
        /*
            r11 = this;
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r11.f41090a
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzi r0 = r0.f41142a
            r0.mo21656w()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r13.mo21376b()
            r1 = 0
            if (r0 != 0) goto L_0x0012
            r7 = r1
            goto L_0x002b
        L_0x0012:
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<com.google.android.gms.location.LocationListener>, com.google.android.gms.internal.location.zzau> r2 = r11.f41093d
            monitor-enter(r2)
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<com.google.android.gms.location.LocationListener>, com.google.android.gms.internal.location.zzau> r3 = r11.f41093d     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.location.zzau r3 = (com.google.android.gms.internal.location.zzau) r3     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0024
            com.google.android.gms.internal.location.zzau r3 = new com.google.android.gms.internal.location.zzau     // Catch:{ all -> 0x0048 }
            r3.<init>(r13)     // Catch:{ all -> 0x0048 }
        L_0x0024:
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<com.google.android.gms.location.LocationListener>, com.google.android.gms.internal.location.zzau> r13 = r11.f41093d     // Catch:{ all -> 0x0048 }
            r13.put(r0, r3)     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            r7 = r3
        L_0x002b:
            if (r7 != 0) goto L_0x002e
            return
        L_0x002e:
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r13 = r11.f41090a
            com.google.android.gms.internal.location.zzh r13 = (com.google.android.gms.internal.location.zzh) r13
            com.google.android.gms.internal.location.zzam r13 = r13.mo50640a()
            com.google.android.gms.internal.location.zzba r6 = com.google.android.gms.internal.location.zzba.m59254l2(r1, r12)
            com.google.android.gms.internal.location.zzbc r12 = new com.google.android.gms.internal.location.zzbc
            r5 = 1
            r8 = 0
            r9 = 0
            r4 = r12
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.mo50520c2(r12)
            return
        L_0x0048:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzav.mo50541d(com.google.android.gms.location.LocationRequest, com.google.android.gms.common.api.internal.ListenerHolder, com.google.android.gms.internal.location.zzai):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50542e(com.google.android.gms.internal.location.zzba r11, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> r12, com.google.android.gms.internal.location.zzai r13) throws android.os.RemoteException {
        /*
            r10 = this;
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r10.f41090a
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzi r0 = r0.f41142a
            r0.mo21656w()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r12.mo21376b()
            if (r0 != 0) goto L_0x0012
            r12 = 0
        L_0x0010:
            r8 = r12
            goto L_0x002c
        L_0x0012:
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<com.google.android.gms.location.LocationCallback>, com.google.android.gms.internal.location.zzar> r1 = r10.f41095f
            monitor-enter(r1)
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<com.google.android.gms.location.LocationCallback>, com.google.android.gms.internal.location.zzar> r2 = r10.f41095f     // Catch:{ all -> 0x0046 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.location.zzar r2 = (com.google.android.gms.internal.location.zzar) r2     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.location.zzar r2 = new com.google.android.gms.internal.location.zzar     // Catch:{ all -> 0x0046 }
            r2.<init>(r12)     // Catch:{ all -> 0x0046 }
        L_0x0024:
            r12 = r2
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<com.google.android.gms.location.LocationCallback>, com.google.android.gms.internal.location.zzar> r2 = r10.f41095f     // Catch:{ all -> 0x0046 }
            r2.put(r0, r12)     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0010
        L_0x002c:
            if (r8 != 0) goto L_0x002f
            return
        L_0x002f:
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r12 = r10.f41090a
            com.google.android.gms.internal.location.zzh r12 = (com.google.android.gms.internal.location.zzh) r12
            com.google.android.gms.internal.location.zzam r12 = r12.mo50640a()
            com.google.android.gms.internal.location.zzbc r0 = new com.google.android.gms.internal.location.zzbc
            r4 = 1
            r6 = 0
            r7 = 0
            r3 = r0
            r5 = r11
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12.mo50520c2(r0)
            return
        L_0x0046:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzav.mo50542e(com.google.android.gms.internal.location.zzba, com.google.android.gms.common.api.internal.ListenerHolder, com.google.android.gms.internal.location.zzai):void");
    }

    /* renamed from: f */
    public final void mo50543f(zzba zzba, PendingIntent pendingIntent, zzai zzai) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        ((zzh) this.f41090a).mo50640a().mo50520c2(zzbc.m59257m2(zzba, pendingIntent, zzai));
    }

    /* renamed from: g */
    public final void mo50544g(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzai) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        ((zzh) this.f41090a).mo50640a().mo50520c2(zzbc.m59257m2(zzba.m59254l2((String) null, locationRequest), pendingIntent, zzai));
    }

    /* renamed from: h */
    public final void mo50545h(ListenerHolder.ListenerKey<LocationListener> listenerKey, zzai zzai) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        Preconditions.m4489l(listenerKey, "Invalid null listener key");
        synchronized (this.f41093d) {
            zzau remove = this.f41093d.remove(listenerKey);
            if (remove != null) {
                remove.mo50537a();
                ((zzh) this.f41090a).mo50640a().mo50520c2(zzbc.m59256l2(remove, zzai));
            }
        }
    }

    /* renamed from: i */
    public final void mo50546i(ListenerHolder.ListenerKey<LocationCallback> listenerKey, zzai zzai) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        Preconditions.m4489l(listenerKey, "Invalid null listener key");
        synchronized (this.f41095f) {
            zzar remove = this.f41095f.remove(listenerKey);
            if (remove != null) {
                remove.mo50533a();
                ((zzh) this.f41090a).mo50640a().mo50520c2(zzbc.m59258n2(remove, zzai));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50547j(android.app.PendingIntent r10, com.google.android.gms.internal.location.zzai r11) throws android.os.RemoteException {
        /*
            r9 = this;
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r9.f41090a
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzi r0 = r0.f41142a
            r0.mo21656w()
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r9.f41090a
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzam r0 = r0.mo50640a()
            com.google.android.gms.internal.location.zzbc r8 = new com.google.android.gms.internal.location.zzbc
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r1 = r8
            r5 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.mo50520c2(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzav.mo50547j(android.app.PendingIntent, com.google.android.gms.internal.location.zzai):void");
    }

    /* renamed from: k */
    public final void mo50548k(boolean z) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        ((zzh) this.f41090a).mo50640a().mo50513Gb(z);
        this.f41092c = z;
    }

    /* renamed from: l */
    public final void mo50549l(Location location) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        ((zzh) this.f41090a).mo50640a().mo50521g4(location);
    }

    /* renamed from: m */
    public final void mo50550m(zzai zzai) throws RemoteException {
        ((zzh) this.f41090a).f41142a.mo21656w();
        ((zzh) this.f41090a).mo50640a().mo50522h5(zzai);
    }

    /* renamed from: n */
    public final void mo50551n() throws RemoteException {
        synchronized (this.f41093d) {
            for (zzau next : this.f41093d.values()) {
                if (next != null) {
                    ((zzh) this.f41090a).mo50640a().mo50520c2(zzbc.m59256l2(next, (zzai) null));
                }
            }
            this.f41093d.clear();
        }
        synchronized (this.f41095f) {
            for (zzar next2 : this.f41095f.values()) {
                if (next2 != null) {
                    ((zzh) this.f41090a).mo50640a().mo50520c2(zzbc.m59258n2(next2, (zzai) null));
                }
            }
            this.f41095f.clear();
        }
        synchronized (this.f41094e) {
            for (zzas next3 : this.f41094e.values()) {
                if (next3 != null) {
                    ((zzh) this.f41090a).mo50640a().mo50515I3(new zzl(2, (zzj) null, next3, (IBinder) null));
                }
            }
            this.f41094e.clear();
        }
    }

    /* renamed from: o */
    public final void mo50552o() throws RemoteException {
        if (this.f41092c) {
            mo50548k(false);
        }
    }
}
