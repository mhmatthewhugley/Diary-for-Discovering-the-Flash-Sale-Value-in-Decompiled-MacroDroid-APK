package com.arlosoft.macrodroid.triggers.services;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RunningApplicationServiceV21 extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f14535a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ActivityManager f14536c;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.RunningApplicationServiceV21$b */
    private class C6115b extends AsyncTask<Void, List<Macro>, Void> {

        /* renamed from: a */
        private final Set<String> f14537a;

        private C6115b() {
            this.f14537a = new HashSet();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            while (RunningApplicationServiceV21.this.f14535a) {
                arrayList.clear();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException unused) {
                }
                this.f14537a.clear();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = RunningApplicationServiceV21.this.f14536c.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    return null;
                }
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (next.importance == 100) {
                        this.f14537a.addAll(Arrays.asList(next.pkgList));
                    }
                }
                if (this.f14537a != null) {
                    for (Macro next2 : C4934n.m18998M().mo29679I()) {
                        Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
                        while (it.hasNext()) {
                            Trigger next3 = it.next();
                            if (next3 instanceof ApplicationLaunchedTrigger) {
                                ApplicationLaunchedTrigger applicationLaunchedTrigger = (ApplicationLaunchedTrigger) next3;
                                if (applicationLaunchedTrigger.mo30922F3()) {
                                    Iterator<String> it2 = applicationLaunchedTrigger.mo30924H3().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        String c = RunningApplicationServiceV21.this.m24207e(it2.next());
                                        if (this.f14537a.contains(c) && !hashSet.contains(c) && next3.mo31374R2()) {
                                            next2.setTriggerThatInvoked(next3);
                                            next2.setTriggerContextInfo(RunningApplicationServiceV21.this.m24208f(next3, c));
                                            if (next2.canInvoke(next2.getTriggerContextInfo())) {
                                                arrayList.add(next2);
                                            }
                                        }
                                    }
                                }
                                if (!applicationLaunchedTrigger.mo30922F3()) {
                                    Iterator<String> it3 = applicationLaunchedTrigger.mo30924H3().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        String c2 = RunningApplicationServiceV21.this.m24207e(it3.next());
                                        if (hashSet.contains(c2) && !this.f14537a.contains(c2) && next3.mo31374R2()) {
                                            next2.setTriggerThatInvoked(next3);
                                            next2.setTriggerContextInfo(RunningApplicationServiceV21.this.m24208f(next3, c2));
                                            if (next2.canInvoke(next2.getTriggerContextInfo())) {
                                                arrayList.add(next2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hashSet.clear();
                hashSet.addAll(this.f14537a);
                publishProgress(new List[]{arrayList});
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(List<Macro>... listArr) {
            for (Macro next : listArr[0]) {
                next.invokeActions(next.getTriggerContextInfo());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m24207e(String str) {
        return str.equals("com.google.android.apps.photos") ? "com.google.android.apps.plus" : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public TriggerContextInfo m24208f(Trigger trigger, String str) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return new TriggerContextInfo(trigger, (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : getString(C17541R$string.unknown_application)));
    }

    /* renamed from: g */
    private void m24209g(C6115b bVar) {
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[]) null);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f14535a = true;
        this.f14536c = (ActivityManager) getSystemService("activity");
        C6115b bVar = new C6115b();
        getPackageManager();
        new Intent("android.media.action.IMAGE_CAPTURE");
        m24209g(bVar);
    }

    public void onDestroy() {
        this.f14535a = false;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
