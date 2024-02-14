package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PeriodsItem;", "Landroid/os/Parcelable;", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Close;", "component1", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Open;", "component2", "close", "open", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Close;", "getClose", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Close;", "setClose", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Close;)V", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Open;", "getOpen", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Open;", "setOpen", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Open;)V", "<init>", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Close;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Open;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PeriodsItem.kt */
public final class PeriodsItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("close")
    private Close close;
    @SerializedName("open")
    private Open open;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Open} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                java.lang.String r0 = "in"
                kotlin.jvm.internal.C13706o.m87930g(r5, r0)
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PeriodsItem r0 = new com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PeriodsItem
                int r1 = r5.readInt()
                r2 = 0
                if (r1 == 0) goto L_0x0017
                android.os.Parcelable$Creator r1 = com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Close.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r5)
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Close r1 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Close) r1
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                int r3 = r5.readInt()
                if (r3 == 0) goto L_0x0027
                android.os.Parcelable$Creator r2 = com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Open.CREATOR
                java.lang.Object r5 = r2.createFromParcel(r5)
                r2 = r5
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Open r2 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Open) r2
            L_0x0027:
                r0.<init>(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PeriodsItem.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        public final Object[] newArray(int i) {
            return new PeriodsItem[i];
        }
    }

    public PeriodsItem() {
        this((Close) null, (Open) null, 3, (C13695i) null);
    }

    public PeriodsItem(Close close2, Open open2) {
        this.close = close2;
        this.open = open2;
    }

    public static /* synthetic */ PeriodsItem copy$default(PeriodsItem periodsItem, Close close2, Open open2, int i, Object obj) {
        if ((i & 1) != 0) {
            close2 = periodsItem.close;
        }
        if ((i & 2) != 0) {
            open2 = periodsItem.open;
        }
        return periodsItem.copy(close2, open2);
    }

    public final Close component1() {
        return this.close;
    }

    public final Open component2() {
        return this.open;
    }

    public final PeriodsItem copy(Close close2, Open open2) {
        return new PeriodsItem(close2, open2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodsItem)) {
            return false;
        }
        PeriodsItem periodsItem = (PeriodsItem) obj;
        return C13706o.m87924a(this.close, periodsItem.close) && C13706o.m87924a(this.open, periodsItem.open);
    }

    public final Close getClose() {
        return this.close;
    }

    public final Open getOpen() {
        return this.open;
    }

    public int hashCode() {
        Close close2 = this.close;
        int i = 0;
        int hashCode = (close2 != null ? close2.hashCode() : 0) * 31;
        Open open2 = this.open;
        if (open2 != null) {
            i = open2.hashCode();
        }
        return hashCode + i;
    }

    public final void setClose(Close close2) {
        this.close = close2;
    }

    public final void setOpen(Open open2) {
        this.open = open2;
    }

    public String toString() {
        return "PeriodsItem(close=" + this.close + ", open=" + this.open + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        Close close2 = this.close;
        if (close2 != null) {
            parcel.writeInt(1);
            close2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Open open2 = this.open;
        if (open2 != null) {
            parcel.writeInt(1);
            open2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PeriodsItem(Close close2, Open open2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : close2, (i & 2) != 0 ? null : open2);
    }
}
