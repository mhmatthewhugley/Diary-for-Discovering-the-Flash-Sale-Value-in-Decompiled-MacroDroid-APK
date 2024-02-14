package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import org.apache.commons.logging.LogFactory;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m1425b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.m1273f(getApplicationContext());
        TransportContext.Builder d = TransportContext.m1253a().mo19432b(string).mo19434d(PriorityMapping.m1671b(i));
        if (string2 != null) {
            d.mo19433c(Base64.decode(string2, 0));
        }
        TransportRuntime.m1271c().mo19464e().mo19567v(d.mo19431a(), i2, new C1672b(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
