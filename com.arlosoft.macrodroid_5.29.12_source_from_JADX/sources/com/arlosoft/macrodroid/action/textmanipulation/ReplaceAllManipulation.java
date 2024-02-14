package com.arlosoft.macrodroid.action.textmanipulation;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import org.apache.commons.p353io.IOUtils;

@DontObfuscate
public class ReplaceAllManipulation extends TextManipulation {
    public static final Parcelable.Creator<ReplaceAllManipulation> CREATOR = new C3483a();

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.ReplaceAllManipulation$a */
    class C3483a implements Parcelable.Creator<ReplaceAllManipulation> {
        C3483a() {
        }

        /* renamed from: a */
        public ReplaceAllManipulation createFromParcel(Parcel parcel) {
            return new ReplaceAllManipulation(parcel, (C3483a) null);
        }

        /* renamed from: b */
        public ReplaceAllManipulation[] newArray(int i) {
            return new ReplaceAllManipulation[i];
        }
    }

    /* synthetic */ ReplaceAllManipulation(Parcel parcel, C3483a aVar) {
        this(parcel);
    }

    public String apply(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        return str.replaceAll(C4023j0.m15760t0(MacroDroidApplication.m14845u(), this.params.get(0), triggerContextInfo, macro).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX), C4023j0.m15760t0(MacroDroidApplication.m14845u(), this.params.get(1), triggerContextInfo, macro).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX));
    }

    public int describeContents() {
        return 0;
    }

    public int getDescription() {
        return C17541R$string.text_manipulation_replace_all_description;
    }

    public String getExtendedInfo(String str) {
        if (str.length() > 12) {
            str = str.substring(0, 10) + "..";
        }
        return getString(getName()) + " (" + str + ", " + this.params.get(0) + ", " + this.params.get(1) + ")";
    }

    public int getName() {
        return C17541R$string.text_manipulation_replace_all;
    }

    public int[] getParamNames() {
        return new int[]{C17541R$string.text_manipulation_text_to_replace_regex, C17541R$string.text_manipulation_new_text};
    }

    public TextManipulation.C3486a[] getParamTypes() {
        return new TextManipulation.C3486a[]{TextManipulation.C3486a.STRING, TextManipulation.C3486a.STRING_OPTIONAL};
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public ReplaceAllManipulation() {
    }

    private ReplaceAllManipulation(Parcel parcel) {
        super(parcel);
    }
}
