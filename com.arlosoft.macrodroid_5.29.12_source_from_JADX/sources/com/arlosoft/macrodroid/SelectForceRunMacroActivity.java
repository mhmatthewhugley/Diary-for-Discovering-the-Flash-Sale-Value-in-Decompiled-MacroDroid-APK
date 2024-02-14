package com.arlosoft.macrodroid;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.InvokedByRunMacroTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p319lc.C15626c;

public class SelectForceRunMacroActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ void m9515L1(List list, String str, boolean z, ResumeMacroInfo resumeMacroInfo, AdapterView adapterView, View view, int i, long j) {
        finish();
        Macro macro = (Macro) list.get(i);
        if (macro != null) {
            TriggerContextInfo triggerContextInfo = new TriggerContextInfo(str);
            macro.setTriggerContextInfo(triggerContextInfo);
            if (z || macro.canInvoke(triggerContextInfo, true)) {
                macro.setTriggerThatInvoked(InvokedByRunMacroTrigger.m22515g3());
                macro.invokeActions(triggerContextInfo, true, resumeMacroInfo);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(524288);
        getWindow().addFlags(4194304);
        setContentView((int) C17535R$layout.select_current_mode);
        ListView listView = (ListView) findViewById(C17532R$id.select_current_mode_list);
        long longExtra = getIntent().getLongExtra("guid", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("IgnoreConstraints", false);
        String stringExtra = getIntent().getStringExtra("Trigger");
        String stringExtra2 = getIntent().getStringExtra("Category");
        boolean booleanExtra2 = getIntent().getBooleanExtra("HideIfOff", false);
        ResumeMacroInfo resumeMacroInfo = (ResumeMacroInfo) getIntent().getParcelableExtra("resume_macro_info");
        String stringExtra3 = getIntent().getStringExtra("Title");
        if (!TextUtils.isEmpty(stringExtra3)) {
            setTitle(stringExtra3);
        }
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            Macro next = it.next();
            if (longExtra == next.getGUID()) {
                it.remove();
            } else {
                if (stringExtra2 != null) {
                    if (!stringExtra2.equals("[" + getString(C17541R$string.all_categories) + "]") && !stringExtra2.equals("[All Categories]") && !stringExtra2.equals(next.getCategory())) {
                        it.remove();
                    }
                }
                if (booleanExtra2 && !next.isEnabled()) {
                    it.remove();
                }
            }
        }
        if (B.size() == 0) {
            C15626c.makeText(getApplicationContext(), C17541R$string.no_macros_to_display, 0).show();
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Macro name : B) {
            arrayList.add(name.getName());
        }
        listView.setAdapter(new ArrayAdapter(this, 17367043, arrayList));
        listView.setOnItemClickListener(new C4732h0(this, B, stringExtra, booleanExtra, resumeMacroInfo));
    }
}
