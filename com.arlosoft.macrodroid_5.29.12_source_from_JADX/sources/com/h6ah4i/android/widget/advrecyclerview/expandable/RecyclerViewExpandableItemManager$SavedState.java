package com.h6ah4i.android.widget.advrecyclerview.expandable;

import android.os.Parcel;
import android.os.Parcelable;

public class RecyclerViewExpandableItemManager$SavedState implements Parcelable {
    public static final Parcelable.Creator<RecyclerViewExpandableItemManager$SavedState> CREATOR = new C11657a();

    /* renamed from: a */
    final long[] f57293a;

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager$SavedState$a */
    static class C11657a implements Parcelable.Creator<RecyclerViewExpandableItemManager$SavedState> {
        C11657a() {
        }

        /* renamed from: a */
        public RecyclerViewExpandableItemManager$SavedState createFromParcel(Parcel parcel) {
            return new RecyclerViewExpandableItemManager$SavedState(parcel);
        }

        /* renamed from: b */
        public RecyclerViewExpandableItemManager$SavedState[] newArray(int i) {
            return new RecyclerViewExpandableItemManager$SavedState[i];
        }
    }

    RecyclerViewExpandableItemManager$SavedState(Parcel parcel) {
        this.f57293a = parcel.createLongArray();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLongArray(this.f57293a);
    }
}
