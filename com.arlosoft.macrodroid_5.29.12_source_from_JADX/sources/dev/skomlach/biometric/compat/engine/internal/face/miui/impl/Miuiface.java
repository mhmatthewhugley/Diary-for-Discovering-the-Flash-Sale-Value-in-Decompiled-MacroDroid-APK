package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "Lja/u;", "writeToParcel", "", "deviceId", "J", "getDeviceId", "()J", "groupId", "I", "getGroupId", "()I", "miuifaceId", "getMiuifaceId", "", "name", "Ljava/lang/CharSequence;", "getName", "()Ljava/lang/CharSequence;", "<init>", "(Ljava/lang/CharSequence;IIJ)V", "p", "(Landroid/os/Parcel;)V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Miuiface.kt */
public final class Miuiface implements Parcelable {
    public static final Parcelable.Creator<Miuiface> CREATOR = new Miuiface$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((C13695i) null);
    private final long deviceId;
    private final int groupId;
    private final int miuifaceId;
    private final CharSequence name;

    @Metadata(mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Miuiface.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public /* synthetic */ Miuiface(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    public Miuiface(CharSequence charSequence, int i, int i2, long j) {
        this.name = charSequence;
        this.groupId = i;
        this.miuifaceId = i2;
        this.deviceId = j;
    }

    public int describeContents() {
        return 0;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getMiuifaceId() {
        return this.miuifaceId;
    }

    public final CharSequence getName() {
        return this.name;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(String.valueOf(this.name));
        parcel.writeInt(this.groupId);
        parcel.writeInt(this.miuifaceId);
        parcel.writeLong(this.deviceId);
    }

    private Miuiface(Parcel parcel) {
        this.name = parcel.readString();
        this.groupId = parcel.readInt();
        this.miuifaceId = parcel.readInt();
        this.deviceId = parcel.readLong();
    }
}
