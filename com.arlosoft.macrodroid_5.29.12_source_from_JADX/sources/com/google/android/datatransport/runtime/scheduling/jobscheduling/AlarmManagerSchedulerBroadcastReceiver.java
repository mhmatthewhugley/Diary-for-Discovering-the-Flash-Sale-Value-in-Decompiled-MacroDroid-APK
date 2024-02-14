package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import org.apache.commons.logging.LogFactory;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m1410b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        TransportRuntime.m1273f(context);
        TransportContext.Builder d = TransportContext.m1253a().mo19432b(queryParameter).mo19434d(PriorityMapping.m1671b(intValue));
        if (queryParameter2 != null) {
            d.mo19433c(Base64.decode(queryParameter2, 0));
        }
        TransportRuntime.m1271c().mo19464e().mo19567v(d.mo19431a(), i, C1671a.f1528a);
    }
}
