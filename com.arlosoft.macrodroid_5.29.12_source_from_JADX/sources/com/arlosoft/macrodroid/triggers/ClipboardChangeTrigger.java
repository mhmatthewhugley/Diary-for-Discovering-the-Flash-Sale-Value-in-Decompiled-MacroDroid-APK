package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.clipboard.ClipboardReadActivity;
import com.arlosoft.macrodroid.clipboard.logcat.C3950a;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6364b;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p057a2.C2224m;
import p119k3.C7551s;
import p135n1.C7967d;
import p148q0.C8151a;
import p150q2.C8164a;

public class ClipboardChangeTrigger extends Trigger implements C2224m {
    public static final Parcelable.Creator<ClipboardChangeTrigger> CREATOR = new C5627b();
    private static C3950a logcatClipboardDetector;
    private static C5628c s_clipboardListener;
    private static int s_triggerCounter;
    /* access modifiers changed from: private */
    public boolean enableRegex;
    private boolean isConfigured;
    private String m_text;
    private boolean useAccessibilityService;

    /* renamed from: com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger$a */
    class C5626a implements C3950a.C3952b {
        C5626a() {
        }

        /* renamed from: a */
        public void mo27659a() {
            ClipboardReadActivity.m15323O1(ClipboardChangeTrigger.this.mo27827K0());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger$b */
    class C5627b implements Parcelable.Creator<ClipboardChangeTrigger> {
        C5627b() {
        }

        /* renamed from: a */
        public ClipboardChangeTrigger createFromParcel(Parcel parcel) {
            return new ClipboardChangeTrigger(parcel, (C5626a) null);
        }

        /* renamed from: b */
        public ClipboardChangeTrigger[] newArray(int i) {
            return new ClipboardChangeTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger$c */
    private static class C5628c implements ClipboardManager.OnPrimaryClipChangedListener {

        /* renamed from: a */
        private final ClipboardManager f13604a;

        /* renamed from: b */
        private final Context f13605b;

        public C5628c(Context context, ClipboardManager clipboardManager) {
            this.f13604a = clipboardManager;
            this.f13605b = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
            if (r6.mo31374R2() == false) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
            r4.setTriggerThatInvoked(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
            if (r4.canInvoke(r4.getTriggerContextInfo()) == false) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
            r2.add(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r0 = r0.getItemAt(0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPrimaryClipChanged() {
            /*
                r10 = this;
                android.content.ClipboardManager r0 = r10.f13604a
                android.content.ClipData r0 = r0.getPrimaryClip()
                r1 = 0
                if (r0 == 0) goto L_0x001b
                r2 = 0
                android.content.ClipData$Item r0 = r0.getItemAt(r2)
                if (r0 == 0) goto L_0x001b
                android.content.Context r2 = r10.f13605b
                java.lang.CharSequence r0 = r0.coerceToText(r2)
                java.lang.String r0 = r0.toString()
                goto L_0x001c
            L_0x001b:
                r0 = r1
            L_0x001c:
                if (r0 != 0) goto L_0x001f
                return
            L_0x001f:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.arlosoft.macrodroid.macro.n r3 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                java.util.List r3 = r3.mo29679I()
                java.util.Iterator r3 = r3.iterator()
            L_0x0030:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x009c
                java.lang.Object r4 = r3.next()
                com.arlosoft.macrodroid.macro.Macro r4 = (com.arlosoft.macrodroid.macro.Macro) r4
                java.util.ArrayList r5 = r4.getTriggerListWithAwaitingActions()
                java.util.Iterator r5 = r5.iterator()
            L_0x0044:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0030
                java.lang.Object r6 = r5.next()
                com.arlosoft.macrodroid.triggers.Trigger r6 = (com.arlosoft.macrodroid.triggers.Trigger) r6
                boolean r7 = r6 instanceof com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger
                if (r7 == 0) goto L_0x0044
                r7 = r6
                com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger r7 = (com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger) r7
                android.content.Context r8 = r10.f13605b
                java.lang.String r9 = r7.mo31052m3()
                java.lang.String r8 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r8, r9, r1, r4)
                java.lang.String r8 = r8.toLowerCase()
                boolean r9 = r7.enableRegex
                java.lang.String r8 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r8, r9)
                java.lang.String r9 = r7.mo31052m3()
                boolean r9 = android.text.TextUtils.isEmpty(r9)
                if (r9 != 0) goto L_0x0085
                java.lang.String r9 = r0.toLowerCase()
                boolean r7 = r7.enableRegex
                boolean r7 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r9, r8, r7)
                if (r7 == 0) goto L_0x0044
            L_0x0085:
                boolean r5 = r6.mo31374R2()
                if (r5 == 0) goto L_0x0030
                r4.setTriggerThatInvoked(r6)
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r5 = r4.getTriggerContextInfo()
                boolean r5 = r4.canInvoke(r5)
                if (r5 == 0) goto L_0x0030
                r2.add(r4)
                goto L_0x0030
            L_0x009c:
                java.util.Iterator r0 = r2.iterator()
            L_0x00a0:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00b4
                java.lang.Object r1 = r0.next()
                com.arlosoft.macrodroid.macro.Macro r1 = (com.arlosoft.macrodroid.macro.Macro) r1
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r2 = r1.getTriggerContextInfo()
                r1.invokeActions(r2)
                goto L_0x00a0
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.ClipboardChangeTrigger.C5628c.onPrimaryClipChanged():void");
        }
    }

    /* synthetic */ ClipboardChangeTrigger(Parcel parcel, C5626a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    public static int m21984l3() {
        return s_triggerCounter;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m21985o3(CheckBox checkBox, Activity activity, EditText editText, CheckBox checkBox2, CheckBox checkBox3, AppCompatDialog appCompatDialog, View view) {
        if (Build.VERSION.SDK_INT >= 29 && checkBox.isChecked() && ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.READ_LOGS") != 0) {
            if (C8164a.m33886a()) {
                C4061t1.m15947B0(new String[]{"pm grant com.arlosoft.macrodroid android.permission.READ_LOGS"});
            } else {
                C6364b.m24610a(activity, Collections.singletonList("android.permission.READ_LOGS"));
                return;
            }
        }
        this.m_text = editText.getText().toString();
        this.enableRegex = checkBox2.isChecked();
        this.useAccessibilityService = checkBox3.isChecked();
        this.isConfigured = true;
        C5163j2.m20282v3(mo27827K0(), checkBox.isChecked());
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static /* synthetic */ void m21987q3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m21988r3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), false, true, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* renamed from: s3 */
    private void m21989s3() {
        if (logcatClipboardDetector == null) {
            if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.READ_LOGS") != 0) {
                if (C8164a.m33886a()) {
                    C4061t1.m15947B0(new String[]{"pm grant com.arlosoft.macrodroid android.permission.READ_LOGS"});
                } else {
                    C4878b.m18869h("Could not initialise Clipboard logcat listener, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.READ_LOGS", mo27840Y0().longValue());
                    return;
                }
            }
            C3950a aVar = new C3950a(mo27827K0());
            logcatClipboardDetector = aVar;
            aVar.mo27656h(new C5626a());
            C4878b.m18879r("Listening to logcat for clipboard events");
            logcatClipboardDetector.mo27657i();
        }
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_text};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_text = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: K1 */
    public boolean mo25764K1() {
        return this.isConfigured && Build.VERSION.SDK_INT >= 29 && C5163j2.m20302y(mo27827K0());
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (!mo24824M1()) {
            return SelectableItem.m15535j1(C17541R$string.clipboard_android_10_warning);
        }
        return null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (TextUtils.isEmpty(this.m_text)) {
            return SelectableItem.m15535j1(C17541R$string.any);
        }
        return this.m_text;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        C3950a aVar;
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                ((ClipboardManager) mo27827K0().getApplicationContext().getSystemService("clipboard")).removePrimaryClipChangedListener(s_clipboardListener);
                s_clipboardListener = null;
            } catch (Exception unused) {
            }
            if (Build.VERSION.SDK_INT >= 29 && (aVar = logcatClipboardDetector) != null) {
                aVar.mo27658j();
                logcatClipboardDetector.mo27655g();
                logcatClipboardDetector = null;
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7551s.m31428u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            ClipboardManager clipboardManager = (ClipboardManager) mo27827K0().getSystemService("clipboard");
            C5628c cVar = new C5628c(mo27827K0().getApplicationContext(), clipboardManager);
            s_clipboardListener = cVar;
            clipboardManager.addPrimaryClipChangedListener(cVar);
            if (Build.VERSION.SDK_INT >= 29 && C5163j2.m20302y(mo27827K0())) {
                m21989s3();
            }
        }
        s_triggerCounter++;
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29 && C5163j2.m20302y(mo27827K0());
    }

    /* renamed from: k0 */
    public List<String> mo25570k0() {
        if (!this.isConfigured || Build.VERSION.SDK_INT < 29 || !C5163j2.m20302y(mo27827K0())) {
            return new ArrayList();
        }
        return Collections.singletonList("android.permission.READ_LOGS");
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 200) + ")";
    }

    /* renamed from: m3 */
    public String mo31052m3() {
        return this.m_text;
    }

    /* renamed from: n3 */
    public boolean mo31053n3() {
        return this.enableRegex;
    }

    /* renamed from: r2 */
    public boolean mo25499r2() {
        return this.isConfigured && Build.VERSION.SDK_INT >= 29 && this.useAccessibilityService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_clipboard_change_trigger);
            appCompatDialog.setTitle((int) C17541R$string.trigger_clipboard_change);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_clipboard_change_trigger_text);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.dialog_clipboard_change_trigger_magic_text_button);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex);
            CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.useAccessibilityCheckbox);
            CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.useLogcatCheckbox);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.useAccessibilityInfo);
            TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.useLogcatInfo);
            String str = this.m_text;
            if (str != null) {
                editText.setText(str);
                editText.setSelection(editText.length());
            }
            checkBox.setChecked(this.enableRegex);
            checkBox2.setChecked(this.useAccessibilityService);
            checkBox3.setChecked(C5163j2.m20302y(mo27827K0()));
            int i = Build.VERSION.SDK_INT;
            checkBox3.setVisibility(i >= 29 ? 0 : 8);
            textView2.setVisibility(i >= 29 ? 0 : 8);
            checkBox2.setVisibility(8);
            textView.setVisibility(8);
            button.setOnClickListener(new C5955i2(this, checkBox3, j0, editText, checkBox, checkBox2, appCompatDialog));
            button2.setOnClickListener(new C5931g2(appCompatDialog));
            button3.setOnClickListener(new C5943h2(this, j0, new C5967j2(editText)));
            appCompatDialog.show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_text);
        parcel.writeInt(this.enableRegex ? 1 : 0);
        parcel.writeInt(this.useAccessibilityService ? 1 : 0);
        parcel.writeInt(this.isConfigured ? 1 : 0);
    }

    public ClipboardChangeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ClipboardChangeTrigger() {
        this.useAccessibilityService = false;
        this.isConfigured = false;
        this.m_text = "";
    }

    private ClipboardChangeTrigger(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.useAccessibilityService = false;
        this.isConfigured = false;
        this.m_text = parcel.readString();
        this.enableRegex = parcel.readInt() != 0;
        this.useAccessibilityService = parcel.readInt() != 0;
        this.isConfigured = parcel.readInt() != 0 ? true : z;
    }
}
