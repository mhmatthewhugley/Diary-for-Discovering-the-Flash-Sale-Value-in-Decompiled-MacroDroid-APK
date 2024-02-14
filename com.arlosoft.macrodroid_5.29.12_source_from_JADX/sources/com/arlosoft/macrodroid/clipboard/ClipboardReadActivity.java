package com.arlosoft.macrodroid.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6460y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p105i1.C12442b;
import p105i1.C7394a;

/* compiled from: ClipboardReadActivity.kt */
public final class ClipboardReadActivity extends NonAppActivity {

    /* renamed from: p */
    public static final C3949a f10267p = new C3949a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static boolean f10268s;

    /* renamed from: o */
    public Map<Integer, View> f10269o = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.clipboard.ClipboardReadActivity$a */
    /* compiled from: ClipboardReadActivity.kt */
    public static final class C3949a {
        private C3949a() {
        }

        public /* synthetic */ C3949a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo27652a() {
            return ClipboardReadActivity.f10268s;
        }

        /* renamed from: b */
        public final void mo27653b(boolean z) {
            ClipboardReadActivity.f10268s = z;
        }

        /* renamed from: c */
        public final void mo27654c(Context context) {
            C13706o.m87929f(context, "context");
            if (!mo27652a() && ClipboardChangeTrigger.m21984l3() > 0) {
                mo27653b(true);
                Intent intent = new Intent(context, ClipboardReadActivity.class);
                intent.addFlags(268435456);
                intent.addFlags(65536);
                context.startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m15322N1(ClipboardReadActivity clipboardReadActivity) {
        Trigger next;
        ClipData.Item itemAt;
        C13706o.m87929f(clipboardReadActivity, "this$0");
        try {
            Object systemService = clipboardReadActivity.getSystemService("clipboard");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            String str = "";
            if (!(primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null)) {
                str = itemAt.coerceToText(clipboardReadActivity).toString();
            }
            if (clipboardReadActivity.getIntent().getBooleanExtra("do_not_trigger", false)) {
                C7394a.m30555b(str);
            } else if (!C13706o.m87924a(C7394a.m30554a(), str)) {
                C7394a.m30555b(str);
                ArrayList arrayList = new ArrayList();
                for (Macro next2 : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        next = it.next();
                        if (next instanceof ClipboardChangeTrigger) {
                            String t0 = C4023j0.m15760t0(clipboardReadActivity, ((ClipboardChangeTrigger) next).mo31052m3(), (TriggerContextInfo) null, next2);
                            C13706o.m87928e(t0, "text");
                            Locale locale = Locale.ROOT;
                            String lowerCase = t0.toLowerCase(locale);
                            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            String c = C6460y1.m24791c(lowerCase, ((ClipboardChangeTrigger) next).mo31053n3());
                            if (TextUtils.isEmpty(((ClipboardChangeTrigger) next).mo31052m3())) {
                                break;
                            }
                            String lowerCase2 = str.toLowerCase(locale);
                            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (C6460y1.m24792d(lowerCase2, c, ((ClipboardChangeTrigger) next).mo31053n3())) {
                                break;
                            }
                        }
                    }
                    if (next.mo31374R2()) {
                        next2.setTriggerThatInvoked(next);
                        if (next2.canInvoke(next2.getTriggerContextInfo())) {
                            arrayList.add(next2);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Macro macro = (Macro) it2.next();
                    macro.invokeActions(macro.getTriggerContextInfo());
                }
            }
            clipboardReadActivity.finish();
        } catch (Exception unused) {
        }
        f10268s = false;
    }

    /* renamed from: O1 */
    public static final void m15323O1(Context context) {
        f10267p.mo27654c(context);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler().postDelayed(new C12442b(this), 200);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        f10268s = false;
    }
}
