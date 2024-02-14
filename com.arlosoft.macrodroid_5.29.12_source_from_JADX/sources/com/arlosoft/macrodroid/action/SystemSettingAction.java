package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import org.apache.commons.p353io.IOUtils;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p057a2.C2224m;
import p128m0.C7803n4;
import p150q2.C8164a;
import p177v1.C10316a;
import p297ja.C13328m;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16270q;
import p370qa.C16271r;

/* compiled from: SystemSettingAction.kt */
public final class SystemSettingAction extends Action implements C2224m {
    public static final Parcelable.Creator<SystemSettingAction> CREATOR = new C2708a();
    private static final String[] DIALOG_OPTIONS = {"System", "Secure<br/><small>(" + SelectableItem.m15535j1(C17541R$string.root_or_adb_hack) + ")</small>", "Global<br/><small>(" + SelectableItem.m15535j1(C17541R$string.root_or_adb_hack) + ")</small>"};

    /* renamed from: d */
    public static final C2709b f7614d = new C2709b((C13695i) null);
    /* access modifiers changed from: private */
    public String settingString;
    private int tableOption;
    /* access modifiers changed from: private */
    public boolean useHelper;
    /* access modifiers changed from: private */
    public String valueString;
    /* access modifiers changed from: private */
    public int valueType;

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$a */
    /* compiled from: SystemSettingAction.kt */
    public static final class C2708a implements Parcelable.Creator<SystemSettingAction> {
        C2708a() {
        }

