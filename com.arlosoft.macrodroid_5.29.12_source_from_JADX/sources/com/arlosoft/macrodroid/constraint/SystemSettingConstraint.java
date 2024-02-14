package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p057a2.C2224m;
import p123l1.C7661z0;
import p297ja.C13328m;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16270q;

/* compiled from: SystemSettingConstraint.kt */
public final class SystemSettingConstraint extends Constraint implements C2224m {
    public static final Parcelable.Creator<SystemSettingConstraint> CREATOR = new C4193a();
    private static final String[] DIALOG_OPTIONS = {"System", "Secure", "Global"};
    private static final int EQUALITY_CHECK_EQUALS = 0;
    private static final int EQUALITY_CHECK_GREATER_THAN_OR_EXCLUDES = 3;
    private static final int EQUALITY_CHECK_LESS_THAN_OR_CONTAINS = 2;
    private static final int EQUALITY_CHECK_NOT_EQUALS = 1;
    private static final int TABLE_OPTION_GLOBAL = 2;
    private static final int TABLE_OPTION_SECURE = 1;
    private static final int TABLE_OPTION_SYSTEM = 0;
    private static final int VALUE_TYPE_FLOAT = 1;
    private static final int VALUE_TYPE_INT = 0;
    private static final int VALUE_TYPE_LONG = 2;
    private static final int VALUE_TYPE_STRING = 3;

    /* renamed from: f */
    public static final C4194b f10762f = new C4194b((C13695i) null);
    /* access modifiers changed from: private */
    public int equalityCheckOption;
    /* access modifiers changed from: private */
    public String settingString;
    private int tableOption;
    /* access modifiers changed from: private */
    public String valueString;
    /* access modifiers changed from: private */
    public int valueType;

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$a */
    /* compiled from: SystemSettingConstraint.kt */
    public static final class C4193a implements Parcelable.Creator<SystemSettingConstraint> {
        C4193a() {
        }

