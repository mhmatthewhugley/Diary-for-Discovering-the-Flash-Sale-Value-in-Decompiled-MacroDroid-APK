package com.arlosoft.macrodroid.googleassistant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.ShortcutTriggerReceiver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;

/* compiled from: GoogleAssistantDispatchActivity.kt */
public final class GoogleAssistantDispatchActivity extends NonAppActivity {

    /* renamed from: p */
    public static final C4730a f11885p = new C4730a((C13695i) null);

    /* renamed from: s */
    private static final String f11886s = "actions.fulfillment.extra.ACTION_TOKEN";

    /* renamed from: o */
    public Map<Integer, View> f11887o = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.googleassistant.GoogleAssistantDispatchActivity$a */
    /* compiled from: GoogleAssistantDispatchActivity.kt */
    public static final class C4730a {
        private C4730a() {
        }

        public /* synthetic */ C4730a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: L1 */
    private final void m18328L1(Uri uri) {
        String str = null;
        String queryParameter = uri != null ? uri.getQueryParameter("macro") : null;
        if (queryParameter != null) {
            Intent intent = new Intent(this, ShortcutTriggerReceiver.class);
            intent.putExtra("com.arlosoft.macrodroid.MACRO_NAME", queryParameter);
            intent.putExtra("guid", 0);
            intent.putExtra("is_assistant", true);
            sendBroadcast(intent);
            m18330N1("http://schema.org/CompletedActionStatus");
        }
        if (uri != null) {
            str = uri.getQueryParameter("name");
        }
        if (str != null) {
            boolean z = false;
            Iterator<Macro> it = C4934n.m18998M().mo29672B(false).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Macro next = it.next();
                String name = next.getName();
                C13706o.m87928e(name, "macro.name");
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = str.toLowerCase(locale);
                C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (lowerCase.equals(lowerCase2)) {
                    Intent intent2 = new Intent(this, EditMacroActivity.class);
                    intent2.putExtra("MacroId", next.getId());
                    startActivity(intent2);
                    m18330N1("http://schema.org/CompletedActionStatus");
                    z = true;
                    break;
                }
            }
            if (!z) {
                C15626c.m94876a(this, getString(C17541R$string.macro_not_found) + ": " + str, 1).show();
                m18330N1("http://schema.org/FailedActionStatus");
            }
        }
    }

    /* renamed from: M1 */
    private final void m18329M1(Intent intent, Intent intent2) {
        String action = intent2.getAction();
        if (action != null && action.hashCode() == -1173171990 && action.equals("android.intent.action.VIEW")) {
            m18328L1(intent.getData());
        }
    }

    /* renamed from: N1 */
    private final void m18330N1(String str) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Intent intent2 = getIntent();
            C13706o.m87928e(intent2, "intent");
            m18329M1(intent, intent2);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m18329M1(intent, intent);
        }
        finish();
    }
}
