package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.C10462R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;

@ExperimentalBadgeUtils
public class BadgeUtils {

    /* renamed from: a */
    public static final boolean f48693a = false;

    /* renamed from: com.google.android.material.badge.BadgeUtils$1 */
    final class C104791 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Toolbar f48694a;

        /* renamed from: c */
        final /* synthetic */ int f48695c;

        /* renamed from: d */
        final /* synthetic */ BadgeDrawable f48696d;

        /* renamed from: f */
        final /* synthetic */ FrameLayout f48697f;

        public void run() {
            ActionMenuItemView a = ToolbarUtils.m68824a(this.f48694a, this.f48695c);
            if (a != null) {
                BadgeUtils.m67489f(this.f48696d, this.f48694a.getResources());
                BadgeUtils.m67484a(this.f48696d, a, this.f48697f);
            }
        }
    }

    private BadgeUtils() {
    }

    /* renamed from: a */
    public static void m67484a(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        m67488e(badgeDrawable, view, frameLayout);
        if (badgeDrawable.mo56816i() != null) {
            badgeDrawable.mo56816i().setForeground(badgeDrawable);
        } else if (!f48693a) {
            view.getOverlay().add(badgeDrawable);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    @NonNull
    /* renamed from: b */
    public static SparseArray<BadgeDrawable> m67485b(Context context, @NonNull ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState != null) {
                sparseArray.put(keyAt, BadgeDrawable.m67422e(context, savedState));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    @NonNull
    /* renamed from: c */
    public static ParcelableSparseArray m67486c(@NonNull SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.mo56822n());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m67487d(@Nullable BadgeDrawable badgeDrawable, @NonNull View view) {
        if (badgeDrawable != null) {
            if (f48693a || badgeDrawable.mo56816i() != null) {
                badgeDrawable.mo56816i().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(badgeDrawable);
            }
        }
    }

    /* renamed from: e */
    public static void m67488e(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.mo56808L(view, frameLayout);
    }

    @VisibleForTesting
    /* renamed from: f */
    static void m67489f(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.mo56828v(resources.getDimensionPixelOffset(C10462R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.mo56829w(resources.getDimensionPixelOffset(C10462R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    /* renamed from: g */
    public static void m67490g(@NonNull Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
