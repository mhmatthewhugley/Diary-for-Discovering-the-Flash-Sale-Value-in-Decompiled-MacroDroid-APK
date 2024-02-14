package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Geometry;", "Landroid/os/Parcelable;", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Viewport;", "component1", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Location;", "component2", "viewport", "location", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Viewport;", "getViewport", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Viewport;", "setViewport", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Viewport;)V", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Location;", "getLocation", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Location;", "setLocation", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Location;)V", "<init>", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Viewport;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Location;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: Geometry.kt */
public final class Geometry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("location")
    private Location location;
    @SerializedName("viewport")
    private Viewport viewport;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Location} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                java.lang.String r0 = "in"
                kotlin.jvm.internal.C13706o.m87930g(r5, r0)
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Geometry r0 = new com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Geometry
                int r1 = r5.readInt()
                r2 = 0
                if (r1 == 0) goto L_0x0017
                android.os.Parcelable$Creator r1 = com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Viewport.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r5)
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Viewport r1 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Viewport) r1
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                int r3 = r5.readInt()
                if (r3 == 0) goto L_0x0027
                android.os.Parcelable$Creator r2 = com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Location.CREATOR
                java.lang.Object r5 = r2.createFromParcel(r5)
                r2 = r5
                com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Location r2 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Location) r2
            L_0x0027:
                r0.<init>(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Geometry.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        public final Object[] newArray(int i) {
            return new Geometry[i];
        }
    }

    public Geometry() {
        this((Viewport) null, (Location) null, 3, (C13695i) null);
    }

    public Geometry(Viewport viewport2, Location location2) {
        this.viewport = viewport2;
        this.location = location2;
    }

    public static /* synthetic */ Geometry copy$default(Geometry geometry, Viewport viewport2, Location location2, int i, Object obj) {
        if ((i & 1) != 0) {
            viewport2 = geometry.viewport;
        }
        if ((i & 2) != 0) {
            location2 = geometry.location;
        }
        return geometry.copy(viewport2, location2);
    }

    public final Viewport component1() {
        return this.viewport;
    }

    public final Location component2() {
        return this.location;
    }

    public final Geometry copy(Viewport viewport2, Location location2) {
        return new Geometry(viewport2, location2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geometry)) {
            return false;
        }
        Geometry geometry = (Geometry) obj;
        return C13706o.m87924a(this.viewport, geometry.viewport) && C13706o.m87924a(this.location, geometry.location);
    }

    public final Location getLocation() {
        return this.location;
    }

    public final Viewport getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        Viewport viewport2 = this.viewport;
        int i = 0;
        int hashCode = (viewport2 != null ? viewport2.hashCode() : 0) * 31;
        Location location2 = this.location;
        if (location2 != null) {
            i = location2.hashCode();
        }
        return hashCode + i;
    }

    public final void setLocation(Location location2) {
        this.location = location2;
    }

    public final void setViewport(Viewport viewport2) {
        this.viewport = viewport2;
    }

    public String toString() {
        return "Geometry(viewport=" + this.viewport + ", location=" + this.location + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        Viewport viewport2 = this.viewport;
        if (viewport2 != null) {
            parcel.writeInt(1);
            viewport2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Location location2 = this.location;
        if (location2 != null) {
            parcel.writeInt(1);
            location2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Geometry(Viewport viewport2, Location location2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : viewport2, (i & 2) != 0 ? null : location2);
    }
}
