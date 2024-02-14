package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import org.apache.commons.logging.LogFactory;

public class AlarmManagerScheduler implements WorkScheduler {

    /* renamed from: a */
    private final Context f1480a;

    /* renamed from: b */
    private final EventStore f1481b;

    /* renamed from: c */
    private AlarmManager f1482c;

    /* renamed from: d */
    private final SchedulerConfig f1483d;

    /* renamed from: e */
    private final Clock f1484e;

    /* renamed from: a */
    public void mo19537a(TransportContext transportContext, int i) {
        mo19538b(transportContext, i, false);
    }

    /* renamed from: b */
    public void mo19538b(TransportContext transportContext, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.mo19426b());
        builder.appendQueryParameter(LogFactory.PRIORITY_KEY, String.valueOf(PriorityMapping.m1670a(transportContext.mo19428d())));
        if (transportContext.mo19427c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(transportContext.mo19427c(), 0));
        }
        Intent intent = new Intent(this.f1480a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !mo19539c(intent)) {
            long M0 = this.f1481b.mo19599M0(transportContext);
            long g = this.f1483d.mo19560g(transportContext.mo19428d(), M0, i);
            Logging.m1382c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(g), Long.valueOf(M0), Integer.valueOf(i));
            this.f1482c.set(3, this.f1484e.mo19627a() + g, PendingIntent.getBroadcast(this.f1480a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            return;
        }
        Logging.m1381b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public boolean mo19539c(Intent intent) {
        return PendingIntent.getBroadcast(this.f1480a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }
}
