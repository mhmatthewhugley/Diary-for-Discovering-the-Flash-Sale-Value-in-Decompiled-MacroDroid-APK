package com.afollestad.materialdialogs.prefs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import p037m.C2004b;
import p037m.C2009f;

public class MaterialMultiSelectListPreference extends MultiSelectListPreference {

    /* renamed from: a */
    private Context f836a;

    /* renamed from: c */
    private C2009f f837c;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$a */
    class C1447a implements C2009f.C2018h {
        C1447a() {
        }

        /* renamed from: a */
        public boolean mo16975a(C2009f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
            MaterialMultiSelectListPreference.this.onClick((DialogInterface) null, -1);
            fVar.dismiss();
            HashSet hashSet = new HashSet();
            for (Integer intValue : numArr) {
                hashSet.add(MaterialMultiSelectListPreference.this.getEntryValues()[intValue.intValue()].toString());
            }
            if (!MaterialMultiSelectListPreference.this.callChangeListener(hashSet)) {
                return true;
            }
            MaterialMultiSelectListPreference.this.setValues(hashSet);
            return true;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$b */
    class C1448b implements C2009f.C2022l {
        C1448b() {
        }

        /* renamed from: a */
        public void mo16934a(@NonNull C2009f fVar, @NonNull C2004b bVar) {
            int i = C1449c.f842a[bVar.ordinal()];
            if (i == 1) {
                MaterialMultiSelectListPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialMultiSelectListPreference.this.onClick(fVar, -1);
            } else {
                MaterialMultiSelectListPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$c */
    static /* synthetic */ class C1449c {

        /* renamed from: a */
        static final /* synthetic */ int[] f842a;

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
                f842a = r0
                m.b r1 = p037m.C2004b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f842a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.b r1 = p037m.C2004b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference.C1449c.<clinit>():void");
        }
    }

    public MaterialMultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m697d(context, attributeSet);
    }

    /* renamed from: d */
    private void m697d(Context context, AttributeSet attributeSet) {
        this.f836a = context;
        C1450a.m703b(context, this, attributeSet);
    }

    public Dialog getDialog() {
        return this.f837c;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C2009f fVar = this.f837c;
        if (fVar != null && fVar.isShowing()) {
            this.f837c.dismiss();
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
        if (savedState.f838a) {
            showDialog(savedState.f839c);
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
        savedState.f838a = true;
        savedState.f839c = dialog.onSaveInstanceState();
        return savedState;
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        C2009f fVar = this.f837c;
        if (fVar != null) {
            fVar.mo24059A(charSequenceArr);
        }
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (String next : getValues()) {
            if (findIndexOfValue(next) >= 0) {
                arrayList.add(Integer.valueOf(findIndexOfValue(next)));
            }
        }
        C2009f.C2014d i = new C2009f.C2014d(this.f836a).mo24101u(getDialogTitle()).mo24091k(getDialogIcon()).mo24095o(getNegativeButtonText()).mo24097q(getPositiveButtonText()).mo24096p(new C1448b()).mo24092l(getEntries()).mo24093m((Integer[]) arrayList.toArray(new Integer[arrayList.size()]), new C1447a()).mo24089i(this);
        View onCreateDialogView = onCreateDialogView();
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            i.mo24088h(onCreateDialogView, false);
        } else {
            i.mo24087g(getDialogMessage());
        }
        C1450a.m702a(this, this);
        C2009f b = i.mo24083b();
        this.f837c = b;
        if (bundle != null) {
            b.onRestoreInstanceState(bundle);
        }
        this.f837c.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1446a();

        /* renamed from: a */
        boolean f838a;

        /* renamed from: c */
        Bundle f839c;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialMultiSelectListPreference$SavedState$a */
        static class C1446a implements Parcelable.Creator<SavedState> {
            C1446a() {
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
            this.f838a = parcel.readInt() != 1 ? false : true;
            this.f839c = parcel.readBundle();
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f838a ? 1 : 0);
            parcel.writeBundle(this.f839c);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialMultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m697d(context, attributeSet);
    }
}
