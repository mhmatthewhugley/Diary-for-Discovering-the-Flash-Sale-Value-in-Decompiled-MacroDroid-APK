package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.activities.OptionDialogActivity;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.actionblock.common.C3666b;
import com.arlosoft.macrodroid.actionblock.common.C3670c;
import com.arlosoft.macrodroid.actionblock.common.C3671d;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import p057a2.C2212a;
import p057a2.C2223l;
import p057a2.C2224m;
import p057a2.C2225n;
import p128m0.C7795m2;
import p297ja.C13339u;
import p370qa.C16265l;

public class OptionDialogAction extends Action implements C2212a, C2225n, C2224m, C2223l {
    public static final Parcelable.Creator<OptionDialogAction> CREATOR = new C2574g();
    private static final int NUM_BUTTONS = 3;
    /* access modifiers changed from: private */
    public ActionBlockData[] actionBlockData;
    protected boolean blockNextAction;
    private long[] m_actionMacroGuids;
    private String[] m_buttonNames;
    private int m_defaultButton;
    private int m_defaultTimeOutSecs;
    private String m_message;
    private String m_title;
    private boolean preventBackButtonClosing;
    /* access modifiers changed from: private */
    public transient ActionBlockData[] workingActionBlockData;

    /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$a */
    class C2565a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7405a;

        /* renamed from: c */
        final /* synthetic */ ScrollView f7406c;

