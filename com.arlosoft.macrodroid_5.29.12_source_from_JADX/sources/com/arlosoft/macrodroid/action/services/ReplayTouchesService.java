package com.arlosoft.macrodroid.action.services;

import android.app.IntentService;
import android.content.Intent;
import android.view.WindowManager;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6363a1;
import java.io.DataOutputStream;
import java.util.ArrayList;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.p353io.IOUtils;
import p148q0.C8151a;

public class ReplayTouchesService extends IntentService {

    /* renamed from: a */
    private C3447a f9118a;

    /* renamed from: c */
    private WindowManager f9119c;

    /* renamed from: com.arlosoft.macrodroid.action.services.ReplayTouchesService$b */
    private static class C3434b {

        /* renamed from: a */
        long f9120a;

        /* renamed from: b */
        int f9121b;

        /* renamed from: c */
        int f9122c;

        /* renamed from: d */
        int f9123d;

        private C3434b() {
        }
    }

    public ReplayTouchesService() {
        super("ReplayTouchesService");
    }

    public void onCreate() {
        super.onCreate();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, C6363a1.m24607a(), 24, -3);
        this.f9119c = (WindowManager) getSystemService("window");
        C3447a aVar = new C3447a(this, "Replaying Touch Events", C17530R$drawable.play_translucent);
        this.f9118a = aVar;
        this.f9119c.addView(aVar, layoutParams);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f9119c.removeView(this.f9118a);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        DataOutputStream dataOutputStream;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException unused) {
        }
        String l2 = C5163j2.m20201l2(this);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("events");
        C3433a aVar = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(Runtime.getRuntime().exec(new String[]{"su", "-c", "system/bin/sh"}).getOutputStream());
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str = "sendevent " + l2 + " ";
                ArrayList<C3434b> arrayList = new ArrayList<>();
                long j = 0;
                for (String split : stringArrayListExtra) {
                    String[] split2 = split.split(" ");
                    if (split2.length == 4) {
                        C3434b bVar = new C3434b();
                        long doubleValue = (long) (Double.valueOf(split2[0].replace(HelpFormatter.DEFAULT_OPT_PREFIX, ".").replace(":", "")).doubleValue() * 1000.0d);
                        bVar.f9120a = doubleValue;
                        if (j == 0) {
                            j = doubleValue;
                        }
                        try {
                            bVar.f9121b = Integer.parseInt(split2[1], 16);
                            bVar.f9122c = Integer.parseInt(split2[2], 16);
                            try {
                                bVar.f9123d = Integer.parseInt(split2[3], 16);
                            } catch (NumberFormatException unused2) {
                                bVar.f9123d = Integer.MIN_VALUE;
                            }
                            arrayList.add(bVar);
                        } catch (NumberFormatException unused3) {
                        }
                        aVar = null;
                    }
                }
                for (C3434b bVar2 : arrayList) {
                    for (long currentTimeMillis2 = System.currentTimeMillis(); currentTimeMillis2 < (bVar2.f9120a - j) + currentTimeMillis; currentTimeMillis2 = System.currentTimeMillis()) {
                    }
                    dataOutputStream2.writeBytes(str + bVar2.f9121b + " " + bVar2.f9122c + " " + bVar2.f9123d + IOUtils.LINE_SEPARATOR_UNIX);
                }
            } catch (Exception e) {
                e = e;
                dataOutputStream = dataOutputStream2;
                try {
                    C8151a.m33873n(new RuntimeException("ERROR REPLAYING TOUCH EVENTS: " + e.toString()));
                    dataOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        dataOutputStream.close();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                dataOutputStream.close();
                throw th;
            }
            try {
                dataOutputStream2.close();
            } catch (Exception unused5) {
            }
        } catch (Exception e2) {
            e = e2;
            dataOutputStream = null;
            C8151a.m33873n(new RuntimeException("ERROR REPLAYING TOUCH EVENTS: " + e.toString()));
            dataOutputStream.close();
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
            dataOutputStream.close();
            throw th;
        }
    }
}
