package com.arlosoft.macrodroid.action.textmanipulation;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;

@DontObfuscate
public class UpperCaseManipulation extends TextManipulation {
    public static final Parcelable.Creator<UpperCaseManipulation> CREATOR = new C3488a();

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.UpperCaseManipulation$a */
    class C3488a implements Parcelable.Creator<UpperCaseManipulation> {
        C3488a() {
        }

        /* renamed from: a */
        public UpperCaseManipulation createFromParcel(Parcel parcel) {
            return new UpperCaseManipulation(parcel, (C3488a) null);
        }

        /* renamed from: b */
        public UpperCaseManipulation[] newArray(int i) {
            return new UpperCaseManipulation[i];
        }
    }

    /* synthetic */ UpperCaseManipulation(Parcel parcel, C3488a aVar) {
        this(parcel);
    }

    public String apply(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        return str.toUpperCase();
    }

    public int describeContents() {
        return 0;
    }

    public int getDescription() {
        return C17541R$string.text_manipulation_uppercase_description;
    }

    public String getExtendedInfo(String str) {
        if (str.length() > 12) {
            str = str.substring(0, 10) + "..";
        }
        return getString(getName()) + "(" + str + ")";
    }

    public int getName() {
        return C17541R$string.text_manipulation_uppercase;
    }

    public int[] getParamNames() {
        return new int[0];
    }

    public TextManipulation.C3486a[] getParamTypes() {
        return new TextManipulation.C3486a[0];
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public UpperCaseManipulation() {
    }

    private UpperCaseManipulation(Parcel parcel) {
        super(parcel);
    }
}
