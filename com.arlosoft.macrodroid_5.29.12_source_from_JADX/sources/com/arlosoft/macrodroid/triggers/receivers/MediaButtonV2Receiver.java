package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import kotlin.jvm.internal.C13706o;
import p455ag.C17105a;

/* compiled from: MediaButtonV2Receiver.kt */
public final class MediaButtonV2Receiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        C17105a.m100581c("************** MediaButtonV2Receiver", new Object[0]);
        if (C13706o.m87924a("android.intent.action.MEDIA_BUTTON", intent.getAction()) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
            keyEvent.getKeyCode();
        }
    }
}
