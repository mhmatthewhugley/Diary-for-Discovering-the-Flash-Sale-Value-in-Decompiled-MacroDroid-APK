package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C10462R;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;

public class ChipGroup extends FlowLayout {

    /* renamed from: E */
    private static final int f49055E = C10462R.style.Widget_MaterialComponents_ChipGroup;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final CheckedStateTracker f49056A;
    @NonNull

    /* renamed from: B */
    private PassThroughHierarchyChangeListener f49057B;
    /* access modifiers changed from: private */
    @IdRes

    /* renamed from: C */
    public int f49058C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f49059D;
    @Dimension

    /* renamed from: g */
    private int f49060g;
    @Dimension

    /* renamed from: o */
    private int f49061o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f49062p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f49063s;
    @Nullable

    /* renamed from: z */
    private OnCheckedChangeListener f49064z;

    private class CheckedStateTracker implements CompoundButton.OnCheckedChangeListener {
        private CheckedStateTracker() {
        }

        public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f49059D) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f49063s) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f49058C == -1 || ChipGroup.this.f49058C == id || !ChipGroup.this.f49062p)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m68031r(chipGroup.f49058C, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f49058C == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.m68031r(compoundButton.getId(), true);
                    ChipGroup.this.m68030q(compoundButton.getId(), false);
                }
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    public interface OnCheckedChangeListener {
        /* renamed from: a */
        void mo57481a(ChipGroup chipGroup, @IdRes int i);
    }

    private class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f49066a;

        private PassThroughHierarchyChangeListener() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.generateViewId());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).mo57456m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f49056A);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f49066a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f49066a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.chipGroupStyle);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m68030q(int i, boolean z) {
        this.f49058C = i;
        OnCheckedChangeListener onCheckedChangeListener = this.f49064z;
        if (onCheckedChangeListener != null && this.f49062p && z) {
            onCheckedChangeListener.mo57481a(this, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m68031r(@IdRes int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f49059D = true;
            ((Chip) findViewById).setChecked(z);
            this.f49059D = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        m68030q(i, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f49058C;
                if (i2 != -1 && this.f49062p) {
                    m68031r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public boolean mo57447c() {
        return super.mo57447c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        if (this.f49062p) {
            return this.f49058C;
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f49062p) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f49060g;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f49061o;
    }

    /* renamed from: m */
    public void mo57456m(@IdRes int i) {
        int i2 = this.f49058C;
        if (i != i2) {
            if (i2 != -1 && this.f49062p) {
                m68031r(i2, false);
            }
            if (i != -1) {
                m68031r(i, true);
            }
            setCheckedId(i);
        }
    }

    /* renamed from: n */
    public void mo57457n() {
        this.f49059D = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f49059D = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo57458o(@Nullable View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f49058C;
        if (i != -1) {
            m68031r(i, true);
            setCheckedId(this.f49058C);
        }
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), mo57447c() ? getChipCount() : -1, false, mo57461p() ? 1 : 2));
    }

    /* renamed from: p */
    public boolean mo57461p() {
        return this.f49062p;
    }

    public void setChipSpacing(@Dimension int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@Dimension int i) {
        if (this.f49060g != i) {
            this.f49060g = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@DimenRes int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@Dimension int i) {
        if (this.f49061o != i) {
            this.f49061o = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.f49064z = onCheckedChangeListener;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f49057B.f49066a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f49063s = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f49062p != z) {
            this.f49062p = z;
            mo57457n();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f49055E
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$CheckedStateTracker r8 = new com.google.android.material.chip.ChipGroup$CheckedStateTracker
            r0 = 0
            r8.<init>()
            r7.f49056A = r8
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r8 = new com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener
            r8.<init>()
            r7.f49057B = r8
            r8 = -1
            r7.f49058C = r8
            r6 = 0
            r7.f49059D = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C10462R.styleable.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = com.google.android.material.C10462R.styleable.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.C10462R.styleable.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = com.google.android.material.C10462R.styleable.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine((boolean) r10)
            int r10 = com.google.android.material.C10462R.styleable.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection((boolean) r10)
            int r10 = com.google.android.material.C10462R.styleable.ChipGroup_selectionRequired
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = com.google.android.material.C10462R.styleable.ChipGroup_checkedChip
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L_0x0069
            r7.f49058C = r10
        L_0x0069:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r8 = r7.f49057B
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
