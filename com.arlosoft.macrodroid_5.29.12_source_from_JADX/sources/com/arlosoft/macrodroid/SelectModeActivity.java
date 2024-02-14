package com.arlosoft.macrodroid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SelectModeActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ void m9517L1(List list, boolean z, TriggerContextInfo triggerContextInfo, Macro macro, boolean z2, Trigger trigger, int i, boolean z3, Stack stack, ResumeMacroInfo resumeMacroInfo, AdapterView adapterView, View view, int i2, long j) {
        Macro macro2 = macro;
        List list2 = list;
        C4061t1.m15955F0(this, (String) list.get(i2));
        finish();
        if (z && triggerContextInfo != null && macro2 != null && !z2) {
            Trigger trigger2 = trigger;
            macro.setTriggerThatInvoked(trigger);
            macro.invokeActions(macro.getActions(), i, triggerContextInfo, z3, stack, resumeMacroInfo);
        }
    }

    public void onCreate(Bundle bundle) {
        Stack<Integer> stack;
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.select_current_mode);
        setTitle(C17541R$string.select_mode_activity_select_mode);
        ListView listView = (ListView) findViewById(C17532R$id.select_current_mode_list);
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
            C4878b.m18868g("Could not find macro in Select Mode Actions");
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("force_not_enabled", false);
        Trigger trigger = (Trigger) getIntent().getExtras().getParcelable("TriggerThatInvoked");
        ResumeMacroInfo resumeMacroInfo = (ResumeMacroInfo) getIntent().getExtras().getParcelable("resume_macro_info");
        List<String> Q2 = C4061t1.m15971Q(C5163j2.m20090X0(this));
        listView.setAdapter(new ArrayAdapter(this, 17367043, Q2));
        C4827i0 i0Var = r0;
        Trigger trigger2 = trigger;
        Macro macro = Q;
        C4827i0 i0Var2 = new C4827i0(this, Q2, z2, triggerContextInfo, Q, z, trigger, i, booleanExtra, stack2, resumeMacroInfo);
        listView.setOnItemClickListener(i0Var);
        if (!z2 && !z) {
            Macro macro2 = macro;
            macro2.setTriggerThatInvoked(trigger2);
            macro2.invokeActions(macro2.getActions(), i, triggerContextInfo, booleanExtra, stack2, resumeMacroInfo);
        }
    }
}
