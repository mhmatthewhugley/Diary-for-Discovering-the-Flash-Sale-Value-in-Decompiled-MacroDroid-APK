package com.arlosoft.macrodroid.action.services;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.arlosoft.macrodroid.action.services.UploadService;
import com.arlosoft.macrodroid.settings.C5163j2;
import p098h0.C7359c;
import p110j0.C7430a;
import p134n0.C7960a;

public class UploadMessageService extends UploadService {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo26791g() {
        return "preferences:tweet_notify_failure";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo26792h() {
        return "preferences:tweet_notify_success";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo26793i() {
        return "preferences:tweet_retry_period";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C7960a.C7963c mo26794o(Context context, UploadService.C3444d dVar) {
        return C7960a.m33247j(context, (String) dVar.f9166a);
    }

    public void onCreate() {
        super.onCreate();
        this.f9145c = "message";
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        String string = intent.getExtras().getString("UploadSite");
        String string2 = intent.getExtras().getString("Message");
        String string3 = intent.getExtras().getString("EmailAddress");
        if (string2 != null) {
            UploadService.C3444d dVar = new UploadService.C3444d(string2, string, string3);
            synchronized (UploadService.f9143z) {
                this.f9147f.add(dVar);
            }
            if (this.f9147f.size() == 1) {
                mo26819k(0);
            }
        } else {
            Log.w("UploadMessageService", "Message is null");
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo26797q(Context context, UploadService.C3444d dVar, String str) throws Exception {
        C7430a aVar = new C7430a(str, C5163j2.m20061T(context));
        UploadService.C3444d dVar2 = this.f9144a;
        aVar.mo37546c("Sharing Message", (String) dVar2.f9166a, str, dVar2.f9169d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26798s(Context context, UploadService.C3444d dVar, String str, String str2) throws Exception {
        C7359c cVar = new C7359c();
        UploadService.C3444d dVar2 = this.f9144a;
        cVar.mo37334b(context, "Sharing Message", (String) dVar2.f9166a, str, str2, dVar2.f9169d);
    }
}
