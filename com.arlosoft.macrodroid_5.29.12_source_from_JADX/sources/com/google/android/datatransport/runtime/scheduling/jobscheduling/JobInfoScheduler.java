package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import org.apache.commons.logging.LogFactory;

@RequiresApi(api = 21)
public class JobInfoScheduler implements WorkScheduler {

    /* renamed from: a */
    private final Context f1493a;

    /* renamed from: b */
    private final EventStore f1494b;

    /* renamed from: c */
    private final SchedulerConfig f1495c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f1493a = context;
        this.f1494b = eventStore;
        this.f1495c = schedulerConfig;
    }

    /* renamed from: d */
    private boolean m1420d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo19537a(TransportContext transportContext, int i) {
        mo19538b(transportContext, i, false);
    }

    /* renamed from: b */
    public void mo19538b(TransportContext transportContext, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f1493a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f1493a.getSystemService("jobscheduler");
        int c = mo19556c(transportContext);
        if (z || !m1420d(jobScheduler, c, i)) {
            long M0 = this.f1494b.mo19599M0(transportContext);
            JobInfo.Builder c2 = this.f1495c.mo19559c(new JobInfo.Builder(c, componentName), transportContext.mo19428d(), M0, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", transportContext.mo19426b());
            persistableBundle.putInt(LogFactory.PRIORITY_KEY, PriorityMapping.m1670a(transportContext.mo19428d()));
            if (transportContext.mo19427c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(transportContext.mo19427c(), 0));
            }
            c2.setExtras(persistableBundle);
            Logging.m1382c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(c), Long.valueOf(this.f1495c.mo19560g(transportContext.mo19428d(), M0, i)), Long.valueOf(M0), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        Logging.m1381b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public int mo19556c(TransportContext transportContext) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f1493a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.mo19426b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.m1670a(transportContext.mo19428d())).array());
        if (transportContext.mo19427c() != null) {
            adler32.update(transportContext.mo19427c());
        }
        return (int) adler32.getValue();
    }
}
