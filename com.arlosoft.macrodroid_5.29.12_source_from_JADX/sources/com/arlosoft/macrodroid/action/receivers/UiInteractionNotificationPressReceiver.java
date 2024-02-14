package com.arlosoft.macrodroid.action.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6457x1;
import p101h3.C7375a;
import p149q1.C8157f;

public class UiInteractionNotificationPressReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Macro macro = (Macro) intent.getParcelableExtra(C8157f.ITEM_TYPE);
        Action action = (Action) intent.getParcelableExtra("current_action");
        C6457x1.m24786b(context, 0);
        C7375a.m30478a(context, context.getString(C17541R$string.ui_interaction_identify_touch_ui_control), -1, C17530R$drawable.launcher_no_border, ContextCompat.getColor(context, C17528R$color.actions_primary_dark), 1, true, true);
        UIInteractionAccessibilityService.f9127g.mo26809a();
    }
}
