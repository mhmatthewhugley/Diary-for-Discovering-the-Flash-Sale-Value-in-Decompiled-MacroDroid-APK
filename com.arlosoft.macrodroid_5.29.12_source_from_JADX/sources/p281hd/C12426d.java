package p281hd;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import p097gd.C7354d;
import p310kd.C13551b;

/* renamed from: hd.d */
/* compiled from: CycledLeScannerForJellyBeanMr2 */
public class C12426d extends C12421b {

    /* renamed from: z */
    private BluetoothAdapter.LeScanCallback f59193z;

    /* renamed from: hd.d$a */
    /* compiled from: CycledLeScannerForJellyBeanMr2 */
    class C12427a implements Runnable {
        C12427a() {
        }

        @MainThread
        public void run() {
            C12426d.this.mo68795q(Boolean.TRUE);
        }
    }

    /* renamed from: hd.d$b */
    /* compiled from: CycledLeScannerForJellyBeanMr2 */
    class C12428b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BluetoothAdapter f59195a;

        /* renamed from: c */
        final /* synthetic */ BluetoothAdapter.LeScanCallback f59196c;

        C12428b(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
            this.f59195a = bluetoothAdapter;
            this.f59196c = leScanCallback;
        }

        @WorkerThread
        public void run() {
            try {
                this.f59195a.startLeScan(this.f59196c);
            } catch (Exception e) {
                C7354d.m30378c(e, "CycledLeScannerForJellyBeanMr2", "Internal Android exception in startLeScan()", new Object[0]);
            }
        }
    }

    /* renamed from: hd.d$c */
    /* compiled from: CycledLeScannerForJellyBeanMr2 */
    class C12429c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BluetoothAdapter f59198a;

        /* renamed from: c */
        final /* synthetic */ BluetoothAdapter.LeScanCallback f59199c;

        C12429c(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
            this.f59198a = bluetoothAdapter;
            this.f59199c = leScanCallback;
        }

        @WorkerThread
        public void run() {
            try {
                this.f59198a.stopLeScan(this.f59199c);
            } catch (Exception e) {
                C7354d.m30378c(e, "CycledLeScannerForJellyBeanMr2", "Internal Android exception in stopLeScan()", new Object[0]);
            }
        }
    }

    /* renamed from: hd.d$d */
    /* compiled from: CycledLeScannerForJellyBeanMr2 */
    class C12430d implements BluetoothAdapter.LeScanCallback {
        C12430d() {
        }

        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            C7354d.m30376a("CycledLeScannerForJellyBeanMr2", "got record", new Object[0]);
            C12426d.this.f59185u.mo68784a(bluetoothDevice, i, bArr, System.currentTimeMillis());
            C12426d dVar = C12426d.this;
            C13551b bVar = dVar.f59184t;
            if (bVar != null) {
                bVar.mo71648b(bluetoothDevice, dVar.m83349B());
            }
        }
    }

    public C12426d(Context context, long j, long j2, boolean z, C12420a aVar, C13551b bVar) {
        super(context, j, j2, z, aVar, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public BluetoothAdapter.LeScanCallback m83349B() {
        if (this.f59193z == null) {
            this.f59193z = new C12430d();
        }
        return this.f59193z;
    }

    /* renamed from: C */
    private void m83350C() {
        BluetoothAdapter l = mo68792l();
        if (l != null) {
            BluetoothAdapter.LeScanCallback B = m83349B();
            this.f59182r.removeCallbacksAndMessages((Object) null);
            this.f59182r.post(new C12428b(l, B));
        }
    }

    /* renamed from: D */
    private void m83351D() {
        BluetoothAdapter l = mo68792l();
        if (l != null) {
            BluetoothAdapter.LeScanCallback B = m83349B();
            this.f59182r.removeCallbacksAndMessages((Object) null);
            this.f59182r.post(new C12429c(l, B));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo68789h() {
        long elapsedRealtime = this.f59168d - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            return false;
        }
        C7354d.m30376a("CycledLeScannerForJellyBeanMr2", "Waiting to start next Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.f59186v) {
            mo68800v();
        }
        Handler handler = this.f59181q;
        C12427a aVar = new C12427a();
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(aVar, elapsedRealtime);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo68791j() {
        m83351D();
        this.f59173i = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo68802x() {
        m83350C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo68804z() {
        m83351D();
    }
}
