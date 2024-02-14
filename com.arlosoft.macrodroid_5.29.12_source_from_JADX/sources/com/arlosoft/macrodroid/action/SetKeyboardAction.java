package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.inputmethod.InputMethodManager;
import com.arlosoft.macrodroid.action.activities.SetKeyboardPieActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7802n3;

public class SetKeyboardAction extends Action {
    public static final Parcelable.Creator<SetKeyboardAction> CREATOR = new C2637a();

    /* renamed from: com.arlosoft.macrodroid.action.SetKeyboardAction$a */
    class C2637a implements Parcelable.Creator<SetKeyboardAction> {
        C2637a() {
        }

        /* renamed from: a */
        public SetKeyboardAction createFromParcel(Parcel parcel) {
            return new SetKeyboardAction(parcel, (C2637a) null);
        }

        /* renamed from: b */
        public SetKeyboardAction[] newArray(int i) {
            return new SetKeyboardAction[i];
        }
    }

    /* synthetic */ SetKeyboardAction(Parcel parcel, C2637a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7802n3.m32598u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (Build.VERSION.SDK_INT < 27) {
            ((InputMethodManager) mo27827K0().getSystemService("input_method")).showInputMethodPicker();
            return;
        }
        Intent intent = new Intent(mo27827K0(), SetKeyboardPieActivity.class);
        intent.addFlags(268435456);
        mo27827K0().startActivity(intent);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public SetKeyboardAction(Activity activity, Macro macro) {
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetKeyboardAction() {
    }

    private SetKeyboardAction(Parcel parcel) {
        super(parcel);
    }
}
