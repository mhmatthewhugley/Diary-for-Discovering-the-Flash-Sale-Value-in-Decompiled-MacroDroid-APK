package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdzw implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f33490a;

    /* renamed from: b */
    private final Sensor f33491b;

    /* renamed from: c */
    private float f33492c = 0.0f;

    /* renamed from: d */
    private Float f33493d = Float.valueOf(0.0f);

    /* renamed from: e */
    private long f33494e = zzt.m2889b().mo21950a();

    /* renamed from: f */
    private int f33495f = 0;

    /* renamed from: g */
    private boolean f33496g = false;

    /* renamed from: h */
    private boolean f33497h = false;

    /* renamed from: i */
    private zzdzv f33498i = null;

    /* renamed from: j */
    private boolean f33499j = false;

    zzdzw(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f33490a = sensorManager;
        if (sensorManager != null) {
            this.f33491b = sensorManager.getDefaultSensor(4);
        } else {
            this.f33491b = null;
        }
    }

    /* renamed from: a */
    public final void mo45108a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!(!this.f33499j || (sensorManager = this.f33490a) == null || (sensor = this.f33491b) == null)) {
                sensorManager.unregisterListener(this, sensor);
                this.f33499j = false;
                zze.m2645k("Stopped listening for flick gestures.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3.f33490a == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3.f33491b != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        com.google.android.gms.internal.ads.zzcgp.m45229g("Flick detection failed to initialize. Failed to obtain gyroscope.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45109b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26944N7     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x003e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return
        L_0x0015:
            boolean r0 = r3.f33499j     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002d
            android.hardware.SensorManager r0 = r3.f33490a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002d
            android.hardware.Sensor r1 = r3.f33491b     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x002d
            r2 = 2
            r0.registerListener(r3, r1, r2)     // Catch:{ all -> 0x003e }
            r0 = 1
            r3.f33499j = r0     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "Listening for flick gestures."
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)     // Catch:{ all -> 0x003e }
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            android.hardware.SensorManager r0 = r3.f33490a
            if (r0 == 0) goto L_0x0038
            android.hardware.Sensor r0 = r3.f33491b
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            java.lang.String r0 = "Flick detection failed to initialize. Failed to obtain gyroscope."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r0)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzw.mo45109b():void");
    }

    /* renamed from: c */
    public final void mo45110c(zzdzv zzdzv) {
        this.f33498i = zzdzv;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26944N7)).booleanValue()) {
            long a = zzt.m2889b().mo21950a();
            if (this.f33494e + ((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26964P7)).intValue()) < a) {
                this.f33495f = 0;
                this.f33494e = a;
                this.f33496g = false;
                this.f33497h = false;
                this.f33492c = this.f33493d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f33493d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f33493d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.f33492c;
            zzbiu zzbiu = zzbjc.f26954O7;
            if (floatValue > f + ((Float) zzay.m1924c().mo42663b(zzbiu)).floatValue()) {
                this.f33492c = this.f33493d.floatValue();
                this.f33497h = true;
            } else if (this.f33493d.floatValue() < this.f33492c - ((Float) zzay.m1924c().mo42663b(zzbiu)).floatValue()) {
                this.f33492c = this.f33493d.floatValue();
                this.f33496g = true;
            }
            if (this.f33493d.isInfinite()) {
                this.f33493d = Float.valueOf(0.0f);
                this.f33492c = 0.0f;
            }
            if (this.f33496g && this.f33497h) {
                zze.m2645k("Flick detected.");
                this.f33494e = a;
                int i = this.f33495f + 1;
                this.f33495f = i;
                this.f33496g = false;
                this.f33497h = false;
                zzdzv zzdzv = this.f33498i;
                if (zzdzv != null) {
                    if (i == ((Integer) zzay.m1924c().mo42663b(zzbjc.f26974Q7)).intValue()) {
                        zzeak zzeak = (zzeak) zzdzv;
                        zzeak.mo45129h(new zzeai(zzeak), zzeaj.GESTURE);
                    }
                }
            }
        }
    }
}
