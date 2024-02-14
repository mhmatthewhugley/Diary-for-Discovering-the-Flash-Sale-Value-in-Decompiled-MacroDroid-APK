package com.arlosoft.macrodroid.comments;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: CommentableItem.kt */
public class CommentableItem implements Parcelable {
    public static final Parcelable.Creator<CommentableItem> CREATOR = new C3966a();
    private final String commenterName;

    /* renamed from: com.arlosoft.macrodroid.comments.CommentableItem$a */
    /* compiled from: CommentableItem.kt */
    public static final class C3966a implements Parcelable.Creator<CommentableItem> {
        /* renamed from: a */
        public final CommentableItem createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new CommentableItem(parcel.readString());
        }

        /* renamed from: b */
        public final CommentableItem[] newArray(int i) {
            return new CommentableItem[i];
        }
    }

    public CommentableItem(String str) {
        C13706o.m87929f(str, "commenterName");
        this.commenterName = str;
    }

    public int describeContents() {
        return 0;
    }

    public final String getCommenterName() {
        return this.commenterName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.commenterName);
    }
}
