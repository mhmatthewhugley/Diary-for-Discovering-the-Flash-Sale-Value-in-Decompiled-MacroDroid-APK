package com.arlosoft.macrodroid.action.services;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.WindowManager;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.action.LaunchAndPressAction;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6363a1;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import p148q0.C8151a;
import p149q1.C8157f;

public class RecordInputService extends IntentService {

    /* renamed from: a */
    private C3447a f9109a;

    /* renamed from: c */
    private WindowManager f9110c;

    /* renamed from: d */
    private C3432b f9111d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f9112f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public DataOutputStream f9113g;

    /* renamed from: o */
    private int f9114o;

    /* renamed from: p */
    private LaunchAndPressAction f9115p;

    /* renamed from: s */
    private Macro f9116s;

    /* renamed from: com.arlosoft.macrodroid.action.services.RecordInputService$b */
    private class C3432b extends BroadcastReceiver {
        private C3432b() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                boolean unused = RecordInputService.this.f9112f = false;
                if (RecordInputService.this.f9113g != null) {
                    DataOutputStream b = RecordInputService.this.f9113g;
                    b.writeBytes("" + 3);
                    RecordInputService.this.f9113g.flush();
                    RecordInputService.this.f9113g.close();
                }
            } catch (IOException unused2) {
            }
        }
    }

    public RecordInputService() {
        super("RecordInputService");
        setIntentRedelivery(true);
    }

    public void onCreate() {
        super.onCreate();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, C6363a1.m24607a(), 24, -3);
        this.f9110c = (WindowManager) getSystemService("window");
        C3447a aVar = new C3447a(this, "Recording Touch Events", C17530R$drawable.record_translucent);
        this.f9109a = aVar;
        try {
            this.f9110c.addView(aVar, layoutParams);
        } catch (Exception unused) {
        }
        this.f9111d = new C3432b();
        MacroDroidApplication.m14845u().registerReceiver(this.f9111d, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    public void onDestroy() {
        Intent intent;
        Class<EditMacroActivity> cls = EditMacroActivity.class;
        super.onDestroy();
        MacroDroidApplication.m14845u().unregisterReceiver(this.f9111d);
        try {
            this.f9110c.removeView(this.f9109a);
        } catch (Exception unused) {
        }
        int i = this.f9114o;
        if (i != 0) {
            if (i == 1) {
                intent = new Intent(this, cls);
                intent.addFlags(67108864);
                this.f9116s.addAction(this.f9115p);
            } else {
                intent = new Intent(this, cls);
                intent.putExtra("MacroId", this.f9116s.getId());
            }
            C4934n.m18998M().mo29695o0(this.f9116s);
        } else {
            this.f9116s.addAction(this.f9115p);
            intent = new Intent(this, WizardActivity.class);
            intent.putExtra(C8157f.ITEM_TYPE, this.f9116s);
        }
        intent.addFlags(335544320);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String readLine;
        String l2 = C5163j2.m20201l2(this);
        ArrayList arrayList = new ArrayList();
        this.f9115p = (LaunchAndPressAction) intent.getExtras().getParcelable("action");
        this.f9116s = (Macro) intent.getExtras().getParcelable(C8157f.ITEM_TYPE);
        this.f9114o = intent.getExtras().getInt("FromActivity", 0);
        try {
            Process start = new ProcessBuilder(new String[]{"su"}).redirectErrorStream(true).start();
            this.f9113g = new DataOutputStream(start.getOutputStream());
            this.f9113g.writeBytes(getApplicationInfo().dataDir + "/socat EXEC:\"getevent -t " + l2 + "\",pty,ctty stdio\n");
            this.f9113g.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            this.f9112f = true;
            do {
                if (this.f9112f && (readLine = bufferedReader.readLine()) != null) {
                    arrayList.add(readLine.replaceAll("(\\[|\\])", "").trim());
                }
            } while (this.f9112f);
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("RecordInputService: Exception while reading input touches: " + e.getMessage()));
        }
        this.f9115p.mo25292J3(arrayList);
    }
}
