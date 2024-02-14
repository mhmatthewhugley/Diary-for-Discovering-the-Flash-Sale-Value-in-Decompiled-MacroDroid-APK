package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.services.UploadMessageService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2224m;
import p128m0.C7849t4;
import p134n0.C7960a;
import p148q0.C8151a;

public class TweetAction extends Action implements C7960a.C7961a, C2224m {
    public static final Parcelable.Creator<TweetAction> CREATOR = new C2738b();
    private String m_messageText;

    /* renamed from: com.arlosoft.macrodroid.action.TweetAction$a */
    class C2737a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7664a;

        /* renamed from: c */
        final /* synthetic */ EditText f7665c;

        C2737a(Button button, EditText editText) {
            this.f7664a = button;
            this.f7665c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7664a.setEnabled(this.f7665c.getText().length() > 0 && !this.f7665c.getText().toString().contains("@"));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TweetAction$b */
    class C2738b implements Parcelable.Creator<TweetAction> {
        C2738b() {
        }

        /* renamed from: a */
        public TweetAction createFromParcel(Parcel parcel) {
            return new TweetAction(parcel, (C2737a) null);
        }

        /* renamed from: b */
        public TweetAction[] newArray(int i) {
            return new TweetAction[i];
        }
    }

    /* synthetic */ TweetAction(Parcel parcel, C2737a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m13448n3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_messageText = editText.getText().toString();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static /* synthetic */ void m13450p3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m13451q3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_messageText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_messageText = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: L */
    public void mo25739L() {
        mo27871v1();
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return C7960a.m33245h(mo27827K0());
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_messageText;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7849t4.m32822u();
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        Activity j0 = mo27850j0();
        if (!C7960a.m33245h(j0)) {
            C7960a.m33246i(j0, this);
        } else {
            super.mo25540W1();
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_messageText, triggerContextInfo, mo27837X0());
        String replace = t0.replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
        if (t0.contains("@")) {
            C4878b.m18868g("Cannot send tweet, @ tag is not allowed");
            return;
        }
        Intent intent = new Intent(mo27827K0(), UploadMessageService.class);
        intent.putExtra("UploadSite", "Twitter");
        intent.putExtra("Message", replace);
        mo27827K0().startService(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_tweet_configure);
        appCompatDialog.setTitle((int) C17541R$string.action_tweet);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_tweet_configure_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.dialog_tweet_configure_magic_text_button);
        String str = this.m_messageText;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        editText.addTextChangedListener(new C2737a(button, editText));
        button.setOnClickListener(new C3607xn(this, editText, appCompatDialog));
        button2.setOnClickListener(new C3552vn(appCompatDialog));
        button3.setOnClickListener(new C3580wn(this, j0, new C3634yn(editText)));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_messageText);
    }

    public TweetAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private TweetAction() {
    }

    private TweetAction(Parcel parcel) {
        super(parcel);
        this.m_messageText = parcel.readString();
    }
}
