package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.p007os.ParcelCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p057a2.C2224m;
import p123l1.C7626l;

/* compiled from: ClipboardConstraint.kt */
public final class ClipboardConstraint extends Constraint implements C2224m {
    public static final Parcelable.Creator<ClipboardConstraint> CREATOR = new C4129a();

    /* renamed from: f */
    public static final C4130b f10712f = new C4130b((C13695i) null);
    private final transient ClipboardManager clipboardManager;
    private boolean enableRegex;
    private String text;

    /* renamed from: com.arlosoft.macrodroid.constraint.ClipboardConstraint$a */
    /* compiled from: ClipboardConstraint.kt */
    public static final class C4129a implements Parcelable.Creator<ClipboardConstraint> {
        C4129a() {
        }

        /* renamed from: a */
        public ClipboardConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ClipboardConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ClipboardConstraint[] newArray(int i) {
            return new ClipboardConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.ClipboardConstraint$b */
    /* compiled from: ClipboardConstraint.kt */
    public static final class C4130b {
        private C4130b() {
        }

        public /* synthetic */ C4130b(C13695i iVar) {
            this();
        }
    }

    public ClipboardConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ClipboardConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m16331k3(ClipboardConstraint clipboardConstraint, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(clipboardConstraint, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        clipboardConstraint.text = String.valueOf(editText != null ? editText.getText() : null);
        clipboardConstraint.enableRegex = checkBox != null ? checkBox.isChecked() : false;
        appCompatDialog.dismiss();
        clipboardConstraint.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m16332l3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m16333m3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text2 = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text2.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m16334n3(Activity activity, C4023j0.C4028e eVar, ClipboardConstraint clipboardConstraint, View view) {
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(clipboardConstraint, "this$0");
        C4023j0.m15698D(activity, eVar, clipboardConstraint.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, clipboardConstraint.mo24686E1());
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.text};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 1) {
            this.text = strArr[0];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.text;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo r6) {
        /*
            r5 = this;
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = ""
            r1 = 29
            if (r6 < r1) goto L_0x0015
            java.lang.String r6 = p105i1.C7394a.m30554a()
            if (r6 == 0) goto L_0x0013
            java.lang.String r6 = p105i1.C7394a.m30554a()
            goto L_0x0030
        L_0x0013:
            r6 = r0
            goto L_0x0030
        L_0x0015:
            android.content.ClipboardManager r6 = r5.clipboardManager
            android.content.ClipData r6 = r6.getPrimaryClip()
            if (r6 == 0) goto L_0x0013
            r1 = 0
            android.content.ClipData$Item r6 = r6.getItemAt(r1)
            if (r6 == 0) goto L_0x0013
            android.content.Context r1 = r5.mo27827K0()
            java.lang.CharSequence r6 = r6.coerceToText(r1)
            java.lang.String r6 = r6.toString()
        L_0x0030:
            android.content.Context r1 = r5.mo27827K0()
            java.lang.String r2 = r5.text
            r3 = 0
            com.arlosoft.macrodroid.macro.Macro r4 = r5.mo27837X0()
            java.lang.String r1 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r1, r2, r3, r4)
            java.lang.String r2 = "modifiedText"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.C13706o.m87928e(r1, r3)
            boolean r4 = r5.enableRegex
            java.lang.String r1 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r1, r4)
            if (r6 == 0) goto L_0x0062
            java.lang.String r6 = r6.toLowerCase(r2)
            kotlin.jvm.internal.C13706o.m87928e(r6, r3)
            if (r6 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = r6
        L_0x0062:
            boolean r6 = r5.enableRegex
            boolean r6 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.ClipboardConstraint.mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7626l.f18533g.mo37667a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ')';
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
            appCompatDialog.setContentView((int) C17535R$layout.dialog_clipboard_change_trigger);
            appCompatDialog.setTitle((int) C17541R$string.constraint_clipboard_contents);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            layoutParams.width = -1;
            Window window2 = appCompatDialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_clipboard_change_trigger_text);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.dialog_clipboard_change_trigger_magic_text_button);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.useLogcatCheckbox);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.useLogcatInfo);
            CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.useAccessibilityCheckbox);
            TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.useAccessibilityInfo);
            CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex);
            if (editText != null) {
                editText.setText(this.text);
            }
            if (editText != null) {
                editText.setSelection(editText.length());
            }
            if (checkBox3 != null) {
                checkBox3.setChecked(this.enableRegex);
            }
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (button != null) {
                button.setOnClickListener(new C4341x(this, editText, checkBox3, appCompatDialog));
            }
            if (button2 != null) {
                button2.setOnClickListener(new C4336w(appCompatDialog));
            }
            if (editText != null) {
                C4346y yVar = new C4346y(editText);
                if (button3 != null) {
                    button3.setOnClickListener(new C4331v(j0, yVar, this));
                }
            }
            appCompatDialog.show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        ParcelCompat.writeBoolean(parcel, this.enableRegex);
    }

    private ClipboardConstraint() {
        this.text = "";
        Object systemService = mo27827K0().getSystemService("clipboard");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.clipboardManager = (ClipboardManager) systemService;
        this.text = "";
    }

    private ClipboardConstraint(Parcel parcel) {
        super(parcel);
        String str = "";
        this.text = str;
        Object systemService = mo27827K0().getSystemService("clipboard");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.clipboardManager = (ClipboardManager) systemService;
        String readString = parcel.readString();
        this.text = readString != null ? readString : str;
        this.enableRegex = ParcelCompat.readBoolean(parcel);
    }
}
