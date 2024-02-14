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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DontObfuscate
public class ExtractTextManipulation extends TextManipulation {
    public static final Parcelable.Creator<ExtractTextManipulation> CREATOR = new C3481a();
    private static final int OPTION_FIRST_MATCH = 0;
    private static final int OPTION_FULL_MATCH = 2;
    private static final int OPTION_GROUP_1 = 1;

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.ExtractTextManipulation$a */
    class C3481a implements Parcelable.Creator<ExtractTextManipulation> {
        C3481a() {
        }

        /* renamed from: a */
        public ExtractTextManipulation createFromParcel(Parcel parcel) {
            return new ExtractTextManipulation(parcel, (C3481a) null);
        }

        /* renamed from: b */
        public ExtractTextManipulation[] newArray(int i) {
            return new ExtractTextManipulation[i];
        }
    }

    /* synthetic */ ExtractTextManipulation(Parcel parcel, C3481a aVar) {
        this(parcel);
    }

    public String apply(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        Matcher matcher = Pattern.compile(C4023j0.m15760t0(MacroDroidApplication.m14845u(), this.params.get(0), triggerContextInfo, macro)).matcher(str);
        if (Integer.valueOf(this.params.get(1)).intValue() == 1) {
            if (matcher.find()) {
                try {
                    return matcher.group(1);
                } catch (Exception unused) {
                }
            }
            return "";
        } else if (Integer.valueOf(this.params.get(1)).intValue() != 0) {
            StringBuilder sb = new StringBuilder();
            while (matcher.find()) {
                sb.append(matcher.group(0));
            }
            return sb.toString();
        } else if (matcher.find()) {
            return str.substring(matcher.start(), matcher.end());
        } else {
            return "";
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getDescription() {
        return C17541R$string.text_manipulation_extract_text_description;
    }

    public int[] getEnumNames(int i) {
        if (i == 1) {
            return new int[]{C17541R$string.text_manipulation_text_extract_first_match, C17541R$string.text_manipulation_text_extract_group_1, C17541R$string.text_manipulation_text_extract_full_match};
        }
        return super.getEnumNames(i);
    }

    public String getExtendedInfo(String str) {
        if (str.length() > 12) {
            str = str.substring(0, 10) + "..";
        }
        return getString(getName()) + " (" + str + ", " + this.params.get(0) + ")";
    }

    public int getName() {
        return C17541R$string.text_manipulation_extract_text;
    }

    public int[] getParamNames() {
        return new int[]{C17541R$string.text_manipulation_text_to_match_regex, 0};
    }

    public TextManipulation.C3486a[] getParamTypes() {
        return new TextManipulation.C3486a[]{TextManipulation.C3486a.STRING, TextManipulation.C3486a.ENUM};
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public ExtractTextManipulation() {
    }

    private ExtractTextManipulation(Parcel parcel) {
        super(parcel);
    }
}
