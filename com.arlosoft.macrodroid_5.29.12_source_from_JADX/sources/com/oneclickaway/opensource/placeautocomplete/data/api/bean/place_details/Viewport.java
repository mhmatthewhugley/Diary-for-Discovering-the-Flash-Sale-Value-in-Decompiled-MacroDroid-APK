package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Viewport;", "Landroid/os/Parcelable;", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Southwest;", "component1", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Northeast;", "component2", "southwest", "northeast", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Southwest;", "getSouthwest", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Southwest;", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Northeast;", "getNortheast", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Northeast;", "<init>", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Southwest;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Northeast;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@Entity(tableName = "Viewport")
/* compiled from: Viewport.kt */
public final class Viewport implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("northeast")
    private final Northeast northeast;
    @SerializedName("southwest")
    @PrimaryKey
    private final Southwest southwest;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Northeast} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                java.lang.String r0 = "in"
                kotlin.jvm.internal.C13706o.m87930g(r5, r0)
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Viewport r0 = new com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Viewport
                int r1 = r5.readInt()
                r2 = 0
                if (r1 == 0) goto L_0x0017
                android.os.Parcelable$Creator r1 = com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Southwest.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r5)
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Southwest r1 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Southwest) r1
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                int r3 = r5.readInt()
                if (r3 == 0) goto L_0x0027
                android.os.Parcelable$Creator r2 = com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Northeast.CREATOR
                java.lang.Object r5 = r2.createFromParcel(r5)
                r2 = r5
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Northeast r2 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Northeast) r2
            L_0x0027:
                r0.<init>(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Viewport.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        public final Object[] newArray(int i) {
            return new Viewport[i];
        }
    }

    public Viewport() {
        this((Southwest) null, (Northeast) null, 3, (C13695i) null);
    }

    public Viewport(Southwest southwest2, Northeast northeast2) {
        this.southwest = southwest2;
        this.northeast = northeast2;
    }

    public static /* synthetic */ Viewport copy$default(Viewport viewport, Southwest southwest2, Northeast northeast2, int i, Object obj) {
        if ((i & 1) != 0) {
            southwest2 = viewport.southwest;
        }
        if ((i & 2) != 0) {
            northeast2 = viewport.northeast;
        }
        return viewport.copy(southwest2, northeast2);
    }

    public final Southwest component1() {
        return this.southwest;
    }

    public final Northeast component2() {
        return this.northeast;
    }

    public final Viewport copy(Southwest southwest2, Northeast northeast2) {
        return new Viewport(southwest2, northeast2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Viewport)) {
            return false;
        }
        Viewport viewport = (Viewport) obj;
        return C13706o.m87924a(this.southwest, viewport.southwest) && C13706o.m87924a(this.northeast, viewport.northeast);
    }

    public final Northeast getNortheast() {
        return this.northeast;
    }

    public final Southwest getSouthwest() {
        return this.southwest;
    }

    public int hashCode() {
        Southwest southwest2 = this.southwest;
        int i = 0;
        int hashCode = (southwest2 != null ? southwest2.hashCode() : 0) * 31;
        Northeast northeast2 = this.northeast;
        if (northeast2 != null) {
            i = northeast2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Viewport(southwest=" + this.southwest + ", northeast=" + this.northeast + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        Southwest southwest2 = this.southwest;
        if (southwest2 != null) {
            parcel.writeInt(1);
            southwest2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Northeast northeast2 = this.northeast;
        if (northeast2 != null) {
            parcel.writeInt(1);
            northeast2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Viewport(Southwest southwest2, Northeast northeast2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : southwest2, (i & 2) != 0 ? null : northeast2);
    }
}
