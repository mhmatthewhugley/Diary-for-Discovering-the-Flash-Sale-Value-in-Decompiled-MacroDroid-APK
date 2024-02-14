package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzc;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
public class WakeLock {

    /* renamed from: r */
    private static final long f47970r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f47971s = null;

    /* renamed from: t */
    private static final Object f47972t = new Object();

    /* renamed from: u */
    private static volatile zzd f47973u = new zzb();

    /* renamed from: a */
    private final Object f47974a = new Object();
    @GuardedBy("acquireReleaseLock")

    /* renamed from: b */
    private final PowerManager.WakeLock f47975b;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: c */
    private int f47976c = 0;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: d */
    private Future<?> f47977d;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: e */
    private long f47978e;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: f */
    private final Set<zze> f47979f = new HashSet();
    @GuardedBy("acquireReleaseLock")

    /* renamed from: g */
    private boolean f47980g = true;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: h */
    private int f47981h;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: i */
    zzb f47982i;

    /* renamed from: j */
    private Clock f47983j = DefaultClock.m4871d();

    /* renamed from: k */
    private WorkSource f47984k;

    /* renamed from: l */
    private final String f47985l;

    /* renamed from: m */
    private final String f47986m;

    /* renamed from: n */
    private final Context f47987n;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: o */
    private final Map<String, zzc> f47988o = new HashMap();

    /* renamed from: p */
    private AtomicInteger f47989p = new AtomicInteger(0);

    /* renamed from: q */
    private final ScheduledExecutorService f47990q;

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i, @NonNull String str) {
        String str2;
        String packageName = context.getPackageName();
        Preconditions.m4489l(context, "WakeLock: context must not be null");
        Preconditions.m4485h(str, "WakeLock: wakeLockName must not be empty");
        this.f47987n = context.getApplicationContext();
        this.f47986m = str;
        this.f47982i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f47985l = str2;
        } else {
            this.f47985l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f47975b = newWakeLock;
            if (WorkSourceUtil.m4917c(context)) {
                WorkSource b = WorkSourceUtil.m4916b(context, Strings.m4912b(packageName) ? context.getPackageName() : packageName);
                this.f47984k = b;
                if (b != null) {
                    m66616i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f47971s;
            if (scheduledExecutorService == null) {
                synchronized (f47972t) {
                    scheduledExecutorService = f47971s;
                    if (scheduledExecutorService == null) {
                        zzh.m64016a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f47971s = scheduledExecutorService;
                    }
                }
            }
            this.f47990q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m66612e(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.f47974a) {
            if (wakeLock.mo56128b()) {
                Log.e("WakeLock", String.valueOf(wakeLock.f47985l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.m66614g();
                if (wakeLock.mo56128b()) {
                    wakeLock.f47976c = 1;
                    wakeLock.m66615h(0);
                }
            }
        }
    }

    @GuardedBy("acquireReleaseLock")
    /* renamed from: f */
    private final String m66613f(String str) {
        if (this.f47980g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    @GuardedBy("acquireReleaseLock")
    /* renamed from: g */
    private final void m66614g() {
        if (!this.f47979f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f47979f);
            this.f47979f.clear();
            if (arrayList.size() > 0) {
                zze zze = (zze) arrayList.get(0);
                throw null;
            }
        }
    }

    /* renamed from: h */
    private final void m66615h(int i) {
        synchronized (this.f47974a) {
            if (mo56128b()) {
                if (this.f47980g) {
                    int i2 = this.f47976c - 1;
                    this.f47976c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f47976c = 0;
                }
                m66614g();
                for (zzc zzc : this.f47988o.values()) {
                    zzc.f47992a = 0;
                }
                this.f47988o.clear();
                Future<?> future = this.f47977d;
                if (future != null) {
                    future.cancel(false);
                    this.f47977d = null;
                    this.f47978e = 0;
                }
                this.f47981h = 0;
                if (this.f47975b.isHeld()) {
                    try {
                        this.f47975b.release();
                        if (this.f47982i != null) {
                            this.f47982i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f47985l).concat(" failed to release!"), e);
                            if (this.f47982i != null) {
                                this.f47982i = null;
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        if (this.f47982i != null) {
                            this.f47982i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f47985l).concat(" should be held!"));
                }
            }
        }
    }

    /* renamed from: i */
    private static void m66616i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo56127a(long j) {
        this.f47989p.incrementAndGet();
        long j2 = f47970r;
        long j3 = LocationRequestCompat.PASSIVE_INTERVAL;
        long max = Math.max(Math.min(LocationRequestCompat.PASSIVE_INTERVAL, j2), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f47974a) {
            if (!mo56128b()) {
                this.f47982i = zzb.m64015b(false, (zzc) null);
                this.f47975b.acquire();
                this.f47983j.mo21952c();
            }
            this.f47976c++;
            this.f47981h++;
            m66613f((String) null);
            zzc zzc = this.f47988o.get((Object) null);
            if (zzc == null) {
                zzc = new zzc((zzb) null);
                this.f47988o.put((Object) null, zzc);
            }
            zzc.f47992a++;
            long c = this.f47983j.mo21952c();
            if (LocationRequestCompat.PASSIVE_INTERVAL - c > max) {
                j3 = c + max;
            }
            if (j3 > this.f47978e) {
                this.f47978e = j3;
                Future<?> future = this.f47977d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f47977d = this.f47990q.schedule(new zza(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean mo56128b() {
        boolean z;
        synchronized (this.f47974a) {
            z = this.f47976c > 0;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo56129c() {
        if (this.f47989p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f47985l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f47974a) {
            m66613f((String) null);
            if (this.f47988o.containsKey((Object) null)) {
                zzc zzc = this.f47988o.get((Object) null);
                if (zzc != null) {
                    int i = zzc.f47992a - 1;
                    zzc.f47992a = i;
                    if (i == 0) {
                        this.f47988o.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f47985l).concat(" counter does not exist"));
            }
            m66615h(0);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo56130d(boolean z) {
        synchronized (this.f47974a) {
            this.f47980g = z;
        }
    }
}
