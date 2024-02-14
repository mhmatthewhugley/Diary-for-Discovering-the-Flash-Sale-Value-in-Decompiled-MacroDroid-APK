package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p057a2.C2224m;
import p128m0.C7882y1;
import p148q0.C8151a;

public class LogAction extends Action implements C2224m {
    public static final Parcelable.Creator<LogAction> CREATOR = new C2524b();
    private static final Object s_logLock = new Object();
    private boolean m_logDateAndTime;
    private String m_logText;

    /* renamed from: com.arlosoft.macrodroid.action.LogAction$a */
    class C2523a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7351a;

        /* renamed from: c */
        final /* synthetic */ EditText f7352c;

        C2523a(Button button, EditText editText) {
            this.f7351a = button;
            this.f7352c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7351a.setEnabled(this.f7352c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LogAction$b */
    class C2524b implements Parcelable.Creator<LogAction> {
        C2524b() {
        }

        /* renamed from: a */
        public LogAction createFromParcel(Parcel parcel) {
            return new LogAction(parcel, (C2523a) null);
        }

        /* renamed from: b */
        public LogAction[] newArray(int i) {
            return new LogAction[i];
        }
    }

    /* synthetic */ LogAction(Parcel parcel, C2523a aVar) {
        this(parcel);
    }

    /* renamed from: n3 */
    private void m11312n3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.configure_log_message);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.configure_log_message_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.configure_log_message_magic_text_button);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.configure_log_date_and_time);
        checkBox.setChecked(this.m_logDateAndTime);
        String str = this.m_logText;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.getText().length());
        }
        editText.addTextChangedListener(new C2523a(button, editText));
        button.setOnClickListener(new C3474t8(this, appCompatDialog, editText, checkBox));
        button.setEnabled(editText.getText().length() > 0);
        button2.setOnClickListener(new C3391r8(appCompatDialog));
        button3.setOnClickListener(new C3420s8(this, j0, new C3510u8(editText)));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m11313o3(AppCompatDialog appCompatDialog, EditText editText, CheckBox checkBox, View view) {
        appCompatDialog.cancel();
        this.m_logText = editText.getText().toString();
        this.m_logDateAndTime = checkBox.isChecked();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static /* synthetic */ void m11315q3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m11316r3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_logText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_logText = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_logText;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7882y1.m32978u();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|33|35|36) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b1 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00b1=Splitter:B:35:0x00b1, B:28:0x00a5=Splitter:B:28:0x00a5} */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            boolean r1 = r6.m_logDateAndTime
            if (r1 == 0) goto L_0x002c
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "] - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x002c:
            java.lang.String r1 = r6.m_logText
            java.lang.String r7 = r6.mo24690R2(r1, r7)
            java.lang.Object r1 = s_logLock
            monitor-enter(r1)
            r2 = 0
            com.arlosoft.macrodroid.app.MacroDroidApplication r3 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r4 = "MacroDroidUserLog.txt"
            r5 = 32768(0x8000, float:4.5918E-41)
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r5)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x007d }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch:{ Exception -> 0x007d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r2.<init>()     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r2.append(r0)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r2.append(r7)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            java.lang.String r7 = "\n"
            r2.append(r7)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r4.write(r7)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r4.close()     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            x8.c r7 = p161s1.C10180a.m40075a()     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            com.arlosoft.macrodroid.events.LogUpdateEvent r0 = new com.arlosoft.macrodroid.events.LogUpdateEvent     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r0.<init>()     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r7.mo80018i(r0)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r4.close()     // Catch:{ Exception -> 0x00a5 }
        L_0x0073:
            r3.close()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a5
        L_0x0077:
            r7 = move-exception
            r2 = r4
            goto L_0x00a8
        L_0x007a:
            r7 = move-exception
            r2 = r4
            goto L_0x0084
        L_0x007d:
            r7 = move-exception
            goto L_0x0084
        L_0x007f:
            r7 = move-exception
            r3 = r2
            goto L_0x00a8
        L_0x0082:
            r7 = move-exception
            r3 = r2
        L_0x0084:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r4.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = "ERROR - Writing to log: "
            r4.append(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00a7 }
            r4.append(r7)     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00a7 }
            r0.<init>(r7)     // Catch:{ all -> 0x00a7 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ all -> 0x00a7 }
            r2.close()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x0073
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            return
        L_0x00a7:
            r7 = move-exception
        L_0x00a8:
            r2.close()     // Catch:{ Exception -> 0x00b1 }
            r3.close()     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b1
        L_0x00af:
            r7 = move-exception
            goto L_0x00b2
        L_0x00b1:
            throw r7     // Catch:{ all -> 0x00af }
        L_0x00b2:
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.LogAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + ": " + mo24690R2(this.m_logText, triggerContextInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m11312n3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_logText);
        parcel.writeInt(this.m_logDateAndTime ? 1 : 0);
    }

    public LogAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private LogAction() {
        this.m_logDateAndTime = true;
    }

    private LogAction(Parcel parcel) {
        super(parcel);
        this.m_logText = parcel.readString();
        this.m_logDateAndTime = parcel.readInt() != 0;
    }
}
