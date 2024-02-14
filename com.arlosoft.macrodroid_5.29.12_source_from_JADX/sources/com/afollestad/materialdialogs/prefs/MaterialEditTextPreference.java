package com.afollestad.materialdialogs.prefs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import com.afollestad.materialdialogs.commons.R$attr;
import com.afollestad.materialdialogs.commons.R$layout;
import p037m.C2004b;
import p037m.C2009f;
import p039n.C2037b;
import p040o.C2039a;

public class MaterialEditTextPreference extends EditTextPreference {

    /* renamed from: a */
    private int f822a = 0;

    /* renamed from: c */
    private C2009f f823c;

    /* renamed from: d */
    private EditText f824d;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference$a */
    class C1440a implements C2009f.C2022l {
        C1440a() {
        }

        /* renamed from: a */
        public void mo16934a(@NonNull C2009f fVar, @NonNull C2004b bVar) {
            int i = C1441b.f828a[bVar.ordinal()];
            if (i == 1) {
                MaterialEditTextPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialEditTextPreference.this.onClick(fVar, -1);
            } else {
                MaterialEditTextPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference$b */
    static /* synthetic */ class C1441b {

        /* renamed from: a */
        static final /* synthetic */ int[] f828a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                m.b[] r0 = p037m.C2004b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f828a = r0
                m.b r1 = p037m.C2004b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f828a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.b r1 = p037m.C2004b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference.C1441b.<clinit>():void");
        }
    }

    public MaterialEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m686b(context, attributeSet);
    }

    /* renamed from: b */
    private void m686b(Context context, AttributeSet attributeSet) {
        C1450a.m703b(context, this, attributeSet);
        this.f822a = C2039a.m8443m(context, R$attr.md_widget_color, C2039a.m8443m(context, R$attr.colorAccent, C2039a.m8442l(context, 16843829)));
        AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
        this.f824d = appCompatEditText;
        appCompatEditText.setId(16908291);
        this.f824d.setEnabled(true);
    }

    /* renamed from: d */
    private void m687d(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public Dialog getDialog() {
        return this.f823c;
    }

    public EditText getEditText() {
        return this.f824d;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C2009f fVar = this.f823c;
        if (fVar != null && fVar.isShowing()) {
            this.f823c.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onAddEditTextToDialogView(@NonNull View view, @NonNull EditText editText) {
        ((ViewGroup) view).addView(editText, new LinearLayout.LayoutParams(-1, -2));
    }

    /* access modifiers changed from: protected */
    public void onBindDialogView(@NonNull View view) {
        EditText editText = this.f824d;
        editText.setText(getText());
        if (editText.getText().length() > 0) {
            editText.setSelection(editText.length());
        }
        ViewParent parent = editText.getParent();
        if (parent != view) {
            if (parent != null) {
                ((ViewGroup) parent).removeView(editText);
            }
            onAddEditTextToDialogView(view, editText);
        }
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        if (z) {
            String obj = this.f824d.getText().toString();
            if (callChangeListener(obj)) {
                setText(obj);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1450a.m704c(this, this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f825a) {
            showDialog(savedState.f826c);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Dialog dialog = getDialog();
        if (dialog == null || !dialog.isShowing()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f825a = true;
        savedState.f826c = dialog.onSaveInstanceState();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        C2009f.C2014d i = new C2009f.C2014d(getContext()).mo24101u(getDialogTitle()).mo24091k(getDialogIcon()).mo24097q(getPositiveButtonText()).mo24095o(getNegativeButtonText()).mo24089i(this).mo24096p(new C1440a()).mo24089i(this);
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.md_stub_inputpref, (ViewGroup) null);
        onBindDialogView(inflate);
        C2037b.m8426e(this.f824d, this.f822a);
        TextView textView = (TextView) inflate.findViewById(16908299);
        if (getDialogMessage() == null || getDialogMessage().toString().length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(getDialogMessage());
        }
        i.mo24088h(inflate, false);
        C1450a.m702a(this, this);
        C2009f b = i.mo24083b();
        this.f823c = b;
        if (bundle != null) {
            b.onRestoreInstanceState(bundle);
        }
        m687d(this.f823c);
        this.f823c.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1439a();

        /* renamed from: a */
        boolean f825a;

        /* renamed from: c */
        Bundle f826c;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialEditTextPreference$SavedState$a */
        static class C1439a implements Parcelable.Creator<SavedState> {
            C1439a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f825a = parcel.readInt() != 1 ? false : true;
            this.f826c = parcel.readBundle();
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f825a ? 1 : 0);
            parcel.writeBundle(this.f826c);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m686b(context, attributeSet);
    }
}
