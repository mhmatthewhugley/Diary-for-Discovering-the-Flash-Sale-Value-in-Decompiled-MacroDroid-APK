package p183w2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.StopwatchTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: w2.a */
/* compiled from: StopWatch */
public class C10330a {
    /* renamed from: a */
    public static void m40549a(@NonNull String str) {
        for (Macro triggerListWithAwaitingActions : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = triggerListWithAwaitingActions.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                if (next instanceof StopwatchTrigger) {
                    StopwatchTrigger stopwatchTrigger = (StopwatchTrigger) next;
                    if (str.equals(stopwatchTrigger.mo24430G())) {
                        stopwatchTrigger.mo31508q3();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m40550b(@NonNull String str) {
        for (Macro triggerListWithAwaitingActions : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = triggerListWithAwaitingActions.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                if (next instanceof StopwatchTrigger) {
                    StopwatchTrigger stopwatchTrigger = (StopwatchTrigger) next;
                    if (str.equals(stopwatchTrigger.mo24430G())) {
                        stopwatchTrigger.mo31506E3();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static String m40551c(long j) {
        long j2 = j / 1000;
        return String.format("%02d", new Object[]{Long.valueOf(j2 / 3600)}) + ":" + String.format("%02d", new Object[]{Long.valueOf((j2 / 60) % 60)}) + ":" + String.format("%02d", new Object[]{Long.valueOf(j2 % 60)});
    }

    /* renamed from: d */
    public static long m40552d(@NonNull Context context, @NonNull String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        long j = defaultSharedPreferences.getLong("stopwatch_start_" + str, 0);
        long j2 = defaultSharedPreferences.getLong("stopwatch_stop_" + str, 0);
        if (j == 0) {
            return 0;
        }
        return j2 == 0 ? System.currentTimeMillis() - j : j2 - j;
    }

    /* renamed from: e */
    public static List<String> m40553e(@NonNull Context context) {
        Set<String> stringSet = PreferenceManager.getDefaultSharedPreferences(context).getStringSet("stopwatches", new ArraySet());
        stringSet.remove((Object) null);
        ArrayList arrayList = new ArrayList(stringSet);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m40554f(@NonNull Context context, @NonNull String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        long j = defaultSharedPreferences.getLong("stopwatch_start_" + str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("stopwatch_stop_");
        sb.append(str);
        return j != 0 && defaultSharedPreferences.getLong(sb.toString(), 0) == 0;
    }

    /* renamed from: g */
    public static void m40555g(@NonNull Context context, @NonNull String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        long j = defaultSharedPreferences.getLong("stopwatch_start_" + str, 0);
        long j2 = defaultSharedPreferences.getLong("stopwatch_stop_" + str, 0);
        if (j != 0 && j2 == 0) {
            edit.putLong("stopwatch_stop_" + str, System.currentTimeMillis());
        }
        edit.apply();
        m40549a(str);
    }

    /* renamed from: h */
    public static void m40556h(@NonNull Context context, @NonNull String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("stopwatch_start_" + str, 0);
        edit.putLong("stopwatch_stop_" + str, 0);
        edit.apply();
        m40549a(str);
    }

    /* renamed from: i */
    public static void m40557i(@NonNull Context context, @NonNull List<String> list) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        if (list.contains((Object) null)) {
            list.remove((Object) null);
        }
        edit.putStringSet("stopwatches", new ArraySet(list));
        edit.apply();
    }

    /* renamed from: j */
    public static void m40558j(Context context, @NonNull String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        long j = defaultSharedPreferences.getLong("stopwatch_start_" + str, 0);
        long j2 = defaultSharedPreferences.getLong("stopwatch_stop_" + str, 0);
        if (j == 0 && j2 == 0) {
            edit.putLong("stopwatch_start_" + str, System.currentTimeMillis());
        } else if (j2 != 0) {
            edit.putLong("stopwatch_start_" + str, System.currentTimeMillis() - (j2 - j));
            edit.putLong("stopwatch_stop_" + str, 0);
        }
        edit.apply();
        m40550b(str);
    }
}
