package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzciv implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f28546a;

    /* renamed from: b */
    private final Object f28547b = new Object();

    /* renamed from: c */
    private final Display f28548c;

    /* renamed from: d */
    private final float[] f28549d = new float[9];

    /* renamed from: e */
    private final float[] f28550e = new float[9];

    /* renamed from: f */
    private float[] f28551f;

    /* renamed from: g */
    private Handler f28552g;

    /* renamed from: h */
    private zzciu f28553h;

    zzciv(Context context) {
        this.f28546a = (SensorManager) context.getSystemService("sensor");
        this.f28548c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43729a(zzciu zzciu) {
        this.f28553h = zzciu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43730b() {
        if (this.f28552g == null) {
            Sensor defaultSensor = this.f28546a.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzcgp.m45226d("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzfpz zzfpz = new zzfpz(handlerThread.getLooper());
            this.f28552g = zzfpz;
            if (!this.f28546a.registerListener(this, defaultSensor, 0, zzfpz)) {
                zzcgp.m45226d("SensorManager.registerListener failed.");
                mo43731c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43731c() {
        if (this.f28552g != null) {
            this.f28546a.unregisterListener(this);
            this.f28552g.post(new zzcit(this));
            this.f28552g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo43732d(float[] fArr) {
        synchronized (this.f28547b) {
            float[] fArr2 = this.f28551f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f28547b) {
                if (this.f28551f == null) {
                    this.f28551f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f28549d, fArr);
            int rotation = this.f28548c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f28549d, 2, 129, this.f28550e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f28549d, 129, 130, this.f28550e);
            } else if (rotation != 3) {
                System.arraycopy(this.f28549d, 0, this.f28550e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f28549d, 130, 1, this.f28550e);
            }
            float[] fArr2 = this.f28550e;
            float f = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f;
            float f2 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f2;
            float f3 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f3;
            synchronized (this.f28547b) {
                System.arraycopy(this.f28550e, 0, this.f28551f, 0, 9);
            }
            zzciu zzciu = this.f28553h;
            if (zzciu != null) {
                zzciu.zza();
            }
        }
    }
}
