package com.arlosoft.macrodroid.action.activities;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6362a0;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import p148q0.C8151a;
import p319lc.C15626c;

public class CalibrateTouchDeviceActivity extends MacroDroidDialogBaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f7754f;

    /* renamed from: g */
    private C2819b f7755g;

    /* renamed from: com.arlosoft.macrodroid.action.activities.CalibrateTouchDeviceActivity$b */
    private class C2819b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private String f7756a;

        private C2819b() {
            this.f7756a = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            File[] l = C6362a0.m24606l(new File("/dev/input"));
            if (l == null) {
                C8151a.m33873n(new RuntimeException("/dev/input is not a valid directory"));
                C15626c.m94876a(CalibrateTouchDeviceActivity.this.getApplicationContext(), "/dev/input is not a valid directory", 0).show();
                return null;
            }
            C2820c[] cVarArr = new C2820c[l.length];
            C4878b.m18879r("++ Calibrating touch screen");
            for (int i = 0; i < l.length; i++) {
                C4878b.m18879r("Testing: " + l[i].getAbsolutePath());
                cVarArr[i] = new C2820c(l[i].getAbsolutePath());
                cVarArr[i].start();
            }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException unused) {
            }
            for (int i2 = 0; i2 < l.length; i2++) {
                cVarArr[i2].mo26163a();
                if (cVarArr[i2].mo26164b()) {
                    this.f7756a = l[i2].getAbsolutePath();
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            if (isCancelled()) {
                return;
            }
            if (this.f7756a != null) {
                C15626c.makeText(CalibrateTouchDeviceActivity.this.getApplicationContext(), C17541R$string.calibration_complete, 1).show();
                C5163j2.m20125b6(CalibrateTouchDeviceActivity.this, this.f7756a);
                CalibrateTouchDeviceActivity.this.setResult(-1, new Intent());
                CalibrateTouchDeviceActivity.this.finish();
                return;
            }
            CalibrateTouchDeviceActivity.this.f7754f.setText(C17541R$string.calibration_failed);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.CalibrateTouchDeviceActivity$c */
    private class C2820c extends Thread {

        /* renamed from: a */
        private final String f7758a;

        /* renamed from: c */
        private boolean f7759c;

        /* renamed from: d */
        private boolean f7760d;

        /* renamed from: f */
        private DataOutputStream f7761f;

        /* renamed from: a */
        public void mo26163a() {
            this.f7760d = false;
            try {
                DataOutputStream dataOutputStream = this.f7761f;
                if (dataOutputStream != null) {
                    dataOutputStream.writeBytes("" + 3);
                    this.f7761f.flush();
                    this.f7761f.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public boolean mo26164b() {
            return this.f7759c;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00dd */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r1 = "su"
                java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ Exception -> 0x00e1 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x00e1 }
                r1 = 1
                java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r1)     // Catch:{ Exception -> 0x00e1 }
                java.lang.Process r0 = r0.start()     // Catch:{ Exception -> 0x00e1 }
                java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00e1 }
                java.io.OutputStream r3 = r0.getOutputStream()     // Catch:{ Exception -> 0x00e1 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00e1 }
                r9.f7761f = r2     // Catch:{ Exception -> 0x00e1 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
                r2.<init>()     // Catch:{ Exception -> 0x00e1 }
                com.arlosoft.macrodroid.action.activities.CalibrateTouchDeviceActivity r3 = com.arlosoft.macrodroid.action.activities.CalibrateTouchDeviceActivity.this     // Catch:{ Exception -> 0x00e1 }
                android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r3 = r3.dataDir     // Catch:{ Exception -> 0x00e1 }
                r2.append(r3)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r3 = "/socat EXEC:\"getevent "
                r2.append(r3)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r3 = r9.f7758a     // Catch:{ Exception -> 0x00e1 }
                r2.append(r3)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r3 = "\",pty,ctty stdio\n"
                r2.append(r3)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00e1 }
                java.io.DataOutputStream r3 = r9.f7761f     // Catch:{ Exception -> 0x00e1 }
                r3.writeBytes(r2)     // Catch:{ Exception -> 0x00e1 }
                java.io.DataOutputStream r2 = r9.f7761f     // Catch:{ Exception -> 0x00e1 }
                r2.flush()     // Catch:{ Exception -> 0x00e1 }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x00e1 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00e1 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x00e1 }
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00e1 }
                r0.<init>(r2)     // Catch:{ Exception -> 0x00e1 }
                r3 = 0
                r4 = 0
            L_0x005c:
                boolean r5 = r9.f7760d     // Catch:{ IOException -> 0x00dd }
                if (r5 == 0) goto L_0x00dd
                java.lang.String r5 = r0.readLine()     // Catch:{ IOException -> 0x00dd }
                if (r5 == 0) goto L_0x007c
                java.lang.String r6 = "LINE"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00dd }
                r7.<init>()     // Catch:{ IOException -> 0x00dd }
                java.lang.String r8 = ">>> "
                r7.append(r8)     // Catch:{ IOException -> 0x00dd }
                r7.append(r5)     // Catch:{ IOException -> 0x00dd }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00dd }
                android.util.Log.w(r6, r7)     // Catch:{ IOException -> 0x00dd }
            L_0x007c:
                if (r5 == 0) goto L_0x005c
                int r6 = r5.length()     // Catch:{ IOException -> 0x00dd }
                r7 = 5
                if (r6 <= r7) goto L_0x005c
                java.lang.String r6 = "WARNING"
                boolean r6 = r5.startsWith(r6)     // Catch:{ IOException -> 0x00dd }
                if (r6 != 0) goto L_0x005c
                java.lang.String r6 = "not found"
                boolean r6 = r5.contains(r6)     // Catch:{ IOException -> 0x00dd }
                if (r6 != 0) goto L_0x005c
                if (r3 != 0) goto L_0x00b6
                java.lang.String r6 = " 0035 "
                boolean r6 = r5.contains(r6)     // Catch:{ IOException -> 0x00dd }
                if (r6 == 0) goto L_0x00b6
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00dd }
                r3.<init>()     // Catch:{ IOException -> 0x00dd }
                java.lang.String r6 = "Seen 0035: "
                r3.append(r6)     // Catch:{ IOException -> 0x00dd }
                java.lang.String r6 = r9.f7758a     // Catch:{ IOException -> 0x00dd }
                r3.append(r6)     // Catch:{ IOException -> 0x00dd }
                java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00dd }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r3)     // Catch:{ IOException -> 0x00dd }
                r3 = 1
            L_0x00b6:
                if (r4 != 0) goto L_0x00d7
                java.lang.String r6 = " 0036 "
                boolean r5 = r5.contains(r6)     // Catch:{ IOException -> 0x00dd }
                if (r5 == 0) goto L_0x00d7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00dd }
                r4.<init>()     // Catch:{ IOException -> 0x00dd }
                java.lang.String r5 = "Seen 0036: "
                r4.append(r5)     // Catch:{ IOException -> 0x00dd }
                java.lang.String r5 = r9.f7758a     // Catch:{ IOException -> 0x00dd }
                r4.append(r5)     // Catch:{ IOException -> 0x00dd }
                java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00dd }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r4)     // Catch:{ IOException -> 0x00dd }
                r4 = 1
            L_0x00d7:
                if (r3 == 0) goto L_0x005c
                if (r4 == 0) goto L_0x005c
                r9.f7759c = r1     // Catch:{ IOException -> 0x00dd }
            L_0x00dd:
                r2.close()     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00ff
            L_0x00e1:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Exception while reading input touches: "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                p148q0.C8151a.m33873n(r1)
            L_0x00ff:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.activities.CalibrateTouchDeviceActivity.C2820c.run():void");
        }

        private C2820c(String str) {
            this.f7758a = str;
            this.f7760d = true;
        }
    }

    public void onCancelClick(View view) {
        this.f7755g.cancel(true);
        setResult(0, new Intent());
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(C17541R$string.action_launch_and_press_calibrating_touch_screen);
        setContentView((int) C17535R$layout.calibrate_touch_device);
        getWindow().setLayout(-1, -2);
        TextView textView = (TextView) findViewById(C17532R$id.calibrate_touch_device_instruction_text);
        this.f7754f = textView;
        textView.setText(C17541R$string.needs_calibration_info);
        C2819b bVar = new C2819b();
        this.f7755g = bVar;
        bVar.execute((Object[]) null);
    }
}
