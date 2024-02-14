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
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.p353io.IOUtils;

@DontObfuscate
public class SplitManipulation extends TextManipulation {
    public static final Parcelable.Creator<SplitManipulation> CREATOR = new C3484a();
    private static final int OPTION_VAR_TYPE_BOOLEAN = 3;
    private static final int OPTION_VAR_TYPE_DECIMAL = 2;
    private static final int OPTION_VAR_TYPE_INTEGER = 1;
    private static final int OPTION_VAR_TYPE_STRING = 0;

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.SplitManipulation$a */
    class C3484a implements Parcelable.Creator<SplitManipulation> {
        C3484a() {
        }

        /* renamed from: a */
        public SplitManipulation createFromParcel(Parcel parcel) {
            return new SplitManipulation(parcel, (C3484a) null);
        }

        /* renamed from: b */
        public SplitManipulation[] newArray(int i) {
            return new SplitManipulation[i];
        }
    }

    /* synthetic */ SplitManipulation(Parcel parcel, C3484a aVar) {
        this(parcel);
    }

    public VariableValue.Dictionary applyArray(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        int i;
        String[] split = str.split(Pattern.quote(C4023j0.m15760t0(MacroDroidApplication.m14845u(), this.params.get(0), triggerContextInfo, macro).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX)));
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < split.length; i2++) {
            int intValue = Integer.valueOf(this.params.get(1)).intValue();
            if (intValue == 0) {
                arrayList.add(new VariableValue.DictionaryEntry(String.valueOf(i2), new VariableValue.StringValue(split[i2], (List<String>) null), (List<String>) null));
            } else if (intValue == 1) {
                try {
                    i = Integer.valueOf(split[i2]).intValue();
                } catch (Exception unused) {
                    i = 0;
                }
                arrayList.add(new VariableValue.DictionaryEntry(String.valueOf(i2), new VariableValue.IntegerValue((long) i, (List<String>) null), (List<String>) null));
            } else if (intValue == 2) {
                double d = 0.0d;
                try {
                    d = Double.valueOf(split[i2]).doubleValue();
                } catch (Exception unused2) {
                }
                arrayList.add(new VariableValue.DictionaryEntry(String.valueOf(i2), new VariableValue.DecimalValue(d, (List<String>) null), (List<String>) null));
            } else if (intValue == 3) {
                arrayList.add(new VariableValue.DictionaryEntry(String.valueOf(i2), new VariableValue.BooleanValue(split[i2].equalsIgnoreCase("true"), (List<String>) null), (List<String>) null));
            }
        }
        return new VariableValue.Dictionary(arrayList, true, (List<String>) null);
    }

    public int describeContents() {
        return 0;
    }

    public int getDescription() {
        return C17541R$string.text_manipulation_split_to_array_description;
    }

    public int[] getEnumNames(int i) {
        if (i == 1) {
            return new int[]{C17541R$string.string, C17541R$string.integer, C17541R$string.decimal, C17541R$string.bool};
        }
        return super.getEnumNames(i);
    }

    public String getExtendedInfo(String str) {
        if (str.length() > 12) {
            str = str.substring(0, 10) + "..";
        }
        return getString(getName()) + " (" + str + ")";
    }

    public int getName() {
        return C17541R$string.text_manipulation_split_to_array;
    }

    public int[] getParamNames() {
        return new int[]{C17541R$string.text_manipulation_string_delimiter, C17541R$string.text_manipulation_split_to_variable_type};
    }

    public TextManipulation.C3486a[] getParamTypes() {
        return new TextManipulation.C3486a[]{TextManipulation.C3486a.STRING_OPTIONAL, TextManipulation.C3486a.ENUM};
    }

    public boolean isArray() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public SplitManipulation() {
    }

    private SplitManipulation(Parcel parcel) {
        super(parcel);
    }
}
