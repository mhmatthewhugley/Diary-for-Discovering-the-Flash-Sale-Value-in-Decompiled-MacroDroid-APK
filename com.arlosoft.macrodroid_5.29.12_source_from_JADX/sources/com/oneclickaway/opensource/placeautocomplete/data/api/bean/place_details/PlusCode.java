package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlusCode;", "Landroid/os/Parcelable;", "", "component1", "component2", "compoundCode", "globalCode", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/String;", "getCompoundCode", "()Ljava/lang/String;", "setCompoundCode", "(Ljava/lang/String;)V", "getGlobalCode", "setGlobalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@Entity(tableName = "PlusCode")
/* compiled from: PlusCode.kt */
public final class PlusCode implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("compound_code")
    private String compoundCode;
    @SerializedName("global_code")
    private String globalCode;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C13706o.m87930g(parcel, "in");
            return new PlusCode(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PlusCode[i];
        }
    }

    public PlusCode() {
        this((String) null, (String) null, 3, (C13695i) null);
    }

    public PlusCode(String str, String str2) {
        this.compoundCode = str;
        this.globalCode = str2;
    }

    public static /* synthetic */ PlusCode copy$default(PlusCode plusCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusCode.compoundCode;
        }
        if ((i & 2) != 0) {
            str2 = plusCode.globalCode;
        }
        return plusCode.copy(str, str2);
    }

    public final String component1() {
        return this.compoundCode;
    }

    public final String component2() {
        return this.globalCode;
    }

    public final PlusCode copy(String str, String str2) {
        return new PlusCode(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlusCode)) {
            return false;
        }
        PlusCode plusCode = (PlusCode) obj;
        return C13706o.m87924a(this.compoundCode, plusCode.compoundCode) && C13706o.m87924a(this.globalCode, plusCode.globalCode);
    }

    public final String getCompoundCode() {
        return this.compoundCode;
    }

    public final String getGlobalCode() {
        return this.globalCode;
    }

    public int hashCode() {
        String str = this.compoundCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.globalCode;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final void setCompoundCode(String str) {
        this.compoundCode = str;
    }

    public final void setGlobalCode(String str) {
        this.globalCode = str;
    }

    public String toString() {
        return "PlusCode(compoundCode=" + this.compoundCode + ", globalCode=" + this.globalCode + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        parcel.writeString(this.compoundCode);
        parcel.writeString(this.globalCode);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlusCode(String str, String str2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
