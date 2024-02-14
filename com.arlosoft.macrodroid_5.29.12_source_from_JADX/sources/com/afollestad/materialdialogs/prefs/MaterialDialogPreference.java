package com.afollestad.materialdialogs.prefs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import p037m.C2004b;
import p037m.C2009f;

public class MaterialDialogPreference extends DialogPreference {

    /* renamed from: a */
    private Context f816a;

    /* renamed from: c */
    private C2009f f817c;

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialDialogPreference$a */
    class C1437a implements C2009f.C2022l {
        C1437a() {
        }

        /* renamed from: a */
        public void mo16934a(@NonNull C2009f fVar, @NonNull C2004b bVar) {
            int i = C1438b.f821a[bVar.ordinal()];
            if (i == 1) {
                MaterialDialogPreference.this.onClick(fVar, -3);
            } else if (i != 2) {
                MaterialDialogPreference.this.onClick(fVar, -1);
            } else {
                MaterialDialogPreference.this.onClick(fVar, -2);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.prefs.MaterialDialogPreference$b */
    static /* synthetic */ class C1438b {

        /* renamed from: a */
        static final /* synthetic */ int[] f821a;

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
                f821a = r0
                m.b r1 = p037m.C2004b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f821a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.b r1 = p037m.C2004b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.prefs.MaterialDialogPreference.C1438b.<clinit>():void");
        }
    }

    public MaterialDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m682b(context, attributeSet);
    }

    /* renamed from: b */
    private void m682b(Context context, AttributeSet attributeSet) {
        this.f816a = context;
        C1450a.m703b(context, this, attributeSet);
    }

    public Dialog getDialog() {
        return this.f817c;
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C2009f fVar = this.f817c;
        if (fVar != null && fVar.isShowing()) {
            this.f817c.dismiss();
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
        if (savedState.f818a) {
            showDialog(savedState.f819c);
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
        savedState.f818a = true;
        savedState.f819c = dialog.onSaveInstanceState();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        C2009f.C2014d a = new C2009f.C2014d(this.f816a).mo24101u(getDialogTitle()).mo24091k(getDialogIcon()).mo24089i(this).mo24096p(new C1437a()).mo24097q(getPositiveButtonText()).mo24095o(getNegativeButtonText()).mo24082a(true);
        View onCreateDialogView = onCreateDialogView();
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            a.mo24088h(onCreateDialogView, false);
        } else {
            a.mo24087g(getDialogMessage());
        }
        C1450a.m702a(this, this);
        C2009f b = a.mo24083b();
        this.f817c = b;
        if (bundle != null) {
            b.onRestoreInstanceState(bundle);
        }
        this.f817c.show();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1436a();

        /* renamed from: a */
        boolean f818a;

        /* renamed from: c */
        Bundle f819c;

        /* renamed from: com.afollestad.materialdialogs.prefs.MaterialDialogPreference$SavedState$a */
        static class C1436a implements Parcelable.Creator<SavedState> {
            C1436a() {
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
            this.f818a = parcel.readInt() != 1 ? false : true;
            this.f819c = parcel.readBundle();
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f818a ? 1 : 0);
            parcel.writeBundle(this.f819c);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialDialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m682b(context, attributeSet);
    }
}
