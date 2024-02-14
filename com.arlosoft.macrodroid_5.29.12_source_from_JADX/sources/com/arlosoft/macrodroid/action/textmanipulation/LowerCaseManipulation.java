package com.arlosoft.macrodroid.action.textmanipulation;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;

@DontObfuscate
public class LowerCaseManipulation extends TextManipulation {
    public static final Parcelable.Creator<LowerCaseManipulation> CREATOR = new C3482a();

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.LowerCaseManipulation$a */
    class C3482a implements Parcelable.Creator<LowerCaseManipulation> {
        C3482a() {
        }

        /* renamed from: a */
        public LowerCaseManipulation createFromParcel(Parcel parcel) {
            return new LowerCaseManipulation(parcel, (C3482a) null);
        }

        /* renamed from: b */
        public LowerCaseManipulation[] newArray(int i) {
            return new LowerCaseManipulation[i];
        }
    }

    /* synthetic */ LowerCaseManipulation(Parcel parcel, C3482a aVar) {
        this(parcel);
    }

    public String apply(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        return str.toLowerCase();
    }

    public int describeContents() {
        return 0;
    }

    public int getDescription() {
        return C17541R$string.text_manipulation_lowercase_description;
    }

    public String getExtendedInfo(String str) {
        if (str.length() > 12) {
            str = str.substring(0, 10) + "..";
        }
        return getString(getName()) + " (" + str + ")";
    }

    public int getName() {
        return C17541R$string.text_manipulation_lowercase;
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

    public LowerCaseManipulation() {
    }

    private LowerCaseManipulation(Parcel parcel) {
        super(parcel);
    }
}
