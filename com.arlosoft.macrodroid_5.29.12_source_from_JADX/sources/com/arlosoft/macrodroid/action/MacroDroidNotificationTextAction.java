package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatEditText;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import org.apache.commons.p353io.IOUtils;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p057a2.C2224m;
import p128m0.C7705b2;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;
import p370qa.C16271r;

/* compiled from: MacroDroidNotificationTextAction.kt */
public final class MacroDroidNotificationTextAction extends Action implements C2224m {
    public static final Parcelable.Creator<MacroDroidNotificationTextAction> CREATOR = new C2531a();

    /* renamed from: d */
    public static final C2532b f7363d = new C2532b((C13695i) null);
    private String body;
    private boolean showCustom;
    private String title;

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidNotificationTextAction$a */
    /* compiled from: MacroDroidNotificationTextAction.kt */
    public static final class C2531a implements Parcelable.Creator<MacroDroidNotificationTextAction> {
        C2531a() {
        }

        /* renamed from: a */
        public MacroDroidNotificationTextAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new MacroDroidNotificationTextAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public MacroDroidNotificationTextAction[] newArray(int i) {
            return new MacroDroidNotificationTextAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidNotificationTextAction$b */
    /* compiled from: MacroDroidNotificationTextAction.kt */
    public static final class C2532b {
        private C2532b() {
        }

        public /* synthetic */ C2532b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidNotificationTextAction$c */
    /* compiled from: MacroDroidNotificationTextAction.kt */
    static final class C2533c extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2533c(AppCompatDialog appCompatDialog, C13635d<? super C2533c> dVar) {
            super(4, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object mo25347h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2533c cVar = new C2533c(this.$dialog, dVar);
            cVar.Z$0 = z;
            return cVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo25347h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                boolean z = this.Z$0;
                LinearLayout linearLayout = (LinearLayout) this.$dialog.findViewById(C17532R$id.customLayout);
                C13706o.m87928e(linearLayout, "dialog.customLayout");
                linearLayout.setVisibility(z ? 0 : 8);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidNotificationTextAction$d */
    /* compiled from: MacroDroidNotificationTextAction.kt */
    static final class C2534d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $titleMagicTextListener;
        int label;
        final /* synthetic */ MacroDroidNotificationTextAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2534d(MacroDroidNotificationTextAction macroDroidNotificationTextAction, C4023j0.C4028e eVar, C13635d<? super C2534d> dVar) {
            super(3, dVar);
            this.this$0 = macroDroidNotificationTextAction;
            this.$titleMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2534d(this.this$0, this.$titleMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.mo27850j0(), this.$titleMagicTextListener, this.this$0.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, this.this$0.mo24686E1());
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidNotificationTextAction$e */
    /* compiled from: MacroDroidNotificationTextAction.kt */
    static final class C2535e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $bodyMagicTextListener;
        int label;
        final /* synthetic */ MacroDroidNotificationTextAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2535e(MacroDroidNotificationTextAction macroDroidNotificationTextAction, C4023j0.C4028e eVar, C13635d<? super C2535e> dVar) {
            super(3, dVar);
            this.this$0 = macroDroidNotificationTextAction;
            this.$bodyMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2535e(this.this$0, this.$bodyMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15700F(this.this$0.mo27850j0(), this.$bodyMagicTextListener, this.this$0.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, this.this$0.mo24686E1());
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidNotificationTextAction$f */
    /* compiled from: MacroDroidNotificationTextAction.kt */
    static final class C2536f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MacroDroidNotificationTextAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2536f(MacroDroidNotificationTextAction macroDroidNotificationTextAction, C13635d<? super C2536f> dVar) {
            super(2, dVar);
            this.this$0 = macroDroidNotificationTextAction;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2536f(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2536f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
                Context K0 = this.this$0.mo27827K0();
                C13706o.m87928e(K0, "context");
                aVar.mo24644i(K0, true);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public MacroDroidNotificationTextAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ MacroDroidNotificationTextAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m11401n3(AppCompatDialog appCompatDialog, C4023j0.C4029f fVar) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        int i = C17532R$id.titleText;
        int max = Math.max(((AppCompatEditText) appCompatDialog.findViewById(i)).getSelectionStart(), 0);
        int max2 = Math.max(((AppCompatEditText) appCompatDialog.findViewById(i)).getSelectionEnd(), 0);
        Editable text = ((AppCompatEditText) appCompatDialog.findViewById(i)).getText();
        if (text != null) {
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m11402o3(AppCompatDialog appCompatDialog, C4023j0.C4029f fVar) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        int i = C17532R$id.bodyText;
        int max = Math.max(((AppCompatEditText) appCompatDialog.findViewById(i)).getSelectionStart(), 0);
        int max2 = Math.max(((AppCompatEditText) appCompatDialog.findViewById(i)).getSelectionEnd(), 0);
        Editable text = ((AppCompatEditText) appCompatDialog.findViewById(i)).getText();
        if (text != null) {
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m11403p3(MacroDroidNotificationTextAction macroDroidNotificationTextAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(macroDroidNotificationTextAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        macroDroidNotificationTextAction.title = String.valueOf(((AppCompatEditText) appCompatDialog.findViewById(C17532R$id.titleText)).getText());
        macroDroidNotificationTextAction.body = String.valueOf(((AppCompatEditText) appCompatDialog.findViewById(C17532R$id.bodyText)).getText());
        macroDroidNotificationTextAction.showCustom = ((RadioButton) appCompatDialog.findViewById(C17532R$id.customRadioButton)).isChecked();
        appCompatDialog.dismiss();
        macroDroidNotificationTextAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m11404q3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.title, this.body};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 2) {
            this.title = strArr[0];
            this.body = strArr[1];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.showCustom) {
            return this.title + " / " + this.body;
        }
        String j1 = SelectableItem.m15535j1(C17541R$string.macrodroid_default);
        C13706o.m87928e(j1, "{ getString(R.string.macrodroid_default) }");
        return j1;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7705b2.f18664j.mo37744a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.showCustom) {
            String R2 = mo24690R2(this.title, triggerContextInfo);
            String R22 = mo24690R2(this.body, triggerContextInfo);
            C13706o.m87928e(R22, "applyMagicText(body, contextInfo)");
            String E = C15176v.m93630E(R22, "\\n", IOUtils.LINE_SEPARATOR_UNIX, false, 4, (Object) null);
            C5163j2.m19967F4(mo27827K0(), R2);
            C5163j2.m19959E4(mo27827K0(), E);
        } else {
            C5163j2.m19967F4(mo27827K0(), (String) null);
            C5163j2.m19959E4(mo27827K0(), (String) null);
        }
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2536f(this, (C13635d<? super C2536f>) null), 2, (Object) null);
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + ": " + mo24690R2(this.title, triggerContextInfo) + " / " + mo24690R2(this.body, triggerContextInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_macrodroid_notification_text);
        appCompatDialog.setTitle((int) C17541R$string.action_macrodroid_notification_text);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        ((AppCompatEditText) appCompatDialog.findViewById(C17532R$id.titleText)).setText(this.title);
        ((AppCompatEditText) appCompatDialog.findViewById(C17532R$id.bodyText)).setText(this.body);
        ((RadioButton) appCompatDialog.findViewById(C17532R$id.defaultRadioButton)).setChecked(!this.showCustom);
        int i = C17532R$id.customRadioButton;
        ((RadioButton) appCompatDialog.findViewById(i)).setChecked(this.showCustom);
        LinearLayout linearLayout = (LinearLayout) appCompatDialog.findViewById(C17532R$id.customLayout);
        C13706o.m87928e(linearLayout, "dialog.customLayout");
        linearLayout.setVisibility(this.showCustom ? 0 : 8);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(i);
        C13706o.m87928e(radioButton, "dialog.customRadioButton");
        C16061a.m96671b(radioButton, (C13640g) null, new C2533c(appCompatDialog, (C13635d<? super C2533c>) null), 1, (Object) null);
        C3166j9 j9Var = new C3166j9(appCompatDialog);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.titleMagicTextButton);
        C13706o.m87928e(button, "dialog.titleMagicTextButton");
        C4666m.m18147o(button, (C13640g) null, new C2534d(this, j9Var, (C13635d<? super C2534d>) null), 1, (Object) null);
        C3138i9 i9Var = new C3138i9(appCompatDialog);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.bodyMagicTextButton);
        C13706o.m87928e(button2, "dialog.bodyMagicTextButton");
        C4666m.m18147o(button2, (C13640g) null, new C2535e(this, i9Var, (C13635d<? super C2535e>) null), 1, (Object) null);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3110h9(this, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3082g9(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeInt(this.showCustom ? 1 : 0);
    }

    public MacroDroidNotificationTextAction() {
        this.title = "";
        this.body = "";
    }

    private MacroDroidNotificationTextAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.title = str;
        this.body = str;
        String readString = parcel.readString();
        this.title = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.body = readString2 != null ? readString2 : str;
        this.showCustom = parcel.readInt() != 0;
    }
}
