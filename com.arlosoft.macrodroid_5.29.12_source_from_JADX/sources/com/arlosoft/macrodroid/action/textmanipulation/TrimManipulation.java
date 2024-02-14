package com.arlosoft.macrodroid.action.textmanipulation;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;

@DontObfuscate
public class TrimManipulation extends TextManipulation {
    public static final Parcelable.Creator<TrimManipulation> CREATOR = new C3487a();

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.TrimManipulation$a */
    class C3487a implements Parcelable.Creator<TrimManipulation> {
        C3487a() {
        }

        /* renamed from: a */
        public TrimManipulation createFromParcel(Parcel parcel) {
            return new TrimManipulation(parcel, (C3487a) null);
        }

        /* renamed from: b */
        public TrimManipulation[] newArray(int i) {
            return new TrimManipulation[i];
        }
    }

    /* synthetic */ TrimManipulation(Parcel parcel, C3487a aVar) {
        this(parcel);
    }

    public String apply(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        return str.trim();
    }

    public int describeContents() {
        return 0;
    }

    public int getDescription() {
        return C17541R$string.text_manipulation_trim_whitespace_description;
    }

    public String getExtendedInfo(String str) {
        if (str.length() > 12) {
            str = str.substring(0, 10) + "..";
        }
        return getString(getName()) + " (" + str + ")";
    }

    public int getName() {
        return C17541R$string.text_manipulation_trim_whitespace;
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

    public TrimManipulation() {
    }

    private TrimManipulation(Parcel parcel) {
        super(parcel);
    }
}
