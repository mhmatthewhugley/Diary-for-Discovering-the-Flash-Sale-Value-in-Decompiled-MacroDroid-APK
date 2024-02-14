package com.arlosoft.macrodroid.macro;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import p148q0.C8151a;
import p149q1.C8157f;
import p455ag.C17105a;

public class ContinuePausedActionsHandler extends BroadcastReceiver {

    /* renamed from: a */
    private static final Map<Long, List<Intent>> f12352a = new HashMap();

    /* renamed from: b */
    private static int f12353b = 920875;

    /* renamed from: c */
    private static int f12354c = 0;

    /* renamed from: d */
    private static final HashMap<Long, TriggerContextInfo> f12355d = new HashMap<>();

    /* renamed from: b */
    public static void m18973b(Context context, Macro macro) {
        List<Intent> list = f12352a.get(Long.valueOf(macro.getGUID()));
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (list != null) {
            for (Intent intent : list) {
                PendingIntent broadcast = PendingIntent.getBroadcast(context.getApplicationContext(), intent.getIntExtra("id", -1), intent, 134217728 | C6368b1.f14959b);
                if (broadcast != null) {
                    broadcast.cancel();
                    alarmManager.cancel(broadcast);
                    C4878b.m18880s("Cancelled alarm id: " + intent.getIntExtra("id", -1) + " for " + macro.getName(), macro.getGUID());
                }
            }
            list.clear();
            f12352a.put(Long.valueOf(macro.getGUID()), list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m18974c(Macro macro, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo, PowerManager.WakeLock wakeLock) {
        try {
            macro.invokeActions(macro.getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        } finally {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        }
    }

    /* renamed from: d */
    public static synchronized int m18975d(Macro macro, Context context, int i, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, TriggerContextInfo triggerContextInfo, int i2, boolean z, boolean z2) {
        int i3;
        synchronized (ContinuePausedActionsHandler.class) {
            f12353b++;
            if (i2 / 1000 < 5) {
                m18976e(macro, context, i, stack, resumeMacroInfo, triggerContextInfo, i2, z);
                int i4 = f12353b;
                return i4;
            }
            C4878b.m18880s("Scheduling macro (" + f12353b + "): " + macro.getName() + " to resume in: " + i2 + "ms action index: " + i, macro.getGUID());
            Calendar instance = Calendar.getInstance();
            instance.add(14, i2);
            Intent intent = new Intent(context, ContinuePausedActionsHandler.class);
            intent.setAction(Long.toString(System.currentTimeMillis()));
            intent.putExtra("id", f12353b);
            int i5 = f12354c + 1;
            f12354c = i5;
            intent.putExtra("intent_number", i5);
            intent.putExtra("guid", macro.getGUID());
            intent.putExtra("NextActionIndex", i);
            intent.putExtra("SkipEndifIndex", stack);
            intent.putExtra("force_not_enabled", z);
            intent.putExtra("resume_macro_info", resumeMacroInfo);
            if (!Build.MANUFACTURER.toLowerCase().equals("huawei") || !((i3 = Build.VERSION.SDK_INT) == 21 || i3 == 22)) {
                intent.putExtra("TriggerContextInfo", triggerContextInfo);
            } else {
                f12355d.put(Long.valueOf(macro.getGUID()), triggerContextInfo);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context.getApplicationContext(), f12353b, intent, 134217728 | C6368b1.f14959b);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            int i6 = Build.VERSION.SDK_INT;
            if (z2) {
                alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(instance.getTimeInMillis(), broadcast), broadcast);
            } else if (i6 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, instance.getTimeInMillis(), broadcast);
            } else {
                alarmManager.setExact(0, instance.getTimeInMillis(), broadcast);
            }
            Map<Long, List<Intent>> map = f12352a;
            List list = map.get(Long.valueOf(macro.getGUID()));
            if (list == null) {
                list = new ArrayList();
            }
            list.add(intent);
            C17105a.m100579a("New intent number " + f12354c + " Macro: " + macro.getName() + " has " + list.size() + " waiting intents", new Object[0]);
            C4878b.m18879r("Intent details at creation");
            StringBuilder sb = new StringBuilder();
            sb.append("ID = ");
            sb.append(intent.getIntExtra("id", -1));
            C4878b.m18879r(sb.toString());
            C4878b.m18879r("GUID = " + intent.getLongExtra("guid", -1));
            C4878b.m18879r("Next Action = " + intent.getIntExtra("NextActionIndex", -1));
            map.put(Long.valueOf(macro.getGUID()), list);
            int i7 = f12353b;
            return i7;
        }
    }

    /* renamed from: e */
    private static void m18976e(Macro macro, Context context, int i, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, TriggerContextInfo triggerContextInfo, int i2, boolean z) {
        int i3 = i2;
        Context context2 = context;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "macrodroid:waitForTime");
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire((long) (i3 + 500));
        new Handler(Looper.getMainLooper()).postDelayed(new C4916b(macro, i, triggerContextInfo, z, stack, resumeMacroInfo, newWakeLock), (long) i3);
    }

    public void onReceive(Context context, Intent intent) {
        Macro macro;
        TriggerContextInfo triggerContextInfo;
        Stack<Integer> stack;
        int i;
        Intent intent2 = intent;
        long j = 0;
        long longExtra = intent2.getLongExtra("guid", 0);
        int intExtra = intent2.getIntExtra("id", -1);
        int intExtra2 = intent2.getIntExtra("NextActionIndex", -1);
        Macro macro2 = (Macro) intent2.getParcelableExtra(C8157f.ITEM_TYPE);
        if (macro2 == null && longExtra == 0) {
            C8151a.m33873n(new RuntimeException("ContinuePausedActionsReceiver - no id value: " + intExtra));
            C4878b.m18882u("Failed to resume macro after wait before next, id was -1");
            return;
        }
        if (macro2 != null) {
            macro = macro2;
        } else {
            macro = C4934n.m18998M().mo29682Q(longExtra);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Waking up intent to resume macro. ID = ");
        sb.append(intExtra);
        sb.append(", GUID = ");
        sb.append(longExtra);
        sb.append(", hasMacro = ");
        sb.append(macro2 != null);
        sb.append(", nextActionIndex = ");
        sb.append(intExtra2);
        String sb2 = sb.toString();
        if (macro != null) {
            j = macro.getGUID();
        }
        C4878b.m18880s(sb2, j);
        if (!Build.MANUFACTURER.toLowerCase().equals("huawei") || !((i = Build.VERSION.SDK_INT) == 21 || i == 22)) {
            triggerContextInfo = (TriggerContextInfo) intent2.getParcelableExtra("TriggerContextInfo");
        } else {
            triggerContextInfo = f12355d.remove(Long.valueOf(longExtra));
        }
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        if (intent2.hasExtra("SkipEndifIndex")) {
            try {
                stack = C4061t1.m16017s((ArrayList) intent2.getSerializableExtra("SkipEndifIndex"));
            } catch (Exception unused) {
                stack = new Stack<>();
            }
        } else {
            stack = new Stack<>();
        }
        ResumeMacroInfo resumeMacroInfo = (ResumeMacroInfo) intent2.getParcelableExtra("resume_macro_info");
        int intExtra3 = intent2.getIntExtra("intent_number", -1);
        boolean booleanExtra = intent2.getBooleanExtra("force_not_enabled", false);
        if (macro == null || intExtra2 < 0) {
            C8151a.m33873n(new RuntimeException("ContinuePausedActionsReceiver - macro = " + macro + " nextActionIndex = " + intExtra2 + " guid = " + longExtra));
            C4878b.m18882u("Failed to resume macro after wait before next, macro was null");
            return;
        }
        C17105a.m100579a("Invoking next actions for: " + macro.getName() + ". Intent number = " + intExtra3, new Object[0]);
        ArrayList arrayList = new ArrayList(macro.getActions());
        Stack stack2 = new Stack();
        stack2.addAll(stack);
        macro.invokeActions(arrayList, intExtra2, triggerContextInfo2, booleanExtra, stack2, resumeMacroInfo);
        List list = f12352a.get(Long.valueOf(macro.getGUID()));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Intent intent3 = (Intent) it.next();
                if (intent3 != null && intent3.getIntExtra("intent_number", -1) == intExtra3) {
                    it.remove();
                    C17105a.m100579a("Removed waiting intent for " + macro.getName() + " intent number = " + intExtra3, new Object[0]);
                }
            }
            C17105a.m100579a("Number of waiting intents for " + macro.getName() + " = " + list.size(), new Object[0]);
        }
    }
}
