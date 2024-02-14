package com.arlosoft.macrodroid.actionblock.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

/* compiled from: ActionBlockData.kt */
public final class ActionBlockData implements Parcelable {
    public static final Parcelable.Creator<ActionBlockData> CREATOR = new C3664a();
    private final long actionBlockGuid;
    private final String actionBlockName;
    private final HashMap<String, String> inputVarsMap;
    private final HashMap<String, String> outputVarsMap;

    /* renamed from: com.arlosoft.macrodroid.actionblock.common.ActionBlockData$a */
    /* compiled from: ActionBlockData.kt */
    public static final class C3664a implements Parcelable.Creator<ActionBlockData> {
        /* renamed from: a */
        public final ActionBlockData createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            HashMap hashMap = new HashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
            int readInt2 = parcel.readInt();
            HashMap hashMap2 = new HashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                hashMap2.put(parcel.readString(), parcel.readString());
            }
            return new ActionBlockData(readString, readLong, hashMap, hashMap2);
        }

        /* renamed from: b */
        public final ActionBlockData[] newArray(int i) {
            return new ActionBlockData[i];
        }
    }

    public ActionBlockData(String str, long j, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        C13706o.m87929f(str, "actionBlockName");
        C13706o.m87929f(hashMap, "inputVarsMap");
        C13706o.m87929f(hashMap2, "outputVarsMap");
        this.actionBlockName = str;
        this.actionBlockGuid = j;
        this.inputVarsMap = hashMap;
        this.outputVarsMap = hashMap2;
    }

    /* renamed from: b */
    public static /* synthetic */ ActionBlockData m14501b(ActionBlockData actionBlockData, String str, long j, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionBlockData.actionBlockName;
        }
        if ((i & 2) != 0) {
            j = actionBlockData.actionBlockGuid;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            hashMap = actionBlockData.inputVarsMap;
        }
        HashMap<String, String> hashMap3 = hashMap;
        if ((i & 8) != 0) {
            hashMap2 = actionBlockData.outputVarsMap;
        }
        return actionBlockData.mo27081a(str, j2, hashMap3, hashMap2);
    }

    /* renamed from: a */
    public final ActionBlockData mo27081a(String str, long j, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        C13706o.m87929f(str, "actionBlockName");
        C13706o.m87929f(hashMap, "inputVarsMap");
        C13706o.m87929f(hashMap2, "outputVarsMap");
        return new ActionBlockData(str, j, hashMap, hashMap2);
    }

    /* renamed from: c */
    public final long mo27082c() {
        return this.actionBlockGuid;
    }

    /* renamed from: d */
    public final String mo27083d() {
        return this.actionBlockName;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final HashMap<String, String> mo27085e() {
        return this.inputVarsMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBlockData)) {
            return false;
        }
        ActionBlockData actionBlockData = (ActionBlockData) obj;
        return C13706o.m87924a(this.actionBlockName, actionBlockData.actionBlockName) && this.actionBlockGuid == actionBlockData.actionBlockGuid && C13706o.m87924a(this.inputVarsMap, actionBlockData.inputVarsMap) && C13706o.m87924a(this.outputVarsMap, actionBlockData.outputVarsMap);
    }

    /* renamed from: f */
    public final HashMap<String, String> mo27087f() {
        return this.outputVarsMap;
    }

    public int hashCode() {
        return (((((this.actionBlockName.hashCode() * 31) + C1405a.m633a(this.actionBlockGuid)) * 31) + this.inputVarsMap.hashCode()) * 31) + this.outputVarsMap.hashCode();
    }

    public String toString() {
        return "ActionBlockData(actionBlockName=" + this.actionBlockName + ", actionBlockGuid=" + this.actionBlockGuid + ", inputVarsMap=" + this.inputVarsMap + ", outputVarsMap=" + this.outputVarsMap + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.actionBlockName);
        parcel.writeLong(this.actionBlockGuid);
        HashMap<String, String> hashMap = this.inputVarsMap;
        parcel.writeInt(hashMap.size());
        for (Map.Entry next : hashMap.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        HashMap<String, String> hashMap2 = this.outputVarsMap;
        parcel.writeInt(hashMap2.size());
        for (Map.Entry next2 : hashMap2.entrySet()) {
            parcel.writeString((String) next2.getKey());
            parcel.writeString((String) next2.getValue());
        }
    }
}