        C2565a(ViewGroup viewGroup, ScrollView scrollView) {
            this.f7405a = viewGroup;
            this.f7406c = scrollView;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f7405a.setVisibility(i == 0 ? 8 : 0);
            if (i > 0) {
                ScrollView scrollView = this.f7406c;
                scrollView.post(new C3395rc(scrollView));
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$b */
    class C2566b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7408a;

        C2566b(TextView textView) {
            this.f7408a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView = this.f7408a;
            textView.setText(((i + 1) * 5) + SelectableItem.m15535j1(C17541R$string.seconds_one_char));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$c */
    class C2567c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7410a;

        /* renamed from: c */
        final /* synthetic */ EditText f7411c;

        /* renamed from: d */
        final /* synthetic */ EditText f7412d;

        /* renamed from: f */
        final /* synthetic */ EditText[] f7413f;

        /* renamed from: g */
        final /* synthetic */ Spinner[] f7414g;

        C2567c(Button button, EditText editText, EditText editText2, EditText[] editTextArr, Spinner[] spinnerArr) {
            this.f7410a = button;
            this.f7411c = editText;
            this.f7412d = editText2;
            this.f7413f = editTextArr;
            this.f7414g = spinnerArr;
        }

        public void afterTextChanged(Editable editable) {
            this.f7410a.setEnabled(OptionDialogAction.this.m11739R3(this.f7411c, this.f7412d, this.f7413f, this.f7414g));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$d */
    class C2568d implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Button f7416a;

        /* renamed from: c */
        final /* synthetic */ EditText f7417c;

        /* renamed from: d */
        final /* synthetic */ EditText f7418d;

        /* renamed from: f */
        final /* synthetic */ EditText[] f7419f;

        /* renamed from: g */
        final /* synthetic */ Spinner[] f7420g;

        /* renamed from: o */
        final /* synthetic */ List f7421o;

        /* renamed from: p */
        final /* synthetic */ Button f7422p;

        /* renamed from: s */
        final /* synthetic */ Activity f7423s;

        /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$d$a */
        class C2569a implements C16265l<ActionBlockData, C13339u> {
            C2569a() {
            }

            /* renamed from: a */
            public C13339u invoke(ActionBlockData actionBlockData) {
                OptionDialogAction.this.workingActionBlockData[0] = actionBlockData;
                return null;
            }
        }

        C2568d(Button button, EditText editText, EditText editText2, EditText[] editTextArr, Spinner[] spinnerArr, List list, Button button2, Activity activity) {
            this.f7416a = button;
            this.f7417c = editText;
            this.f7418d = editText2;
            this.f7419f = editTextArr;
            this.f7420g = spinnerArr;
            this.f7421o = list;
            this.f7422p = button2;
            this.f7423s = activity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m11771b(Activity activity, ActionBlock actionBlock, View view) {
            C3666b.m14512c(activity, actionBlock, OptionDialogAction.this.workingActionBlockData[0], OptionDialogAction.this, new C2569a());
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f7416a.setEnabled(OptionDialogAction.this.m11739R3(this.f7417c, this.f7418d, this.f7419f, this.f7420g));
            C3671d dVar = (C3671d) this.f7421o.get(i);
            this.f7422p.setVisibility(dVar.mo27106e() ? 0 : 8);
            if (dVar.mo27106e()) {
                ActionBlock g = OptionDialogAction.this.m11724C3().mo29649g(dVar.mo27105d());
                OptionDialogAction.this.workingActionBlockData[0] = OptionDialogAction.this.actionBlockData[0] != null ? OptionDialogAction.this.actionBlockData[0] : new ActionBlockData(g.getName(), g.getGUID(), new HashMap(), new HashMap());
                this.f7422p.setOnClickListener(new C3424sc(this, this.f7423s, g));
                return;
            }
            OptionDialogAction.this.workingActionBlockData[0] = null;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$e */
    class C2570e implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Button f7426a;

        /* renamed from: c */
        final /* synthetic */ EditText f7427c;

        /* renamed from: d */
        final /* synthetic */ EditText f7428d;

        /* renamed from: f */
        final /* synthetic */ EditText[] f7429f;

        /* renamed from: g */
        final /* synthetic */ Spinner[] f7430g;

        /* renamed from: o */
        final /* synthetic */ List f7431o;

        /* renamed from: p */
        final /* synthetic */ Button f7432p;

        /* renamed from: s */
        final /* synthetic */ Activity f7433s;

        /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$e$a */
        class C2571a implements C16265l<ActionBlockData, C13339u> {
            C2571a() {
            }

            /* renamed from: a */
            public C13339u invoke(ActionBlockData actionBlockData) {
                OptionDialogAction.this.workingActionBlockData[1] = actionBlockData;
                return null;
            }
        }

        C2570e(Button button, EditText editText, EditText editText2, EditText[] editTextArr, Spinner[] spinnerArr, List list, Button button2, Activity activity) {
            this.f7426a = button;
            this.f7427c = editText;
            this.f7428d = editText2;
            this.f7429f = editTextArr;
            this.f7430g = spinnerArr;
            this.f7431o = list;
            this.f7432p = button2;
            this.f7433s = activity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m11774b(Activity activity, ActionBlock actionBlock, View view) {
            C3666b.m14512c(activity, actionBlock, OptionDialogAction.this.workingActionBlockData[1], OptionDialogAction.this, new C2571a());
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f7426a.setEnabled(OptionDialogAction.this.m11739R3(this.f7427c, this.f7428d, this.f7429f, this.f7430g));
            C3671d dVar = (C3671d) this.f7431o.get(i);
            this.f7432p.setVisibility(dVar.mo27106e() ? 0 : 8);
            if (dVar.mo27106e()) {
                ActionBlock g = OptionDialogAction.this.m11724C3().mo29649g(dVar.mo27105d());
                OptionDialogAction.this.workingActionBlockData[1] = OptionDialogAction.this.actionBlockData[1] != null ? OptionDialogAction.this.actionBlockData[1] : new ActionBlockData(g.getName(), g.getGUID(), new HashMap(), new HashMap());
                this.f7432p.setOnClickListener(new C3478tc(this, this.f7433s, g));
                return;
            }
            OptionDialogAction.this.workingActionBlockData[1] = null;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$f */
    class C2572f implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Button f7436a;

        /* renamed from: c */
        final /* synthetic */ EditText f7437c;

        /* renamed from: d */
        final /* synthetic */ EditText f7438d;

        /* renamed from: f */
        final /* synthetic */ EditText[] f7439f;

        /* renamed from: g */
        final /* synthetic */ Spinner[] f7440g;

        /* renamed from: o */
        final /* synthetic */ List f7441o;

        /* renamed from: p */
        final /* synthetic */ Button f7442p;

        /* renamed from: s */
        final /* synthetic */ Activity f7443s;

        /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$f$a */
        class C2573a implements C16265l<ActionBlockData, C13339u> {
            C2573a() {
            }

            /* renamed from: a */
            public C13339u invoke(ActionBlockData actionBlockData) {
                OptionDialogAction.this.workingActionBlockData[2] = actionBlockData;
                return null;
            }
        }

        C2572f(Button button, EditText editText, EditText editText2, EditText[] editTextArr, Spinner[] spinnerArr, List list, Button button2, Activity activity) {
            this.f7436a = button;
            this.f7437c = editText;
            this.f7438d = editText2;
            this.f7439f = editTextArr;
            this.f7440g = spinnerArr;
            this.f7441o = list;
            this.f7442p = button2;
            this.f7443s = activity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m11777b(Activity activity, ActionBlock actionBlock, View view) {
            C3666b.m14512c(activity, actionBlock, OptionDialogAction.this.workingActionBlockData[2], OptionDialogAction.this, new C2573a());
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f7436a.setEnabled(OptionDialogAction.this.m11739R3(this.f7437c, this.f7438d, this.f7439f, this.f7440g));
            C3671d dVar = (C3671d) this.f7441o.get(i);
            this.f7442p.setVisibility(dVar.mo27106e() ? 0 : 8);
            if (dVar.mo27106e()) {
                ActionBlock g = OptionDialogAction.this.m11724C3().mo29649g(dVar.mo27105d());
                OptionDialogAction.this.workingActionBlockData[2] = OptionDialogAction.this.actionBlockData[2] != null ? OptionDialogAction.this.actionBlockData[2] : new ActionBlockData(g.getName(), g.getGUID(), new HashMap(), new HashMap());
                this.f7442p.setOnClickListener(new C3514uc(this, this.f7443s, g));
                return;
            }
            OptionDialogAction.this.workingActionBlockData[2] = null;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OptionDialogAction$g */
    class C2574g implements Parcelable.Creator<OptionDialogAction> {
        C2574g() {
        }

        /* renamed from: a */
        public OptionDialogAction createFromParcel(Parcel parcel) {
            return new OptionDialogAction(parcel, (C2565a) null);
        }

        /* renamed from: b */
        public OptionDialogAction[] newArray(int i) {
            return new OptionDialogAction[i];
        }
    }

    /* synthetic */ OptionDialogAction(Parcel parcel, C2565a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public C4915a m11724C3() {
        return C4934n.m18998M();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m11725D3(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m11726E3(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m11727F3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m11728G3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m11729H3(EditText editText, EditText editText2, SeekBar seekBar, Spinner spinner, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, EditText editText3, EditText editText4, EditText editText5, List list, Spinner spinner2, Spinner spinner3, Spinner spinner4, View view) {
        this.actionBlockData = this.workingActionBlockData;
        this.m_title = editText.getText().toString();
        this.m_message = editText2.getText().toString();
        this.m_defaultTimeOutSecs = (seekBar.getProgress() + 1) * 5;
        this.m_defaultButton = spinner.getSelectedItemPosition();
        this.preventBackButtonClosing = checkBox.isChecked();
        this.blockNextAction = checkBox2.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
        this.m_buttonNames = new String[]{editText3.getText().toString(), editText4.getText().toString(), editText5.getText().toString()};
        this.m_actionMacroGuids = new long[]{((C3671d) list.get(spinner2.getSelectedItemPosition())).mo27105d(), ((C3671d) list.get(spinner3.getSelectedItemPosition())).mo27105d(), ((C3671d) list.get(spinner4.getSelectedItemPosition())).mo27105d()};
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public static /* synthetic */ void m11731J3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static /* synthetic */ void m11732K3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static /* synthetic */ void m11733L3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static /* synthetic */ void m11734M3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static /* synthetic */ void m11735N3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m11736O3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void m11737P3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public /* synthetic */ void m11738Q3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public boolean m11739R3(TextView textView, TextView textView2, EditText[] editTextArr, Spinner[] spinnerArr) {
        if (!(textView.getText().length() == 0 || textView2.getText().length() == 0)) {
            for (int i = 0; i < editTextArr.length; i++) {
                if (editTextArr[i].getText().length() > 0 && spinnerArr[i].getSelectedItemPosition() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: C */
    public ArrayList<Long> mo24438C() {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (long valueOf : this.m_actionMacroGuids) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        ArrayList arrayList = new ArrayList();
        for (ActionBlockData actionBlockData2 : this.actionBlockData) {
            if (actionBlockData2 != null) {
                HashMap<String, String> e = actionBlockData2.mo27085e();
                for (String next : e.keySet()) {
                    arrayList.add(e.get(next) == null ? "" : e.get(next));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        int i = 0;
        for (ActionBlockData actionBlockData2 : this.actionBlockData) {
            if (actionBlockData2 != null) {
                HashMap<String, String> e = actionBlockData2.mo27085e();
                for (String put : e.keySet()) {
                    e.put(put, strArr[i].equals("") ? null : strArr[i]);
                    i++;
                }
            }
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_title + ": " + this.m_message;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7795m2.m32558u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        Context K0 = mo27827K0();
        String str = this.m_title;
        String str2 = this.m_message;
        long[] jArr = this.m_actionMacroGuids;
        ActionBlockData[] actionBlockDataArr = this.actionBlockData;
        String[] strArr = this.m_buttonNames;
        int i2 = this.m_defaultButton;
        int i3 = this.m_defaultTimeOutSecs;
        long guid = this.m_macro.getGUID();
        Trigger triggerThatInvoked = this.m_macro.getTriggerThatInvoked();
        Context context = K0;
        OptionDialogActivity.m13952k2(context, str, str2, jArr, actionBlockDataArr, strArr, i2, i3, triggerContextInfo, guid, triggerThatInvoked, i, stack, z, z2, resumeMacroInfo, this.blockNextAction, this.preventBackButtonClosing);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @NonNull
    /* renamed from: i */
    public List<String> mo24442i() {
        ArrayList arrayList = new ArrayList();
        for (ActionBlockData actionBlockData2 : this.actionBlockData) {
            if (actionBlockData2 != null) {
                arrayList.add(actionBlockData2.mo27083d());
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    public void mo24439r(@NonNull ArrayList<Long> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.m_actionMacroGuids[i] = arrayList.get(i).longValue();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Spinner[] spinnerArr;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.configure_option_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_option_dialog);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_title);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_message);
        EditText editText3 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_1);
        EditText editText4 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_2);
        EditText editText5 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_3);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_spinner_1);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.option_dialog_button1_magic_text_button);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.option_dialog_button2_magic_text_button);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.option_dialog_button3_magic_text_button);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.default_option_spinner);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.option_dialog_message_magic_text_button);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.default_timeout_seekbar);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.option_dialog_title_magic_text_button);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.timeout_options);
        Button button6 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.seconds_value);
        Button button7 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        ScrollView scrollView = (ScrollView) appCompatDialog.findViewById(C17532R$id.scroll_view);
        Spinner spinner3 = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_spinner_3);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.prevent_back_button_checkbox);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.block_next_actions);
        Button button8 = (Button) appCompatDialog.findViewById(C17532R$id.configInputOutputParams1);
        Button button9 = (Button) appCompatDialog.findViewById(C17532R$id.configInputOutputParams2);
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        Button button10 = (Button) appCompatDialog.findViewById(C17532R$id.configInputOutputParams3);
        String[] strArr = {SelectableItem.m15535j1(C17541R$string.none), SelectableItem.m15535j1(C17541R$string.left_button), SelectableItem.m15535j1(C17541R$string.center_button), SelectableItem.m15535j1(C17541R$string.right_button)};
        Spinner spinner4 = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_option_dialog_spinner_2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, 17367048, strArr);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);
        spinner2.setSelection(this.m_defaultButton, false);
        viewGroup.setVisibility(this.m_defaultButton == 0 ? 8 : 0);
        spinner2.setOnItemSelectedListener(new C2565a(viewGroup, scrollView));
        seekBar.setProgress((this.m_defaultTimeOutSecs / 5) - 1);
        textView.setText(this.m_defaultTimeOutSecs + SelectableItem.m15535j1(C17541R$string.seconds_one_char));
        seekBar.setOnSeekBarChangeListener(new C2566b(textView));
        List<Macro> B = C4934n.m18998M().mo29672B(false);
        List<ActionBlock> i = m11724C3().mo29651i();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(this.m_title)) {
            editText.setText(C17541R$string.select_option);
        } else {
            editText.setText(this.m_title);
        }
        editText.setSelection(editText.length());
        if (TextUtils.isEmpty(this.m_message)) {
            editText2.setText(C17541R$string.choose_option);
        } else {
            editText2.setText(this.m_message);
        }
        editText2.setSelection(editText2.length());
        editText3.setText(this.m_buttonNames[0]);
        editText4.setText(this.m_buttonNames[1]);
        editText5.setText(this.m_buttonNames[2]);
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Spinner spinner5 = spinner2;
        sb.append(mo27827K0().getString(C17541R$string.button_off));
        sb.append(")");
        SeekBar seekBar2 = seekBar;
        arrayList.add(new C3671d(sb.toString(), 0, false));
        arrayList.add(new C3671d(mo27827K0().getString(C17541R$string.option_dialog_option_ignore_continue_macro), 1, false));
        arrayList.add(new C3671d(mo27827K0().getString(C17541R$string.option_dialog_option_ignore_cancel_macro), 2, false));
        int i2 = 0;
        while (i2 < i.size()) {
            ActionBlock actionBlock = i.get(i2);
            arrayList.add(new C3671d(actionBlock.getName(), actionBlock.getGUID(), true));
            i2++;
        }
        for (int i3 = 0; i3 < B.size(); i3++) {
            Macro macro = B.get(i3);
            arrayList.add(new C3671d(macro.getName(), macro.getGUID(), false));
        }
        C3670c cVar = new C3670c(j0, arrayList);
        C3670c cVar2 = new C3670c(j0, arrayList);
        C3670c cVar3 = new C3670c(j0, arrayList);
        spinner.setAdapter(cVar);
        Spinner spinner6 = spinner4;
        spinner6.setAdapter(cVar2);
        Spinner spinner7 = spinner3;
        spinner7.setAdapter(cVar3);
        button9.setOnClickListener(C3339pc.f8913a);
        button10.setOnClickListener(C3309oc.f8833a);
        EditText[] editTextArr = {editText3, editText4, editText5};
        Button button11 = button;
        Button button12 = button2;
        Button button13 = button3;
        Spinner spinner8 = spinner5;
        Button button14 = button4;
        SeekBar seekBar3 = seekBar2;
        Button button15 = button11;
        Button button16 = button14;
        Button button17 = button5;
        Spinner[] spinnerArr2 = {spinner, spinner6, spinner7};
        CheckBox checkBox3 = checkBox;
        CheckBox checkBox4 = checkBox2;
        Button button18 = button9;
        Button button19 = button10;
        Button button20 = button17;
        C2567c cVar4 = r0;
        Spinner spinner9 = spinner6;
        Spinner spinner10 = spinner7;
        Spinner spinner11 = spinner;
        EditText editText6 = editText5;
        C2567c cVar5 = new C2567c(button7, editText, editText2, editTextArr, spinnerArr2);
        int i4 = 0;
        while (true) {
            long[] jArr = this.m_actionMacroGuids;
            if (i4 < jArr.length) {
                long j = jArr[i4];
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        spinnerArr = spinnerArr2;
                        break;
                    } else if (j == ((C3671d) arrayList.get(i5)).mo27105d()) {
                        spinnerArr = spinnerArr2;
                        spinnerArr[i4].setSelection(i5);
                        break;
                    } else {
                        Spinner[] spinnerArr3 = spinnerArr2;
                        i5++;
                    }
                }
                i4++;
                spinnerArr2 = spinnerArr;
            } else {
                Spinner[] spinnerArr4 = spinnerArr2;
                Button button21 = button7;
                EditText editText7 = editText;
                Spinner spinner12 = spinner9;
                C2568d dVar = r0;
                EditText[] editTextArr2 = editTextArr;
                Spinner[] spinnerArr5 = spinnerArr2;
                EditText editText8 = editText4;
                ArrayList arrayList2 = arrayList;
                EditText editText9 = editText2;
                C2568d dVar2 = new C2568d(button21, editText7, editText2, editTextArr2, spinnerArr5, arrayList2, button8, j0);
                EditText editText10 = editText9;
                C2570e eVar = r0;
                C2570e eVar2 = new C2570e(button21, editText7, editText10, editTextArr2, spinnerArr5, arrayList2, button18, j0);
                EditText[] editTextArr3 = editTextArr;
                C2572f fVar = r0;
                C2572f fVar2 = new C2572f(button21, editText7, editText10, editTextArr2, spinnerArr5, arrayList2, button19, j0);
                spinner11.setOnItemSelectedListener(dVar);
                spinner12.setOnItemSelectedListener(eVar);
                Spinner spinner13 = spinner10;
                spinner13.setOnItemSelectedListener(fVar);
                C2567c cVar6 = cVar4;
                editText.addTextChangedListener(cVar6);
                EditText editText11 = editText9;
                editText11.addTextChangedListener(cVar6);
                EditText editText12 = editText3;
                editText12.addTextChangedListener(cVar6);
                EditText editText13 = editText8;
                editText13.addTextChangedListener(cVar6);
                EditText editText14 = editText6;
                editText14.addTextChangedListener(cVar6);
                C3085gc gcVar = new C3085gc(editText);
                C3113hc hcVar = new C3113hc(editText11);
                C3057fc fcVar = new C3057fc(editText12);
                C3028ec ecVar = new C3028ec(editText13);
                C3367qc qcVar = new C3367qc(editText14);
                button20.setOnClickListener(new C3225lc(this, j0, gcVar));
                button16.setOnClickListener(new C3169jc(this, j0, hcVar));
                button15.setOnClickListener(new C3141ic(this, j0, fcVar));
                button2.setOnClickListener(new C3253mc(this, j0, ecVar));
                button13.setOnClickListener(new C3197kc(this, j0, qcVar));
                CheckBox checkBox5 = checkBox3;
                checkBox5.setChecked(this.preventBackButtonClosing);
                CheckBox checkBox6 = checkBox4;
                checkBox6.setChecked(this.blockNextAction);
                C3281nc ncVar = r0;
                CheckBox checkBox7 = checkBox6;
                Spinner spinner14 = spinner8;
                EditText editText15 = editText14;
                C3281nc ncVar2 = new C3281nc(this, editText, editText11, seekBar3, spinner14, checkBox5, checkBox7, appCompatDialog2, editText12, editText13, editText15, arrayList, spinner11, spinner12, spinner13);
                Button button22 = button7;
                button22.setOnClickListener(ncVar);
                button22.setEnabled(m11739R3(editText, editText11, editTextArr3, spinnerArr2));
                AppCompatDialog appCompatDialog3 = appCompatDialog2;
                button6.setOnClickListener(new C3000dc(appCompatDialog3));
                appCompatDialog3.show();
                return;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_title);
        parcel.writeString(this.m_message);
        parcel.writeStringArray(this.m_buttonNames);
        parcel.writeLongArray(this.m_actionMacroGuids);
        parcel.writeParcelableArray(this.actionBlockData, i);
        parcel.writeParcelableArray(this.workingActionBlockData, i);
        parcel.writeInt(this.m_defaultButton);
        parcel.writeInt(this.m_defaultTimeOutSecs);
        parcel.writeInt(this.blockNextAction ? 1 : 0);
        parcel.writeInt(this.preventBackButtonClosing ? 1 : 0);
    }

    public OptionDialogAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private OptionDialogAction() {
        this.blockNextAction = false;
        this.preventBackButtonClosing = false;
        this.m_actionMacroGuids = new long[3];
        this.m_buttonNames = new String[3];
        this.actionBlockData = new ActionBlockData[3];
        this.workingActionBlockData = new ActionBlockData[3];
        this.m_defaultTimeOutSecs = 30;
    }

    private OptionDialogAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.blockNextAction = false;
        this.preventBackButtonClosing = false;
        this.m_title = parcel.readString();
        this.m_message = parcel.readString();
        String[] strArr = new String[3];
        this.m_buttonNames = strArr;
        parcel.readStringArray(strArr);
        long[] jArr = new long[3];
        this.m_actionMacroGuids = jArr;
        parcel.readLongArray(jArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray != null) {
            this.actionBlockData = (ActionBlockData[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, ActionBlockData[].class);
        }
        Parcelable[] readParcelableArray2 = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray2 != null) {
            this.workingActionBlockData = (ActionBlockData[]) Arrays.copyOf(readParcelableArray2, readParcelableArray2.length, ActionBlockData[].class);
        }
        this.m_defaultButton = parcel.readInt();
        this.m_defaultTimeOutSecs = parcel.readInt();
        this.blockNextAction = parcel.readInt() != 0;
        this.preventBackButtonClosing = parcel.readInt() != 0 ? true : z;
    }
}
