package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.SelectForceRunMacroActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.InvokedByRunMacroTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6409o;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import p057a2.C2212a;
import p057a2.C2224m;
import p081e1.C7264a;
import p099h1.C7362b;
import p128m0.C7739f1;
import p135n1.C7967d;
import p148q0.C8151a;
import p319lc.C15626c;

public class ForceMacroRunAction extends Action implements C2224m, C2212a, C7362b {
    public static final Parcelable.Creator<ForceMacroRunAction> CREATOR = new C2470c();
    private static final int GUID_THIS_MACRO = -1;
    private boolean getByName;
    /* access modifiers changed from: private */
    public boolean isCategoryLocked;
    private long m_GUID;
    private String m_category;
    private boolean m_ignoreConstraints;
    private transient List<Macro> m_macroList;
    private String m_macroName;
    private boolean m_useOffStatus;
    private String m_userPromptTitle;
    private boolean m_waitToComplete;
    private transient boolean tempGetByName;
    private transient long tempGuid;
    private transient String tempMacroName;

    /* renamed from: com.arlosoft.macrodroid.action.ForceMacroRunAction$a */
    class C2468a implements C6409o.C6412c {
        C2468a() {
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            boolean unused = ForceMacroRunAction.this.isCategoryLocked = true;
            ForceMacroRunAction.this.m10876y3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ForceMacroRunAction$b */
    class C2469b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7296a;

        /* renamed from: c */
        final /* synthetic */ EditText f7297c;

        C2469b(Button button, EditText editText) {
            this.f7296a = button;
            this.f7297c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7296a.setEnabled(this.f7297c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ForceMacroRunAction$c */
    class C2470c implements Parcelable.Creator<ForceMacroRunAction> {
        C2470c() {
        }

        /* renamed from: a */
        public ForceMacroRunAction createFromParcel(Parcel parcel) {
            return new ForceMacroRunAction(parcel, (C2468a) null);
        }

        /* renamed from: b */
        public ForceMacroRunAction[] newArray(int i) {
            return new ForceMacroRunAction[i];
        }
    }

    /* synthetic */ ForceMacroRunAction(Parcel parcel, C2468a aVar) {
        this(parcel);
    }

    /* renamed from: A3 */
    private void m10844A3() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_run_macro_title);
            appCompatDialog.setTitle((int) C17541R$string.enter_title);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.text_content);
            editText.setText(this.m_userPromptTitle);
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3535v6(this, editText, appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3389r6(appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.magic_text_button)).setOnClickListener(new C3418s6(this, j0, new C3275n6(editText)));
            appCompatDialog.show();
        }
    }

    /* renamed from: B3 */
    private static final String m10845B3() {
        return "[" + MacroDroidApplication.m14845u().getString(C17541R$string.enter_macro_name) + "]";
    }

