package p136n3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.PowerManager;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkRequest;

/* renamed from: n3.g */
/* compiled from: ShakeEventListener */
public class C7974g implements SensorEventListener {

    /* renamed from: j */
    private static int f19121j = 18;

    /* renamed from: k */
    private static int f19122k = 5;

    /* renamed from: a */
    private long f19123a = 0;

    /* renamed from: b */
    private long f19124b;

    /* renamed from: c */
    private int f19125c = 0;

    /* renamed from: d */
    private float f19126d = 0.0f;

    /* renamed from: e */
    private float f19127e = 0.0f;

    /* renamed from: f */
    private float f19128f = 0.0f;

    /* renamed from: g */
    private long f19129g = 0;

    /* renamed from: h */
    private C7975a f19130h;

    /* renamed from: i */
    private final PowerManager.WakeLock f19131i;

    /* renamed from: n3.g$a */
    /* compiled from: ShakeEventListener */
    public interface C7975a {
        /* renamed from: a */
        void mo31794a();
    }

    public C7974g(Context context) {
        this.f19131i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "MacroDroid:ShakeEventListener");
    }

    /* renamed from: a */
    private void m33259a() {
        this.f19123a = 0;
        this.f19125c = 0;
        this.f19124b = 0;
        this.f19126d = 0.0f;
        this.f19127e = 0.0f;
        this.f19128f = 0.0f;
    }

    /* renamed from: c */
    public static void m33260c(String str) {
        if (str.startsWith("5")) {
            f19121j = 4;
            f19122k = 4;
        } else if (str.startsWith("4")) {
            f19121j = 9;
            f19122k = 4;
        } else if (str.startsWith(ExifInterface.GPS_MEASUREMENT_3D)) {
            f19121j = 15;
            f19122k = 4;
        } else if (str.startsWith(ExifInterface.GPS_MEASUREMENT_2D)) {
            f19121j = 21;
            f19122k = 5;
        } else if (str.startsWith("1")) {
            f19121j = 32;
            f19122k = 6;
        }
    }

    /* renamed from: b */
    public void mo37865b(C7975a aVar) {
        this.f19130h = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= this.f19129g + 1200) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            if (Math.abs(((((f + f2) + f3) - this.f19126d) - this.f19127e) - this.f19128f) > ((float) f19121j)) {
                if (this.f19123a == 0) {
                    this.f19123a = currentTimeMillis;
                    this.f19124b = currentTimeMillis;
                }
                if (currentTimeMillis - this.f19124b < 300) {
                    this.f19124b = currentTimeMillis;
                    int i = this.f19125c + 1;
                    this.f19125c = i;
                    this.f19126d = f;
                    this.f19127e = f2;
                    this.f19128f = f3;
                    if (i >= f19122k && currentTimeMillis - this.f19123a < 1000) {
                        this.f19131i.acquire(WorkRequest.MIN_BACKOFF_MILLIS);
                        this.f19130h.mo31794a();
                        try {
                            this.f19131i.release();
                        } catch (Exception unused) {
                        }
                        m33259a();
                        this.f19129g = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                m33259a();
            }
        }
    }
}
