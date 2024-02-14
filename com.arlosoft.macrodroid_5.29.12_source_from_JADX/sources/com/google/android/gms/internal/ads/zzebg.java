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
public final class zzebg implements SensorEventListener {

    /* renamed from: a */
    private final Context f33626a;

    /* renamed from: b */
    private SensorManager f33627b;

    /* renamed from: c */
    private Sensor f33628c;

    /* renamed from: d */
    private long f33629d;

    /* renamed from: e */
    private int f33630e;

    /* renamed from: f */
    private zzebf f33631f;

    /* renamed from: g */
    private boolean f33632g;

    zzebg(Context context) {
        this.f33626a = context;
    }

    /* renamed from: a */
    public final void mo45147a() {
        synchronized (this) {
            if (this.f33632g) {
                SensorManager sensorManager = this.f33627b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f33628c);
                    zze.m2645k("Stopped listening for shake gestures.");
                }
                this.f33632g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45148b() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26894I7     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x0015:
            android.hardware.SensorManager r0 = r6.f33627b     // Catch:{ all -> 0x006a }
            r1 = 1
            if (r0 != 0) goto L_0x0035
            android.content.Context r0 = r6.f33626a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x006a }
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch:{ all -> 0x006a }
            r6.f33627b = r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Shake detection failed to initialize. Failed to obtain accelerometer."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r0)     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x002f:
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ all -> 0x006a }
            r6.f33628c = r0     // Catch:{ all -> 0x006a }
        L_0x0035:
            boolean r0 = r6.f33632g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            android.hardware.SensorManager r0 = r6.f33627b     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0068
            android.hardware.Sensor r2 = r6.f33628c     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0068
            r3 = 2
            r0.registerListener(r6, r2, r3)     // Catch:{ all -> 0x006a }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.m2889b()     // Catch:{ all -> 0x006a }
            long r2 = r0.mo21950a()     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26914K7     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r4.mo42663b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x006a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x006a }
            long r4 = (long) r0     // Catch:{ all -> 0x006a }
            long r2 = r2 - r4
            r6.f33629d = r2     // Catch:{ all -> 0x006a }
            r6.f33632g = r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "Listening for shake gestures."
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebg.mo45148b():void");
    }

    /* renamed from: c */
    public final void mo45149c(zzebf zzebf) {
        this.f33631f = zzebf;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26894I7)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)))) >= ((Float) zzay.m1924c().mo42663b(zzbjc.f26904J7)).floatValue()) {
                long a = zzt.m2889b().mo21950a();
                if (this.f33629d + ((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26914K7)).intValue()) <= a) {
                    if (this.f33629d + ((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26924L7)).intValue()) < a) {
                        this.f33630e = 0;
                    }
                    zze.m2645k("Shake detected.");
                    this.f33629d = a;
                    int i = this.f33630e + 1;
                    this.f33630e = i;
                    zzebf zzebf = this.f33631f;
                    if (zzebf != null) {
                        if (i == ((Integer) zzay.m1924c().mo42663b(zzbjc.f26934M7)).intValue()) {
                            zzeak zzeak = (zzeak) zzebf;
                            zzeak.mo45129h(new zzeah(zzeak), zzeaj.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
