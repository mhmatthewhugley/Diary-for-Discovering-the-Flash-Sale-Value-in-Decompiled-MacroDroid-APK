package com.arlosoft.macrodroid.action.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
import org.apache.commons.p353io.IOUtils;
import p257f0.C12198d;
import p257f0.C12199e;

public class ConfirmDialogActivity extends NonAppActivity {
    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m13919N1(TriggerContextInfo triggerContextInfo, Macro macro, boolean z, Trigger trigger, int i, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo, View view) {
        Macro macro2 = macro;
        finish();
        if (triggerContextInfo != null && macro2 != null && !z) {
            Trigger trigger2 = trigger;
            macro.setTriggerThatInvoked(trigger);
            macro.invokeActions(macro.getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m13920O1(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        Stack<Integer> stack;
        super.onCreate(bundle);
        getWindow().addFlags(524288);
        getWindow().addFlags(4194304);
        setContentView((int) C17535R$layout.confirm_dialog);
        getWindow().setLayout(-1, -2);
        setFinishOnTouchOutside(false);
        boolean z = getIntent().getExtras().getBoolean("IsTest");
        String string = getIntent().getExtras().getString("Title");
        String string2 = getIntent().getExtras().getString("Message");
        String string3 = getIntent().getExtras().getString("positive_text");
        String string4 = getIntent().getExtras().getString("negative_text");
        int i = getIntent().getExtras().getInt("NextActionIndex");
        ResumeMacroInfo resumeMacroInfo = (ResumeMacroInfo) getIntent().getParcelableExtra("resume_macro_info");
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
        setTitle(string);
        TextView textView = (TextView) findViewById(C17532R$id.confirmDialogMessage);
        Button button = (Button) findViewById(C17532R$id.okButton);
        button.setText(string3);
        Button button2 = (Button) findViewById(C17532R$id.cancelButton);
        button2.setText(string4);
        textView.setText(string2 != null ? string2.replace("\\n", IOUtils.LINE_SEPARATOR_UNIX) : "");
        button.setOnClickListener(new C12199e(this, triggerContextInfo, Q, z, trigger, i, booleanExtra, stack2, resumeMacroInfo));
        button2.setOnClickListener(new C12198d(this));
        setFinishOnTouchOutside(false);
    }
}
