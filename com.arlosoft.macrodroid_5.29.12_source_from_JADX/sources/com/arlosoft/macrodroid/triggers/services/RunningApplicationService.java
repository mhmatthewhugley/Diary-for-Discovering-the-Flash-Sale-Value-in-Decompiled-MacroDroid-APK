package com.arlosoft.macrodroid.triggers.services;

import android.app.ActivityManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.List;

public class RunningApplicationService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f14530a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ActivityManager f14531c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f14532d;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.RunningApplicationService$b */
    private class C6113b extends AsyncTask<Void, List<Macro>, Void> {

        /* renamed from: a */
        private String f14533a;

        private C6113b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
            if (r6.mo31374R2() == false) goto L_0x00e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
            r4.setTriggerThatInvoked(r6);
            r4.setTriggerContextInfo(com.arlosoft.macrodroid.triggers.services.RunningApplicationService.m24197d(r12.f14534b, r6, r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dd, code lost:
            if (r4.canInvoke(r4.getTriggerContextInfo()) == false) goto L_0x00e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
            r1.add(r4);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r13) {
            /*
                r12 = this;
                r13 = 0
                r0 = r13
            L_0x0002:
                com.arlosoft.macrodroid.triggers.services.RunningApplicationService r1 = com.arlosoft.macrodroid.triggers.services.RunningApplicationService.this
                boolean r1 = r1.f14530a
                if (r1 == 0) goto L_0x012f
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.clear()
                r2 = 2000(0x7d0, double:9.88E-321)
                java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0017 }
            L_0x0017:
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                com.arlosoft.macrodroid.triggers.services.RunningApplicationService r3 = com.arlosoft.macrodroid.triggers.services.RunningApplicationService.this
                android.app.ActivityManager r3 = r3.f14531c
                java.util.List r3 = r3.getRunningAppProcesses()
                java.util.Iterator r3 = r3.iterator()
            L_0x002a:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0046
                java.lang.Object r4 = r3.next()
                android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
                int r5 = r4.importance
                r6 = 100
                if (r5 != r6) goto L_0x002a
                java.lang.String[] r4 = r4.pkgList
                java.util.List r4 = java.util.Arrays.asList(r4)
                r2.addAll(r4)
                goto L_0x002a
            L_0x0046:
                r3 = 0
                java.lang.String[] r4 = new java.lang.String[r3]
                r2.toArray(r4)
                if (r0 == 0) goto L_0x0123
                java.lang.String r2 = r12.f14533a
                if (r2 == 0) goto L_0x0123
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0123
                com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                java.util.List r2 = r2.mo29679I()
                java.util.Iterator r2 = r2.iterator()
            L_0x0064:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0123
                java.lang.Object r4 = r2.next()
                com.arlosoft.macrodroid.macro.Macro r4 = (com.arlosoft.macrodroid.macro.Macro) r4
                java.util.ArrayList r5 = r4.getTriggerListWithAwaitingActions()
                java.util.Iterator r5 = r5.iterator()
            L_0x0078:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0064
                java.lang.Object r6 = r5.next()
                com.arlosoft.macrodroid.triggers.Trigger r6 = (com.arlosoft.macrodroid.triggers.Trigger) r6
                boolean r7 = r6 instanceof com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger
                if (r7 == 0) goto L_0x0078
                r7 = r6
                com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger r7 = (com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger) r7
                java.util.ArrayList r8 = r7.mo30924H3()
                java.util.Iterator r8 = r8.iterator()
            L_0x0093:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00e2
                java.lang.Object r9 = r8.next()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r10 = r12.f14533a
                boolean r10 = r9.equals(r10)
                if (r10 == 0) goto L_0x00ad
                boolean r10 = r7.mo30922F3()
                if (r10 != 0) goto L_0x00c3
            L_0x00ad:
                java.lang.String r10 = "com.android.camera"
                boolean r10 = r9.equals(r10)
                if (r10 == 0) goto L_0x0093
                java.lang.String r10 = r12.f14533a
                com.arlosoft.macrodroid.triggers.services.RunningApplicationService r11 = com.arlosoft.macrodroid.triggers.services.RunningApplicationService.this
                java.lang.String r11 = r11.f14532d
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x0093
            L_0x00c3:
                boolean r8 = r6.mo31374R2()
                if (r8 == 0) goto L_0x00e2
                r4.setTriggerThatInvoked(r6)
                com.arlosoft.macrodroid.triggers.services.RunningApplicationService r8 = com.arlosoft.macrodroid.triggers.services.RunningApplicationService.this
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = r8.m24198e(r6, r9)
                r4.setTriggerContextInfo(r8)
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = r4.getTriggerContextInfo()
                boolean r8 = r4.canInvoke(r8)
                if (r8 == 0) goto L_0x00e2
                r1.add(r4)
            L_0x00e2:
                java.util.ArrayList r8 = r7.mo30924H3()
                java.util.Iterator r8 = r8.iterator()
            L_0x00ea:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0078
                java.lang.Object r9 = r8.next()
                java.lang.String r9 = (java.lang.String) r9
                boolean r10 = r9.equals(r0)
                if (r10 == 0) goto L_0x00ea
                boolean r10 = r7.mo30922F3()
                if (r10 != 0) goto L_0x00ea
                boolean r7 = r6.mo31374R2()
                if (r7 == 0) goto L_0x0078
                r4.setTriggerThatInvoked(r6)
                com.arlosoft.macrodroid.triggers.services.RunningApplicationService r7 = com.arlosoft.macrodroid.triggers.services.RunningApplicationService.this
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r7.m24198e(r6, r9)
                r4.setTriggerContextInfo(r6)
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r4.getTriggerContextInfo()
                boolean r6 = r4.canInvoke(r6)
                if (r6 == 0) goto L_0x0078
                r1.add(r4)
                goto L_0x0078
            L_0x0123:
                java.lang.String r0 = r12.f14533a
                r2 = 1
                java.util.List[] r2 = new java.util.List[r2]
                r2[r3] = r1
                r12.publishProgress(r2)
                goto L_0x0002
            L_0x012f:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.RunningApplicationService.C6113b.doInBackground(java.lang.Void[]):java.lang.Void");
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
    public TriggerContextInfo m24198e(Trigger trigger, String str) {
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
    private void m24199f(C6113b bVar) {
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[]) null);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f14530a = true;
        this.f14531c = (ActivityManager) getSystemService("activity");
        C6113b bVar = new C6113b();
        PackageManager packageManager = getPackageManager();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f14532d = "camera";
        ComponentName resolveActivity = intent.resolveActivity(packageManager);
        if (resolveActivity != null) {
            this.f14532d = resolveActivity.getPackageName();
        }
        m24199f(bVar);
    }

    public void onDestroy() {
        this.f14530a = false;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
