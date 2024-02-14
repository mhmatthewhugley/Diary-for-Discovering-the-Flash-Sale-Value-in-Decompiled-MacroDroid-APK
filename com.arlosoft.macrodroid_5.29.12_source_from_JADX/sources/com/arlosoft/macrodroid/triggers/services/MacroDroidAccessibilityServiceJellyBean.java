package com.arlosoft.macrodroid.triggers.services;

import android.content.Intent;
import android.os.Bundle;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;

public class MacroDroidAccessibilityServiceJellyBean extends MacroDroidAccessibilityService {
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        Bundle extras = intent.getExtras();
        int i3 = extras != null ? extras.getInt("GlobalControlType", -1) : -1;
        if (i3 == -1) {
            return 2;
        }
        try {
            performGlobalAction(i3);
            return 2;
        } catch (Exception e) {
            C4878b.m18868g("Failed to send global command: " + e.toString());
            return 2;
        }
    }
}
