package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunningApplicationServiceV22 extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f14539a;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.RunningApplicationServiceV22$b */
    private class C6117b extends AsyncTask<Void, List<Macro>, Void> {

        /* renamed from: a */
        private UsageStatsManager f14540a;

        private C6117b() {
            this.f14540a = (UsageStatsManager) RunningApplicationServiceV22.this.getSystemService("usagestats");
        }

        /* renamed from: b */
        private String m24219b() {
            List<UsageStats> list;
            long currentTimeMillis = System.currentTimeMillis();
            UsageStats usageStats = null;
            try {
                list = this.f14540a.queryUsageStats(4, currentTimeMillis - 4500, currentTimeMillis);
            } catch (IllegalStateException e) {
                C4878b.m18868g("Failed to query application info: " + e.toString());
                list = null;
            } catch (NullPointerException unused) {
                return "none";
            }
            if (list == null || list.size() == 0) {
                return "none";
            }
            long j = -1;
            for (UsageStats next : list) {
                if (next.getLastTimeUsed() > j) {
                    j = next.getLastTimeUsed();
                    usageStats = next;
                }
            }
            if (usageStats == null) {
                return "none";
            }
            if (!C5163j2.m20190k(RunningApplicationServiceV22.this)) {
                return RunningApplicationServiceV22.this.m24216d(usageStats);
            }
            UsageEvents queryEvents = this.f14540a.queryEvents(currentTimeMillis - 2000, currentTimeMillis);
            UsageEvents.Event event = new UsageEvents.Event();
            while (queryEvents.hasNextEvent()) {
                queryEvents.getNextEvent(event);
                if (event.getEventType() == 1 && usageStats.getPackageName().equals(event.getPackageName())) {
                    return RunningApplicationServiceV22.this.m24216d(usageStats);
                }
            }
            return "none";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String str = "none";
            while (RunningApplicationServiceV22.this.f14539a) {
                ArrayList arrayList = new ArrayList();
                arrayList.clear();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException unused) {
                }
                String b = m24219b();
                if (!b.equals("none") && !b.equals("com.arlosoft.macrodroid") && !b.equals(str)) {
                    for (Macro next : C4934n.m18998M().mo29679I()) {
                        Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                        while (it.hasNext()) {
                            Trigger next2 = it.next();
                            if (next2 instanceof ApplicationLaunchedTrigger) {
                                ApplicationLaunchedTrigger applicationLaunchedTrigger = (ApplicationLaunchedTrigger) next2;
                                Iterator<String> it2 = applicationLaunchedTrigger.mo30924H3().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String next3 = it2.next();
                                    if (applicationLaunchedTrigger.mo30922F3() && next3.equals(b) && next2.mo31374R2()) {
                                        next.setTriggerThatInvoked(next2);
                                        next.setTriggerContextInfo(RunningApplicationServiceV22.this.m24217e(next2, next3));
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                        }
                                    } else if (!applicationLaunchedTrigger.mo30922F3() && next3.equals(str) && next2.mo31374R2()) {
                                        next.setTriggerThatInvoked(next2);
                                        next.setTriggerContextInfo(RunningApplicationServiceV22.this.m24217e(next2, next3));
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        publishProgress(new List[]{arrayList});
                    }
                    str = b;
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onProgressUpdate(List<Macro>... listArr) {
            RunningApplicationServiceV22.this.getPackageManager();
            for (Macro next : listArr[0]) {
                next.invokeActions(next.getTriggerContextInfo());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m24216d(UsageStats usageStats) {
        String packageName = usageStats.getPackageName();
        return (packageName == null || !packageName.equals("com.google.android.googlequicksearchbox")) ? packageName : "com.google.android.launcher";
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public TriggerContextInfo m24217e(Trigger trigger, String str) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return new TriggerContextInfo(trigger, (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : getString(C17541R$string.unknown_application)));
    }

    /* renamed from: f */
    private void m24218f(C6117b bVar) {
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[]) null);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f14539a = true;
        m24218f(new C6117b());
    }

    public void onDestroy() {
        this.f14539a = false;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
