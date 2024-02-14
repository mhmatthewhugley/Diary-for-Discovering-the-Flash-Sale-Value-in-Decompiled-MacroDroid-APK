package p337nc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;

/* renamed from: nc.a */
/* compiled from: TaskerPlugin */
public class C15785a {

    /* renamed from: nc.a$a */
    /* compiled from: TaskerPlugin */
    public static class C15786a {
        /* renamed from: a */
        public static void m95312a(Intent intent, Bundle bundle) {
            m95313b(intent).putAll(bundle);
        }

        /* renamed from: b */
        private static Bundle m95313b(Intent intent) {
            if (intent.hasExtra(TaskerPlugin.Event.EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA)) {
                return intent.getBundleExtra(TaskerPlugin.Event.EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA);
            }
            Bundle bundle = new Bundle();
            intent.putExtra(TaskerPlugin.Event.EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA, bundle);
            return bundle;
        }

        /* renamed from: c */
        public static Bundle m95314c(Intent intent) {
            return (Bundle) C15785a.m95311d(intent, TaskerPlugin.Event.EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA, Bundle.class, "retrievePassThroughData");
        }
    }

    /* renamed from: nc.a$b */
    /* compiled from: TaskerPlugin */
    public static class C15787b {
        /* renamed from: a */
        public static Bundle m95315a(Bundle bundle) {
            return (Bundle) C15785a.m95310c(bundle, "net.dinglisch.android.tasker.extras.VARIABLES", Bundle.class, "getVariablesBundle");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Object m95310c(Bundle bundle, String str, Class<?> cls, String str2) {
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                Log.w("TaskerPlugin", str2 + ": " + str + ": null value");
            } else if (obj.getClass() == cls) {
                return obj;
            } else {
                Log.w("TaskerPlugin", str2 + ": " + str + ": expected " + cls.getClass().getName() + ", got " + obj.getClass().getName());
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Object m95311d(Intent intent, String str, Class<?> cls, String str2) {
        if (intent.hasExtra(str)) {
            return m95310c(intent.getExtras(), str, cls, str2);
        }
        return null;
    }
}
