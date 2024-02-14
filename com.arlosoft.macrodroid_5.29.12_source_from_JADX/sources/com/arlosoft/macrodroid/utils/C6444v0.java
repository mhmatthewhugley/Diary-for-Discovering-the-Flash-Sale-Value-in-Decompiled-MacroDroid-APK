package com.arlosoft.macrodroid.utils;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.logging.LogFactory;
import p297ja.C13339u;

/* renamed from: com.arlosoft.macrodroid.utils.v0 */
/* compiled from: NearFarListener.kt */
public final class C6444v0 {

    /* renamed from: a */
    public static final C6445a f15068a = new C6445a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final SensorManager f15069b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<C6447b> f15070c = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f15071d = new Object();

    /* renamed from: com.arlosoft.macrodroid.utils.v0$a */
    /* compiled from: NearFarListener.kt */
    public static final class C6445a {

        /* renamed from: com.arlosoft.macrodroid.utils.v0$a$a */
        /* compiled from: NearFarListener.kt */
        public /* synthetic */ class C6446a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f15072a;

            static {
                int[] iArr = new int[C6448c.values().length];
                iArr[C6448c.CONSTRAINT.ordinal()] = 1;
                iArr[C6448c.TRIGGER.ordinal()] = 2;
                f15072a = iArr;
            }
        }

        private C6445a() {
        }

        public /* synthetic */ C6445a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo32499a(C6447b bVar, C6448c cVar) {
            C13706o.m87929f(bVar, "listener");
            C13706o.m87929f(cVar, LogFactory.PRIORITY_KEY);
            synchronized (C6444v0.f15071d) {
                if (C6444v0.f15070c.isEmpty()) {
                    C6444v0.f15069b.registerListener(C6449d.f15076a, C6444v0.f15069b.getDefaultSensor(8), 3);
                }
                if (!C6444v0.f15070c.contains(bVar)) {
                    int i = C6446a.f15072a[cVar.ordinal()];
                    if (i == 1) {
                        C6444v0.f15070c.add(0, bVar);
                    } else if (i == 2) {
                        C6444v0.f15070c.add(bVar);
                    }
                }
                C13339u uVar = C13339u.f61331a;
            }
        }

        /* renamed from: b */
        public final void mo32500b(C6447b bVar) {
            C13706o.m87929f(bVar, "listener");
            synchronized (C6444v0.f15071d) {
                if (C6444v0.f15070c.contains(bVar)) {
                    C6444v0.f15070c.remove(bVar);
                }
                if (C6444v0.f15070c.isEmpty()) {
                    C6444v0.f15069b.unregisterListener(C6449d.f15076a);
                }
                C13339u uVar = C13339u.f61331a;
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.utils.v0$b */
    /* compiled from: NearFarListener.kt */
    public interface C6447b {
        /* renamed from: a */
        void mo28289a(boolean z);
    }

    /* renamed from: com.arlosoft.macrodroid.utils.v0$c */
    /* compiled from: NearFarListener.kt */
    public enum C6448c {
        CONSTRAINT,
        TRIGGER
    }

    /* renamed from: com.arlosoft.macrodroid.utils.v0$d */
    /* compiled from: NearFarListener.kt */
    private static final class C6449d implements SensorEventListener {

        /* renamed from: a */
        public static final C6449d f15076a = new C6449d();

        private C6449d() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            C13706o.m87929f(sensor, "sensor");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C13706o.m87929f(sensorEvent, NotificationCompat.CATEGORY_EVENT);
            boolean z = false;
            if (sensorEvent.values[0] < C6444v0.f15069b.getDefaultSensor(8).getMaximumRange() / ((float) 2)) {
                z = true;
            }
            synchronized (C6444v0.f15071d) {
                Iterator it = C6444v0.f15070c.iterator();
                while (it.hasNext()) {
                    ((C6447b) it.next()).mo28289a(z);
                }
                C13339u uVar = C13339u.f61331a;
            }
        }
    }

    static {
        Object systemService = MacroDroidApplication.f9883I.mo27303b().getSystemService("sensor");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        f15069b = (SensorManager) systemService;
    }

    /* renamed from: d */
    public static final void m24759d(C6447b bVar, C6448c cVar) {
        f15068a.mo32499a(bVar, cVar);
    }

    /* renamed from: e */
    public static final void m24760e(C6447b bVar) {
        f15068a.mo32500b(bVar);
    }
}
