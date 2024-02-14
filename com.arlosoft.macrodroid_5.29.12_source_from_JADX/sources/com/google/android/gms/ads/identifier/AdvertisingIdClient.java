package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class AdvertisingIdClient {
    @Nullable

    /* renamed from: a */
    BlockingServiceConnection f1767a;
    @Nullable

    /* renamed from: b */
    zzf f1768b;

    /* renamed from: c */
    boolean f1769c;

    /* renamed from: d */
    final Object f1770d;
    @Nullable

    /* renamed from: e */
    zzb f1771e;

    /* renamed from: f */
    private final Context f1772f;

    /* renamed from: g */
    final long f1773g;

    @KeepForSdkWithMembers
    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class Info {
        @Nullable

        /* renamed from: a */
        private final String f1774a;

        /* renamed from: b */
        private final boolean f1775b;

        @Deprecated
        public Info(@Nullable String str, boolean z) {
            this.f1774a = str;
            this.f1775b = z;
        }

        @Nullable
        /* renamed from: a */
        public String mo19848a() {
            return this.f1774a;
        }

        /* renamed from: b */
        public boolean mo19849b() {
            return this.f1775b;
        }

        @NonNull
        public String toString() {
            String str = this.f1774a;
            boolean z = this.f1775b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static Info m1817a(@NonNull Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.mo19846g(false);
            Info i = advertisingIdClient.m1820i(-1);
            advertisingIdClient.mo19847h(i, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            advertisingIdClient.mo19844f();
            return i;
        } catch (Throwable th) {
            advertisingIdClient.mo19844f();
            throw th;
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m1818c(@NonNull Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean d;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, false, false);
        try {
            advertisingIdClient.mo19846g(false);
            Preconditions.m4487j("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.f1769c) {
                    synchronized (advertisingIdClient.f1770d) {
                        zzb zzb = advertisingIdClient.f1771e;
                        if (zzb == null || !zzb.f1780f) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.mo19846g(false);
                        if (!advertisingIdClient.f1769c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                Preconditions.m4488k(advertisingIdClient.f1767a);
                Preconditions.m4488k(advertisingIdClient.f1768b);
                d = advertisingIdClient.f1768b.mo48480d();
            }
            advertisingIdClient.m1821j();
            return d;
        } finally {
            advertisingIdClient.mo19844f();
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: d */
    public static void m1819d(boolean z) {
    }

    /* renamed from: i */
    private final Info m1820i(int i) throws IOException {
        Info info;
        Preconditions.m4487j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f1769c) {
                synchronized (this.f1770d) {
                    zzb zzb = this.f1771e;
                    if (zzb == null || !zzb.f1780f) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo19846g(false);
                    if (!this.f1769c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            Preconditions.m4488k(this.f1767a);
            Preconditions.m4488k(this.f1768b);
            info = new Info(this.f1768b.mo48479a(), this.f1768b.mo48481o0(true));
        }
        m1821j();
        return info;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1821j() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1770d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.zzb r1 = r6.f1771e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f1779d     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.ads.identifier.zzb r1 = r6.f1771e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f1773g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            com.google.android.gms.ads.identifier.zzb r3 = new com.google.android.gms.ads.identifier.zzb     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f1771e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.m1821j():void");
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Info mo19842b() throws IOException {
        return m1820i(-1);
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo19843e() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        mo19846g(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19844f() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.m4487j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f1772f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.BlockingServiceConnection r0 = r3.f1767a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f1769c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.m4827b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f1772f     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.BlockingServiceConnection r2 = r3.f1767a     // Catch:{ all -> 0x001f }
            r0.mo21939c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f1769c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f1768b = r0     // Catch:{ all -> 0x0033 }
            r3.f1767a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.mo19844f():void");
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        mo19844f();
        super.finalize();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: g */
    public final void mo19846g(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.m4487j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f1769c) {
                mo19844f();
            }
            Context context = this.f1772f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j = GoogleApiAvailabilityLight.m3542h().mo21157j(context, GooglePlayServicesUtilLight.f3065a);
                if (j != 0) {
                    if (j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (ConnectionTracker.m4827b().mo21938a(context, intent, blockingServiceConnection, 1)) {
                    this.f1767a = blockingServiceConnection;
                    this.f1768b = zze.m55591y(blockingServiceConnection.mo21128b(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS));
                    this.f1769c = true;
                    if (z) {
                        m1821j();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: h */
    public final boolean mo19847h(@Nullable Info info, boolean z, float f, long j, String str, @Nullable Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.mo19849b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String a = info.mo19848a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new zza(this, hashMap).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f1770d = new Object();
        Preconditions.m4488k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f1772f = context;
        this.f1769c = false;
        this.f1773g = j;
    }
}
