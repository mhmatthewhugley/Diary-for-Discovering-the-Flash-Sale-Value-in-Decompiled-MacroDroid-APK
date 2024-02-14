package com.arlosoft.macrodroid.action.activities;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.triggers.services.NotificationService;

public class AcceptCallActivity extends NonAppActivity {

    /* renamed from: o */
    private KeyguardManager f7750o;

    /* renamed from: p */
    private AudioManager f7751p;

    /* renamed from: s */
    private C2817b f7752s;

    /* renamed from: com.arlosoft.macrodroid.action.activities.AcceptCallActivity$b */
    private class C2817b extends BroadcastReceiver {
        private C2817b() {
        }

        public void onReceive(Context context, Intent intent) {
            AcceptCallActivity.this.finish();
        }
    }

    /* renamed from: L1 */
    private void m13898L1() {
        boolean z = "HTC".equalsIgnoreCase(Build.MANUFACTURER) && !this.f7751p.isWiredHeadsetOn();
        if (z) {
            m13899M1(false);
        }
        try {
            mo26156O1();
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("input keyevent " + Integer.toString(79));
        } catch (Exception unused) {
            Intent putExtra = new Intent("android.intent.action.MEDIA_BUTTON").putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, 79));
            Intent putExtra2 = new Intent("android.intent.action.MEDIA_BUTTON").putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(1, 79));
            sendOrderedBroadcast(putExtra, "android.permission.CALL_PRIVILEGED");
            sendOrderedBroadcast(putExtra2, "android.permission.CALL_PRIVILEGED");
        } catch (Throwable th) {
            if (z) {
                m13899M1(false);
            }
            throw th;
        }
        if (z) {
            m13899M1(false);
        }
    }

    /* renamed from: M1 */
    private void m13899M1(boolean z) {
        Intent intent = new Intent("android.intent.action.HEADSET_PLUG");
        intent.addFlags(BasicMeasure.EXACTLY);
        intent.putExtra("state", z ? 1 : 0);
        intent.putExtra("name", "mysms");
        try {
            sendOrderedBroadcast(intent, (String) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: N1 */
    private void m13900N1() {
        this.f7752s = new C2817b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(this.f7752s, intentFilter);
    }

    /* renamed from: P1 */
    private void m13901P1() {
        if (this.f7750o.inKeyguardRestrictedInputMode()) {
            getWindow().addFlags(6815744);
        } else {
            getWindow().clearFlags(4718720);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void mo26156O1() {
        try {
            for (MediaController next : ((MediaSessionManager) getApplicationContext().getSystemService("media_session")).getActiveSessions(new ComponentName(getApplicationContext(), NotificationService.class))) {
                if ("com.android.server.telecom".equals(next.getPackageName())) {
                    next.dispatchMediaButtonEvent(new KeyEvent(1, 79));
                    return;
                }
            }
        } catch (SecurityException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7750o = (KeyguardManager) getSystemService("keyguard");
        this.f7751p = (AudioManager) getSystemService("audio");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C2817b bVar = this.f7752s;
        if (bVar != null) {
            unregisterReceiver(bVar);
            this.f7752s = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m13900N1();
        m13901P1();
        m13898L1();
    }
}
