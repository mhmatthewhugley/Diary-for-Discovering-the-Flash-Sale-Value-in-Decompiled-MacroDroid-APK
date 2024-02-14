package org.altbeacon.bluetooth;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.WorkRequest;
import p097gd.C7354d;
import p310kd.C13552c;

@RequiresApi(21)
public class BluetoothTestJob extends JobService {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f65988d = BluetoothTestJob.class.getSimpleName();

    /* renamed from: f */
    private static int f65989f = -1;
    @Nullable

    /* renamed from: a */
    private Handler f65990a = null;
    @Nullable

    /* renamed from: c */
    private HandlerThread f65991c = null;

    /* renamed from: org.altbeacon.bluetooth.BluetoothTestJob$a */
    class C16033a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JobParameters f65992a;

        C16033a(JobParameters jobParameters) {
            this.f65992a = jobParameters;
        }

        public void run() {
            boolean z;
            C7354d.m30379d(BluetoothTestJob.f65988d, "Bluetooth Test Job running", new Object[0]);
            int i = this.f65992a.getExtras().getInt("test_type");
            boolean z2 = true;
            if (i == 0) {
                C7354d.m30376a(BluetoothTestJob.f65988d, "No test specified.  Done with job.", new Object[0]);
                z = true;
            } else {
                z = false;
            }
            if ((i & 1) == 1) {
                C7354d.m30376a(BluetoothTestJob.f65988d, "Scan test specified.", new Object[0]);
                if (!C13552c.m87365k().mo71650n(BluetoothTestJob.this)) {
                    C7354d.m30376a(BluetoothTestJob.f65988d, "scan test failed", new Object[0]);
                }
                z = true;
            }
            if ((i & 2) == 2) {
                if (z) {
                    try {
                        Thread.sleep(WorkRequest.MIN_BACKOFF_MILLIS);
                    } catch (InterruptedException unused) {
                    }
                }
                C7354d.m30376a(BluetoothTestJob.f65988d, "Transmit test specified.", new Object[0]);
                if (!C13552c.m87365k().mo71651o(BluetoothTestJob.this)) {
                    C7354d.m30376a(BluetoothTestJob.f65988d, "transmit test failed", new Object[0]);
                }
            } else {
                z2 = z;
            }
            if (!z2) {
                String a = BluetoothTestJob.f65988d;
                C7354d.m30381f(a, "Unknown test type:" + i + "  Exiting.", new Object[0]);
            }
            BluetoothTestJob.this.jobFinished(this.f65992a, false);
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f65991c == null) {
            HandlerThread handlerThread = new HandlerThread("BluetoothTestThread");
            this.f65991c = handlerThread;
            handlerThread.start();
        }
        if (this.f65990a == null) {
            this.f65990a = new Handler(this.f65991c.getLooper());
        }
        this.f65990a.post(new C16033a(jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
