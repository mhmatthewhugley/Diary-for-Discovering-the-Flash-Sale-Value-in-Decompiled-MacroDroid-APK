package com.arlosoft.macrodroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.triggers.receivers.ShortcutTriggerReceiver;
import java.util.LinkedHashMap;
import java.util.Map;
import p148q0.C8151a;

/* compiled from: ShortcutDispatchActivity.kt */
public final class ShortcutDispatchActivity extends NonAppActivity {

    /* renamed from: o */
    public Map<Integer, View> f7101o = new LinkedHashMap();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8151a.m33860a("ShortcutDispatchActivity");
        String stringExtra = getIntent().getStringExtra("com.arlosoft.macrodroid.MACRO_NAME");
        long longExtra = getIntent().getLongExtra("guid", 0);
        Intent intent = new Intent(this, ShortcutTriggerReceiver.class);
        intent.putExtra("com.arlosoft.macrodroid.MACRO_NAME", stringExtra);
        intent.putExtra("guid", longExtra);
        sendBroadcast(intent);
        finish();
    }
}
