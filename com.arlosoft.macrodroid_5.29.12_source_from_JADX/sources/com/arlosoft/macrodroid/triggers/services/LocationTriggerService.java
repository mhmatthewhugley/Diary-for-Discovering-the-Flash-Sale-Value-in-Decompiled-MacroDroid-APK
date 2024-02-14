package com.arlosoft.macrodroid.triggers.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;

public class LocationTriggerService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static Location f14488p;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PowerManager.WakeLock f14489a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public PendingIntent f14490c;

    /* renamed from: d */
    private C6105b f14491d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public LocationManager f14492f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Location f14493g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final LocationListener f14494o = new C6104a();

    /* renamed from: com.arlosoft.macrodroid.triggers.services.LocationTriggerService$a */
    class C6104a implements LocationListener {
        C6104a() {
        }

        public void onLocationChanged(Location location) {
            if (location.getProvider().equals("network")) {
                if (LocationTriggerService.f14488p == null || ((double) location.distanceTo(LocationTriggerService.f14488p)) >= 1.0E-8d) {
                    Location unused = LocationTriggerService.f14488p = location;
                } else {
                    return;
                }
            }
            if (LocationTriggerService.this.f14493g == null) {
                Location unused2 = LocationTriggerService.this.f14493g = location;
            } else if (location.getAccuracy() < LocationTriggerService.this.f14493g.getAccuracy()) {
                Location unused3 = LocationTriggerService.this.f14493g = location;
            }
            if (C6127g.m24242a(location)) {
                ((AlarmManager) LocationTriggerService.this.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(LocationTriggerService.this.f14490c);
                C4878b.m18879r("LocationTrigger: Good location obtained");
                try {
                    LocationTriggerService.this.f14492f.removeUpdates(LocationTriggerService.this.f14494o);
                } catch (SecurityException unused4) {
                }
                if (LocationTriggerService.this.f14489a != null && LocationTriggerService.this.f14489a.isHeld()) {
                    LocationTriggerService.this.f14489a.release();
                }
                LocationTriggerService.this.stopSelf();
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.LocationTriggerService$b */
    private class C6105b extends BroadcastReceiver {
        private C6105b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (LocationTriggerService.this.f14493g == null) {
                C4878b.m18879r("LOC UPDATE FAILED - Could not obtain a good location fix.");
            } else {
                C4878b.m18879r("LOC UPDATE FAILED - Fix not good enough (Accuracy: " + LocationTriggerService.this.f14493g.getAccuracy() + "m)");
            }
            try {
                if (LocationTriggerService.this.f14492f != null) {
                    LocationTriggerService.this.f14492f.removeUpdates(LocationTriggerService.this.f14494o);
                }
            } catch (SecurityException unused) {
            }
            if (LocationTriggerService.this.f14489a.isHeld()) {
                LocationTriggerService.this.f14489a.release();
            }
            LocationTriggerService.this.stopSelf();
        }

        /* synthetic */ C6105b(LocationTriggerService locationTriggerService, C6104a aVar) {
            this();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r18 = this;
            r0 = r18
            super.onCreate()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r4 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            if (r4 == 0) goto L_0x0025
            r4 = 2131954090(0x7f1309aa, float:1.954467E38)
            java.lang.String r4 = r0.getString(r4)
            p112j2.C7439d0.m30909o0(r0, r1, r4, r2, r3)
            r18.stopSelf()
            return
        L_0x0025:
            java.lang.String r1 = "LocationTrigger: Obtaining a location fix"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r1)
            java.lang.String r1 = "power"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            java.lang.String r4 = "macrodorid:locationtriggerservice"
            android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r2, r4)
            r0.f14489a = r1
            r1.setReferenceCounted(r3)
            java.lang.String r1 = "location"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r0.f14492f = r1
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "Timeout"
            r1.<init>(r2)
            com.arlosoft.macrodroid.triggers.services.LocationTriggerService$b r4 = new com.arlosoft.macrodroid.triggers.services.LocationTriggerService$b
            r5 = 0
            r4.<init>(r0, r5)
            r0.f14491d = r4
            r0.registerReceiver(r4, r1)
            android.os.PowerManager$WakeLock r1 = r0.f14489a
            r6 = 40500(0x9e34, double:2.00097E-319)
            r1.acquire(r6)
            android.location.LocationManager r1 = r0.f14492f
            android.location.LocationListener r4 = r0.f14494o
            r1.removeUpdates(r4)
            android.location.LocationManager r6 = r0.f14492f     // Catch:{ Exception -> 0x0074 }
            java.lang.String r7 = "network"
            r8 = 0
            r10 = 0
            android.location.LocationListener r11 = r0.f14494o     // Catch:{ Exception -> 0x0074 }
            r6.requestLocationUpdates(r7, r8, r10, r11)     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            android.location.LocationManager r12 = r0.f14492f     // Catch:{ Exception -> 0x0083 }
            java.lang.String r13 = "gps"
            r14 = 0
            r16 = 0
            android.location.LocationListener r1 = r0.f14494o     // Catch:{ Exception -> 0x0083 }
            r17 = r1
            r12.requestLocationUpdates(r13, r14, r16, r17)     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2)
            r2 = 134217728(0x8000000, float:3.85186E-34)
            int r4 = com.arlosoft.macrodroid.utils.C6368b1.f14959b
            r2 = r2 | r4
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r3, r1, r2)
            r0.f14490c = r1
            java.lang.String r1 = "alarm"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 40000(0x9c40, double:1.97626E-319)
            long r6 = r6 + r8
            android.app.PendingIntent r2 = r0.f14490c
            r1.set(r3, r6, r2)
            r0.f14493g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.LocationTriggerService.onCreate():void");
    }

    public void onDestroy() {
        PowerManager.WakeLock wakeLock = this.f14489a;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f14489a.release();
        }
        this.f14489a = null;
        if (this.f14490c != null) {
            ((AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f14490c);
        }
        C6105b bVar = this.f14491d;
        if (bVar != null) {
            unregisterReceiver(bVar);
        }
        super.onDestroy();
    }
}
