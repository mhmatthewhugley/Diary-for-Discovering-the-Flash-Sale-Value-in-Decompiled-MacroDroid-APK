package com.arlosoft.macrodroid.action.textmanipulation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6451w;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@DontObfuscate
public abstract class TextManipulation implements Parcelable {
    @SerializedName(alternate = {"a"}, value = "params")
    protected List<String> params = new ArrayList();

    /* renamed from: com.arlosoft.macrodroid.action.textmanipulation.TextManipulation$a */
    public enum C3486a {
        STRING,
        INTEGER,
        ENUM,
        STRING_OPTIONAL
    }

    public TextManipulation() {
    }

    private int calculateExpression(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        try {
            return (int) C6451w.m24766b(MacroDroidApplication.m14845u(), macro, str, triggerContextInfo);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static List<TextManipulation> getAllTextManipulations() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SubstringManipulation());
        arrayList.add(new ReplaceAllManipulation());
        arrayList.add(new ExtractTextManipulation());
        arrayList.add(new UpperCaseManipulation());
        arrayList.add(new LowerCaseManipulation());
        arrayList.add(new TrimManipulation());
        arrayList.add(new SplitManipulation());
        return arrayList;
    }

    public String apply(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        return str;
    }

    @Nullable
    public VariableValue.Dictionary applyArray(String str, Macro macro, TriggerContextInfo triggerContextInfo) {
        return null;
    }

    @StringRes
    public abstract int getDescription();

    public int[] getEnumNames(int i) {
        return new int[0];
    }

    public abstract String getExtendedInfo(String str);

    /* access modifiers changed from: protected */
    public int getIntValue(int i, Macro macro, TriggerContextInfo triggerContextInfo) {
        if (i < this.params.size()) {
            return calculateExpression(this.params.get(i), macro, triggerContextInfo);
        }
        C4878b.m18868g("Attempted to get value for illegal parameter - index = " + i + ", params size = " + this.params.size());
        return 0;
    }

    @StringRes
    public abstract int getName();

    public abstract int[] getParamNames();

    public abstract C3486a[] getParamTypes();

    public List<String> getParams() {
        return this.params;
    }

    /* access modifiers changed from: protected */
    public String getString(int i) {
        return MacroDroidApplication.m14845u().getString(i);
    }

    public boolean isArray() {
        return false;
    }

    public void setParams(List<String> list) {
        this.params = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.params);
    }

    public TextManipulation(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.params = arrayList;
        parcel.readStringList(arrayList);
    }
}