        /* renamed from: a */
        public SystemSettingAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SystemSettingAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SystemSettingAction[] newArray(int i) {
            return new SystemSettingAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$b */
    /* compiled from: SystemSettingAction.kt */
    public static final class C2709b {
        private C2709b() {
        }

        public /* synthetic */ C2709b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String[] m13245c() {
            return new String[]{"System", "Secure", "Global"};
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String[] m13246d() {
            String r3 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_integer);
            C13706o.m87928e(r3, "getString(R.string.actio…tem_setting_type_integer)");
            Locale locale = Locale.ROOT;
            String lowerCase = r3.toLowerCase(locale);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String r32 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_floating_point_number);
            C13706o.m87928e(r32, "getString(R.string.actio…pe_floating_point_number)");
            String r33 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_long_number);
            C13706o.m87928e(r33, "getString(R.string.actio…setting_type_long_number)");
            String r34 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_string);
            C13706o.m87928e(r34, "getString(R.string.actio…stem_setting_type_string)");
            String lowerCase2 = r34.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return new String[]{lowerCase, r32, r33, lowerCase2};
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$c */
    /* compiled from: SystemSettingAction.kt */
    public static final class C2710c extends ArrayAdapter<CharSequence> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2710c(ContextThemeWrapper contextThemeWrapper, String[] strArr) {
            super(contextThemeWrapper, C17535R$layout.single_choice_list_item, (CharSequence[]) strArr);
            C13706o.m87927d(strArr, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C13706o.m87929f(viewGroup, "parent");
            View view2 = super.getView(i, view, viewGroup);
            C13706o.m87928e(view2, "super.getView(position, convertView, parent)");
            ((TextView) view2.findViewById(16908308)).setText(C6413o0.m24692a(String.valueOf(getItem(i))));
            return view2;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$d */
    /* compiled from: Comparisons.kt */
    public static final class C2711d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C15612b.m94865a((String) ((C13328m) t).mo70154c(), (String) ((C13328m) t2).mo70154c());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$e */
    /* compiled from: SystemSettingAction.kt */
    static final class C2712e extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        int label;

        C2712e(C13635d<? super C2712e> dVar) {
            super(4, dVar);
        }

        /* renamed from: h */
        public final Object mo25828h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            return new C2712e(dVar).invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo25828h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$f */
    /* compiled from: SystemSettingAction.kt */
    static final class C2713f extends C13708q implements C16265l<Integer, C13339u> {
        final /* synthetic */ EditText $keyText;
        final /* synthetic */ Spinner $typeSpinner;
        final /* synthetic */ List<C13328m<String, String>> $updatedList;
        final /* synthetic */ EditText $valueText;
        final /* synthetic */ SystemSettingAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2713f(List<C13328m<String, String>> list, EditText editText, EditText editText2, Spinner spinner, SystemSettingAction systemSettingAction) {
            super(1);
            this.$updatedList = list;
            this.$keyText = editText;
            this.$valueText = editText2;
            this.$typeSpinner = spinner;
            this.this$0 = systemSettingAction;
        }

        /* renamed from: a */
        public final void mo25829a(int i) {
            if (i > 0) {
                C13328m mVar = this.$updatedList.get(i);
                this.$keyText.setText((CharSequence) mVar.mo70154c());
                this.$valueText.setText((CharSequence) mVar.mo70155d());
                Spinner spinner = this.$typeSpinner;
                if (spinner != null) {
                    spinner.setSelection(this.this$0.m13206J3((String) mVar.mo70155d()));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo25829a(((Number) obj).intValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$g */
    /* compiled from: SystemSettingAction.kt */
    static final class C2714g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ CheckBox $helperCheckbox;
        final /* synthetic */ EditText $keyText;
        final /* synthetic */ Spinner $typeSpinner;
        final /* synthetic */ EditText $valueText;
        int label;
        final /* synthetic */ SystemSettingAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2714g(SystemSettingAction systemSettingAction, CheckBox checkBox, EditText editText, EditText editText2, Spinner spinner, AppCompatDialog appCompatDialog, C13635d<? super C2714g> dVar) {
            super(3, dVar);
            this.this$0 = systemSettingAction;
            this.$helperCheckbox = checkBox;
            this.$keyText = editText;
            this.$valueText = editText2;
            this.$typeSpinner = spinner;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2714g(this.this$0, this.$helperCheckbox, this.$keyText, this.$valueText, this.$typeSpinner, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                SystemSettingAction systemSettingAction = this.this$0;
                CheckBox checkBox = this.$helperCheckbox;
                int i = 0;
                systemSettingAction.useHelper = checkBox != null ? checkBox.isChecked() : false;
                this.this$0.settingString = this.$keyText.getText().toString();
                this.this$0.valueString = this.$valueText.getText().toString();
                SystemSettingAction systemSettingAction2 = this.this$0;
                Spinner spinner = this.$typeSpinner;
                if (spinner != null) {
                    i = spinner.getSelectedItemPosition();
                }
                systemSettingAction2.valueType = i;
                this.this$0.mo24689O1();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SystemSettingAction$h */
    /* compiled from: SystemSettingAction.kt */
    static final class C2715h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2715h(AppCompatDialog appCompatDialog, C13635d<? super C2715h> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2715h(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SystemSettingAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SystemSettingAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m13197A3(SystemSettingAction systemSettingAction, DialogInterface dialogInterface) {
        C13706o.m87929f(systemSettingAction, "this$0");
        systemSettingAction.mo24706w1();
    }

    /* renamed from: B3 */
    private final void m13198B3(List<C13328m<String, String>> list) {
        CheckBox checkBox;
        Button button;
        Button button2;
        Button button3;
        C15264f fVar;
        int i;
        Button button4;
        String str;
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_system_setting);
        appCompatDialog.setTitle((CharSequence) f7614d.m13245c()[this.tableOption]);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        View findViewById = appCompatDialog.findViewById(C17532R$id.key);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.value);
        C13706o.m87926c(findViewById2);
        EditText editText2 = (EditText) findViewById2;
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.typeSpinner);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(2131363838);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button6 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.helperFileCheckBox);
        Button button7 = (Button) appCompatDialog.findViewById(C17532R$id.keyMagicTextButton);
        Button button8 = (Button) appCompatDialog.findViewById(C17532R$id.valueMagicTextButton);
        String str2 = this.settingString;
        if (str2 == null || str2.length() == 0) {
            if (checkBox2 != null) {
                checkBox2.setChecked(C4031k.m15910j());
            }
        } else if (checkBox2 != null) {
            checkBox2.setChecked(this.useHelper);
        }
        if (checkBox2 != null) {
            C16061a.m96671b(checkBox2, (C13640g) null, new C2712e((C13635d<? super C2712e>) null), 1, (Object) null);
        }
        List I0 = C13566b0.m87405I0(list);
        if (I0.size() > 1) {
            C13622x.m87781y(I0, new C2711d());
        }
        I0.add(0, new C13328m(SelectableItem.m15535j1(C17541R$string.select_option), ""));
        Activity j02 = mo27850j0();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(I0, 10));
        Iterator it = I0.iterator();
        while (it.hasNext()) {
            C13328m mVar = (C13328m) it.next();
            Iterator it2 = it;
            StringBuilder sb = new StringBuilder();
            Button button9 = button8;
            sb.append((String) mVar.mo70154c());
            if (((CharSequence) mVar.mo70155d()).length() == 0) {
                button4 = button7;
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                button4 = button7;
                sb2.append(" (");
                sb2.append((String) mVar.mo70155d());
                sb2.append(')');
                str = sb2.toString();
            }
            sb.append(str);
            arrayList.add(sb.toString());
            it = it2;
            button7 = button4;
            button8 = button9;
        }
        Button button10 = button8;
        Button button11 = button7;
        ArrayAdapter arrayAdapter = new ArrayAdapter(j02, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        if (spinner2 != null) {
            spinner2.setAdapter(arrayAdapter);
        }
        if (spinner2 != null) {
            spinner2.setSelection(0, false);
        }
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(mo27850j0(), 17367048, f7614d.m13246d());
        arrayAdapter2.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(arrayAdapter2);
        }
        if (spinner != null) {
            spinner.setSelection(this.valueType);
        }
        if (spinner2 != null) {
            button3 = button10;
            button = button6;
            button2 = button11;
            checkBox = checkBox2;
            C4666m.m18145m(spinner2, new C2713f(I0, editText, editText2, spinner, this));
        } else {
            checkBox = checkBox2;
            button = button6;
            button2 = button11;
            button3 = button10;
        }
        editText.setText(this.settingString);
        editText2.setText(this.valueString);
        C3123hm hmVar = new C3123hm(editText);
        if (button2 != null) {
            button2.setOnClickListener(new C3067fm(this, hmVar));
        }
        C3095gm gmVar = new C3095gm(editText2);
        if (button3 != null) {
            button3.setOnClickListener(new C3038em(this, gmVar));
        }
        if (button5 != null) {
            i = 1;
            fVar = null;
            C4666m.m18147o(button5, (C13640g) null, new C2714g(this, checkBox, editText, editText2, spinner, appCompatDialog, (C13635d<? super C2714g>) null), 1, (Object) null);
        } else {
            i = 1;
            fVar = null;
        }
        if (button != null) {
            C4666m.m18147o(button, fVar, new C2715h(appCompatDialog, fVar), i, fVar);
        }
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m13199C3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$keyText");
        C13706o.m87929f(fVar, "pair");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m13200D3(SystemSettingAction systemSettingAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(systemSettingAction, "this$0");
        C13706o.m87929f(eVar, "$keyMagicTextListener");
        C4023j0.m15700F(systemSettingAction.mo27850j0(), eVar, systemSettingAction.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, systemSettingAction.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m13201E3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$valueText");
        C13706o.m87929f(fVar, "pair");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m13202F3(SystemSettingAction systemSettingAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(systemSettingAction, "this$0");
        C13706o.m87929f(eVar, "$valueMagicTextListener");
        C4023j0.m15700F(systemSettingAction.mo27850j0(), eVar, systemSettingAction.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, systemSettingAction.mo24686E1());
    }

    /* renamed from: G3 */
    private final String m13203G3() {
        int i = this.tableOption;
        return i != 0 ? i != 1 ? "global" : ClientCookie.SECURE_ATTR : "system";
    }

    /* renamed from: H3 */
    private final String m13204H3() {
        int i = this.valueType;
        return i != 0 ? i != 1 ? i != 2 ? TypedValues.Custom.S_STRING : "long" : TypedValues.Custom.S_FLOAT : "int";
    }

    /* renamed from: I3 */
    private final String m13205I3(String str, TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), str, triggerContextInfo, mo27837X0());
        C13706o.m87928e(t0, "replaceMagicText(context…text, contextInfo, macro)");
        return C15176v.m93630E(t0, "\\n", IOUtils.LINE_SEPARATOR_UNIX, false, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        java.lang.Long.parseLong(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        java.lang.Float.parseFloat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return 3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000a */
    /* renamed from: J3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m13206J3(java.lang.String r1) {
        /*
            r0 = this;
            java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0005 }
            r1 = 0
            return r1
        L_0x0005:
            java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x000a }
            r1 = 2
            return r1
        L_0x000a:
            java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x000f }
            r1 = 1
            return r1
        L_0x000f:
            r1 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SystemSettingAction.m13206J3(java.lang.String):int");
    }

    /* renamed from: K3 */
    private final void m13207K3(TriggerContextInfo triggerContextInfo) {
        String I3 = m13205I3(this.settingString, triggerContextInfo);
        String I32 = m13205I3(this.valueString, triggerContextInfo);
        try {
            int i = this.tableOption;
            if (i == 0) {
                try {
                    int i2 = this.valueType;
                    if (i2 == 0) {
                        Settings.System.putInt(mo27827K0().getContentResolver(), I3, Integer.parseInt(I32));
                    } else if (i2 == 1) {
                        Settings.System.putFloat(mo27827K0().getContentResolver(), I3, Float.parseFloat(I32));
                    } else if (i2 == 2) {
                        Settings.System.putLong(mo27827K0().getContentResolver(), I3, Long.parseLong(I32));
                    } else if (i2 == 3) {
                        Settings.System.putString(mo27827K0().getContentResolver(), I3, I32);
                    }
                } catch (Exception e) {
                    String str = "Could not set " + I3 + ": " + e;
                    Long Y0 = mo27840Y0();
                    C13706o.m87928e(Y0, "macroGuid");
                    C4878b.m18869h(str, Y0.longValue());
                }
            } else if (i != 1) {
                if (i == 2) {
                    if (!C8164a.m33886a()) {
                        try {
                            int i3 = this.valueType;
                            if (i3 == 0) {
                                Settings.Global.putInt(mo27827K0().getContentResolver(), I3, Integer.parseInt(I32));
                            } else if (i3 == 1) {
                                Settings.Global.putFloat(mo27827K0().getContentResolver(), I3, Float.parseFloat(I32));
                            } else if (i3 == 2) {
                                Settings.Global.putLong(mo27827K0().getContentResolver(), I3, Long.parseLong(I32));
                            } else if (i3 == 3) {
                                Settings.Global.putString(mo27827K0().getContentResolver(), I3, I32);
                            }
                        } catch (SecurityException unused) {
                            String str2 = "Could not set " + I3 + ", you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS";
                            Long Y02 = mo27840Y0();
                            C13706o.m87928e(Y02, "macroGuid");
                            C4878b.m18869h(str2, Y02.longValue());
                        } catch (Exception e2) {
                            String str3 = "Could not set " + I3 + ": " + e2;
                            Long Y03 = mo27840Y0();
                            C13706o.m87928e(Y03, "macroGuid");
                            C4878b.m18869h(str3, Y03.longValue());
                        }
                    } else {
                        C4061t1.m15947B0(new String[]{"settings put global " + I3 + ' ' + I32});
                    }
                }
            } else if (!C8164a.m33886a()) {
                try {
                    int i4 = this.valueType;
                    if (i4 == 0) {
                        Settings.Secure.putInt(mo27827K0().getContentResolver(), I3, Integer.parseInt(I32));
                    } else if (i4 == 1) {
                        Settings.Secure.putFloat(mo27827K0().getContentResolver(), I3, Float.parseFloat(I32));
                    } else if (i4 == 2) {
                        Settings.Secure.putLong(mo27827K0().getContentResolver(), I3, Long.parseLong(I32));
                    } else if (i4 == 3) {
                        Settings.Secure.putString(mo27827K0().getContentResolver(), I3, I32);
                    }
                } catch (SecurityException unused2) {
                    String str4 = "Could not set " + I3 + ", you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS";
                    Long Y04 = mo27840Y0();
                    C13706o.m87928e(Y04, "macroGuid");
                    C4878b.m18869h(str4, Y04.longValue());
                } catch (Exception e3) {
                    String str5 = "Could not set " + I3 + ": " + e3;
                    Long Y05 = mo27840Y0();
                    C13706o.m87928e(Y05, "macroGuid");
                    C4878b.m18869h(str5, Y05.longValue());
                }
            } else {
                C4061t1.m15947B0(new String[]{"settings put secure " + I3 + ' ' + this.valueString});
            }
        } catch (Exception e4) {
            String exc = e4.toString();
            Long Y06 = mo27840Y0();
            C13706o.m87928e(Y06, "macroGuid");
            C4878b.m18869h(exc, Y06.longValue());
        }
    }

    /* renamed from: L3 */
    private final void m13208L3(TriggerContextInfo triggerContextInfo) {
        if (C4031k.m15910j()) {
            String I3 = m13205I3(this.settingString, triggerContextInfo);
            String I32 = m13205I3(this.valueString, triggerContextInfo);
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18874m("Calling helper file to set system setting.", Y0.longValue());
            Context K0 = mo27827K0();
            C13706o.m87928e(K0, "context");
            HelperSystemCommands.m24582e(K0, m13203G3(), m13204H3(), I3, I32);
            return;
        }
        Long Y02 = mo27840Y0();
        C13706o.m87928e(Y02, "macroGuid");
        C4878b.m18869h("System setting is configured to use the helper file, but the helper file is not installed. Please see: https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/", Y02.longValue());
        Context K02 = mo27827K0();
        C13706o.m87928e(K02, "context");
        String a1 = mo25559a1();
        C13706o.m87928e(a1, "name");
        C10316a.m40521a(K02, a1, "1.4");
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m13223x3(SystemSettingAction systemSettingAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(systemSettingAction, "this$0");
        systemSettingAction.mo24679x2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m13224y3(SystemSettingAction systemSettingAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(systemSettingAction, "this$0");
        systemSettingAction.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m13225z3(SystemSettingAction systemSettingAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(systemSettingAction, "this$0");
        systemSettingAction.mo27873w2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.tableOption;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.settingString, this.valueString};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 2) {
            this.settingString = strArr[0];
            this.valueString = strArr[1];
            return;
        }
        C4878b.m18868g("SystemSettingAction - Incorrect length when setting magic text");
    }

    /* renamed from: K1 */
    public boolean mo25764K1() {
        return this.tableOption > 0 && !this.useHelper;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return '[' + f7614d.m13245c()[this.tableOption] + "] " + this.settingString + " = " + this.valueString;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7803n4.f18822j.mo37762a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.useHelper) {
            m13208L3(triggerContextInfo);
        } else {
            m13207K3(triggerContextInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return DIALOG_OPTIONS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        C2710c cVar = new C2710c(new ContextThemeWrapper(mo27850j0(), mo24705l0()), mo24676g1());
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((ListAdapter) cVar, mo24671D0(), (DialogInterface.OnClickListener) new C2981cm(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3010dm(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2953bm(this));
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
        create.setOnCancelListener(new C2925am(this));
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        String j1 = SelectableItem.m15535j1(C17541R$string.action_system_setting_select_settings_table);
        C13706o.m87928e(j1, "getString(R.string.actio…ng_select_settings_table)");
        return j1;
    }

    /* renamed from: k0 */
    public List<String> mo25570k0() {
        if (this.tableOption == 0 || this.useHelper) {
            return null;
        }
        return C13612s.m87736e("android.permission.WRITE_SECURE_SETTINGS");
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return !this.useHelper;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        try {
            ContentResolver contentResolver = mo27827K0().getContentResolver();
            StringBuilder sb = new StringBuilder();
            sb.append("content://settings/");
            String lowerCase = f7614d.m13245c()[this.tableOption].toLowerCase(Locale.ROOT);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            sb.append(lowerCase);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), new String[]{"name", "value"}, (String) null, (String[]) null, (String) null);
            C13706o.m87926c(query);
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex("name"));
                String string2 = query.getString(query.getColumnIndex("value"));
                if (string2 == null) {
                    string2 = "";
                }
                arrayList.add(new C13328m(string, string2));
            }
            m13198B3(arrayList);
            query.close();
        } catch (Exception unused) {
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.tableOption);
        parcel.writeString(this.settingString);
        parcel.writeString(this.valueString);
        parcel.writeInt(this.valueType);
        parcel.writeInt(this.useHelper ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.tableOption = i;
    }

    public SystemSettingAction() {
        this.settingString = "";
        this.valueString = "";
    }

    private SystemSettingAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.settingString = str;
        this.valueString = str;
        this.tableOption = parcel.readInt();
        String readString = parcel.readString();
        this.settingString = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.valueString = readString2 != null ? readString2 : str;
        this.valueType = parcel.readInt();
        this.useHelper = parcel.readInt() != 0;
    }
}
