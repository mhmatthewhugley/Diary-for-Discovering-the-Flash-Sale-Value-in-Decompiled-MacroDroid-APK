package com.arlosoft.macrodroid.action.textmanipulation;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;

@DontObfuscate
public class SubstringManipulation extends TextManipulation {
    public static final Parcelable.Creator<SubstringManipulation> CREATOR = new C3485a();

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.SubstringManipulation$a */
    class C3485a implements Parcelable.Creator<SubstringManipulation> {
        C3485a() {
        }

        /* renamed from: a */
        public SubstringManipulation createFromParcel(Parcel parcel) {
            return new SubstringManipulation(parcel, (C3485a) null);
        }

        /* renamed from: b */
        public SubstringManipulation[] newArray(int i) {
            return new SubstringManipulation[i];
        }
    }

    /* synthetic */ SubstringManipulation(Parcel parcel, C3485a aVar) {
        this(parcel);
    }

    public String apply(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        int intValue = getIntValue(0, macro, triggerContextInfo);
        int intValue2 = getIntValue(1, macro, triggerContextInfo);
        if (intValue > str.length()) {
            return "";
        }
        if (intValue2 > str.length()) {
            intValue2 = str.length();
        }
        return str.substring(intValue, intValue2);
    }

    public int describeContents() {
        return 0;
    }

    public int getDescription() {
        return C17541R$string.text_manipulation_substring_description;
    }

    public String getExtendedInfo(String str) {
        if (str.length() > 12) {
            str = str.substring(0, 10) + "..";
        }
        return getString(getName()) + " (" + str + ", " + this.params.get(0) + ", " + this.params.get(1) + ")";
    }

    public int getName() {
        return C17541R$string.text_manipulation_substring;
    }

    public int[] getParamNames() {
        return new int[]{C17541R$string.text_manipulation_start_index, C17541R$string.text_manipulation_end_index};
    }

    public TextManipulation.C3486a[] getParamTypes() {
        TextManipulation.C3486a aVar = TextManipulation.C3486a.INTEGER;
        return new TextManipulation.C3486a[]{aVar, aVar};
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public SubstringManipulation() {
    }

    private SubstringManipulation(Parcel parcel) {
        super(parcel);
    }
}
