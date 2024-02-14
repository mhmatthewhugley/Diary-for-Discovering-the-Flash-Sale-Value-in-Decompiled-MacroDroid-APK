package com.arlosoft.macrodroid.action.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6416p0;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;

/* compiled from: VoiceInputActivity.kt */
public final class VoiceInputActivity extends NonAppActivity {

    /* renamed from: H */
    public static final C2837a f7883H = new C2837a((C13695i) null);

    /* renamed from: A */
    private Stack<Integer> f7884A;

    /* renamed from: B */
    private boolean f7885B;

    /* renamed from: C */
    private ResumeMacroInfo f7886C;

    /* renamed from: D */
    private TriggerContextInfo f7887D;

    /* renamed from: E */
    private Trigger f7888E;

    /* renamed from: F */
    private DictionaryKeys f7889F;

    /* renamed from: G */
    public Map<Integer, View> f7890G = new LinkedHashMap();

    /* renamed from: o */
    private String f7891o;

    /* renamed from: p */
    private long f7892p;

    /* renamed from: s */
    private boolean f7893s;

    /* renamed from: z */
    private int f7894z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.VoiceInputActivity$a */
    /* compiled from: VoiceInputActivity.kt */
    public static final class C2837a {
        private C2837a() {
        }

        public /* synthetic */ C2837a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: L1 */
    private final MacroDroidVariable m14018L1(Macro macro, String str) {
        for (MacroDroidVariable next : macro.getLocalVariables()) {
            if (C13706o.m87924a(next.getName(), str)) {
                return next;
            }
        }
        return C4064u.m16048t().mo27996w(str);
    }

    /* renamed from: M1 */
    private final void m14019M1(Macro macro) {
        Stack<Integer> stack;
        Stack<Integer> stack2 = this.f7884A;
        if (stack2 == null) {
            C13706o.m87945v("skipEndifIndexStack");
            stack2 = null;
        }
        if (!stack2.isEmpty()) {
            Stack<Integer> stack3 = this.f7884A;
            if (stack3 == null) {
                C13706o.m87945v("skipEndifIndexStack");
                stack3 = null;
            }
            Integer peek = stack3.peek();
            if (peek != null && peek.intValue() == 0) {
                Stack<Integer> stack4 = this.f7884A;
                if (stack4 == null) {
                    C13706o.m87945v("skipEndifIndexStack");
                    stack4 = null;
                }
                stack4.pop();
            }
        }
        int b = C6416p0.m24705b(macro.getActions(), this.f7894z - 1);
        Stack<Integer> stack5 = this.f7884A;
        if (stack5 == null) {
            C13706o.m87945v("skipEndifIndexStack");
            stack5 = null;
        }
        stack5.push(Integer.valueOf(b));
        finish();
        if (!this.f7885B) {
            macro.setTriggerThatInvoked(this.f7888E);
            ArrayList<Action> actions = macro.getActions();
            int i = this.f7894z;
            TriggerContextInfo triggerContextInfo = this.f7887D;
            boolean z = this.f7893s;
            Stack<Integer> stack6 = this.f7884A;
            if (stack6 == null) {
                C13706o.m87945v("skipEndifIndexStack");
                stack = null;
            } else {
                stack = stack6;
            }
            macro.invokeActions(actions, i, triggerContextInfo, z, stack, this.f7886C);
        }
    }

    /* renamed from: N1 */
    private final void m14020N1(List<String> list) {
        List<String> list2;
        Macro Q = C4934n.m18998M().mo29682Q(this.f7892p);
        if (Q == null) {
            C4878b.m18869h("Macro not found for voice input prompt: " + this.f7892p, this.f7892p);
            finish();
            return;
        }
        if (list == null || list.isEmpty()) {
            C4878b.m18882u("No text identified");
        } else {
            String str = this.f7891o;
            String str2 = null;
            if (str == null) {
                C13706o.m87945v("varName");
                str = null;
            }
            MacroDroidVariable L1 = m14018L1(Q, str);
            if (L1 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No variable found with name: ");
                String str3 = this.f7891o;
                if (str3 == null) {
                    C13706o.m87945v("varName");
                } else {
                    str2 = str3;
                }
                sb.append(str2);
                C4878b.m18869h(sb.toString(), this.f7892p);
            } else {
                DictionaryKeys dictionaryKeys = this.f7889F;
                if (dictionaryKeys == null || (list2 = dictionaryKeys.getKeys()) == null) {
                    list2 = C13614t.m87748j();
                }
                Q.variableUpdate(L1, new VariableValue.StringValue(list.get(0), C6520o0.m24868C(this, list2, this.f7887D, Q)));
            }
        }
        m14019M1(Q);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1 && intent != null) {
                m14020N1(intent.getStringArrayListExtra("android.speech.extra.RESULTS"));
            } else if (i2 == 0) {
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Stack<Integer> stack;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("variable_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f7891o = stringExtra;
        this.f7892p = getIntent().getLongExtra("MacroGuid", -1);
        Bundle extras = getIntent().getExtras();
        int i = 0;
        this.f7885B = extras != null ? extras.getBoolean("IsTest") : false;
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            i = extras2.getInt("NextActionIndex");
        }
        this.f7894z = i;
        if (getIntent().hasExtra("SkipEndifIndex")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("SkipEndifIndex");
            C13706o.m87927d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
            stack = C4061t1.m16017s((ArrayList) serializableExtra);
            C13706o.m87928e(stack, "{\n            Util.deser…ArrayList<Int>)\n        }");
        } else {
            stack = new Stack<>();
        }
        this.f7884A = stack;
        this.f7887D = (TriggerContextInfo) getIntent().getParcelableExtra("TriggerContextInfo");
        this.f7888E = (Trigger) getIntent().getParcelableExtra("TriggerThatInvoked");
        this.f7886C = (ResumeMacroInfo) getIntent().getParcelableExtra("resume_macro_info");
        this.f7889F = (DictionaryKeys) getIntent().getParcelableExtra("dictionary_keys");
        try {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("calling_package", "com.arlosoft.macrodroid");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            String string = getString(C17541R$string.feature_requires_google_app_installed);
            C13706o.m87928e(string, "getString(R.string.featu…res_google_app_installed)");
            C4878b.m18868g(string);
            C15626c.m94876a(this, getString(C17541R$string.feature_requires_google_app_installed), 1).show();
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + "com.google.android.googlequicksearchbox")));
            } catch (ActivityNotFoundException unused2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + "com.google.android.googlequicksearchbox")));
            }
        }
    }
}
