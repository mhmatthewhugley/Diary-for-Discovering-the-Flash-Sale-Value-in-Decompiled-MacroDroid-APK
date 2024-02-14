package p116k0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.activities.IfThenConfirmDialogActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.IOUtils;
import p135n1.C7967d;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16272s;

/* renamed from: k0.l */
/* compiled from: ConfirmNextHelper.kt */
public final class C7467l {

    /* renamed from: k0.l$a */
    /* compiled from: ConfirmNextHelper.kt */
    public static final class C7468a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f18316a;

        /* renamed from: c */
        final /* synthetic */ EditText f18317c;

        /* renamed from: d */
        final /* synthetic */ EditText f18318d;

        /* renamed from: f */
        final /* synthetic */ EditText f18319f;

        /* renamed from: g */
        final /* synthetic */ EditText f18320g;

        C7468a(Button button, EditText editText, EditText editText2, EditText editText3, EditText editText4) {
            this.f18316a = button;
            this.f18317c = editText;
            this.f18318d = editText2;
            this.f18319f = editText3;
            this.f18320g = editText4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005e, code lost:
            if (((r0 == null || (r0 = r0.getText()) == null || r0.length() <= 0) ? false : true) != false) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = r0.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r4) {
            /*
                r3 = this;
                java.lang.String r0 = "s"
                kotlin.jvm.internal.C13706o.m87929f(r4, r0)
                android.widget.Button r4 = r3.f18316a
                if (r4 != 0) goto L_0x000a
                goto L_0x0065
            L_0x000a:
                android.widget.EditText r0 = r3.f18317c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x001e
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x001e
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x001e
                r0 = 1
                goto L_0x001f
            L_0x001e:
                r0 = 0
            L_0x001f:
                if (r0 == 0) goto L_0x0061
                android.widget.EditText r0 = r3.f18318d
                if (r0 == 0) goto L_0x0033
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x0033
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0033
                r0 = 1
                goto L_0x0034
            L_0x0033:
                r0 = 0
            L_0x0034:
                if (r0 == 0) goto L_0x0061
                android.widget.EditText r0 = r3.f18319f
                if (r0 == 0) goto L_0x0048
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x0048
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0048
                r0 = 1
                goto L_0x0049
            L_0x0048:
                r0 = 0
            L_0x0049:
                if (r0 == 0) goto L_0x0061
                android.widget.EditText r0 = r3.f18320g
                if (r0 == 0) goto L_0x005d
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x005d
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x005d
                r0 = 1
                goto L_0x005e
            L_0x005d:
                r0 = 0
            L_0x005e:
                if (r0 == 0) goto L_0x0061
                goto L_0x0062
            L_0x0061:
                r1 = 0
            L_0x0062:
                r4.setEnabled(r1)
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p116k0.C7467l.C7468a.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: l */
    private static final String m31029l(Context context, Macro macro, String str, TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(context, str, triggerContextInfo, macro);
        C13706o.m87928e(t0, "replaceMagicText(context…text, contextInfo, macro)");
        return C15176v.m93630E(t0, "\\n", IOUtils.LINE_SEPARATOR_UNIX, false, 4, (Object) null);
    }

    /* renamed from: m */
    public static final void m31030m(Activity activity, String str, Macro macro, int i, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, C16272s<? super String, ? super String, ? super String, ? super String, ? super Boolean, C13339u> sVar, C16254a<C13339u> aVar) {
        Activity activity2 = activity;
        String str8 = str;
        Macro macro2 = macro;
        C16254a<C13339u> aVar2 = aVar;
        C13706o.m87929f(activity2, "activity");
        C13706o.m87929f(str8, "dialogTitle");
        C13706o.m87929f(macro2, "macro");
        C13706o.m87929f(str6, "defaultTitle");
        C13706o.m87929f(str7, "defaultMessage");
        C13706o.m87929f(sVar, "onConfirmListener");
        C13706o.m87929f(aVar2, "onCancelListener");
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity2, i);
        appCompatDialog.setContentView((int) C17535R$layout.configure_confirm_next_dialog);
        appCompatDialog.setTitle((CharSequence) str8);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.configure_confirm_next_dialog_title);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_confirm_next_dialog_message);
        EditText editText3 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_confirm_next_positive_text);
        EditText editText4 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_confirm_next_negative_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.confirm_next_title_magic_text_button);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.confirm_next_message_magic_text_button);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.confirm_next_message_positive_text_button);
        Button button6 = (Button) appCompatDialog.findViewById(C17532R$id.confirm_next_message_negative_text_button);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.quitOnBackCheckbox);
        if (editText != null) {
            editText.setText(str2 == null ? str6 : str2);
        }
        if (editText != null) {
            C4666m.m18154v(editText);
        }
        if (editText2 != null) {
            editText2.setText(str3 == null ? str7 : str3);
        }
        if (editText2 != null) {
            C4666m.m18154v(editText2);
        }
        if (editText3 != null) {
            editText3.setText(str4 == null ? activity2.getString(17039370) : str4);
        }
        if (editText3 != null) {
            C4666m.m18154v(editText3);
        }
        if (editText4 != null) {
            editText4.setText(str5 == null ? activity2.getString(17039360) : str5);
        }
        if (editText4 != null) {
            C4666m.m18154v(editText4);
        }
        if (checkBox != null) {
            checkBox.setVisibility(z ? 0 : 8);
        }
        if (checkBox != null) {
            checkBox.setChecked(z2);
        }
        C7468a aVar3 = new C7468a(button, editText, editText2, editText3, editText4);
        if (editText != null) {
            editText.addTextChangedListener(aVar3);
        }
        if (editText2 != null) {
            editText2.addTextChangedListener(aVar3);
        }
        if (button != null) {
            button.setOnClickListener(new C13389h(sVar, editText, editText2, editText3, editText4, checkBox, appCompatDialog));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C13388g(aVar2, appCompatDialog));
        }
        if (editText != null) {
            C13392k kVar = new C13392k(editText);
            if (button3 != null) {
                button3.setOnClickListener(new C13385d(activity2, kVar, macro2));
            }
        }
        if (editText2 != null) {
            C13391j jVar = new C13391j(editText2);
            if (button4 != null) {
                button4.setOnClickListener(new C13386e(activity2, jVar, macro2));
            }
        }
        if (editText3 != null) {
            C13383b bVar = new C13383b(editText3);
            if (button5 != null) {
                button5.setOnClickListener(new C13384c(activity2, bVar, macro2));
            }
        }
        if (editText4 != null) {
            C13390i iVar = new C13390i(editText4);
            if (button6 != null) {
                button6.setOnClickListener(new C13387f(activity2, iVar, macro2));
            }
        }
        appCompatDialog.setOnCancelListener(new C13382a(aVar2));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m31031n(C16272s sVar, EditText editText, EditText editText2, EditText editText3, EditText editText4, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(sVar, "$onConfirmListener");
        C13706o.m87929f(appCompatDialog, "$dialog");
        Editable editable = null;
        String valueOf = String.valueOf(editText != null ? editText.getText() : null);
        String valueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        String valueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        if (editText4 != null) {
            editable = editText4.getText();
        }
        sVar.mo24899n(valueOf, valueOf2, valueOf3, String.valueOf(editable), Boolean.valueOf(checkBox != null ? checkBox.isChecked() : false));
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m31032o(C16254a aVar, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(aVar, "$onCancelListener");
        C13706o.m87929f(appCompatDialog, "$dialog");
        aVar.invoke();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m31033p(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m31034q(Activity activity, C4023j0.C4028e eVar, Macro macro, View view) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(macro, "$macro");
        C4023j0.m15698D(activity, eVar, macro, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m31035r(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m31036s(Activity activity, C4023j0.C4028e eVar, Macro macro, View view) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(macro, "$macro");
        C4023j0.m15698D(activity, eVar, macro, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m31037t(C16254a aVar, DialogInterface dialogInterface) {
        C13706o.m87929f(aVar, "$onCancelListener");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m31038u(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m31039v(Activity activity, C4023j0.C4028e eVar, Macro macro, View view) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(macro, "$macro");
        C4023j0.m15698D(activity, eVar, macro, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m31040w(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m31041x(Activity activity, C4023j0.C4028e eVar, Macro macro, View view) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(macro, "$macro");
        C4023j0.m15700F(activity, eVar, macro, true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* renamed from: y */
    public static final void m31042y(Context context, Macro macro, TriggerContextInfo triggerContextInfo, String str, String str2, String str3, String str4, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2, boolean z3) {
        Context context2 = context;
        Macro macro2 = macro;
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        Stack<Integer> stack2 = stack;
        C13706o.m87929f(context, "context");
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(stack2, "skipEndifIndexStack");
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        Intent intent = new Intent(aVar.mo27303b(), IfThenConfirmDialogActivity.class);
        intent.addFlags(268435456);
        String str5 = str;
        intent.putExtra("Title", m31029l(context, macro, str, triggerContextInfo));
        String str6 = str2;
        intent.putExtra("Message", m31029l(context, macro, str2, triggerContextInfo));
        String str7 = str3;
        intent.putExtra("positive_text", m31029l(context, macro, str3, triggerContextInfo));
        String str8 = str4;
        intent.putExtra("negative_text", m31029l(context, macro, str4, triggerContextInfo));
        intent.putExtra("guid", macro.getGUID());
        intent.putExtra("TriggerThatInvoked", macro.getTriggerThatInvoked());
        intent.putExtra("TriggerContextInfo", triggerContextInfo);
        intent.putExtra("NextActionIndex", i);
        intent.putExtra("SkipEndifIndex", stack2);
        intent.putExtra("force_not_enabled", z);
        intent.putExtra("resume_macro_info", resumeMacroInfo);
        intent.putExtra("IsTest", z2);
        intent.putExtra("quit_on_back_pressed", z3);
        intent.addFlags(268435456);
        aVar.mo27303b().startActivity(intent);
    }
}
