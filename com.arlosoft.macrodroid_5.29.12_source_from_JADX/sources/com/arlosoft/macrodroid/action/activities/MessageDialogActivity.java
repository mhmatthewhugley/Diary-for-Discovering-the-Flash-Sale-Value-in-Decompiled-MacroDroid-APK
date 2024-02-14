package com.arlosoft.macrodroid.action.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Stack;
import p257f0.C12202h;

public class MessageDialogActivity extends NonAppActivity {

    /* renamed from: o */
    private boolean f7785o = false;

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ void m13928M1(boolean z, TriggerContextInfo triggerContextInfo, Macro macro, boolean z2, Trigger trigger, int i, boolean z3, Stack stack, ResumeMacroInfo resumeMacroInfo, View view) {
        Macro macro2 = macro;
        finish();
        if (z && triggerContextInfo != null && macro2 != null && !z2) {
            Trigger trigger2 = trigger;
            macro.setTriggerThatInvoked(trigger);
            macro.invokeActions(macro.getActions(), i, triggerContextInfo, z3, stack, resumeMacroInfo);
        }
    }

    /* renamed from: N1 */
    private void m13929N1(Intent intent) {
        if (intent.getExtras() != null) {
            String string = intent.getExtras().getString("Subject");
            String string2 = intent.getExtras().getString("Message");
            TextView textView = (TextView) findViewById(C17532R$id.message_dialog_message);
            setTitle(string);
            textView.setText(Html.fromHtml(string2));
            Linkify.addLinks(textView, 1);
            setFinishOnTouchOutside(false);
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (!this.f7785o) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Stack<Integer> stack;
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.message_dialog);
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            getWindow().setLayout(-1, -2);
        }
        getWindow().addFlags(524288);
        m13929N1(getIntent());
        this.f7785o = getIntent().getExtras().getBoolean("PreventBackButton");
        boolean z = getIntent().getExtras().getBoolean("IsTest");
        boolean z2 = getIntent().getExtras().getBoolean("block_next_action");
        int i = getIntent().getExtras().getInt("NextActionIndex");
        if (getIntent().hasExtra("SkipEndifIndex")) {
            stack = C4061t1.m16017s((ArrayList) getIntent().getSerializableExtra("SkipEndifIndex"));
        } else {
            stack = new Stack<>();
        }
        Stack<Integer> stack2 = stack;
        TriggerContextInfo triggerContextInfo = (TriggerContextInfo) getIntent().getExtras().getParcelable("TriggerContextInfo");
        Macro Q = C4934n.m18998M().mo29682Q(getIntent().getExtras().getLong("guid"));
        if (Q == null) {
            C4878b.m18868g("Could not find macro in Confirm Next Actions");
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("force_not_enabled", false);
        Trigger trigger = (Trigger) getIntent().getExtras().getParcelable("TriggerThatInvoked");
        ResumeMacroInfo resumeMacroInfo = (ResumeMacroInfo) getIntent().getExtras().getParcelable("resume_macro_info");
        C12202h hVar = r0;
        int i2 = i;
        int i3 = i;
        Button button = (Button) findViewById(C17532R$id.okButton);
        Trigger trigger2 = trigger;
        Stack<Integer> stack3 = stack2;
        Stack<Integer> stack4 = stack2;
        Macro macro = Q;
        C12202h hVar2 = new C12202h(this, z2, triggerContextInfo, Q, z, trigger, i2, booleanExtra, stack3, resumeMacroInfo);
        button.setOnClickListener(hVar);
        if (!z2 && !z) {
            macro.setTriggerThatInvoked(trigger2);
            macro.invokeActions(macro.getActions(), i3, triggerContextInfo, booleanExtra, stack4, resumeMacroInfo);
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m13929N1(intent);
    }
}
