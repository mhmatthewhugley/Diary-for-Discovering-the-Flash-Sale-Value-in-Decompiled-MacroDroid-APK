package com.arlosoft.macrodroid.database.room;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

@Entity(tableName = "SystemLogEntry")
/* compiled from: SystemLogEntry.kt */
public final class SystemLogEntry implements Parcelable {

    /* renamed from: A */
    public static final C4380a f11167A = new C4380a((C13695i) null);
    public static final Parcelable.Creator<SystemLogEntry> CREATOR = new C4381b();

    /* renamed from: a */
    private final C4403i f11168a;

    /* renamed from: c */
    private final long f11169c;

    /* renamed from: d */
    private final String f11170d;

    /* renamed from: f */
    private final long f11171f;

    /* renamed from: g */
    private final String f11172g;

    /* renamed from: o */
    private final String f11173o;

    /* renamed from: p */
    private final String f11174p;

    /* renamed from: s */
    private final C4402h f11175s;
    @PrimaryKey(autoGenerate = true)

    /* renamed from: z */
    private final long f11176z;

    /* renamed from: com.arlosoft.macrodroid.database.room.SystemLogEntry$a */
    /* compiled from: SystemLogEntry.kt */
    public static final class C4380a {
        private C4380a() {
        }

        public /* synthetic */ C4380a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.SystemLogEntry$b */
    /* compiled from: SystemLogEntry.kt */
    public static final class C4381b implements Parcelable.Creator<SystemLogEntry> {
        /* renamed from: a */
        public final SystemLogEntry createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SystemLogEntry(C4403i.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), C4402h.valueOf(parcel.readString()), parcel.readLong());
        }

        /* renamed from: b */
        public final SystemLogEntry[] newArray(int i) {
            return new SystemLogEntry[i];
        }
    }

    public SystemLogEntry(C4403i iVar, long j, String str, long j2, String str2, String str3, String str4, C4402h hVar, long j3) {
        C13706o.m87929f(iVar, "logLevel");
        C13706o.m87929f(str, "logText");
        C13706o.m87929f(hVar, "flag");
        this.f11168a = iVar;
        this.f11169c = j;
        this.f11170d = str;
        this.f11171f = j2;
        this.f11172g = str2;
        this.f11173o = str3;
        this.f11174p = str4;
        this.f11175s = hVar;
        this.f11176z = j3;
    }

    /* renamed from: a */
    public final C4402h mo28683a() {
        return this.f11175s;
    }

    /* renamed from: b */
    public final String mo28684b() {
        return this.f11173o;
    }

    /* renamed from: c */
    public final long mo28685c() {
        return this.f11176z;
    }

    /* renamed from: d */
    public final C4403i mo28686d() {
        return this.f11168a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo28688e() {
        return this.f11170d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemLogEntry)) {
            return false;
        }
        SystemLogEntry systemLogEntry = (SystemLogEntry) obj;
        return this.f11168a == systemLogEntry.f11168a && this.f11169c == systemLogEntry.f11169c && C13706o.m87924a(this.f11170d, systemLogEntry.f11170d) && this.f11171f == systemLogEntry.f11171f && C13706o.m87924a(this.f11172g, systemLogEntry.f11172g) && C13706o.m87924a(this.f11173o, systemLogEntry.f11173o) && C13706o.m87924a(this.f11174p, systemLogEntry.f11174p) && this.f11175s == systemLogEntry.f11175s && this.f11176z == systemLogEntry.f11176z;
    }

    /* renamed from: f */
    public final long mo28690f() {
        return this.f11171f;
    }

    /* renamed from: g */
    public final long mo28691g() {
        return this.f11169c;
    }

    /* renamed from: h */
    public final String mo28692h() {
        return this.f11172g;
    }

    public int hashCode() {
        int hashCode = ((((((this.f11168a.hashCode() * 31) + C1405a.m633a(this.f11169c)) * 31) + this.f11170d.hashCode()) * 31) + C1405a.m633a(this.f11171f)) * 31;
        String str = this.f11172g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11173o;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11174p;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((hashCode3 + i) * 31) + this.f11175s.hashCode()) * 31) + C1405a.m633a(this.f11176z);
    }

    /* renamed from: i */
    public final String mo28694i() {
        return this.f11174p;
    }

    public String toString() {
        return "SystemLogEntry(logLevel=" + this.f11168a + ", timeStamp=" + this.f11169c + ", logText=" + this.f11170d + ", macroId=" + this.f11171f + ", variableName=" + this.f11172g + ", geofenceId=" + this.f11173o + ", webLink=" + this.f11174p + ", flag=" + this.f11175s + ", id=" + this.f11176z + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.f11168a.name());
        parcel.writeLong(this.f11169c);
        parcel.writeString(this.f11170d);
        parcel.writeLong(this.f11171f);
        parcel.writeString(this.f11172g);
        parcel.writeString(this.f11173o);
        parcel.writeString(this.f11174p);
        parcel.writeString(this.f11175s.name());
        parcel.writeLong(this.f11176z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SystemLogEntry(com.arlosoft.macrodroid.database.room.C4403i r17, long r18, java.lang.String r20, long r21, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.arlosoft.macrodroid.database.room.C4402h r26, long r27, int r29, kotlin.jvm.internal.C13695i r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r23
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r24
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r25
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0023
            com.arlosoft.macrodroid.database.room.h r1 = com.arlosoft.macrodroid.database.room.C4402h.NONE
            r13 = r1
            goto L_0x0025
        L_0x0023:
            r13 = r26
        L_0x0025:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002d
            r0 = 0
            r14 = r0
            goto L_0x002f
        L_0x002d:
            r14 = r27
        L_0x002f:
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            r3.<init>(r4, r5, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.database.room.SystemLogEntry.<init>(com.arlosoft.macrodroid.database.room.i, long, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, com.arlosoft.macrodroid.database.room.h, long, int, kotlin.jvm.internal.i):void");
    }
}
