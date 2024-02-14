package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerUpdateVariableActivity */
/* compiled from: DrawerUpdateVariableActivity.kt */
public final class DrawerUpdateVariableActivity extends MacroDroidBaseActivity {

    /* renamed from: p */
    public static final C4479a f11412p = new C4479a((C13695i) null);

    /* renamed from: o */
    public Map<Integer, View> f11413o = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerUpdateVariableActivity$a */
    /* compiled from: DrawerUpdateVariableActivity.kt */
    public static final class C4479a {
        private C4479a() {
        }

        public /* synthetic */ C4479a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo28877a(Context context, String str, DictionaryKeys dictionaryKeys) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(str, "variableName");
            Intent intent = new Intent(context, DrawerUpdateVariableActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("var_name", str);
            intent.putExtra("dictionary_keys", dictionaryKeys);
            context.startActivity(intent);
        }
    }

    /* renamed from: R1 */
    public static final void m17745R1(Context context, String str, DictionaryKeys dictionaryKeys) {
        f11412p.mo28877a(context, str, dictionaryKeys);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m17746S1(DrawerUpdateVariableActivity drawerUpdateVariableActivity, DialogInterface dialogInterface) {
        C13706o.m87929f(drawerUpdateVariableActivity, "this$0");
        drawerUpdateVariableActivity.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("var_name");
        C13706o.m87926c(stringExtra);
        MacroDroidVariable w = C4064u.m16048t().mo27996w(stringExtra);
        C13706o.m87928e(w, "variable");
        C6520o0.m24938r0(this, w, (DictionaryKeys) getIntent().getParcelableExtra("dictionary_keys"), (View.OnClickListener) null, false, new C4492d1(this));
    }
}