    /* renamed from: D3 */
    private static final String m10846D3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.constraint_last_run_time_this_macro);
    }

    /* renamed from: E3 */
    private static final String m10847E3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.user_prompt);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m10848F3(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        this.m_category = (String) arrayList.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m10849G3(DialogInterface dialogInterface, int i) {
        m10844A3();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m10850H3(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, AppCompatDialog appCompatDialog, View view) {
        this.m_ignoreConstraints = checkBox.isChecked();
        this.m_useOffStatus = !checkBox2.isChecked();
        this.m_waitToComplete = checkBox3.isChecked();
        if (this.tempGetByName || this.tempGuid != 0 || this.tempMacroName.equals(m10846D3())) {
            this.getByName = this.tempGetByName;
            this.m_macroName = this.tempMacroName;
            this.m_GUID = this.tempGuid;
            mo24689O1();
        } else {
            m10875x3();
        }
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public static /* synthetic */ void m10852J3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m10853K3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.tempMacroName = editText.getText().toString();
        this.tempGetByName = true;
        m10876y3();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void m10855M3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(mo27850j0(), eVar, mo27837X0(), false, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static /* synthetic */ void m10856N3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m10857O3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void m10858P3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.getByName = this.tempGetByName;
        this.m_macroName = this.tempMacroName;
        this.m_userPromptTitle = editText.getText().toString();
        this.m_GUID = this.tempGuid;
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* renamed from: S3 */
    private void m10860S3(C7264a aVar, String str) {
        new C6409o(aVar, (C6409o.C6411b) null).mo32449u(mo27850j0(), SelectableItem.m15535j1(C17541R$string.enter_category_lock_password), str, C5163j2.m19992J0(mo27850j0()), 0, new C2468a());
    }

    /* renamed from: x3 */
    private void m10875x3() {
        if (mo27836X()) {
            List<Macro> B = C4934n.m18998M().mo29672B(true);
            HashSet hashSet = new HashSet();
            for (Macro category : B) {
                String category2 = category.getCategory();
                if (category2 != null) {
                    hashSet.add(category2);
                } else {
                    C8151a.m33873n(new RuntimeException("DisableCategoryAction: Macro has a null category"));
                }
            }
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            arrayList.add(0, SelectableItem.m15535j1(C17541R$string.uncategorized));
            arrayList.add(0, "[" + SelectableItem.m15535j1(C17541R$string.all_categories) + "]");
            if (this.m_category == null) {
                this.m_category = "[" + SelectableItem.m15535j1(C17541R$string.all_categories) + "]";
            }
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    i = 0;
                    break;
                } else if (this.m_category.equals(arrayList.get(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (this.m_category == null) {
                this.m_category = (String) arrayList.get(0);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.select_category);
            builder.setSingleChoiceItems((CharSequence[]) (String[]) arrayList.toArray(new String[0]), i, (DialogInterface.OnClickListener) new C3303o6(this, arrayList));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3219l6(this));
            builder.create().show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m10876y3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_macro_run_options);
        appCompatDialog.setTitle((int) C17541R$string.action_force_macro_run);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.ignoreConstraintsCheckBox);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.alwaysRunCheckBox);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.waitToCompleteCheckBox);
        checkBox.setChecked(this.m_ignoreConstraints);
        checkBox2.setChecked(!this.m_useOffStatus);
        checkBox3.setChecked(this.m_waitToComplete);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3472t6(this, checkBox, checkBox2, checkBox3, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3333p6(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: z3 */
    private void m10877z3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_enter_macro_name);
        appCompatDialog.setTitle((int) C17541R$string.enter_macro_name);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363972);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        C3247m6 m6Var = new C3247m6(editText);
        String str = this.tempMacroName;
        if (str != null && !str.equals(m10845B3()) && !this.tempMacroName.equals(m10846D3()) && !this.tempMacroName.equals(m10847E3())) {
            editText.setText(this.tempMacroName);
        }
        button2.setEnabled(!TextUtils.isEmpty(this.m_macroName));
        button2.setOnClickListener(new C3508u6(this, editText, appCompatDialog));
        button3.setOnClickListener(new C3361q6(appCompatDialog));
        button.setOnClickListener(new C3563w6(this, m6Var));
        editText.addTextChangedListener(new C2469b(button2, editText));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        appCompatDialog.show();
    }

    /* renamed from: B */
    public void mo24964B(String str) {
        this.m_category = str;
    }

    /* renamed from: C3 */
    public long mo25116C3() {
        return this.m_GUID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.getByName) {
            return 1;
        }
        long j = this.m_GUID;
        if (j == 0) {
            return 0;
        }
        if (j == -1) {
            return 2;
        }
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        this.m_macroList = B;
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (mo27837X0().getGUID() == it.next().getGUID()) {
                it.remove();
            }
        }
        this.m_macroList.add(0, mo27837X0());
        for (int i = 0; i < this.m_macroList.size(); i++) {
            if (this.m_GUID == this.m_macroList.get(i).getGUID()) {
                return i + 2;
            }
        }
        return 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        String[] strArr = new String[2];
        String str = this.m_userPromptTitle;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        strArr[1] = this.m_macroName;
        return strArr;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_userPromptTitle = strArr[0];
            this.m_macroName = strArr[1];
        }
    }

    /* renamed from: J1 */
    public boolean mo24712J1() {
        return true;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        long j = this.m_GUID;
        if (j == 0 || j == -1) {
            return true;
        }
        List<Macro> z = C4934n.m18998M().mo29710z();
        for (Macro guid : z) {
            if (guid.getGUID() == this.m_GUID) {
                return true;
            }
        }
        for (Macro name : z) {
            if (name.getName() == this.m_macroName) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        try {
            if (!this.getByName && this.m_GUID == -1) {
                return m10846D3();
            }
            long j = this.m_GUID;
            if (j == 0 || j == mo27837X0().getGUID() || this.isCategoryLocked) {
                return this.m_macroName;
            }
            return "<a href=\"macrodroid://www.macrodroid.com/macro/" + URLEncoder.encode(this.m_macroName, "UTF-8") + "?showtoast=true\">" + this.m_macroName + "</a>";
        } catch (Exception unused) {
            return this.m_macroName;
        }
    }

    /* renamed from: R3 */
    public void mo25117R3(String str) {
        long j = this.m_GUID;
        if (j == 0 || j == mo27837X0().getGUID()) {
            this.m_macroName = m10846D3();
        } else {
            this.m_macroName = str;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7739f1.m32286u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo25559a1());
        sb.append(" (");
        sb.append((this.getByName || this.m_GUID != -1) ? this.m_macroName : m10846D3());
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: Z0 */
    public String mo24798Z0() {
        return this.m_macroName;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: d0 */
    public void mo25118d0() {
        if (this.m_macroName.equals(m10846D3())) {
            this.m_GUID = -1;
        } else if (this.m_macroName.startsWith("[") && this.m_GUID != 0) {
            this.m_GUID = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        this.m_macroList = B;
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (mo27837X0().getGUID() == it.next().getGUID()) {
                it.remove();
            }
        }
        this.m_macroList.add(0, mo27837X0());
        String[] strArr = new String[(this.m_macroList.size() + 2)];
        strArr[0] = m10847E3();
        strArr[1] = m10845B3();
        for (int i = 2; i < this.m_macroList.size() + 2; i++) {
            int i2 = i - 2;
            if (mo27837X0().getGUID() == this.m_macroList.get(i2).getGUID()) {
                strArr[i] = m10846D3();
            } else {
                strArr[i] = this.m_macroList.get(i2).getName();
                if (this.m_macroList.get(i2).getIsFavourite()) {
                    strArr[i] = "⭐ " + strArr[i];
                }
            }
        }
        if (this.tempGuid == 0 && !this.getByName) {
            this.tempMacroName = m10847E3();
        }
        return strArr;
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        Macro macro;
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        long j = this.m_GUID;
        if (j == 0 && !this.getByName) {
            String t0 = C4023j0.m15760t0(mo27827K0(), this.m_userPromptTitle, triggerContextInfo, mo27837X0());
            Intent intent = new Intent(mo27827K0(), SelectForceRunMacroActivity.class);
            intent.addFlags(268435456);
            if (triggerContextInfo2 != null) {
                intent.putExtra("Trigger", triggerContextInfo.mo31565r());
            }
            intent.putExtra("IgnoreConstraints", this.m_ignoreConstraints);
            intent.putExtra("Category", this.m_category);
            intent.putExtra("HideIfOff", this.m_useOffStatus);
            intent.putExtra("Title", t0);
            intent.putExtra("guid", this.f7124a);
            if (this.m_waitToComplete) {
                intent.putExtra("resume_macro_info", new ResumeMacroInfo(mo27837X0().getGUID(), i, triggerContextInfo, false, stack, resumeMacroInfo, (Map<String, String>) null));
            }
            try {
                mo27827K0().startActivity(intent);
            } catch (Exception e) {
                C4878b.m18868g("Failed to run display macro selection dialog: " + e.toString());
            }
        } else if (j != -1 || this.getByName) {
            if (this.getByName) {
                macro = C4934n.m18998M().mo29684S(C4023j0.m15760t0(mo27827K0(), this.m_macroName, triggerContextInfo, mo27837X0()));
            } else {
                macro = C4934n.m18998M().mo29682Q(this.m_GUID);
            }
            if (macro == null) {
                macro = C4934n.m18998M().mo29684S(this.m_macroName);
            }
            Macro macro2 = macro;
            if (macro2 == null) {
                C4878b.m18869h("Could not find macro with name: " + this.m_macroName, mo27840Y0().longValue());
            } else if (this.m_ignoreConstraints || macro2.canInvoke((TriggerContextInfo) null)) {
                macro2.setTriggerThatInvoked(InvokedByRunMacroTrigger.m22515g3());
                if (!this.m_waitToComplete || z2) {
                    macro2.invokeActions(triggerContextInfo, !this.m_useOffStatus);
                } else {
                    macro2.invokeActions(triggerContextInfo, !this.m_useOffStatus, new ResumeMacroInfo(mo27837X0().getGUID(), i, triggerContextInfo, z, stack, resumeMacroInfo, (Map<String, String>) null));
                }
            } else if (this.m_waitToComplete) {
                mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, true, stack, resumeMacroInfo);
            }
        } else {
            Macro X0 = mo27837X0();
            if (X0 != null && (this.m_ignoreConstraints || X0.canInvoke((TriggerContextInfo) null))) {
                X0.setTriggerThatInvoked(InvokedByRunMacroTrigger.m22515g3());
                X0.invokeActions(triggerContextInfo, !this.m_useOffStatus);
            }
        }
        if (!this.m_waitToComplete && !z2) {
            mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.select_macro);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        this.tempMacroName = this.m_macroName;
        this.tempGuid = this.m_GUID;
        String[] g1 = mo24676g1();
        this.tempGetByName = this.getByName;
        if (g1 == null || g1.length <= 0) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.toast_no_macros_defined), 0).show();
        } else {
            mo27848g0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Category categoryByName;
        if (this.tempGetByName) {
            m10877z3();
            return;
        }
        this.tempGetByName = false;
        Macro S = C4934n.m18998M().mo29684S(this.tempMacroName);
        if (S != null) {
            C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
            CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
            if (!(categoryList == null || (categoryByName = categoryList.getCategoryByName(S.getCategory())) == null || !categoryByName.isLocked())) {
                m10860S3(q, S.getCategory());
                return;
            }
        }
        this.isCategoryLocked = false;
        m10876y3();
    }

    /* renamed from: w */
    public String mo24965w() {
        return this.m_category;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_macroName);
        parcel.writeLong(this.m_GUID);
        parcel.writeInt(this.m_ignoreConstraints ? 1 : 0);
        parcel.writeInt(this.m_useOffStatus ? 1 : 0);
        parcel.writeString(this.m_category);
        parcel.writeString(this.m_userPromptTitle);
        parcel.writeInt(this.m_waitToComplete ? 1 : 0);
        parcel.writeInt(this.isCategoryLocked ? 1 : 0);
        parcel.writeInt(this.getByName ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.tempGetByName = false;
        if (i > 2) {
            int i2 = i - 2;
            this.tempGuid = this.m_macroList.get(i2).getGUID();
            this.tempMacroName = this.m_macroList.get(i2).getName();
        } else if (i == 2) {
            this.tempMacroName = m10845B3();
            this.tempGuid = -1;
        } else if (i == 1) {
            this.tempGetByName = true;
        } else {
            this.tempMacroName = m10847E3();
            this.tempGuid = 0;
        }
    }

    public ForceMacroRunAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ForceMacroRunAction() {
        this.isCategoryLocked = false;
        this.getByName = false;
        this.tempGetByName = false;
        this.m_ignoreConstraints = true;
        this.m_useOffStatus = false;
        this.m_GUID = 0;
        this.m_userPromptTitle = SelectableItem.m15535j1(C17541R$string.select_force_run_macro_activity_run_macro);
    }

    private ForceMacroRunAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.isCategoryLocked = false;
        this.getByName = false;
        this.tempGetByName = false;
        this.m_macroName = parcel.readString();
        this.m_GUID = parcel.readLong();
        this.m_ignoreConstraints = parcel.readInt() != 0;
        this.m_useOffStatus = parcel.readInt() != 0;
        this.m_category = parcel.readString();
        this.m_userPromptTitle = parcel.readString();
        this.m_waitToComplete = parcel.readInt() != 0;
        this.isCategoryLocked = parcel.readInt() != 0;
        this.getByName = parcel.readInt() != 0 ? true : z;
    }
}
