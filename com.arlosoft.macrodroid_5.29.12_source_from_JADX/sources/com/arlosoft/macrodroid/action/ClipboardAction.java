package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p057a2.C2224m;
import p128m0.C7857v;
import p148q0.C8151a;

public class ClipboardAction extends Action implements C2224m {
    public static final Parcelable.Creator<ClipboardAction> CREATOR = new C2367b();
    private String m_clipboardText;

    /* renamed from: com.arlosoft.macrodroid.action.ClipboardAction$a */
    class C2366a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7182a;

        /* renamed from: c */
        final /* synthetic */ EditText f7183c;

        C2366a(Button button, EditText editText) {
            this.f7182a = button;
            this.f7183c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7182a.setEnabled(this.f7183c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClipboardAction$b */
    class C2367b implements Parcelable.Creator<ClipboardAction> {
        C2367b() {
        }

        /* renamed from: a */
        public ClipboardAction createFromParcel(Parcel parcel) {
            return new ClipboardAction(parcel, (C2366a) null);
        }

        /* renamed from: b */
        public ClipboardAction[] newArray(int i) {
            return new ClipboardAction[i];
        }
    }

    /* synthetic */ ClipboardAction(Parcel parcel, C2366a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m10108n3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.cancel();
        this.m_clipboardText = editText.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static /* synthetic */ void m10110p3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m10111q3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_clipboardText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_clipboardText = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_clipboardText;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7857v.m32863u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        ((ClipboardManager) mo27827K0().getSystemService("clipboard")).setText(mo24690R2(this.m_clipboardText, triggerContextInfo));
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " '" + mo24690R2(this.m_clipboardText, triggerContextInfo) + "'";
    }

    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_clipboard_text);
        appCompatDialog.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_clipboard_set_clipboard_text));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!j0.getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363972);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.special_text_button);
        String str = this.m_clipboardText;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        if (editText.getText().length() > 0) {
            button.setEnabled(true);
        }
        editText.addTextChangedListener(new C2366a(button, editText));
        button.setOnClickListener(new C3131i2(this, appCompatDialog, editText));
        button2.setOnClickListener(new C3075g2(appCompatDialog));
        button3.setOnClickListener(new C3103h2(this, j0, new C3159j2(editText)));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_clipboardText);
    }

    public ClipboardAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ClipboardAction() {
        this.m_clipboardText = "";
    }

    private ClipboardAction(Parcel parcel) {
        super(parcel);
        this.m_clipboardText = parcel.readString();
    }
}
