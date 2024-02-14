package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarPresenter implements MenuPresenter {

    /* renamed from: a */
    private MenuBuilder f49755a;

    /* renamed from: c */
    private NavigationBarMenuView f49756c;

    /* renamed from: d */
    private boolean f49757d = false;

    /* renamed from: f */
    private int f49758f;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            @NonNull
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @NonNull
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f49759a;
        @Nullable

        /* renamed from: c */
        ParcelableSparseArray f49760c;

        SavedState() {
        }

        SavedState(@NonNull Parcel parcel) {
            this.f49759a = parcel.readInt();
            this.f49760c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f49759a);
            parcel.writeParcelable(this.f49760c, 0);
        }
    }

    /* renamed from: a */
    public void mo58327a(int i) {
        this.f49758f = i;
    }

    /* renamed from: b */
    public void mo58328b(@NonNull NavigationBarMenuView navigationBarMenuView) {
        this.f49756c = navigationBarMenuView;
    }

    /* renamed from: c */
    public void mo58329c(boolean z) {
        this.f49757d = z;
    }

    public boolean collapseItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean expandItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public int getId() {
        return this.f49758f;
    }

    @Nullable
    public MenuView getMenuView(@Nullable ViewGroup viewGroup) {
        return this.f49756c;
    }

    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f49755a = menuBuilder;
        this.f49756c.initialize(menuBuilder);
    }

    public void onCloseMenu(@Nullable MenuBuilder menuBuilder, boolean z) {
    }

    public void onRestoreInstanceState(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f49756c.mo58304j(savedState.f49759a);
            this.f49756c.setBadgeDrawables(BadgeUtils.m67485b(this.f49756c.getContext(), savedState.f49760c));
        }
    }

    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f49759a = this.f49756c.getSelectedItemId();
        savedState.f49760c = BadgeUtils.m67486c(this.f49756c.getBadgeDrawables());
        return savedState;
    }

    public boolean onSubMenuSelected(@Nullable SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setCallback(@Nullable MenuPresenter.Callback callback) {
    }

    public void updateMenuView(boolean z) {
        if (!this.f49757d) {
            if (z) {
                this.f49756c.mo58281c();
            } else {
                this.f49756c.mo58305k();
            }
        }
    }
}
