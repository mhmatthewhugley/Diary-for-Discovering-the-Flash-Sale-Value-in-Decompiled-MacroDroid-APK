package com.afollestad.materialdialogs.prefs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.ListPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import p037m.C2004b;
import p037m.C2009f;

public class MaterialListPreference extends ListPreference {

    /* renamed from: a */
    private Context f829a;

    /* renamed from: c */
    private C2009f f830c;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$a */
    class C1443a implements C2009f.C2019i {
        C1443a() {
        }

        /* renamed from: a */
        public boolean mo16962a(C2009f fVar, View view, int i, CharSequence charSequence) {
            MaterialListPreference.this.onClick((DialogInterface) null, -1);
            if (i >= 0 && MaterialListPreference.this.getEntryValues() != null) {
                try {
                    Field declaredField = ListPreference.class.getDeclaredField("mClickedDialogEntryIndex");
                    declaredField.setAccessible(true);
                    declaredField.set(MaterialListPreference.this, Integer.valueOf(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$b */
    class C1444b implements C2009f.C2022l {
        C1444b() {
        }

        /* renamed from: a */
        public void mo16934a(@NonNull C2009f fVar, @NonNull C2004b bVar) {
            int i = C1445c.f835a[bVar.ordinal()];
            if (i == 1) {
                MaterialListPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialListPreference.this.onClick(fVar, -1);
            } else {
                MaterialListPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$c */
    static /* synthetic */ class C1445c {

        /* renamed from: a */
        static final /* synthetic */ int[] f835a;

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
                f835a = r0
                m.b r1 = p037m.C2004b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f835a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.b r1 = p037m.C2004b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialListPreference.C1445c.<clinit>():void");
        }
    }

    public MaterialListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m691b(context, attributeSet);
    }

    /* renamed from: b */
    private void m691b(Context context, AttributeSet attributeSet) {
        this.f829a = context;
        C1450a.m703b(context, this, attributeSet);
    }

    public Dialog getDialog() {
        return this.f830c;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C2009f fVar = this.f830c;
        if (fVar != null && fVar.isShowing()) {
            this.f830c.dismiss();
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
        if (savedState.f831a) {
            showDialog(savedState.f832c);
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
        savedState.f831a = true;
        savedState.f832c = dialog.onSaveInstanceState();
        return savedState;
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        C2009f fVar = this.f830c;
        if (fVar != null) {
            fVar.mo24059A(charSequenceArr);
        }
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        if (getEntries() == null || getEntryValues() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        C2009f.C2014d n = new C2009f.C2014d(this.f829a).mo24101u(getDialogTitle()).mo24091k(getDialogIcon()).mo24089i(this).mo24096p(new C1444b()).mo24095o(getNegativeButtonText()).mo24092l(getEntries()).mo24082a(true).mo24094n(findIndexOfValue(getValue()), new C1443a());
        View onCreateDialogView = onCreateDialogView();
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            n.mo24088h(onCreateDialogView, false);
        } else {
            n.mo24087g(getDialogMessage());
        }
        C1450a.m702a(this, this);
        C2009f b = n.mo24083b();
        this.f830c = b;
        if (bundle != null) {
            b.onRestoreInstanceState(bundle);
        }
        onClick(this.f830c, -2);
        this.f830c.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1442a();

        /* renamed from: a */
        boolean f831a;

        /* renamed from: c */
        Bundle f832c;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialListPreference$SavedState$a */
        static class C1442a implements Parcelable.Creator<SavedState> {
            C1442a() {
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
            this.f831a = parcel.readInt() != 1 ? false : true;
            this.f832c = parcel.readBundle();
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f831a ? 1 : 0);
            parcel.writeBundle(this.f832c);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m691b(context, attributeSet);
    }
}
