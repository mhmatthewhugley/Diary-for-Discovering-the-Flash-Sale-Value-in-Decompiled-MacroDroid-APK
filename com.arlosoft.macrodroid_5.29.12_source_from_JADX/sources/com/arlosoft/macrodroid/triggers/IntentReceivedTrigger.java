package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.p007os.ParcelCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.IntentReceivedTriggerReceiver;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p057a2.C2221j;
import p119k3.C7540p0;
import p135n1.C7967d;

/* compiled from: IntentReceivedTrigger.kt */
public final class IntentReceivedTrigger extends Trigger implements C2221j {
    public static final Parcelable.Creator<IntentReceivedTrigger> CREATOR = new C5666a();
    private static final HashMap<String, IntentReceivedTriggerReceiver> actionReceiverMap = new HashMap<>();

    /* renamed from: d */
    public static final C5667b f13633d = new C5667b((C13695i) null);
    private static final HashMap<Long, String> triggerIdActionsMap = new HashMap<>();
    private String action;
    private boolean enableRegex;
    private List<String> extraParams;
    private List<String> extraValuePatterns;
    private List<String> extraVariables;

    /* renamed from: com.arlosoft.macrodroid.triggers.IntentReceivedTrigger$a */
    /* compiled from: IntentReceivedTrigger.kt */
    public static final class C5666a implements Parcelable.Creator<IntentReceivedTrigger> {
        C5666a() {
        }

        /* renamed from: a */
        public IntentReceivedTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new IntentReceivedTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public IntentReceivedTrigger[] newArray(int i) {
            return new IntentReceivedTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.IntentReceivedTrigger$b */
    /* compiled from: IntentReceivedTrigger.kt */
    public static final class C5667b {
        private C5667b() {
        }

        public /* synthetic */ C5667b(C13695i iVar) {
            this();
        }
    }

    public IntentReceivedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ IntentReceivedTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m22434A3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: n3 */
    private final void m22442n3(Context context, LinearLayout linearLayout, CheckBox checkBox, String str, String str2, String str3) {
        View inflate = LayoutInflater.from(context).inflate(C17535R$layout.include_intent_extra, (ViewGroup) null);
        C13706o.m87927d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        linearLayout.addView(viewGroup);
        ((ImageView) viewGroup.findViewById(C17532R$id.delete_button)).setOnClickListener(new C5897d4(linearLayout, viewGroup, checkBox));
        ((TextView) viewGroup.findViewById(C17532R$id.wildcards_text)).setText(SelectableItem.m15535j1(C17541R$string.wildcards_supported) + " (" + SelectableItem.m15535j1(C17541R$string.value) + ')');
        EditText editText = (EditText) viewGroup.findViewById(C17532R$id.value);
        ((EditText) viewGroup.findViewById(C17532R$id.parameter_name)).setText(str);
        editText.setText(str2);
        ((Button) viewGroup.findViewById(C17532R$id.special_text_button)).setOnClickListener(new C5957i4(this, new C5969j4(editText)));
        ArrayList<MacroDroidVariable> y0 = mo27875y0();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, SelectableItem.m15535j1(C17541R$string.none));
        Spinner spinner = (Spinner) viewGroup.findViewById(C17532R$id.variable_spinner);
        ((Button) viewGroup.findViewById(C17532R$id.add_variable_button)).setOnClickListener(new C5933g4(this, spinner));
        Iterator<MacroDroidVariable> it = y0.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            MacroDroidVariable next = it.next();
            if (C13706o.m87924a(str3, next.getName())) {
                i = i2;
            }
            arrayList.add(next.getName());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, C17535R$layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_dropdown_item_1line);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(i, false);
    }

