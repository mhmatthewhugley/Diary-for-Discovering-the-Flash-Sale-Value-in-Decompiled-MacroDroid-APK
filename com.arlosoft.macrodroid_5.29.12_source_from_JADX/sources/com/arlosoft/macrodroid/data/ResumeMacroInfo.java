package com.arlosoft.macrodroid.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

/* compiled from: ResumeMacroInfo.kt */
public final class ResumeMacroInfo implements Parcelable {
    public static final Parcelable.Creator<ResumeMacroInfo> CREATOR = new C4362a();

    /* renamed from: a */
    private final long f11101a;

    /* renamed from: c */
    private final int f11102c;

    /* renamed from: d */
    private final TriggerContextInfo f11103d;

    /* renamed from: f */
    private final boolean f11104f;

    /* renamed from: g */
    private final Stack<Integer> f11105g;

    /* renamed from: o */
    private final ResumeMacroInfo f11106o;

    /* renamed from: p */
    private final Map<String, String> f11107p;

    /* renamed from: com.arlosoft.macrodroid.data.ResumeMacroInfo$a */
    /* compiled from: ResumeMacroInfo.kt */
    public static final class C4362a implements Parcelable.Creator<ResumeMacroInfo> {
        /* renamed from: a */
        public final ResumeMacroInfo createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            C13706o.m87929f(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            TriggerContextInfo triggerContextInfo = (TriggerContextInfo) parcel.readParcelable(ResumeMacroInfo.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            Stack stack = (Stack) parcel.readSerializable();
            ResumeMacroInfo createFromParcel = parcel.readInt() == 0 ? null : ResumeMacroInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new ResumeMacroInfo(readLong, readInt, triggerContextInfo, z, stack, createFromParcel, linkedHashMap);
        }

        /* renamed from: b */
        public final ResumeMacroInfo[] newArray(int i) {
            return new ResumeMacroInfo[i];
        }
    }

    public ResumeMacroInfo(long j, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, Map<String, String> map) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        this.f11101a = j;
        this.f11102c = i;
        this.f11103d = triggerContextInfo;
        this.f11104f = z;
        this.f11105g = stack;
        this.f11106o = resumeMacroInfo;
        this.f11107p = map;
    }

    /* renamed from: a */
    public final Map<String, String> mo28552a() {
        return this.f11107p;
    }

    /* renamed from: b */
    public final TriggerContextInfo mo28553b() {
        return this.f11103d;
    }

    /* renamed from: c */
    public final boolean mo28554c() {
        return this.f11104f;
    }

    /* renamed from: d */
    public final long mo28555d() {
        return this.f11101a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final ResumeMacroInfo mo28557e() {
        return this.f11106o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResumeMacroInfo)) {
            return false;
        }
        ResumeMacroInfo resumeMacroInfo = (ResumeMacroInfo) obj;
        return this.f11101a == resumeMacroInfo.f11101a && this.f11102c == resumeMacroInfo.f11102c && C13706o.m87924a(this.f11103d, resumeMacroInfo.f11103d) && this.f11104f == resumeMacroInfo.f11104f && C13706o.m87924a(this.f11105g, resumeMacroInfo.f11105g) && C13706o.m87924a(this.f11106o, resumeMacroInfo.f11106o) && C13706o.m87924a(this.f11107p, resumeMacroInfo.f11107p);
    }

    /* renamed from: f */
    public final int mo28559f() {
        return this.f11102c;
    }

    /* renamed from: g */
    public final Stack<Integer> mo28560g() {
        return this.f11105g;
    }

    public int hashCode() {
        int a = ((C1405a.m633a(this.f11101a) * 31) + this.f11102c) * 31;
        TriggerContextInfo triggerContextInfo = this.f11103d;
        int i = 0;
        int hashCode = (a + (triggerContextInfo == null ? 0 : triggerContextInfo.hashCode())) * 31;
        boolean z = this.f11104f;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f11105g.hashCode()) * 31;
        ResumeMacroInfo resumeMacroInfo = this.f11106o;
        int hashCode3 = (hashCode2 + (resumeMacroInfo == null ? 0 : resumeMacroInfo.hashCode())) * 31;
        Map<String, String> map = this.f11107p;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ResumeMacroInfo(macroGuid=" + this.f11101a + ", nextAction=" + this.f11102c + ", contextInfo=" + this.f11103d + ", forceEvenIfNotEnabled=" + this.f11104f + ", skipEndifIndexStack=" + this.f11105g + ", nestedResumeMacroInfo=" + this.f11106o + ", actionBlockOutputParameters=" + this.f11107p + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeLong(this.f11101a);
        parcel.writeInt(this.f11102c);
        parcel.writeParcelable(this.f11103d, i);
        parcel.writeInt(this.f11104f ? 1 : 0);
        parcel.writeSerializable(this.f11105g);
        ResumeMacroInfo resumeMacroInfo = this.f11106o;
        if (resumeMacroInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resumeMacroInfo.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.f11107p;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResumeMacroInfo(long j, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo, Map map, int i2, C13695i iVar) {
        this(j, i, triggerContextInfo, z, stack, resumeMacroInfo, (i2 & 64) != 0 ? null : map);
    }
}
