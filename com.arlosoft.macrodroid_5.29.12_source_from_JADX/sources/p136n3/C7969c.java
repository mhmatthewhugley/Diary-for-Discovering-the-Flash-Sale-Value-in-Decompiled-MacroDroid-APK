package p136n3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: n3.c */
/* compiled from: FlipEventListener */
public class C7969c implements SensorEventListener {

    /* renamed from: d */
    private static C7971b f19112d = C7971b.UNKNOWN;

    /* renamed from: a */
    private long f19113a;

    /* renamed from: b */
    private long f19114b;

    /* renamed from: c */
    private C7970a f19115c;

    /* renamed from: n3.c$a */
    /* compiled from: FlipEventListener */
    public interface C7970a {
        /* renamed from: a */
        void mo31130a();

        /* renamed from: b */
        void mo31131b(boolean z);
    }

    /* renamed from: n3.c$b */
    /* compiled from: FlipEventListener */
    enum C7971b {
        FACE_DOWN,
        FACE_UP,
        UNKNOWN
    }

    /* renamed from: a */
    public void mo37860a(C7970a aVar) {
        this.f19115c = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        C7970a aVar;
        C7970a aVar2;
        double d = (double) sensorEvent.values[2];
        boolean z = -9.0d > d && d > -10.0d;
        boolean z2 = 8.8d < d && d < 10.2d;
        boolean z3 = -8.0d > d && d > -11.0d;
        boolean z4 = 8.0d < d && d > 11.0d;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            this.f19114b = currentTimeMillis;
            C7971b bVar = f19112d;
            C7971b bVar2 = C7971b.FACE_DOWN;
            if (!(bVar == bVar2 || (aVar2 = this.f19115c) == null)) {
                if (currentTimeMillis - this.f19113a < 2500) {
                    aVar2.mo31131b(true);
                }
                this.f19115c.mo31130a();
            }
            f19112d = bVar2;
        } else if (z3) {
            this.f19114b = currentTimeMillis;
        } else if (z2) {
            this.f19113a = currentTimeMillis;
            C7971b bVar3 = f19112d;
            C7971b bVar4 = C7971b.FACE_UP;
            if (!(bVar3 == bVar4 || (aVar = this.f19115c) == null || currentTimeMillis - this.f19114b >= 2500)) {
                aVar.mo31131b(false);
                this.f19114b = 0;
            }
            f19112d = bVar4;
        } else if (z4) {
            this.f19113a = currentTimeMillis;
        } else if (d > 0.0d) {
            f19112d = C7971b.UNKNOWN;
        }
    }
}