        /* renamed from: a */
        public SystemSettingConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SystemSettingConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SystemSettingConstraint[] newArray(int i) {
            return new SystemSettingConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$b */
    /* compiled from: SystemSettingConstraint.kt */
    public static final class C4194b {
        private C4194b() {
        }

        public /* synthetic */ C4194b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String[] m17089c() {
            return new String[]{"System", "Secure", "Global"};
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String[] m17090d() {
            String k3 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_integer);
            C13706o.m87928e(k3, "getString(R.string.actio…tem_setting_type_integer)");
            Locale locale = Locale.ROOT;
            String lowerCase = k3.toLowerCase(locale);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String k32 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_floating_point_number);
            C13706o.m87928e(k32, "getString(R.string.actio…pe_floating_point_number)");
            String k33 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_long_number);
            C13706o.m87928e(k33, "getString(R.string.actio…setting_type_long_number)");
            String k34 = SelectableItem.m15535j1(C17541R$string.action_system_setting_type_string);
            C13706o.m87928e(k34, "getString(R.string.actio…stem_setting_type_string)");
            String lowerCase2 = k34.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return new String[]{lowerCase, k32, k33, lowerCase2};
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$c */
    /* compiled from: TextView.kt */
    public static final class C4195c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10763a;

        /* renamed from: c */
        final /* synthetic */ EditText f10764c;

        /* renamed from: d */
        final /* synthetic */ EditText f10765d;

        public C4195c(Button button, EditText editText, EditText editText2) {
            this.f10763a = button;
            this.f10764c = editText;
            this.f10765d = editText2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            if ((r0.length() > 0) != false) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r5) {
            /*
                r4 = this;
                android.widget.Button r5 = r4.f10763a
                android.widget.EditText r0 = r4.f10764c
                android.text.Editable r0 = r0.getText()
                java.lang.String r1 = "keyText.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                int r0 = r0.length()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto L_0x0017
                r0 = 1
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                if (r0 == 0) goto L_0x0031
                android.widget.EditText r0 = r4.f10765d
                android.text.Editable r0 = r0.getText()
                java.lang.String r3 = "valueText.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x002d
                r0 = 1
                goto L_0x002e
            L_0x002d:
                r0 = 0
            L_0x002e:
                if (r0 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r1 = 0
            L_0x0032:
                r5.setEnabled(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.SystemSettingConstraint.C4195c.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$d */
    /* compiled from: TextView.kt */
    public static final class C4196d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10766a;

        /* renamed from: c */
        final /* synthetic */ EditText f10767c;

        /* renamed from: d */
        final /* synthetic */ EditText f10768d;

        public C4196d(Button button, EditText editText, EditText editText2) {
            this.f10766a = button;
            this.f10767c = editText;
            this.f10768d = editText2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            if ((r0.length() > 0) != false) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r5) {
            /*
                r4 = this;
                android.widget.Button r5 = r4.f10766a
                android.widget.EditText r0 = r4.f10767c
                android.text.Editable r0 = r0.getText()
                java.lang.String r1 = "keyText.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                int r0 = r0.length()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto L_0x0017
                r0 = 1
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                if (r0 == 0) goto L_0x0031
                android.widget.EditText r0 = r4.f10768d
                android.text.Editable r0 = r0.getText()
                java.lang.String r3 = "valueText.text"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x002d
                r0 = 1
                goto L_0x002e
            L_0x002d:
                r0 = 0
            L_0x002e:
                if (r0 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r1 = 0
            L_0x0032:
                r5.setEnabled(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.SystemSettingConstraint.C4196d.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$e */
    /* compiled from: Comparisons.kt */
    public static final class C4197e<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C15612b.m94865a((String) ((C13328m) t).mo70154c(), (String) ((C13328m) t2).mo70154c());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$f */
    /* compiled from: SystemSettingConstraint.kt */
    public static final class C4198f implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ RadioButton f10769a;

        /* renamed from: c */
        final /* synthetic */ RadioButton f10770c;

        C4198f(RadioButton radioButton, RadioButton radioButton2) {
            this.f10769a = radioButton;
            this.f10770c = radioButton2;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C13706o.m87929f(view, "view");
            if (i == 3) {
                this.f10769a.setText(C17541R$string.contains);
                this.f10770c.setText(C17541R$string.excludes);
                return;
            }
            this.f10769a.setText("<");
            this.f10770c.setText(">");
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$g */
    /* compiled from: SystemSettingConstraint.kt */
    static final class C4199g extends C13708q implements C16265l<Integer, C13339u> {
        final /* synthetic */ EditText $keyText;
        final /* synthetic */ Spinner $typeSpinner;
        final /* synthetic */ List<C13328m<String, String>> $updatedList;
        final /* synthetic */ EditText $valueText;
        final /* synthetic */ SystemSettingConstraint this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4199g(List<C13328m<String, String>> list, EditText editText, EditText editText2, Spinner spinner, SystemSettingConstraint systemSettingConstraint) {
            super(1);
            this.$updatedList = list;
            this.$keyText = editText;
            this.$valueText = editText2;
            this.$typeSpinner = spinner;
            this.this$0 = systemSettingConstraint;
        }

        /* renamed from: a */
        public final void mo28331a(int i) {
            if (i > 0) {
                C13328m mVar = this.$updatedList.get(i);
                this.$keyText.setText((CharSequence) mVar.mo70154c());
                this.$valueText.setText((CharSequence) mVar.mo70155d());
                this.$typeSpinner.setSelection(this.this$0.m17074y3((String) mVar.mo70155d()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28331a(((Number) obj).intValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$h */
    /* compiled from: SystemSettingConstraint.kt */
    static final class C4200h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ EditText $keyText;
        final /* synthetic */ RadioButton $radioButtonEquals;
        final /* synthetic */ RadioButton $radioButtonLessOrContains;
        final /* synthetic */ RadioButton $radioButtonNotEquals;
        final /* synthetic */ Spinner $typeSpinner;
        final /* synthetic */ EditText $valueText;
        int label;
        final /* synthetic */ SystemSettingConstraint this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4200h(SystemSettingConstraint systemSettingConstraint, EditText editText, EditText editText2, Spinner spinner, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, AppCompatDialog appCompatDialog, C13635d<? super C4200h> dVar) {
            super(3, dVar);
            this.this$0 = systemSettingConstraint;
            this.$keyText = editText;
            this.$valueText = editText2;
            this.$typeSpinner = spinner;
            this.$radioButtonEquals = radioButton;
            this.$radioButtonNotEquals = radioButton2;
            this.$radioButtonLessOrContains = radioButton3;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4200h(this.this$0, this.$keyText, this.$valueText, this.$typeSpinner, this.$radioButtonEquals, this.$radioButtonNotEquals, this.$radioButtonLessOrContains, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.settingString = this.$keyText.getText().toString();
                this.this$0.valueString = this.$valueText.getText().toString();
                SystemSettingConstraint systemSettingConstraint = this.this$0;
                Spinner spinner = this.$typeSpinner;
                int i = 0;
                systemSettingConstraint.valueType = spinner != null ? spinner.getSelectedItemPosition() : 0;
                SystemSettingConstraint systemSettingConstraint2 = this.this$0;
                if (!this.$radioButtonEquals.isChecked()) {
                    if (this.$radioButtonNotEquals.isChecked()) {
                        i = 1;
                    } else {
                        i = this.$radioButtonLessOrContains.isChecked() ? 2 : 3;
                    }
                }
                systemSettingConstraint2.equalityCheckOption = i;
                this.this$0.mo24689O1();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SystemSettingConstraint$i */
    /* compiled from: SystemSettingConstraint.kt */
    static final class C4201i extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4201i(AppCompatDialog appCompatDialog, C13635d<? super C4201i> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4201i(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
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

    public SystemSettingConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SystemSettingConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: q3 */
    private final boolean m17066q3(float f) {
        Float k = C15174t.m93621k(this.valueString);
        float floatValue = k != null ? k.floatValue() : 0.0f;
        int i = this.equalityCheckOption;
        if (i == 2) {
            if (f < floatValue) {
                return true;
            }
        } else if (i == 3) {
            if (f > floatValue) {
                return true;
            }
        } else if (i != 0) {
            if (!(floatValue == f)) {
                return true;
            }
        } else if (floatValue == f) {
            return true;
        }
        return false;
    }

    /* renamed from: r3 */
    private final boolean m17067r3(long j) {
        Long n = C15175u.m93624n(this.valueString);
        long longValue = n != null ? n.longValue() : 0;
        int i = this.equalityCheckOption;
        if (i == 2) {
            if (j < longValue) {
                return true;
            }
        } else if (i == 3) {
            if (j > longValue) {
                return true;
            }
        } else if (i == 0) {
            if (longValue == j) {
                return true;
            }
        } else if (longValue != j) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x006c A[RETURN, SYNTHETIC] */
    /* renamed from: s3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m17068s3(java.lang.String r8, com.arlosoft.macrodroid.triggers.TriggerContextInfo r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.valueString
            com.arlosoft.macrodroid.macro.Macro r2 = r7.mo27837X0()
            java.lang.String r9 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r0, r1, r9, r2)
            java.lang.String r0 = "textContent"
            kotlin.jvm.internal.C13706o.m87928e(r9, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "getDefault()"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.lang.String r0 = r9.toLowerCase(r0)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r3 = 0
            java.lang.String r0 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r0, r3)
            java.util.Locale r4 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C13706o.m87928e(r4, r1)
            java.lang.String r9 = r9.toLowerCase(r4)
            kotlin.jvm.internal.C13706o.m87928e(r9, r2)
            java.lang.String r9 = com.arlosoft.macrodroid.utils.C6460y1.m24790b(r9, r3)
            int r4 = r7.equalityCheckOption
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L_0x0055
            java.util.Locale r0 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.lang.String r8 = r8.toLowerCase(r0)
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)
            boolean r3 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r8, r9, r3)
            goto L_0x0089
        L_0x0055:
            r6 = 3
            if (r4 != r6) goto L_0x006e
            java.util.Locale r0 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.lang.String r8 = r8.toLowerCase(r0)
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)
            boolean r8 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r8, r9, r3)
            if (r8 != 0) goto L_0x0089
        L_0x006c:
            r3 = 1
            goto L_0x0089
        L_0x006e:
            java.util.Locale r9 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C13706o.m87928e(r9, r1)
            java.lang.String r8 = r8.toLowerCase(r9)
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)
            boolean r8 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r8, r0, r3)
            int r9 = r7.equalityCheckOption
            if (r9 != 0) goto L_0x0086
            r3 = r8
            goto L_0x0089
        L_0x0086:
            if (r8 != 0) goto L_0x0089
            goto L_0x006c
        L_0x0089:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.SystemSettingConstraint.m17068s3(java.lang.String, com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0291  */
    /* renamed from: t3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17069t3(java.util.List<p297ja.C13328m<java.lang.String, java.lang.String>> r25) {
        /*
            r24 = this;
            r10 = r24
            androidx.appcompat.app.AppCompatDialog r11 = new androidx.appcompat.app.AppCompatDialog
            android.app.Activity r0 = r24.mo27850j0()
            kotlin.jvm.internal.C13706o.m87926c(r0)
            int r1 = r24.mo24688L0()
            r11.<init>(r0, r1)
            r0 = 2131558651(0x7f0d00fb, float:1.8742624E38)
            r11.setContentView((int) r0)
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$b r0 = f10762f
            java.lang.String[] r0 = r0.m17089c()
            int r1 = r10.tableOption
            r0 = r0[r1]
            r11.setTitle((java.lang.CharSequence) r0)
            r6 = 0
            r12 = 1
            r13 = 0
            com.arlosoft.macrodroid.extensions.C4656c.m18115d(r11, r6, r12, r13)
            r0 = 2131363007(0x7f0a04bf, float:1.834581E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 2131364198(0x7f0a0966, float:1.8348226E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 2131364121(0x7f0a0919, float:1.834807E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r9 = r0
            android.widget.Spinner r9 = (android.widget.Spinner) r9
            r0 = 2131363838(0x7f0a07fe, float:1.8347496E38)
            android.view.View r0 = r11.findViewById(r0)
            r14 = r0
            android.widget.Spinner r14 = (android.widget.Spinner) r14
            r0 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r15 = r0
            android.widget.Button r15 = (android.widget.Button) r15
            r0 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r0 = r11.findViewById(r0)
            r5 = r0
            android.widget.Button r5 = (android.widget.Button) r5
            r0 = 2131363008(0x7f0a04c0, float:1.8345813E38)
            android.view.View r0 = r11.findViewById(r0)
            r4 = r0
            android.widget.Button r4 = (android.widget.Button) r4
            r0 = 2131364200(0x7f0a0968, float:1.834823E38)
            android.view.View r0 = r11.findViewById(r0)
            r3 = r0
            android.widget.Button r3 = (android.widget.Button) r3
            r0 = 2131363557(0x7f0a06e5, float:1.8346926E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r2 = r0
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = 2131363564(0x7f0a06ec, float:1.834694E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r1 = r0
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r0 = 2131363561(0x7f0a06e9, float:1.8346934E38)
            android.view.View r0 = r11.findViewById(r0)
            kotlin.jvm.internal.C13706o.m87926c(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r13 = 2131363560(0x7f0a06e8, float:1.8346932E38)
            android.view.View r13 = r11.findViewById(r13)
            kotlin.jvm.internal.C13706o.m87926c(r13)
            android.widget.RadioButton r13 = (android.widget.RadioButton) r13
            int r6 = r10.equalityCheckOption
            if (r6 != 0) goto L_0x00bf
            r6 = 1
            goto L_0x00c0
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            r2.setChecked(r6)
            int r6 = r10.equalityCheckOption
            if (r6 != r12) goto L_0x00c9
            r6 = 1
            goto L_0x00ca
        L_0x00c9:
            r6 = 0
        L_0x00ca:
            r1.setChecked(r6)
            int r6 = r10.equalityCheckOption
            r12 = 2
            if (r6 != r12) goto L_0x00d4
            r6 = 1
            goto L_0x00d5
        L_0x00d4:
            r6 = 0
        L_0x00d5:
            r0.setChecked(r6)
            int r6 = r10.equalityCheckOption
            r12 = 3
            if (r6 != r12) goto L_0x00df
            r6 = 1
            goto L_0x00e0
        L_0x00df:
            r6 = 0
        L_0x00e0:
            r13.setChecked(r6)
            int r6 = r10.valueType
            if (r6 != r12) goto L_0x00f4
            r6 = 2131952957(0x7f13053d, float:1.9542371E38)
            r0.setText(r6)
            r6 = 2131953201(0x7f130631, float:1.9542866E38)
            r13.setText(r6)
            goto L_0x00fe
        L_0x00f4:
            java.lang.String r6 = "<"
            r0.setText(r6)
            java.lang.String r6 = ">"
            r13.setText(r6)
        L_0x00fe:
            java.util.List r6 = kotlin.collections.C13566b0.m87405I0(r25)
            int r12 = r6.size()
            r17 = r1
            r1 = 1
            if (r12 <= r1) goto L_0x0113
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$e r1 = new com.arlosoft.macrodroid.constraint.SystemSettingConstraint$e
            r1.<init>()
            kotlin.collections.C13622x.m87781y(r6, r1)
        L_0x0113:
            ja.m r1 = new ja.m
            r12 = 2131954833(0x7f130c91, float:1.9546176E38)
            java.lang.String r12 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r12)
            r18 = r2
            java.lang.String r2 = ""
            r1.<init>(r12, r2)
            r12 = 0
            r6.add(r12, r1)
            android.app.Activity r1 = r24.mo27850j0()
            java.util.ArrayList r12 = new java.util.ArrayList
            r25 = r2
            r2 = 10
            int r2 = kotlin.collections.C13616u.m87774u(r6, r2)
            r12.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x013c:
            boolean r19 = r2.hasNext()
            if (r19 == 0) goto L_0x01a1
            java.lang.Object r19 = r2.next()
            ja.m r19 = (p297ja.C13328m) r19
            r20 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r21 = r19.mo70154c()
            r22 = r3
            r3 = r21
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.Object r3 = r19.mo70155d()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x016a
            r3 = 1
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r3 == 0) goto L_0x0172
            r3 = r25
            r21 = r4
            goto L_0x0190
        L_0x0172:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r21 = r4
            java.lang.String r4 = " ("
            r3.append(r4)
            java.lang.Object r4 = r19.mo70155d()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0190:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.add(r2)
            r2 = r20
            r4 = r21
            r3 = r22
            goto L_0x013c
        L_0x01a1:
            r22 = r3
            r21 = r4
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r1, r3, r12)
            r1 = 2131559004(0x7f0d025c, float:1.874334E38)
            r2.setDropDownViewResource(r1)
            if (r14 != 0) goto L_0x01b6
            goto L_0x01b9
        L_0x01b6:
            r14.setAdapter(r2)
        L_0x01b9:
            r12 = 0
            if (r14 == 0) goto L_0x01bf
            r14.setSelection(r12, r12)
        L_0x01bf:
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            android.app.Activity r4 = r24.mo27850j0()
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$b r16 = f10762f
            java.lang.String[] r12 = r16.m17090d()
            r2.<init>(r4, r3, r12)
            r2.setDropDownViewResource(r1)
            r9.setAdapter(r2)
            int r1 = r10.valueType
            r9.setSelection(r1)
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$f r1 = new com.arlosoft.macrodroid.constraint.SystemSettingConstraint$f
            r1.<init>(r0, r13)
            r9.setOnItemSelectedListener(r1)
            if (r14 == 0) goto L_0x0203
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$g r12 = new com.arlosoft.macrodroid.constraint.SystemSettingConstraint$g
            r13 = r0
            r0 = r12
            r16 = r17
            r1 = r6
            r6 = r18
            r2 = r7
            r4 = r22
            r3 = r8
            r17 = r11
            r25 = r13
            r11 = r21
            r13 = r4
            r4 = r9
            r23 = r5
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            com.arlosoft.macrodroid.extensions.C4666m.m18145m(r14, r12)
            goto L_0x0211
        L_0x0203:
            r25 = r0
            r23 = r5
            r16 = r17
            r6 = r18
            r13 = r22
            r17 = r11
            r11 = r21
        L_0x0211:
            java.lang.String r0 = r10.settingString
            r7.setText(r0)
            java.lang.String r0 = r10.valueString
            r8.setText(r0)
            com.arlosoft.macrodroid.constraint.i3 r0 = new com.arlosoft.macrodroid.constraint.i3
            r0.<init>(r7)
            if (r11 == 0) goto L_0x022a
            com.arlosoft.macrodroid.constraint.g3 r1 = new com.arlosoft.macrodroid.constraint.g3
            r1.<init>(r10, r0)
            r11.setOnClickListener(r1)
        L_0x022a:
            com.arlosoft.macrodroid.constraint.h3 r0 = new com.arlosoft.macrodroid.constraint.h3
            r0.<init>(r8)
            if (r13 == 0) goto L_0x0239
            com.arlosoft.macrodroid.constraint.f3 r1 = new com.arlosoft.macrodroid.constraint.f3
            r1.<init>(r9, r10, r0)
            r13.setOnClickListener(r1)
        L_0x0239:
            java.lang.String r0 = r10.settingString
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0243
            r1 = 1
            goto L_0x0244
        L_0x0243:
            r1 = 0
        L_0x0244:
            if (r1 == 0) goto L_0x0255
            java.lang.String r0 = r10.valueString
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0250
            r1 = 1
            goto L_0x0251
        L_0x0250:
            r1 = 0
        L_0x0251:
            if (r1 == 0) goto L_0x0255
            r0 = 1
            goto L_0x0256
        L_0x0255:
            r0 = 0
        L_0x0256:
            r15.setEnabled(r0)
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$c r0 = new com.arlosoft.macrodroid.constraint.SystemSettingConstraint$c
            r0.<init>(r15, r7, r8)
            r7.addTextChangedListener(r0)
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$d r0 = new com.arlosoft.macrodroid.constraint.SystemSettingConstraint$d
            r0.<init>(r15, r7, r8)
            r8.addTextChangedListener(r0)
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$h r11 = new com.arlosoft.macrodroid.constraint.SystemSettingConstraint$h
            r12 = 0
            r0 = r11
            r1 = r24
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r6
            r6 = r16
            r7 = r25
            r8 = r17
            r9 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 1
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r15, r0, r11, r1, r0)
            r2 = r23
            if (r2 == 0) goto L_0x0291
            com.arlosoft.macrodroid.constraint.SystemSettingConstraint$i r3 = new com.arlosoft.macrodroid.constraint.SystemSettingConstraint$i
            r4 = r17
            r3.<init>(r4, r0)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r2, r0, r3, r1, r0)
            goto L_0x0293
        L_0x0291:
            r4 = r17
        L_0x0293:
            r4.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.SystemSettingConstraint.m17069t3(java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m17070u3(EditText editText, C4023j0.C4029f fVar) {
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
    /* renamed from: v3 */
    public static final void m17071v3(SystemSettingConstraint systemSettingConstraint, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(systemSettingConstraint, "this$0");
        C13706o.m87929f(eVar, "$keyMagicTextListener");
        C4023j0.m15700F(systemSettingConstraint.mo27850j0(), eVar, systemSettingConstraint.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Constraint_SmallText, systemSettingConstraint.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m17072w3(EditText editText, C4023j0.C4029f fVar) {
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
    /* renamed from: x3 */
    public static final void m17073x3(Spinner spinner, SystemSettingConstraint systemSettingConstraint, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(spinner, "$typeSpinner");
        C13706o.m87929f(systemSettingConstraint, "this$0");
        C13706o.m87929f(eVar, "$valueMagicTextListener");
        if (spinner.getSelectedItemPosition() == 3) {
            C4023j0.m15700F(systemSettingConstraint.mo27850j0(), eVar, systemSettingConstraint.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Constraint_SmallText, systemSettingConstraint.mo24686E1());
            return;
        }
        C4023j0.m15693A(systemSettingConstraint.mo27850j0(), systemSettingConstraint.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Constraint_SmallText, systemSettingConstraint.mo24686E1());
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
    /* renamed from: y3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m17074y3(java.lang.String r1) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.SystemSettingConstraint.m17074y3(java.lang.String):int");
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

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = f10762f.m17089c()[this.tableOption] + '(' + this.settingString + ')';
        String str2 = "!=";
        if (this.valueType == 3) {
            int i = this.equalityCheckOption;
            if (i != 0) {
                if (i != 1) {
                    str2 = i != 2 ? ">" : "<";
                }
                return str + ' ' + str2 + ' ' + this.valueString;
            }
        } else {
            int i2 = this.equalityCheckOption;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        str2 = SelectableItem.m15535j1(C17541R$string.excludes);
                        C13706o.m87928e(str2, "getString(R.string.excludes)");
                    } else {
                        str2 = SelectableItem.m15535j1(C17541R$string.contains);
                        C13706o.m87928e(str2, "getString(R.string.contains)");
                    }
                }
                return str + ' ' + str2 + ' ' + this.valueString;
            }
        }
        str2 = "=";
        return str + ' ' + str2 + ' ' + this.valueString;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int i;
        float f;
        long j;
        String str;
        String t0 = C4023j0.m15760t0(mo27827K0(), this.settingString, triggerContextInfo, mo27837X0());
        try {
            int i2 = this.valueType;
            if (i2 == 0) {
                int i3 = this.tableOption;
                if (i3 == TABLE_OPTION_SYSTEM) {
                    i = Settings.System.getInt(mo27827K0().getContentResolver(), t0);
                } else if (i3 == TABLE_OPTION_SECURE) {
                    i = Settings.Secure.getInt(mo27827K0().getContentResolver(), t0);
                } else if (i3 == TABLE_OPTION_GLOBAL) {
                    i = Settings.Global.getInt(mo27827K0().getContentResolver(), t0);
                } else {
                    throw new IllegalArgumentException();
                }
                return m17067r3((long) i);
            } else if (i2 == 1) {
                int i4 = this.tableOption;
                if (i4 == TABLE_OPTION_SYSTEM) {
                    f = Settings.System.getFloat(mo27827K0().getContentResolver(), t0);
                } else if (i4 == TABLE_OPTION_SECURE) {
                    f = Settings.Secure.getFloat(mo27827K0().getContentResolver(), t0);
                } else if (i4 == TABLE_OPTION_GLOBAL) {
                    f = Settings.Global.getFloat(mo27827K0().getContentResolver(), t0);
                } else {
                    throw new IllegalArgumentException();
                }
                return m17066q3(f);
            } else if (i2 == 2) {
                int i5 = this.tableOption;
                if (i5 == TABLE_OPTION_SYSTEM) {
                    j = Settings.System.getLong(mo27827K0().getContentResolver(), t0);
                } else if (i5 == TABLE_OPTION_SECURE) {
                    j = Settings.Secure.getLong(mo27827K0().getContentResolver(), t0);
                } else if (i5 == TABLE_OPTION_GLOBAL) {
                    j = Settings.Global.getLong(mo27827K0().getContentResolver(), t0);
                } else {
                    throw new IllegalArgumentException();
                }
                return m17067r3(j);
            } else if (i2 != 3) {
                return true;
            } else {
                int i6 = this.tableOption;
                if (i6 == TABLE_OPTION_SYSTEM) {
                    str = Settings.System.getString(mo27827K0().getContentResolver(), t0);
                } else if (i6 == TABLE_OPTION_SECURE) {
                    str = Settings.Secure.getString(mo27827K0().getContentResolver(), t0);
                } else if (i6 == TABLE_OPTION_GLOBAL) {
                    str = Settings.Global.getString(mo27827K0().getContentResolver(), t0);
                } else {
                    throw new IllegalArgumentException();
                }
                if (str != null) {
                    return m17068s3(str, triggerContextInfo);
                }
                C4878b.m18868g("Constraint check failed. The setting (" + t0 + ") does not exist on this device: " + t0);
                return false;
            }
        } catch (Settings.SettingNotFoundException unused) {
            C4878b.m18868g("Constraint check failed. The setting (" + t0 + ") does not exist on this device: " + t0);
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7661z0.f18571g.mo37673a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return DIALOG_OPTIONS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        try {
            ContentResolver contentResolver = mo27827K0().getContentResolver();
            StringBuilder sb = new StringBuilder();
            sb.append("content://settings/");
            String lowerCase = f10762f.m17089c()[this.tableOption].toLowerCase(Locale.ROOT);
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
            m17069t3(arrayList);
            query.close();
        } catch (Exception unused) {
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.valueType);
        parcel.writeInt(this.tableOption);
        parcel.writeString(this.settingString);
        parcel.writeString(this.valueString);
        parcel.writeInt(this.equalityCheckOption);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.tableOption = i;
    }

    public SystemSettingConstraint() {
        this.settingString = "";
        this.valueString = "";
    }

    private SystemSettingConstraint(Parcel parcel) {
        super(parcel);
        String str = "";
        this.settingString = str;
        this.valueString = str;
        this.valueType = parcel.readInt();
        this.tableOption = parcel.readInt();
        String readString = parcel.readString();
        this.settingString = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.valueString = readString2 != null ? readString2 : str;
        this.equalityCheckOption = parcel.readInt();
    }
}
