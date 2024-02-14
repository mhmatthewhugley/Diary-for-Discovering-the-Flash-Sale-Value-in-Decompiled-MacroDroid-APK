package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.ContinuePausedActionsHandler;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p128m0.C7792m;
import p135n1.C7967d;

public class CancelActiveMacroAction extends Action implements C2224m {
    public static final Parcelable.Creator<CancelActiveMacroAction> CREATOR = new C2346b();
    private static final long THIS_MACRO_GUID = 111;
    private boolean getByName;
    private long m_GUID;
    private transient List<Macro> m_macroList;
    private String m_macroName;
    private transient boolean tempGetByName;

    /* renamed from: com.arlosoft.macrodroid.action.CancelActiveMacroAction$a */
    class C2345a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7157a;

        /* renamed from: c */
        final /* synthetic */ EditText f7158c;

        C2345a(Button button, EditText editText) {
            this.f7157a = button;
            this.f7158c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7157a.setEnabled(this.f7158c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.CancelActiveMacroAction$b */
    class C2346b implements Parcelable.Creator<CancelActiveMacroAction> {
        C2346b() {
        }

        /* renamed from: a */
        public CancelActiveMacroAction createFromParcel(Parcel parcel) {
            return new CancelActiveMacroAction(parcel, (C2345a) null);
        }

        /* renamed from: b */
        public CancelActiveMacroAction[] newArray(int i) {
            return new CancelActiveMacroAction[i];
        }
    }

    /* synthetic */ CancelActiveMacroAction(Parcel parcel, C2345a aVar) {
        this(parcel);
    }

    /* renamed from: n3 */
    private void m9910n3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_enter_macro_name);
        appCompatDialog.setTitle((int) C17541R$string.enter_macro_name);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363972);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        C2960c1 c1Var = new C2960c1(editText);
        String str = this.m_macroName;
        if (str != null && !str.equals(m9911o3()) && !this.m_macroName.equals(m9912q3())) {
            editText.setText(this.m_macroName);
        }
        button2.setEnabled(!TextUtils.isEmpty(this.m_macroName));
        button2.setOnClickListener(new C2804a1(this, editText, appCompatDialog));
        button3.setOnClickListener(new C3638z0(appCompatDialog));
        button.setOnClickListener(new C2932b1(this, c1Var));
        editText.addTextChangedListener(new C2345a(button2, editText));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        appCompatDialog.show();
    }

    /* renamed from: o3 */
    private static final String m9911o3() {
        return "[" + MacroDroidApplication.m14845u().getString(C17541R$string.enter_macro_name) + "]";
    }

    /* renamed from: q3 */
    private static final String m9912q3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.constraint_last_run_time_this_macro);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static /* synthetic */ void m9913r3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m9914s3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_macroName = editText.getText().toString();
        this.getByName = true;
        mo24689O1();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m9916u3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(mo27850j0(), eVar, mo27837X0(), false, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.tempGetByName) {
            return 0;
        }
        long j = this.m_GUID;
        if (j == 0 || j == THIS_MACRO_GUID) {
            return 1;
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
                return i + 1;
            }
        }
        this.m_GUID = THIS_MACRO_GUID;
        this.m_macroName = m9912q3();
        return 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_macroName};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_macroName = strArr[0];
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.getByName) {
            return this.m_macroName;
        }
        if (this.m_GUID == THIS_MACRO_GUID) {
            return m9912q3();
        }
        Macro Q = C4934n.m18998M().mo29682Q(this.m_GUID);
        if (Q != null) {
            return Q.getName();
        }
        return this.m_macroName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7792m.m32540u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: Z0 */
    public String mo24798Z0() {
        return this.m_macroName;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Macro macro;
        if (this.getByName) {
            macro = C4934n.m18998M().mo29684S(C4023j0.m15760t0(mo27827K0(), this.m_macroName, triggerContextInfo, mo27837X0()));
        } else {
            macro = this.m_GUID == THIS_MACRO_GUID ? mo27837X0() : C4934n.m18998M().mo29682Q(this.m_GUID);
        }
        if (macro != null) {
            macro.cancelActiveMacro(mo27827K0());
            ContinuePausedActionsHandler.m18973b(mo27827K0(), macro);
            return;
        }
        C4878b.m18882u("Attempt to cancel macro that does not exist: " + this.m_macroName + " (Ignoring)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        String str;
        this.tempGetByName = this.getByName;
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        this.m_macroList = B;
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (mo27837X0().getGUID() == it.next().getGUID()) {
                it.remove();
            }
        }
        this.m_macroList.add(0, mo27837X0());
        String[] strArr = new String[(this.m_macroList.size() + 1)];
        strArr[0] = m9911o3();
        for (int i = 0; i < this.m_macroList.size(); i++) {
            if (mo27837X0().getGUID() == this.m_macroList.get(i).getGUID()) {
                strArr[i + 1] = m9912q3();
            } else {
                int i2 = i + 1;
                if (this.m_macroList.get(i).getIsFavourite()) {
                    str = "⭐ " + this.m_macroList.get(i).getName();
                } else {
                    str = this.m_macroList.get(i).getName();
                }
                strArr[i2] = str;
            }
        }
        if (this.m_GUID == 0 && this.m_macroList.size() > 0) {
            this.m_GUID = THIS_MACRO_GUID;
            this.m_macroName = m9912q3();
        }
        return strArr;
    }

    /* renamed from: p3 */
    public long mo24799p3() {
        return this.m_GUID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.tempGetByName) {
            m9910n3();
        } else {
            super.mo24677v2();
        }
    }

    /* renamed from: v3 */
    public void mo24800v3(String str) {
        long j = this.m_GUID;
        if (j == 0 || j == mo27837X0().getGUID()) {
            this.m_macroName = m9912q3();
        } else {
            this.m_macroName = str;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_macroName);
        parcel.writeLong(this.m_GUID);
        parcel.writeInt(this.getByName ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        if (i == 0) {
            this.tempGetByName = true;
        } else if (i == 1) {
            this.tempGetByName = false;
            this.getByName = false;
            this.m_GUID = THIS_MACRO_GUID;
            this.m_macroName = m9912q3();
        } else {
            this.tempGetByName = false;
            this.getByName = false;
            int i2 = i - 1;
            this.m_GUID = this.m_macroList.get(i2).getGUID();
            this.m_macroName = this.m_macroList.get(i2).getName();
        }
    }

    public CancelActiveMacroAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CancelActiveMacroAction() {
        this.getByName = false;
        this.tempGetByName = false;
    }

    private CancelActiveMacroAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.getByName = false;
        this.tempGetByName = false;
        this.m_macroName = parcel.readString();
        this.m_GUID = parcel.readLong();
        this.getByName = parcel.readInt() != 0 ? true : z;
    }
}
