package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6460y1;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p057a2.C2224m;
import p123l1.C7659z;

/* compiled from: IpAddressConstraint.kt */
public final class IpAddressConstraint extends Constraint implements C2224m {
    public static final Parcelable.Creator<IpAddressConstraint> CREATOR = new C4149a();

    /* renamed from: f */
    public static final C4150b f10722f = new C4150b((C13695i) null);
    private String ipAddress;
    private boolean matches;

    /* renamed from: com.arlosoft.macrodroid.constraint.IpAddressConstraint$a */
    /* compiled from: IpAddressConstraint.kt */
    public static final class C4149a implements Parcelable.Creator<IpAddressConstraint> {
        C4149a() {
        }

        /* renamed from: a */
        public IpAddressConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new IpAddressConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public IpAddressConstraint[] newArray(int i) {
            return new IpAddressConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.IpAddressConstraint$b */
    /* compiled from: IpAddressConstraint.kt */
    public static final class C4150b {
        private C4150b() {
        }

        public /* synthetic */ C4150b(C13695i iVar) {
            this();
        }
    }

    public IpAddressConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ IpAddressConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m16570k3(IpAddressConstraint ipAddressConstraint, RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(ipAddressConstraint, "this$0");
        C13706o.m87929f(radioButton, "$matchesRadioButton");
        C13706o.m87929f(editText, "$ipAddressText");
        C13706o.m87929f(appCompatDialog, "$dialog");
        ipAddressConstraint.matches = radioButton.isChecked();
        ipAddressConstraint.ipAddress = editText.getText().toString();
        appCompatDialog.dismiss();
        ipAddressConstraint.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m16571l3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m16572m3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$ipAddressText");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m16573n3(Activity activity, C4023j0.C4028e eVar, IpAddressConstraint ipAddressConstraint, View view) {
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(ipAddressConstraint, "this$0");
        C4023j0.m15698D(activity, eVar, ipAddressConstraint.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, ipAddressConstraint.mo24686E1());
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.ipAddress};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 1) {
            this.ipAddress = strArr[0];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.ipAddress;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.ipAddress, triggerContextInfo, mo27837X0());
        String M = C4061t1.m15967M();
        C13706o.m87928e(t0, "ipAddressToCheck");
        if (C6460y1.m24792d(M, C6460y1.m24790b(C15177w.m93674S0(t0, '*'), true), true) == this.matches) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7659z.f18566j.mo37672a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_ip_address);
            appCompatDialog.setTitle((int) C17541R$string.constraint_ip_address);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            layoutParams.width = -1;
            Window window2 = appCompatDialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
            View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
            C13706o.m87926c(findViewById);
            View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
            C13706o.m87926c(findViewById2);
            View findViewById3 = appCompatDialog.findViewById(C17532R$id.ipAddress);
            C13706o.m87926c(findViewById3);
            EditText editText = (EditText) findViewById3;
            View findViewById4 = appCompatDialog.findViewById(C17532R$id.ipAddressMagicTextButton);
            C13706o.m87926c(findViewById4);
            View findViewById5 = appCompatDialog.findViewById(C17532R$id.matchesRadioButton);
            C13706o.m87926c(findViewById5);
            RadioButton radioButton = (RadioButton) findViewById5;
            View findViewById6 = appCompatDialog.findViewById(C17532R$id.excludesRadioButton);
            C13706o.m87926c(findViewById6);
            editText.setText(this.ipAddress);
            ((Button) findViewById).setOnClickListener(new C4352z0(this, radioButton, editText, appCompatDialog));
            radioButton.setChecked(this.matches);
            ((RadioButton) findViewById6).setChecked(!this.matches);
            ((Button) findViewById2).setOnClickListener(new C4347y0(appCompatDialog));
            ((Button) findViewById4).setOnClickListener(new C4342x0(j0, new C4222a1(editText), this));
            appCompatDialog.show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.ipAddress);
        parcel.writeInt(this.matches ? 1 : 0);
    }

    private IpAddressConstraint() {
        this.ipAddress = "";
        this.matches = true;
    }

    private IpAddressConstraint(Parcel parcel) {
        super(parcel);
        String str = "";
        this.ipAddress = str;
        boolean z = true;
        this.matches = true;
        String readString = parcel.readString();
        this.ipAddress = readString != null ? readString : str;
        this.matches = parcel.readInt() == 0 ? false : z;
    }
}