    /* renamed from: o3 */
    static /* synthetic */ void m22443o3(IntentReceivedTrigger intentReceivedTrigger, Context context, LinearLayout linearLayout, CheckBox checkBox, String str, String str2, String str3, int i, Object obj) {
        intentReceivedTrigger.m22442n3(context, linearLayout, checkBox, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m22444p3(LinearLayout linearLayout, ViewGroup viewGroup, CheckBox checkBox, View view) {
        C13706o.m87929f(linearLayout, "$extrasContainer");
        C13706o.m87929f(viewGroup, "$intentLayout");
        C13706o.m87929f(checkBox, "$enableRegexCheckBox");
        linearLayout.removeView(viewGroup);
        int i = 0;
        if (!(linearLayout.getChildCount() > 0)) {
            i = 8;
        }
        checkBox.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m22445q3(EditText editText, C4023j0.C4029f fVar) {
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
    public static final void m22446r3(IntentReceivedTrigger intentReceivedTrigger, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(intentReceivedTrigger, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15700F(intentReceivedTrigger.mo27850j0(), eVar, intentReceivedTrigger.mo27837X0(), false, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m22447s3(IntentReceivedTrigger intentReceivedTrigger, Spinner spinner, View view) {
        C13706o.m87929f(intentReceivedTrigger, "this$0");
        C6440u1.m24749f(intentReceivedTrigger.mo27850j0(), spinner, intentReceivedTrigger, intentReceivedTrigger.mo24688L0(), true, (C6440u1.C6442b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m22448y3(IntentReceivedTrigger intentReceivedTrigger, AppCompatDialog appCompatDialog, LinearLayout linearLayout, CheckBox checkBox, View view) {
        C13706o.m87929f(intentReceivedTrigger, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(checkBox, "$enableRegexCheckBox");
        Context context = appCompatDialog.getContext();
        C13706o.m87928e(context, "dialog.context");
        C13706o.m87926c(linearLayout);
        m22443o3(intentReceivedTrigger, context, linearLayout, checkBox, (String) null, (String) null, (String) null, 56, (Object) null);
        checkBox.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m22449z3(IntentReceivedTrigger intentReceivedTrigger, EditText editText, CheckBox checkBox, LinearLayout linearLayout, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(intentReceivedTrigger, "this$0");
        C13706o.m87929f(checkBox, "$enableRegexCheckBox");
        C13706o.m87929f(appCompatDialog, "$dialog");
        intentReceivedTrigger.action = String.valueOf(editText != null ? editText.getText() : null);
        intentReceivedTrigger.enableRegex = checkBox.isChecked();
        intentReceivedTrigger.extraParams.clear();
        intentReceivedTrigger.extraValuePatterns.clear();
        intentReceivedTrigger.extraVariables.clear();
        C13706o.m87926c(linearLayout);
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            intentReceivedTrigger.extraParams.add(((TextView) childAt.findViewById(C17532R$id.parameter_name)).getText().toString());
            intentReceivedTrigger.extraValuePatterns.add(((TextView) childAt.findViewById(C17532R$id.value)).getText().toString());
            Spinner spinner = (Spinner) childAt.findViewById(C17532R$id.variable_spinner);
            if (spinner.getSelectedItemPosition() == 0) {
                intentReceivedTrigger.extraVariables.add((Object) null);
            } else {
                List<String> list = intentReceivedTrigger.extraVariables;
                Object selectedItem = spinner.getSelectedItem();
                C13706o.m87927d(selectedItem, "null cannot be cast to non-null type kotlin.String");
                list.add((String) selectedItem);
            }
        }
        appCompatDialog.dismiss();
        intentReceivedTrigger.mo24689O1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.action;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        try {
            String str = this.action;
            if (str != null) {
                HashMap<Long, String> hashMap = triggerIdActionsMap;
                hashMap.remove(Long.valueOf(mo27847f1()));
                if (!hashMap.values().contains(str)) {
                    HashMap<String, IntentReceivedTriggerReceiver> hashMap2 = actionReceiverMap;
                    IntentReceivedTriggerReceiver intentReceivedTriggerReceiver = hashMap2.get(str);
                    if (intentReceivedTriggerReceiver != null) {
                        mo27827K0().unregisterReceiver(intentReceivedTriggerReceiver);
                    }
                    hashMap2.remove(str);
                }
            }
        } catch (Exception e) {
            FirebaseCrashlytics.m6487a().mo22936d(e);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7540p0.f18422j.mo37647a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + ": " + mo24672O0();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        String str = this.action;
        if (str != null) {
            HashMap<Long, String> hashMap = triggerIdActionsMap;
            if (!hashMap.values().contains(str)) {
                IntentFilter intentFilter = new IntentFilter(str);
                IntentReceivedTriggerReceiver intentReceivedTriggerReceiver = new IntentReceivedTriggerReceiver();
                actionReceiverMap.put(str, intentReceivedTriggerReceiver);
                mo27827K0().registerReceiver(intentReceivedTriggerReceiver, intentFilter);
            }
            hashMap.put(Long.valueOf(mo27847f1()), str);
        }
    }

    /* renamed from: a */
    public String[] mo24435a() {
        List<String> list = this.extraVariables;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (String str : list) {
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: e */
    public void mo24436e(String[] strArr) {
        C13706o.m87929f(strArr, "varNames");
        this.extraVariables = C13596m.m87619r0(strArr);
    }

    /* renamed from: t3 */
    public final String mo31226t3() {
        return this.action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_intent_receive);
        appCompatDialog.setTitle((int) C17541R$string.trigger_intent_received);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.action);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        LinearLayout linearLayout = (LinearLayout) appCompatDialog.findViewById(C17532R$id.extras_container);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.add_extra_button);
        View findViewById = appCompatDialog.findViewById(C17532R$id.enable_regex);
        C13706o.m87926c(findViewById);
        CheckBox checkBox = (CheckBox) findViewById;
        for (C13592k0 k0Var : C13566b0.m87411M0(this.extraParams)) {
            Context context = appCompatDialog.getContext();
            C13706o.m87928e(context, "dialog.context");
            C13706o.m87926c(linearLayout);
            m22442n3(context, linearLayout, checkBox, (String) k0Var.mo71845d(), this.extraValuePatterns.get(k0Var.mo71844c()), this.extraVariables.get(k0Var.mo71844c()));
        }
        if (button3 != null) {
            button3.setOnClickListener(new C5945h4(this, appCompatDialog, linearLayout, checkBox));
        }
        if (editText != null) {
            editText.setText(this.action);
        }
        checkBox.setChecked(this.enableRegex);
        checkBox.setVisibility(this.extraParams.isEmpty() ^ true ? 0 : 8);
        if (button != null) {
            button.setOnClickListener(new C5921f4(this, editText, checkBox, linearLayout, appCompatDialog));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C5909e4(appCompatDialog));
        }
        appCompatDialog.show();
    }

    /* renamed from: u3 */
    public final boolean mo31227u3() {
        return this.enableRegex;
    }

    /* renamed from: v3 */
    public final List<String> mo31228v3() {
        return this.extraParams;
    }

    /* renamed from: w3 */
    public final List<String> mo31229w3() {
        return this.extraValuePatterns;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.action);
        parcel.writeStringList(this.extraParams);
        parcel.writeStringList(this.extraValuePatterns);
        parcel.writeStringList(this.extraVariables);
        ParcelCompat.writeBoolean(parcel, this.enableRegex);
    }

    /* renamed from: x3 */
    public final List<String> mo31230x3() {
        return this.extraVariables;
    }

    public IntentReceivedTrigger() {
        this.extraParams = new ArrayList();
        this.extraValuePatterns = new ArrayList();
        this.extraVariables = new ArrayList();
    }

    private IntentReceivedTrigger(Parcel parcel) {
        super(parcel);
        this.extraParams = new ArrayList();
        this.extraValuePatterns = new ArrayList();
        this.extraVariables = new ArrayList();
        this.action = parcel.readString();
        parcel.readStringList(this.extraParams);
        parcel.readStringList(this.extraValuePatterns);
        parcel.readStringList(this.extraVariables);
        this.enableRegex = ParcelCompat.readBoolean(parcel);
    }
}
