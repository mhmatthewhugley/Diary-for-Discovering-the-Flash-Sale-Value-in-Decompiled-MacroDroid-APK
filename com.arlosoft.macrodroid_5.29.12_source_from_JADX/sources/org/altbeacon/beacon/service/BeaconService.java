package org.altbeacon.beacon.service;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.MainThread;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.C8046c;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import p091fd.C7322e;
import p097gd.C7354d;
import p300jd.C13374a;
import p310kd.C13551b;

public class BeaconService extends Service {

    /* renamed from: a */
    private final Handler f65903a = new Handler();

    /* renamed from: c */
    private C16024m f65904c;

    /* renamed from: d */
    private C8046c f65905d;

    /* renamed from: f */
    final Messenger f65906f = new Messenger(new C16005a(this));

    /* renamed from: org.altbeacon.beacon.service.BeaconService$a */
    static class C16005a extends Handler {

        /* renamed from: a */
        private final WeakReference<BeaconService> f65907a;

        C16005a(BeaconService beaconService) {
            super(Looper.getMainLooper());
            this.f65907a = new WeakReference<>(beaconService);
        }

        @MainThread
        public void handleMessage(Message message) {
            BeaconService beaconService = (BeaconService) this.f65907a.get();
            if (beaconService != null) {
                StartRMData a = StartRMData.m96520a(message.getData());
                if (a != null) {
                    int i = message.what;
                    if (i == 2) {
                        C7354d.m30379d("BeaconService", "start ranging received", new Object[0]);
                        beaconService.mo76405h(a.mo76424e(), new C16010a(a.mo76422d()));
                        beaconService.mo76403e(a.mo76425f(), a.mo76421c(), a.mo76420b());
                    } else if (i == 3) {
                        C7354d.m30379d("BeaconService", "stop ranging received", new Object[0]);
                        beaconService.mo76407j(a.mo76424e());
                        beaconService.mo76403e(a.mo76425f(), a.mo76421c(), a.mo76420b());
                    } else if (i == 4) {
                        C7354d.m30379d("BeaconService", "start monitoring received", new Object[0]);
                        beaconService.mo76404g(a.mo76424e(), new C16010a(a.mo76422d()));
                        beaconService.mo76403e(a.mo76425f(), a.mo76421c(), a.mo76420b());
                    } else if (i == 5) {
                        C7354d.m30379d("BeaconService", "stop monitoring received", new Object[0]);
                        beaconService.mo76406i(a.mo76424e());
                        beaconService.mo76403e(a.mo76425f(), a.mo76421c(), a.mo76420b());
                    } else if (i != 6) {
                        super.handleMessage(message);
                    } else {
                        C7354d.m30379d("BeaconService", "set scan intervals received", new Object[0]);
                        beaconService.mo76403e(a.mo76425f(), a.mo76421c(), a.mo76420b());
                    }
                } else if (message.what == 7) {
                    C7354d.m30379d("BeaconService", "Received settings update from other process", new Object[0]);
                    C16030p c = C16030p.m96655c(message.getData());
                    if (c != null) {
                        c.mo76527a(beaconService);
                    } else {
                        C7354d.m30381f("BeaconService", "Settings data missing", new Object[0]);
                    }
                } else {
                    C7354d.m30379d("BeaconService", "Received unknown message from other process : " + message.what, new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    private void m96490a() {
        if (this.f65905d == null) {
            C8046c a = C8046c.m33573a(this);
            this.f65905d = a;
            a.mo38047b();
        }
    }

    /* renamed from: b */
    private String m96491b(String str) {
        Bundle bundle;
        try {
            ServiceInfo serviceInfo = getPackageManager().getServiceInfo(new ComponentName(this, BeaconService.class), 128);
            if (serviceInfo == null || (bundle = serviceInfo.metaData) == null) {
                return null;
            }
            return bundle.get(str).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private PendingIntent m96492c() {
        return PendingIntent.getBroadcast(getApplicationContext(), 1, new Intent(getApplicationContext(), StartupBroadcastReceiver.class), 1140850688);
    }

    /* renamed from: f */
    private void m96493f() {
        BeaconManager A = BeaconManager.m33479A(getApplicationContext());
        Notification y = A.mo38013y();
        int z = A.mo38014z();
        if (y != null) {
            startForeground(z, y);
        }
    }

    /* renamed from: d */
    public void mo76402d() {
        this.f65904c.mo76492s();
    }

    @MainThread
    /* renamed from: e */
    public void mo76403e(long j, long j2, boolean z) {
        if (this.f65904c.mo76487j() != null) {
            this.f65904c.mo76487j().mo68799u(j, j2, z);
        }
    }

    @MainThread
    /* renamed from: g */
    public void mo76404g(Region region, C16010a aVar) {
        C7354d.m30376a("BeaconService", "startMonitoring called", new Object[0]);
        this.f65904c.mo76488l().mo76440c(region, aVar);
        C7354d.m30376a("BeaconService", "Currently monitoring %s regions.", Integer.valueOf(this.f65904c.mo76488l().mo76445j()));
        if (this.f65904c.mo76487j() != null) {
            this.f65904c.mo76487j().mo68801w();
        }
    }

    @MainThread
    /* renamed from: h */
    public void mo76405h(Region region, C16010a aVar) {
        synchronized (this.f65904c.mo76489m()) {
            if (this.f65904c.mo76489m().containsKey(region)) {
                C7354d.m30379d("BeaconService", "Already ranging that region -- will replace existing region.", new Object[0]);
                this.f65904c.mo76489m().remove(region);
            }
            this.f65904c.mo76489m().put(region, new C16016g(aVar));
            C7354d.m30376a("BeaconService", "Currently ranging %s regions.", Integer.valueOf(this.f65904c.mo76489m().size()));
        }
        if (this.f65904c.mo76487j() != null) {
            this.f65904c.mo76487j().mo68801w();
        }
    }

    @MainThread
    /* renamed from: i */
    public void mo76406i(Region region) {
        C7354d.m30376a("BeaconService", "stopMonitoring called", new Object[0]);
        this.f65904c.mo76488l().mo76447m(region);
        C7354d.m30376a("BeaconService", "Currently monitoring %s regions.", Integer.valueOf(this.f65904c.mo76488l().mo76445j()));
        if (this.f65904c.mo76488l().mo76445j() == 0 && this.f65904c.mo76489m().size() == 0 && this.f65904c.mo76487j() != null) {
            this.f65904c.mo76487j().mo68803y();
        }
    }

    @MainThread
    /* renamed from: j */
    public void mo76407j(Region region) {
        int size;
        synchronized (this.f65904c.mo76489m()) {
            this.f65904c.mo76489m().remove(region);
            size = this.f65904c.mo76489m().size();
            C7354d.m30376a("BeaconService", "Currently ranging %s regions.", Integer.valueOf(this.f65904c.mo76489m().size()));
        }
        if (size == 0 && this.f65904c.mo76488l().mo76445j() == 0 && this.f65904c.mo76487j() != null) {
            this.f65904c.mo76487j().mo68803y();
        }
    }

    public IBinder onBind(Intent intent) {
        C7354d.m30379d("BeaconService", "binding", new Object[0]);
        return this.f65906f.getBinder();
    }

    @MainThread
    public void onCreate() {
        m96493f();
        C16024m mVar = new C16024m(this);
        this.f65904c = mVar;
        if (mVar.mo76487j() == null) {
            this.f65904c.mo76486i(false, (C13551b) null);
        }
        this.f65904c.mo76495v(C16015f.m96542d(this));
        this.f65904c.mo76496w(new HashMap());
        this.f65904c.mo76493t(new HashSet());
        this.f65904c.mo76494u(new C16012c());
        BeaconManager A = BeaconManager.m33479A(getApplicationContext());
        A.mo37992c0(true);
        if (A.mo37982Q()) {
            C7354d.m30379d("BeaconService", "beaconService version %s is starting up on the main process", "2.19.3");
            m96490a();
        } else {
            C7354d.m30379d("BeaconService", "beaconService version %s is starting up on a separate process", "2.19.3");
            C13374a aVar = new C13374a(this);
            C7354d.m30379d("BeaconService", "beaconService PID is " + aVar.mo70788b() + " with process name " + aVar.mo70789c(), new Object[0]);
        }
        String b = m96491b("longScanForcingEnabled");
        if (b != null && b.equals("true")) {
            C7354d.m30379d("BeaconService", "longScanForcingEnabled to keep scans going on Android N for > 30 minutes", new Object[0]);
            if (this.f65904c.mo76487j() != null) {
                this.f65904c.mo76487j().mo68798t(true);
            }
        }
        this.f65904c.mo76492s();
        Beacon.m33456q(new C7322e(this, BeaconManager.m33500v()));
        try {
            this.f65904c.mo76497x((List) Class.forName("org.altbeacon.beacon.SimulatedScanData").getField("beacons").get((Object) null));
        } catch (ClassNotFoundException unused) {
            C7354d.m30376a("BeaconService", "No org.altbeacon.beacon.SimulatedScanData class exists.", new Object[0]);
        } catch (Exception e) {
            C7354d.m30378c(e, "BeaconService", "Cannot get simulated Scan data.  Make sure your org.altbeacon.beacon.SimulatedScanData class defines a field with the signature 'public static List<Beacon> beacons'", new Object[0]);
        }
    }

    @MainThread
    public void onDestroy() {
        C7354d.m30377b("BeaconService", "onDestroy()", new Object[0]);
        C8046c cVar = this.f65905d;
        if (cVar != null) {
            cVar.mo38048c();
        }
        C7354d.m30379d("BeaconService", "onDestroy called.  stopping scanning", new Object[0]);
        this.f65903a.removeCallbacksAndMessages((Object) null);
        if (this.f65904c.mo76487j() != null) {
            this.f65904c.mo76487j().mo68803y();
            this.f65904c.mo76487j().mo68790i();
        }
        this.f65904c.mo76488l().mo76452s();
        this.f65904c.mo76484B();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (intent == null) {
            str = "starting with null intent";
        } else {
            str = "starting with intent " + intent.toString();
        }
        C7354d.m30379d("BeaconService", str, new Object[0]);
        return super.onStartCommand(intent, i, i2);
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        C7354d.m30376a("BeaconService", "task removed", new Object[0]);
        String str = Build.VERSION.RELEASE;
        if (str.contains("4.4.1") || str.contains("4.4.2") || str.contains("4.4.3")) {
            ((AlarmManager) getApplicationContext().getSystemService(NotificationCompat.CATEGORY_ALARM)).set(0, System.currentTimeMillis() + 1000, m96492c());
            C7354d.m30376a("BeaconService", "Setting a wakeup alarm to go off due to Android 4.4.2 service restarting bug.", new Object[0]);
        }
    }

    public boolean onUnbind(Intent intent) {
        C7354d.m30379d("BeaconService", "unbinding so destroying self", new Object[0]);
        stopForeground(true);
        stopSelf();
        return false;
    }
}
