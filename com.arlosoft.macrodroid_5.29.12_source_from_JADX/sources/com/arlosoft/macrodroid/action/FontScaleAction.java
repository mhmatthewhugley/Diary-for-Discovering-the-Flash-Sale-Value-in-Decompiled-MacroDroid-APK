package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.widget.NDSpinner;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p057a2.C2216e;
import p057a2.C2219h;
import p128m0.C7722d1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: FontScaleAction.kt */
public final class FontScaleAction extends Action implements C2219h, C2216e {
    public static final Parcelable.Creator<FontScaleAction> CREATOR = new C2462a();

    /* renamed from: d */
    public static final C2463b f7291d = new C2463b((C13695i) null);
    private int scalePercent;
    private DictionaryKeys varDictionaryKeys;
    private MacroDroidVariable variable;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.FontScaleAction$a */
    /* compiled from: FontScaleAction.kt */
    public static final class C2462a implements Parcelable.Creator<FontScaleAction> {
        C2462a() {
        }

        /* renamed from: a */
        public FontScaleAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new FontScaleAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public FontScaleAction[] newArray(int i) {
            return new FontScaleAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FontScaleAction$b */
    /* compiled from: FontScaleAction.kt */
    public static final class C2463b {
        private C2463b() {
        }

        public /* synthetic */ C2463b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FontScaleAction$c */
    /* compiled from: FontScaleAction.kt */
    public static final class C2464c implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f7292a;

        C2464c(AppCompatDialog appCompatDialog) {
            this.f7292a = appCompatDialog;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append(((SeekBar) this.f7292a.findViewById(C17532R$id.seekBar)).getProgress() + 50);
            sb.append('%');
            ((TextView) this.f7292a.findViewById(C17532R$id.percentText)).setText(sb.toString());
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FontScaleAction$d */
    /* compiled from: FontScaleAction.kt */
    public static final class C2465d implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f7293a;

        /* renamed from: b */
        final /* synthetic */ FontScaleAction f7294b;

        C2465d(AppCompatDialog appCompatDialog, FontScaleAction fontScaleAction) {
            this.f7293a = appCompatDialog;
            this.f7294b = fontScaleAction;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
            LinearLayout linearLayout = (LinearLayout) this.f7293a.findViewById(C17532R$id.barLayout);
            C13706o.m87928e(linearLayout, "dialog.barLayout");
            linearLayout.setVisibility(0);
            TextView textView = (TextView) this.f7293a.findViewById(C17532R$id.percentText);
            C13706o.m87928e(textView, "dialog.percentText");
            textView.setVisibility(0);
            this.f7294b.workingVariable = null;
            this.f7294b.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            LinearLayout linearLayout = (LinearLayout) this.f7293a.findViewById(C17532R$id.barLayout);
            C13706o.m87928e(linearLayout, "dialog.barLayout");
            linearLayout.setVisibility(8);
            TextView textView = (TextView) this.f7293a.findViewById(C17532R$id.percentText);
            C13706o.m87928e(textView, "dialog.percentText");
            textView.setVisibility(8);
            this.f7294b.workingVariable = macroDroidVariable;
            this.f7294b.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FontScaleAction$e */
    /* compiled from: FontScaleAction.kt */
    static final class C2466e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ float $scaleAsFloat;
        int label;
        final /* synthetic */ FontScaleAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2466e(FontScaleAction fontScaleAction, float f, C13635d<? super C2466e> dVar) {
            super(2, dVar);
            this.this$0 = fontScaleAction;
            this.$scaleAsFloat = f;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2466e(this.this$0, this.$scaleAsFloat, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2466e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(500, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                Settings.System.putFloat(this.this$0.mo27827K0().getContentResolver(), "font_scale", this.$scaleAsFloat);
            } catch (Exception e) {
                Long Y0 = this.this$0.mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18869h("Could not set font_scale: " + e, Y0.longValue());
            }
            return C13339u.f61331a;
        }
    }

    public FontScaleAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ FontScaleAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m10819n3(FontScaleAction fontScaleAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(fontScaleAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        fontScaleAction.scalePercent = ((SeekBar) appCompatDialog.findViewById(C17532R$id.seekBar)).getProgress() + 50;
        fontScaleAction.mo24689O1();
        appCompatDialog.dismiss();
        fontScaleAction.variable = fontScaleAction.workingVariable;
        fontScaleAction.varDictionaryKeys = fontScaleAction.workingDictionaryKeys;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m10820o3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb;
        if (this.variable == null) {
            sb = new StringBuilder();
            sb.append(this.scalePercent);
        } else {
            sb = new StringBuilder();
            MacroDroidVariable macroDroidVariable = this.variable;
            sb.append(macroDroidVariable != null ? macroDroidVariable.getName() : null);
            sb.append(C6520o0.m24912e0(this.varDictionaryKeys));
        }
        sb.append('%');
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7722d1.f18693j.mo37748a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        float max;
        MacroDroidVariable macroDroidVariable = this.variable;
        String str = null;
        if (macroDroidVariable == null) {
            max = (float) this.scalePercent;
        } else {
            C13706o.m87926c(macroDroidVariable);
            MacroDroidVariable q = mo27861q(macroDroidVariable.getName());
            if (q != null) {
                Long C = q.mo27732C(this.varDictionaryKeys);
                if (C != null) {
                    float longValue = (float) C.longValue();
                    if (longValue < 50.0f) {
                        Long Y0 = mo27840Y0();
                        C13706o.m87928e(Y0, "macroGuid");
                        C4878b.m18883v("Variable value below minimum, pinning font scale to 50%", Y0.longValue());
                    }
                    if (longValue > 150.0f) {
                        Long Y02 = mo27840Y0();
                        C13706o.m87928e(Y02, "macroGuid");
                        C4878b.m18883v("Variable value above maximum, pinning font scale to 150%", Y02.longValue());
                    }
                    max = Math.max(50.0f, Math.min(150.0f, longValue));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not set font_scale, variable does not exist: ");
                    MacroDroidVariable macroDroidVariable2 = this.variable;
                    if (macroDroidVariable2 != null) {
                        str = macroDroidVariable2.getName();
                    }
                    sb.append(str);
                    sb.append(C6520o0.m24912e0(this.varDictionaryKeys));
                    String sb2 = sb.toString();
                    Long Y03 = mo27840Y0();
                    C13706o.m87928e(Y03, "macroGuid");
                    C4878b.m18869h(sb2, Y03.longValue());
                    return;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not set font_scale, variable does not exist: ");
                MacroDroidVariable macroDroidVariable3 = this.variable;
                if (macroDroidVariable3 != null) {
                    str = macroDroidVariable3.getName();
                }
                sb3.append(str);
                String sb4 = sb3.toString();
                Long Y04 = mo27840Y0();
                C13706o.m87928e(Y04, "macroGuid");
                C4878b.m18869h(sb4, Y04.longValue());
                return;
            }
        }
        float f = max / 100.0f;
        try {
            Settings.System.putFloat(mo27827K0().getContentResolver(), "font_scale", f - 0.001f);
        } catch (Exception e) {
            Long Y05 = mo27840Y0();
            C13706o.m87928e(Y05, "macroGuid");
            C4878b.m18869h("Could not set font_scale: " + e, Y05.longValue());
        }
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C2466e(this, f, (C13635d<? super C2466e>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: k */
    public void mo24427k(DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String str;
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_font_scale);
        appCompatDialog.setTitle((int) C17541R$string.action_font_scale);
        int i = 0;
        C4656c.m18114c(appCompatDialog, 0);
        int i2 = C17532R$id.seekBar;
        ((SeekBar) appCompatDialog.findViewById(i2)).setProgress(this.scalePercent - 50);
        this.workingVariable = this.variable;
        this.workingDictionaryKeys = this.varDictionaryKeys;
        ((SeekBar) appCompatDialog.findViewById(i2)).setOnSeekBarChangeListener(new C2464c(appCompatDialog));
        int i3 = C17532R$id.percentText;
        StringBuilder sb = new StringBuilder();
        sb.append(this.scalePercent);
        sb.append('%');
        ((TextView) appCompatDialog.findViewById(i3)).setText(sb.toString());
        ArrayList arrayList = new ArrayList();
        String j1 = SelectableItem.m15535j1(C17541R$string.use_slider_value);
        C13706o.m87928e(j1, "getString(R.string.use_slider_value)");
        arrayList.add(j1);
        Activity j02 = mo27850j0();
        C13706o.m87928e(j02, "activity");
        NDSpinner nDSpinner = (NDSpinner) appCompatDialog.findViewById(C17532R$id.variablesSpinner);
        C13706o.m87928e(nDSpinner, "dialog.variablesSpinner");
        Macro X0 = mo27837X0();
        String str2 = null;
        if (this.variable != null) {
            StringBuilder sb2 = new StringBuilder();
            MacroDroidVariable macroDroidVariable = this.variable;
            if (macroDroidVariable != null) {
                str2 = macroDroidVariable.getName();
            }
            sb2.append(str2);
            sb2.append(C6520o0.m24912e0(this.varDictionaryKeys));
            str = sb2.toString();
        } else {
            str = null;
        }
        C6520o0.m24879I(j02, C17542R$style.Theme_App_Dialog_Action, this, nDSpinner, X0, arrayList, str, "", false, new C2465d(appCompatDialog, this));
        LinearLayout linearLayout = (LinearLayout) appCompatDialog.findViewById(C17532R$id.barLayout);
        C13706o.m87928e(linearLayout, "dialog.barLayout");
        boolean z = true;
        linearLayout.setVisibility(this.workingVariable == null ? 0 : 8);
        TextView textView = (TextView) appCompatDialog.findViewById(i3);
        C13706o.m87928e(textView, "dialog.percentText");
        if (this.workingVariable != null) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3135i6(this, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3107h6(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.scalePercent);
        parcel.writeParcelable(this.variable, i);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public FontScaleAction() {
        this.scalePercent = 100;
    }

    private FontScaleAction(Parcel parcel) {
        super(parcel);
        this.scalePercent = 100;
        this.scalePercent = parcel.readInt();
        this.variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
