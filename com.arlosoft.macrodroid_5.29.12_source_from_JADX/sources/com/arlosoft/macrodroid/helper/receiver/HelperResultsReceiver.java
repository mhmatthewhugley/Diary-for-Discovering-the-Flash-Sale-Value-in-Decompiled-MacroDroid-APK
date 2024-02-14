package com.arlosoft.macrodroid.helper.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import kotlin.jvm.internal.C13706o;
import p177v1.C10317b;
import p182w1.C10329b;

/* compiled from: HelperResultsReceiver.kt */
public final class HelperResultsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public C10317b f11896a;

    public HelperResultsReceiver() {
        MacroDroidApplication.f9883I.mo27302a().mo38304i(this);
    }

    /* renamed from: a */
    public final C10317b mo29242a() {
        C10317b bVar = this.f11896a;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("helperResultHandler");
        return null;
    }

    /* renamed from: b */
    public final void mo29243b(Intent intent) {
        C13706o.m87929f(intent, "intent");
        String stringExtra = intent.getStringExtra("shell_result");
        if (stringExtra == null) {
            stringExtra = "";
        }
        int intExtra = intent.getIntExtra("request_id", -1);
        boolean booleanExtra = intent.getBooleanExtra("did_timeout", false);
        C4878b.m18879r("Received return id=" + intExtra + " from helper file for shell command: " + stringExtra);
        mo29242a().mo40939b(new C10329b(intExtra, stringExtra, booleanExtra));
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        if (C13706o.m87924a(intent.getStringExtra("result_type"), "result_type_shell")) {
            mo29243b(intent);
            return;
        }
        C4878b.m18868g("==== RECEIVED return: " + intent.getAction());
    }
}
