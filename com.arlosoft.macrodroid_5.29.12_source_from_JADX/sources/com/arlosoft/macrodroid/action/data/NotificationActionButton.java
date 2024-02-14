package com.arlosoft.macrodroid.action.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: NotificationActionButton.kt */
public final class NotificationActionButton implements Parcelable {
    public static final Parcelable.Creator<NotificationActionButton> CREATOR = new C2998a();
    @SerializedName(alternate = {"d"}, value = "actionBlockData")
    private ActionBlockData actionBlockData;
    @SerializedName(alternate = {"c"}, value = "clearOnPress")
    private final boolean clearOnPress;
    @SerializedName(alternate = {"a"}, value = "label")
    private String label;
    @SerializedName(alternate = {"b"}, value = "macroGuid")
    private long macroGuid;

    /* renamed from: com.arlosoft.macrodroid.action.data.NotificationActionButton$a */
    /* compiled from: NotificationActionButton.kt */
    public static final class C2998a implements Parcelable.Creator<NotificationActionButton> {
        /* renamed from: a */
        public final NotificationActionButton createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new NotificationActionButton(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ActionBlockData.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final NotificationActionButton[] newArray(int i) {
            return new NotificationActionButton[i];
        }
    }

    public NotificationActionButton(String str, long j, boolean z, ActionBlockData actionBlockData2) {
        C13706o.m87929f(str, "label");
        this.label = str;
        this.macroGuid = j;
        this.clearOnPress = z;
        this.actionBlockData = actionBlockData2;
    }

    public static /* synthetic */ NotificationActionButton copy$default(NotificationActionButton notificationActionButton, String str, long j, boolean z, ActionBlockData actionBlockData2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationActionButton.label;
        }
        if ((i & 2) != 0) {
            j = notificationActionButton.macroGuid;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = notificationActionButton.clearOnPress;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            actionBlockData2 = notificationActionButton.actionBlockData;
        }
        return notificationActionButton.copy(str, j2, z2, actionBlockData2);
    }

    public final String component1() {
        return this.label;
    }

    public final long component2() {
        return this.macroGuid;
    }

    public final boolean component3() {
        return this.clearOnPress;
    }

    public final ActionBlockData component4() {
        return this.actionBlockData;
    }

    public final NotificationActionButton copy(String str, long j, boolean z, ActionBlockData actionBlockData2) {
        C13706o.m87929f(str, "label");
        return new NotificationActionButton(str, j, z, actionBlockData2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationActionButton)) {
            return false;
        }
        NotificationActionButton notificationActionButton = (NotificationActionButton) obj;
        return C13706o.m87924a(this.label, notificationActionButton.label) && this.macroGuid == notificationActionButton.macroGuid && this.clearOnPress == notificationActionButton.clearOnPress && C13706o.m87924a(this.actionBlockData, notificationActionButton.actionBlockData);
    }

    public final ActionBlockData getActionBlockData() {
        return this.actionBlockData;
    }

    public final boolean getClearOnPress() {
        return this.clearOnPress;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getMacroGuid() {
        return this.macroGuid;
    }

    public int hashCode() {
        int hashCode = ((this.label.hashCode() * 31) + C1405a.m633a(this.macroGuid)) * 31;
        boolean z = this.clearOnPress;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        ActionBlockData actionBlockData2 = this.actionBlockData;
        return i + (actionBlockData2 == null ? 0 : actionBlockData2.hashCode());
    }

    public final void setActionBlockData(ActionBlockData actionBlockData2) {
        this.actionBlockData = actionBlockData2;
    }

    public final void setLabel(String str) {
        C13706o.m87929f(str, "<set-?>");
        this.label = str;
    }

    public final void setMacroGuid(long j) {
        this.macroGuid = j;
    }

    public String toString() {
        return "NotificationActionButton(label=" + this.label + ", macroGuid=" + this.macroGuid + ", clearOnPress=" + this.clearOnPress + ", actionBlockData=" + this.actionBlockData + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.label);
        parcel.writeLong(this.macroGuid);
        parcel.writeInt(this.clearOnPress ? 1 : 0);
        ActionBlockData actionBlockData2 = this.actionBlockData;
        if (actionBlockData2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        actionBlockData2.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationActionButton(String str, long j, boolean z, ActionBlockData actionBlockData2, int i, C13695i iVar) {
        this(str, j, z, (i & 8) != 0 ? null : actionBlockData2);
    }
}
