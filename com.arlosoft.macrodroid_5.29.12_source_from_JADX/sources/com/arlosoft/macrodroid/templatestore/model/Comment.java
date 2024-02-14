package com.arlosoft.macrodroid.templatestore.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: Comment.kt */
public final class Comment implements Parcelable {
    public static final Parcelable.Creator<Comment> CREATOR = new C5222a();
    private final long editTimestamp;

    /* renamed from: id */
    private final int f13051id;
    private final int macroId;
    private final boolean pending;
    private final int pluginId;
    private final String text;
    private final long timestamp;
    private final int userId;
    private final String userImage;
    private final String username;

    /* renamed from: com.arlosoft.macrodroid.templatestore.model.Comment$a */
    /* compiled from: Comment.kt */
    public static final class C5222a implements Parcelable.Creator<Comment> {
        /* renamed from: a */
        public final Comment createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new Comment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final Comment[] newArray(int i) {
            return new Comment[i];
        }
    }

    public Comment(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, boolean z) {
        C13706o.m87929f(str, "text");
        C13706o.m87929f(str2, "username");
        C13706o.m87929f(str3, "userImage");
        this.f13051id = i;
        this.userId = i2;
        this.macroId = i3;
        this.pluginId = i4;
        this.text = str;
        this.timestamp = j;
        this.editTimestamp = j2;
        this.username = str2;
        this.userImage = str3;
        this.pending = z;
    }

    public static /* synthetic */ Comment copy$default(Comment comment, int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, boolean z, int i5, Object obj) {
        Comment comment2 = comment;
        int i6 = i5;
        return comment.copy((i6 & 1) != 0 ? comment2.f13051id : i, (i6 & 2) != 0 ? comment2.userId : i2, (i6 & 4) != 0 ? comment2.macroId : i3, (i6 & 8) != 0 ? comment2.pluginId : i4, (i6 & 16) != 0 ? comment2.text : str, (i6 & 32) != 0 ? comment2.timestamp : j, (i6 & 64) != 0 ? comment2.editTimestamp : j2, (i6 & 128) != 0 ? comment2.username : str2, (i6 & 256) != 0 ? comment2.userImage : str3, (i6 & 512) != 0 ? comment2.pending : z);
    }

    public final int component1() {
        return this.f13051id;
    }

    public final boolean component10() {
        return this.pending;
    }

    public final int component2() {
        return this.userId;
    }

    public final int component3() {
        return this.macroId;
    }

    public final int component4() {
        return this.pluginId;
    }

    public final String component5() {
        return this.text;
    }

    public final long component6() {
        return this.timestamp;
    }

    public final long component7() {
        return this.editTimestamp;
    }

    public final String component8() {
        return this.username;
    }

    public final String component9() {
        return this.userImage;
    }

    public final Comment copy(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, boolean z) {
        String str4 = str;
        C13706o.m87929f(str4, "text");
        String str5 = str2;
        C13706o.m87929f(str5, "username");
        String str6 = str3;
        C13706o.m87929f(str6, "userImage");
        return new Comment(i, i2, i3, i4, str4, j, j2, str5, str6, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        return this.f13051id == comment.f13051id && this.userId == comment.userId && this.macroId == comment.macroId && this.pluginId == comment.pluginId && C13706o.m87924a(this.text, comment.text) && this.timestamp == comment.timestamp && this.editTimestamp == comment.editTimestamp && C13706o.m87924a(this.username, comment.username) && C13706o.m87924a(this.userImage, comment.userImage) && this.pending == comment.pending;
    }

    public final long getEditTimestamp() {
        return this.editTimestamp;
    }

    public final int getId() {
        return this.f13051id;
    }

    public final int getMacroId() {
        return this.macroId;
    }

    public final boolean getPending() {
        return this.pending;
    }

    public final int getPluginId() {
        return this.pluginId;
    }

    public final String getText() {
        return this.text;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUserImage() {
        return this.userImage;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f13051id * 31) + this.userId) * 31) + this.macroId) * 31) + this.pluginId) * 31) + this.text.hashCode()) * 31) + C1405a.m633a(this.timestamp)) * 31) + C1405a.m633a(this.editTimestamp)) * 31) + this.username.hashCode()) * 31) + this.userImage.hashCode()) * 31;
        boolean z = this.pending;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "Comment(id=" + this.f13051id + ", userId=" + this.userId + ", macroId=" + this.macroId + ", pluginId=" + this.pluginId + ", text=" + this.text + ", timestamp=" + this.timestamp + ", editTimestamp=" + this.editTimestamp + ", username=" + this.username + ", userImage=" + this.userImage + ", pending=" + this.pending + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeInt(this.f13051id);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.macroId);
        parcel.writeInt(this.pluginId);
        parcel.writeString(this.text);
        parcel.writeLong(this.timestamp);
        parcel.writeLong(this.editTimestamp);
        parcel.writeString(this.username);
        parcel.writeString(this.userImage);
        parcel.writeInt(this.pending ? 1 : 0);
    }
}
