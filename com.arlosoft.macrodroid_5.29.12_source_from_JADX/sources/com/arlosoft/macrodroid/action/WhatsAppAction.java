package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.UiInteractionConfiguration;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Stack;
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
import p057a2.C2212a;
import p057a2.C2224m;
import p128m0.C7743f5;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p370qa.C16270q;

/* compiled from: WhatsAppAction.kt */
public final class WhatsAppAction extends Action implements C2212a, C2224m {
    public static final Parcelable.Creator<WhatsAppAction> CREATOR = new C2791a();
    private static final int PICK_CONTACT_REQUEST_CODE = 99;

    /* renamed from: d */
    public static final C2792b f7700d = new C2792b((C13695i) null);
    /* access modifiers changed from: private */
    public boolean exitAppAfter;
    /* access modifiers changed from: private */
    public boolean isBusiness;
    /* access modifiers changed from: private */
    public String messageText;
    /* access modifiers changed from: private */
    public String number;
    private transient WeakReference<EditText> phoneNumberRef;
    /* access modifiers changed from: private */
    public boolean prepopulateOnly;

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$a */
    /* compiled from: WhatsAppAction.kt */
    public static final class C2791a implements Parcelable.Creator<WhatsAppAction> {
        C2791a() {
        }

        /* renamed from: a */
        public WhatsAppAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new WhatsAppAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public WhatsAppAction[] newArray(int i) {
            return new WhatsAppAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$b */
    /* compiled from: WhatsAppAction.kt */
    public static final class C2792b {
        private C2792b() {
        }

        public /* synthetic */ C2792b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$c */
    /* compiled from: WhatsAppAction.kt */
    static final class C2793c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListenerNumber;
        int label;
        final /* synthetic */ WhatsAppAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2793c(WhatsAppAction whatsAppAction, C4023j0.C4028e eVar, C13635d<? super C2793c> dVar) {
            super(3, dVar);
            this.this$0 = whatsAppAction;
            this.$magicTextListenerNumber = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2793c(this.this$0, this.$magicTextListenerNumber, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.mo27850j0(), this.$magicTextListenerNumber, this.this$0.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, this.this$0.mo24686E1());
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$d */
    /* compiled from: WhatsAppAction.kt */
    static final class C2794d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $textMagicTextListener;
        int label;
        final /* synthetic */ WhatsAppAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2794d(WhatsAppAction whatsAppAction, C4023j0.C4028e eVar, C13635d<? super C2794d> dVar) {
            super(3, dVar);
            this.this$0 = whatsAppAction;
            this.$textMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2794d(this.this$0, this.$textMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.mo27850j0(), this.$textMagicTextListener, this.this$0.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, this.this$0.mo24686E1());
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$e */
    /* compiled from: WhatsAppAction.kt */
    static final class C2795e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ WhatsAppAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2795e(WhatsAppAction whatsAppAction, C13635d<? super C2795e> dVar) {
            super(3, dVar);
            this.this$0 = whatsAppAction;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2795e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Intent intent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
                intent.setType("vnd.android.cursor.dir/phone_v2");
                this.this$0.mo27850j0().startActivityForResult(intent, 99);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$f */
    /* compiled from: WhatsAppAction.kt */
    static final class C2796f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ RadioButton $businessRadioButton;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ CheckBox $exitAfterSendCheckbox;
        final /* synthetic */ EditText $messageTextField;
        final /* synthetic */ EditText $phoneNumberField;
        final /* synthetic */ CheckBox $prePopulateCheckbox;
        int label;
        final /* synthetic */ WhatsAppAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2796f(WhatsAppAction whatsAppAction, RadioButton radioButton, EditText editText, EditText editText2, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, C13635d<? super C2796f> dVar) {
            super(3, dVar);
            this.this$0 = whatsAppAction;
            this.$businessRadioButton = radioButton;
            this.$messageTextField = editText;
            this.$phoneNumberField = editText2;
            this.$exitAfterSendCheckbox = checkBox;
            this.$prePopulateCheckbox = checkBox2;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2796f(this.this$0, this.$businessRadioButton, this.$messageTextField, this.$phoneNumberField, this.$exitAfterSendCheckbox, this.$prePopulateCheckbox, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.isBusiness = this.$businessRadioButton.isChecked();
                this.this$0.messageText = this.$messageTextField.getText().toString();
                this.this$0.number = this.$phoneNumberField.getText().toString();
                WhatsAppAction whatsAppAction = this.this$0;
                CheckBox checkBox = this.$exitAfterSendCheckbox;
                boolean z = false;
                whatsAppAction.exitAppAfter = checkBox != null ? checkBox.isChecked() : false;
                WhatsAppAction whatsAppAction2 = this.this$0;
                CheckBox checkBox2 = this.$prePopulateCheckbox;
                if (checkBox2 != null) {
                    z = checkBox2.isChecked();
                }
                whatsAppAction2.prepopulateOnly = z;
                this.$dialog.dismiss();
                this.this$0.mo24689O1();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$g */
    /* compiled from: WhatsAppAction.kt */
    static final class C2797g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2797g(AppCompatDialog appCompatDialog, C13635d<? super C2797g> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2797g(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.action.WhatsAppAction$h */
    /* compiled from: WhatsAppAction.kt */
    static final class C2798h extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TriggerContextInfo $contextInfo;
        final /* synthetic */ boolean $forceEvenIfNotEnabled;
        final /* synthetic */ boolean $isTest;
        final /* synthetic */ int $nextAction;
        final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
        final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
        int label;
        final /* synthetic */ WhatsAppAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2798h(WhatsAppAction whatsAppAction, TriggerContextInfo triggerContextInfo, boolean z, int i, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2798h> dVar) {
            super(2, dVar);
            this.this$0 = whatsAppAction;
            this.$contextInfo = triggerContextInfo;
            this.$isTest = z;
            this.$nextAction = i;
            this.$forceEvenIfNotEnabled = z2;
            this.$skipEndifIndexStack = stack;
            this.$resumeMacroInfo = resumeMacroInfo;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2798h(this.this$0, this.$contextInfo, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2798h) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x0023
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                p297ja.C13332o.m85685b(r9)
                goto L_0x00b6
            L_0x0016:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001e:
                p297ja.C13332o.m85685b(r9)
                goto L_0x00a6
            L_0x0023:
                p297ja.C13332o.m85685b(r9)
                goto L_0x0084
            L_0x0027:
                p297ja.C13332o.m85685b(r9)
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                android.content.Context r9 = r9.mo27827K0()
                com.arlosoft.macrodroid.action.WhatsAppAction r1 = r8.this$0
                java.lang.String r1 = r1.number
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r5 = r8.$contextInfo
                r6 = 0
                com.arlosoft.macrodroid.action.WhatsAppAction r7 = r8.this$0
                com.arlosoft.macrodroid.macro.Macro r7 = r7.mo27837X0()
                java.lang.String r9 = com.arlosoft.macrodroid.common.C4023j0.m15764v0(r9, r1, r5, r6, r7)
                if (r9 == 0) goto L_0x004d
                java.lang.String r1 = "[sms_number]"
                boolean r1 = kotlin.jvm.internal.C13706o.m87924a(r9, r1)
                if (r1 == 0) goto L_0x0061
            L_0x004d:
                com.arlosoft.macrodroid.action.WhatsAppAction r1 = r8.this$0
                java.lang.Long r1 = r1.mo27840Y0()
                java.lang.String r5 = "macroGuid"
                kotlin.jvm.internal.C13706o.m87928e(r1, r5)
                long r5 = r1.longValue()
                java.lang.String r1 = "No number available to send SMS to - [sms_number] must be set by the trigger"
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r1, r5)
            L_0x0061:
                if (r9 == 0) goto L_0x00dc
                com.arlosoft.macrodroid.action.WhatsAppAction r1 = r8.this$0
                java.lang.String r5 = r1.messageText
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r8.$contextInfo
                java.lang.String r1 = r1.mo24690R2(r5, r6)
                com.arlosoft.macrodroid.action.WhatsAppAction r5 = r8.this$0
                java.lang.String r6 = "textWithNewlines"
                kotlin.jvm.internal.C13706o.m87928e(r1, r6)
                r5.m13823F3(r9, r1)
                r5 = 2000(0x7d0, double:9.88E-321)
                r8.label = r4
                java.lang.Object r9 = kotlinx.coroutines.C15552u0.m94699a(r5, r8)
                if (r9 != r0) goto L_0x0084
                return r0
            L_0x0084:
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                boolean r9 = r9.prepopulateOnly
                if (r9 != 0) goto L_0x0093
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r8.$contextInfo
                r9.m13839y3(r1)
            L_0x0093:
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                boolean r9 = r9.exitAppAfter
                if (r9 == 0) goto L_0x00bb
                r4 = 600(0x258, double:2.964E-321)
                r8.label = r3
                java.lang.Object r9 = kotlinx.coroutines.C15552u0.m94699a(r4, r8)
                if (r9 != r0) goto L_0x00a6
                return r0
            L_0x00a6:
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                r9.m13819B3()
                r3 = 100
                r8.label = r2
                java.lang.Object r9 = kotlinx.coroutines.C15552u0.m94699a(r3, r8)
                if (r9 != r0) goto L_0x00b6
                return r0
            L_0x00b6:
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                r9.m13819B3()
            L_0x00bb:
                boolean r9 = r8.$isTest
                if (r9 != 0) goto L_0x00dc
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                com.arlosoft.macrodroid.macro.Macro r0 = r9.mo27837X0()
                com.arlosoft.macrodroid.action.WhatsAppAction r9 = r8.this$0
                com.arlosoft.macrodroid.macro.Macro r9 = r9.mo27837X0()
                java.util.ArrayList r1 = r9.getActions()
                int r2 = r8.$nextAction
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r3 = r8.$contextInfo
                boolean r4 = r8.$forceEvenIfNotEnabled
                java.util.Stack<java.lang.Integer> r5 = r8.$skipEndifIndexStack
                com.arlosoft.macrodroid.data.ResumeMacroInfo r6 = r8.$resumeMacroInfo
                r0.invokeActions(r1, r2, r3, r4, r5, r6)
            L_0x00dc:
                ja.u r9 = p297ja.C13339u.f61331a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.WhatsAppAction.C2798h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WhatsAppAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ WhatsAppAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: A3 */
    private final String m13818A3(String str) {
        PhoneNumberUtil q = PhoneNumberUtil.m78800q();
        String i = q.mo64358i(q.mo64352W(str, "GB"), PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
        C13706o.m87928e(i, "phoneUtil.format(gbNumbe…mberFormat.INTERNATIONAL)");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m13819B3() {
        UiInteractionConfiguration.PressBack pressBack = UiInteractionConfiguration.PressBack.INSTANCE;
        Intent intent = new Intent(mo27827K0(), UIInteractionAccessibilityService.class);
        intent.putExtra("uiInteractionConfig", pressBack);
        mo27827K0().startService(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m13820C3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$phoneNumberField");
        int b = C16792h.m99540b(editText.getSelectionStart(), 0);
        int b2 = C16792h.m99540b(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        C13706o.m87926c(text);
        int d = C16792h.m99542d(b, b2);
        int b3 = C16792h.m99540b(b, b2);
        String str = fVar.f10575a;
        text.replace(d, b3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m13821D3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$messageTextField");
        int b = C16792h.m99540b(editText.getSelectionStart(), 0);
        int b2 = C16792h.m99540b(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int d = C16792h.m99542d(b, b2);
        int b3 = C16792h.m99540b(b, b2);
        String str = fVar.f10575a;
        text.replace(d, b3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m13822E3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public final void m13823F3(String str, String str2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(m13840z3());
            intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + str + "&text=" + URLEncoder.encode(str2, "UTF-8")));
            intent.addFlags(268435456);
            intent.addFlags(32768);
            mo27827K0().startActivity(intent);
        } catch (Exception e) {
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Contact via app failed: " + e, Y0.longValue());
            C15626c.m94876a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.error) + ": " + e, 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m13839y3(TriggerContextInfo triggerContextInfo) {
        UiInteractionConfiguration.Click click = new UiInteractionConfiguration.Click(3, false, (Point) null, (String) null, (String) null, (String) null, 0, (String) null, m13840z3() + ":id/send");
        Intent intent = new Intent(mo27827K0(), UIInteractionAccessibilityService.class);
        intent.putExtra("triggerContextInfo", triggerContextInfo);
        intent.putExtra("macroGuid", mo27837X0().getGUID());
        intent.putExtra("uiInteractionConfig", click);
        mo27827K0().startService(intent);
    }

    /* renamed from: z3 */
    private final String m13840z3() {
        return this.isBusiness ? "com.whatsapp.w4b" : "com.whatsapp";
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.number, this.messageText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87926c(strArr);
        if (strArr.length == 2) {
            this.number = strArr[0];
            this.messageText = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.number + ": " + this.messageText;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7743f5.f18725j.mo37751a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        Stack<Integer> stack2 = stack;
        C13706o.m87929f(stack2, "skipEndifIndexStack");
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93731c(), (C15486m0) null, new C2798h(this, triggerContextInfo, z2, i, z, stack2, resumeMacroInfo, (C13635d<? super C2798h>) null), 2, (Object) null);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        EditText editText;
        C13706o.m87929f(activity, "activity");
        if (i == 99 && i2 == -1) {
            C13706o.m87926c(intent);
            Uri data = intent.getData();
            C13706o.m87926c(data);
            Cursor query = mo27827K0().getContentResolver().query(data, new String[]{"data1"}, (String) null, (String[]) null, (String) null);
            if (query != null && query.getCount() > 0) {
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex("data1"));
                C13706o.m87928e(string, "number");
                String A3 = m13818A3(string);
                WeakReference<EditText> weakReference = this.phoneNumberRef;
                if (!(weakReference == null || (editText = (EditText) weakReference.get()) == null)) {
                    editText.setText(A3);
                }
            }
            if (query != null) {
                query.close();
            }
        }
    }

    /* renamed from: r2 */
    public boolean mo25499r2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Button button;
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_whatsapp_configure);
        appCompatDialog.setTitle((int) C17541R$string.action_whats_app);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        View findViewById = appCompatDialog.findViewById(C17532R$id.messageText);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.phoneNumber);
        C13706o.m87926c(findViewById2);
        EditText editText2 = (EditText) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.magicTextButtonNumber);
        C13706o.m87926c(findViewById3);
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.magicTextButtonMessage);
        C13706o.m87926c(findViewById4);
        ImageButton imageButton = (ImageButton) appCompatDialog.findViewById(C17532R$id.selectContactButton);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.exitAfterSendCheckbox);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.prePopulateCheckbox);
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.standardRadioButton);
        C13706o.m87926c(findViewById5);
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.businessRadioButton);
        C13706o.m87926c(findViewById6);
        RadioButton radioButton = (RadioButton) findViewById6;
        this.phoneNumberRef = new WeakReference<>(editText2);
        ((RadioButton) findViewById5).setChecked(!this.isBusiness);
        radioButton.setChecked(this.isBusiness);
        C3183jq jqVar = new C3183jq(editText2);
        C3211kq kqVar = new C3211kq(editText);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        C4666m.m18147o((Button) findViewById3, (C13640g) null, new C2793c(this, jqVar, (C13635d<? super C2793c>) null), 1, (Object) null);
        C4666m.m18147o((Button) findViewById4, (C13640g) null, new C2794d(this, kqVar, (C13635d<? super C2794d>) null), 1, (Object) null);
        editText.setText(this.messageText);
        editText2.setText(this.number);
        if (checkBox != null) {
            checkBox.setChecked(this.exitAppAfter);
        }
        if (checkBox2 != null) {
            checkBox2.setChecked(this.prepopulateOnly);
        }
        if (imageButton != null) {
            try {
                C4666m.m18147o(imageButton, (C13640g) null, new C2795e(this, (C13635d<? super C2795e>) null), 1, (Object) null);
            } catch (Exception unused) {
                C15626c.makeText(mo27827K0(), C17541R$string.no_app_available, 0).show();
            }
        }
        if (button2 != null) {
            C4666m.m18147o(button2, (C13640g) null, new C2796f(this, radioButton, editText, editText2, checkBox, checkBox2, appCompatDialog, (C13635d<? super C2796f>) null), 1, (Object) null);
        }
        if (button3 != null) {
            button = button3;
            C4666m.m18147o(button, (C13640g) null, new C2797g(appCompatDialog, (C13635d<? super C2797g>) null), 1, (Object) null);
        } else {
            button = button3;
        }
        if (button != null) {
            button.setOnClickListener(new C3155iq(appCompatDialog));
        }
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.number);
        parcel.writeString(this.messageText);
        parcel.writeInt(this.prepopulateOnly ? 1 : 0);
        parcel.writeInt(this.exitAppAfter ? 1 : 0);
        parcel.writeInt(this.isBusiness ? 1 : 0);
    }

    public WhatsAppAction() {
        this.number = "";
        this.messageText = "";
        this.exitAppAfter = true;
    }

    private WhatsAppAction(Parcel parcel) {
        super(parcel);
        this.number = "";
        this.messageText = "";
        boolean z = true;
        this.exitAppAfter = true;
        String readString = parcel.readString();
        C13706o.m87926c(readString);
        this.number = readString;
        String readString2 = parcel.readString();
        C13706o.m87926c(readString2);
        this.messageText = readString2;
        this.prepopulateOnly = parcel.readInt() != 0;
        this.exitAppAfter = parcel.readInt() != 0;
        this.isBusiness = parcel.readInt() == 0 ? false : z;
    }
}
