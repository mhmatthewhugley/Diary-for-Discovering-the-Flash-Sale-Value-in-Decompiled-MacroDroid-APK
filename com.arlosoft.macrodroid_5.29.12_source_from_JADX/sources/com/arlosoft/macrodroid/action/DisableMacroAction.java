package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.events.MacroEnabledStateChangeEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6409o;
import java.util.List;
import p057a2.C2224m;
import p081e1.C7264a;
import p128m0.C7799n0;
import p135n1.C7967d;
import p161s1.C10180a;

public class DisableMacroAction extends Action implements C2224m {
    public static final Parcelable.Creator<DisableMacroAction> CREATOR = new C2410c();
    private boolean getByName;
    private long m_GUID;
    private final boolean m_enable;
    private transient List<Macro> m_macroList;
    private String m_macroName;
    private int m_state;
    private transient boolean tempGetByName;

    /* renamed from: com.arlosoft.macrodroid.action.DisableMacroAction$a */
    class C2408a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7219a;

        /* renamed from: c */
        final /* synthetic */ EditText f7220c;

        C2408a(Button button, EditText editText) {
            this.f7219a = button;
            this.f7220c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7219a.setEnabled(this.f7220c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DisableMacroAction$b */
    class C2409b implements C6409o.C6412c {
        C2409b() {
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            DisableMacroAction.this.m10472C3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DisableMacroAction$c */
    class C2410c implements Parcelable.Creator<DisableMacroAction> {
        C2410c() {
        }

        /* renamed from: a */
        public DisableMacroAction createFromParcel(Parcel parcel) {
            return new DisableMacroAction(parcel, (C2408a) null);
        }

        /* renamed from: b */
        public DisableMacroAction[] newArray(int i) {
            return new DisableMacroAction[i];
        }
    }

    /* synthetic */ DisableMacroAction(Parcel parcel, C2408a aVar) {
        this(parcel);
    }

    /* renamed from: B3 */
    private void m10471B3(C7264a aVar, String str) {
        new C6409o(aVar, (C6409o.C6411b) null).mo32449u(mo27850j0(), SelectableItem.m15535j1(C17541R$string.enter_category_lock_password), str, C5163j2.m19992J0(mo27850j0()), 0, new C2409b());
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public void m10472C3() {
        int i = this.m_state;
        if (i == -1) {
            i = !this.m_enable;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) m10482t3(), i, (DialogInterface.OnClickListener) new C3133i4(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3105h4(this));
        builder.create().show();
    }

    /* renamed from: q3 */
    private void m10480q3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_enter_macro_name);
        appCompatDialog.setTitle((int) C17541R$string.enter_macro_name);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363972);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        C3245m4 m4Var = new C3245m4(editText);
        String str = this.m_macroName;
        if (str != null && !str.equals(m10481r3())) {
            editText.setText(this.m_macroName);
        }
        button2.setEnabled(!TextUtils.isEmpty(this.m_macroName));
        button2.setOnClickListener(new C3189k4(this, editText, appCompatDialog));
        button3.setOnClickListener(new C3161j4(appCompatDialog));
        button.setOnClickListener(new C3217l4(this, m4Var));
        editText.addTextChangedListener(new C2408a(button2, editText));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        appCompatDialog.show();
    }

    /* renamed from: r3 */
    private static final String m10481r3() {
        return "[" + MacroDroidApplication.m14845u().getString(C17541R$string.enter_macro_name) + "]";
    }

    /* renamed from: t3 */
    private String[] m10482t3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_disable_macro_enable), SelectableItem.m15535j1(C17541R$string.action_disable_macro_disable), SelectableItem.m15535j1(C17541R$string.action_disable_macro_toggle)};
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static /* synthetic */ void m10483u3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m10484v3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_macroName = editText.getText().toString();
        this.getByName = true;
        m10472C3();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m10486x3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(mo27850j0(), eVar, mo27837X0(), false, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m10487y3(DialogInterface dialogInterface, int i) {
        this.m_state = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m10488z3(DialogInterface dialogInterface, int i) {
        this.getByName = this.tempGetByName;
        mo24689O1();
    }

    /* renamed from: A3 */
    public void mo24970A3(String str) {
        this.m_macroName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.tempGetByName) {
            return 0;
        }
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        this.m_macroList = B;
        if (B.size() == 0) {
            this.tempGetByName = true;
            return 0;
        }
        if (this.m_GUID != 0) {
            for (int i = 0; i < this.m_macroList.size(); i++) {
                if (this.m_GUID == this.m_macroList.get(i).getGUID()) {
                    return i + 1;
                }
            }
        }
        mo24679x2(1);
        return 1;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_macroName};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        int i;
        Context context;
        if (this.m_state != -1) {
            return m10482t3()[this.m_state];
        }
        if (this.m_enable) {
            context = mo27827K0();
            i = C17541R$string.action_disable_macro_enable;
        } else {
            context = mo27827K0();
            i = C17541R$string.action_disable_macro_disable;
        }
        return context.getString(i);
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_macroName = strArr[0];
        }
    }

    /* renamed from: J2 */
    public void mo24888J2() {
        if (!mo24824M1() && this.m_macroName.equals(mo27837X0().getName())) {
            this.m_GUID = mo27837X0().getGUID();
        }
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        if (this.m_GUID == mo27840Y0().longValue() || this.getByName) {
            return true;
        }
        for (Macro guid : C4934n.m18998M().mo29710z()) {
            if (guid.getGUID() == this.m_GUID) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_macroName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7799n0.m32579u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Macro macro;
        if (this.getByName) {
            macro = C4934n.m18998M().mo29684S(C4023j0.m15760t0(mo27827K0(), this.m_macroName, triggerContextInfo, mo27837X0()));
        } else {
            macro = C4934n.m18998M().mo29682Q(this.m_GUID);
        }
        if (macro != null) {
            boolean z = this.m_enable;
            int i = this.m_state;
            if (i != -1) {
                if (i == 0) {
                    z = true;
                } else if (i == 1) {
                    z = false;
                } else if (i == 2) {
                    z = !macro.isEnabled();
                }
            }
            if (z && !macro.isEnabled()) {
                C4934n.m18998M().mo29708x(macro, true);
                C10180a.m40075a().mo80018i(new MacroEnabledStateChangeEvent(macro, true));
            } else if (!z && macro.isEnabled()) {
                C4934n.m18998M().mo29707w(macro, true);
                C10180a.m40075a().mo80018i(new MacroEnabledStateChangeEvent(macro, false));
            }
        } else {
            C4878b.m18869h("Enable/Disable macro failed: " + this.m_macroName + " with id " + this.m_GUID + " not found", mo27840Y0().longValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        String str;
        this.tempGetByName = this.getByName;
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        this.m_macroList = B;
        String[] strArr = new String[(B.size() + 1)];
        strArr[0] = m10481r3();
        int i = 0;
        while (i < this.m_macroList.size()) {
            int i2 = i + 1;
            if (this.m_macroList.get(i).getIsFavourite()) {
                str = "⭐ " + this.m_macroList.get(i).getName();
            } else {
                str = this.m_macroList.get(i).getName();
            }
            strArr[i2] = str;
            i = i2;
        }
        if (this.m_macroList.size() > 0 && this.m_GUID == 0) {
            this.m_GUID = this.m_macroList.get(0).getGUID();
            this.m_macroName = this.m_macroList.get(0).getName();
        }
        return strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_disable_macro);
    }

    /* renamed from: s3 */
    public long mo24971s3() {
        return this.m_GUID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Category categoryByName;
        if (this.tempGetByName) {
            m10480q3();
            return;
        }
        this.tempGetByName = false;
        Macro Q = C4934n.m18998M().mo29682Q(this.m_GUID);
        if (Q != null) {
            C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
            CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
            if (!(categoryList == null || (categoryByName = categoryList.getCategoryByName(Q.getCategory())) == null || !categoryByName.isLocked())) {
                m10471B3(q, Q.getCategory());
                return;
            }
        }
        m10472C3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_macroName);
        parcel.writeLong(this.m_GUID);
        parcel.writeInt(this.m_enable ^ true ? 1 : 0);
        parcel.writeInt(this.m_state);
        parcel.writeInt(this.getByName ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        if (i == 0) {
            this.tempGetByName = true;
        } else if (this.m_macroList.size() == 0) {
            this.tempGetByName = true;
        } else {
            this.tempGetByName = false;
            int i2 = i - 1;
            this.m_GUID = this.m_macroList.get(i2).getGUID();
            this.m_macroName = this.m_macroList.get(i2).getName();
        }
    }

    public DisableMacroAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DisableMacroAction() {
        this.getByName = false;
        this.tempGetByName = false;
        this.m_enable = true;
        this.m_state = -1;
    }

    private DisableMacroAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.getByName = false;
        this.tempGetByName = false;
        this.m_macroName = parcel.readString();
        this.m_GUID = parcel.readLong();
        this.m_enable = parcel.readInt() == 0;
        this.m_state = parcel.readInt();
        this.getByName = parcel.readInt() != 0 ? true : z;
    }
}
