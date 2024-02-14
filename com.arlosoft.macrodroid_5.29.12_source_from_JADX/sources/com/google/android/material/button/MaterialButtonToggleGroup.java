package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C10462R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: B */
    private static final String f48912B = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: C */
    private static final int f48913C = C10462R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    /* access modifiers changed from: private */
    @IdRes

    /* renamed from: A */
    public int f48914A;

    /* renamed from: a */
    private final List<CornerData> f48915a;

    /* renamed from: c */
    private final CheckedStateTracker f48916c;

    /* renamed from: d */
    private final PressedStateTracker f48917d;

    /* renamed from: f */
    private final LinkedHashSet<OnButtonCheckedListener> f48918f;

    /* renamed from: g */
    private final Comparator<MaterialButton> f48919g;

    /* renamed from: o */
    private Integer[] f48920o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f48921p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f48922s;

    /* renamed from: z */
    private boolean f48923z;

    private class CheckedStateTracker implements MaterialButton.OnCheckedChangeListener {
        private CheckedStateTracker() {
        }

        /* renamed from: a */
        public void mo57038a(@NonNull MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.f48921p) {
                if (MaterialButtonToggleGroup.this.f48922s) {
                    int unused = MaterialButtonToggleGroup.this.f48914A = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.m67772v(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.m67764m(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    private static class CornerData {

        /* renamed from: e */
        private static final CornerSize f48927e = new AbsoluteCornerSize(0.0f);

        /* renamed from: a */
        CornerSize f48928a;

        /* renamed from: b */
        CornerSize f48929b;

        /* renamed from: c */
        CornerSize f48930c;

        /* renamed from: d */
        CornerSize f48931d;

        CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f48928a = cornerSize;
            this.f48929b = cornerSize3;
            this.f48930c = cornerSize4;
            this.f48931d = cornerSize2;
        }

        /* renamed from: a */
        public static CornerData m67781a(CornerData cornerData) {
            CornerSize cornerSize = f48927e;
            return new CornerData(cornerSize, cornerData.f48931d, cornerSize, cornerData.f48930c);
        }

        /* renamed from: b */
        public static CornerData m67782b(CornerData cornerData, View view) {
            return ViewUtils.m68842i(view) ? m67783c(cornerData) : m67784d(cornerData);
        }

        /* renamed from: c */
        public static CornerData m67783c(CornerData cornerData) {
            CornerSize cornerSize = cornerData.f48928a;
            CornerSize cornerSize2 = cornerData.f48931d;
            CornerSize cornerSize3 = f48927e;
            return new CornerData(cornerSize, cornerSize2, cornerSize3, cornerSize3);
        }

        /* renamed from: d */
        public static CornerData m67784d(CornerData cornerData) {
            CornerSize cornerSize = f48927e;
            return new CornerData(cornerSize, cornerSize, cornerData.f48929b, cornerData.f48930c);
        }

        /* renamed from: e */
        public static CornerData m67785e(CornerData cornerData, View view) {
            return ViewUtils.m68842i(view) ? m67784d(cornerData) : m67783c(cornerData);
        }

        /* renamed from: f */
        public static CornerData m67786f(CornerData cornerData) {
            CornerSize cornerSize = cornerData.f48928a;
            CornerSize cornerSize2 = f48927e;
            return new CornerData(cornerSize, cornerSize2, cornerData.f48929b, cornerSize2);
        }
    }

    public interface OnButtonCheckedListener {
        /* renamed from: a */
        void mo57094a(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i, boolean z);
    }

    private class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        /* renamed from: a */
        public void mo57039a(@NonNull MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m67768q(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m67768q(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m67768q(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m67761h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton n = m67765n(i);
                int min = Math.min(n.getStrokeWidth(), m67765n(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams i2 = m67762i(n);
                if (getOrientation() == 0) {
                    MarginLayoutParamsCompat.setMarginEnd(i2, 0);
                    MarginLayoutParamsCompat.setMarginStart(i2, -min);
                    i2.topMargin = 0;
                } else {
                    i2.bottomMargin = 0;
                    i2.topMargin = -min;
                    MarginLayoutParamsCompat.setMarginStart(i2, 0);
                }
                n.setLayoutParams(i2);
            }
            m67769s(firstVisibleChildIndex);
        }
    }

    @NonNull
    /* renamed from: i */
    private LinearLayout.LayoutParams m67762i(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: k */
    private void m67763k(int i, boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(i);
        if (materialButton != null) {
            materialButton.setChecked(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m67764m(@IdRes int i, boolean z) {
        Iterator it = this.f48918f.iterator();
        while (it.hasNext()) {
            ((OnButtonCheckedListener) it.next()).mo57094a(this, i, z);
        }
    }

    /* renamed from: n */
    private MaterialButton m67765n(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public int m67766o(@Nullable View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m67768q(i2)) {
                i++;
            }
        }
        return -1;
    }

    @Nullable
    /* renamed from: p */
    private CornerData m67767p(int i, int i2, int i3) {
        CornerData cornerData = this.f48915a.get(i);
        if (i2 == i3) {
            return cornerData;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? CornerData.m67785e(cornerData, this) : CornerData.m67786f(cornerData);
        }
        if (i == i3) {
            return z ? CornerData.m67782b(cornerData, this) : CornerData.m67781a(cornerData);
        }
        return null;
    }

    /* renamed from: q */
    private boolean m67768q(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: s */
    private void m67769s(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m67765n(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            MarginLayoutParamsCompat.setMarginEnd(layoutParams, 0);
            MarginLayoutParamsCompat.setMarginStart(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setCheckedId(int i) {
        this.f48914A = i;
        m67764m(i, true);
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.mo56981a(this.f48916c);
        materialButton.setOnPressedChangeListenerInternal(this.f48917d);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    private void m67770t(@IdRes int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f48921p = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f48921p = false;
        }
    }

    /* renamed from: u */
    private static void m67771u(ShapeAppearanceModel.Builder builder, @Nullable CornerData cornerData) {
        if (cornerData == null) {
            builder.mo58722o(0.0f);
        } else {
            builder.mo58716F(cornerData.f48928a).mo58730w(cornerData.f48931d).mo58720J(cornerData.f48929b).mo58711A(cornerData.f48930c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public boolean m67772v(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f48923z || !checkedButtonIds.isEmpty()) {
            if (z && this.f48922s) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    m67770t(intValue2, false);
                    m67764m(intValue2, false);
                }
            }
            return true;
        }
        m67770t(i, true);
        this.f48914A = i;
        return false;
    }

    /* renamed from: w */
    private void m67773w() {
        TreeMap treeMap = new TreeMap(this.f48919g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m67765n(i), Integer.valueOf(i));
        }
        this.f48920o = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f48912B, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m67772v(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f48915a.add(new CornerData(shapeAppearanceModel.mo58703r(), shapeAppearanceModel.mo58696j(), shapeAppearanceModel.mo58705t(), shapeAppearanceModel.mo58698l()));
        ViewCompat.setAccessibilityDelegate(materialButton, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, MaterialButtonToggleGroup.this.m67766o(view), 1, false, ((MaterialButton) view).isChecked()));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(@NonNull Canvas canvas) {
        m67773w();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void mo57076g(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.f48918f.add(onButtonCheckedListener);
    }

    @NonNull
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @IdRes
    public int getCheckedButtonId() {
        if (this.f48922s) {
            return this.f48914A;
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton n = m67765n(i);
            if (n.isChecked()) {
                arrayList.add(Integer.valueOf(n.getId()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f48920o;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f48912B, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: j */
    public void mo57081j(@IdRes int i) {
        if (i != this.f48914A) {
            m67763k(i, true);
        }
    }

    /* renamed from: l */
    public void mo57082l() {
        this.f48921p = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton n = m67765n(i);
            n.setChecked(false);
            m67764m(n.getId(), false);
        }
        this.f48921p = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f48914A;
        if (i != -1) {
            m67763k(i, true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getVisibleButtonCount(), false, mo57087r() ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo57091x();
        m67761h();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.mo56998h(this.f48916c);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.OnPressedChangeListener) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f48915a.remove(indexOfChild);
        }
        mo57091x();
        m67761h();
    }

    /* renamed from: r */
    public boolean mo57087r() {
        return this.f48922s;
    }

    public void setSelectionRequired(boolean z) {
        this.f48923z = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f48922s != z) {
            this.f48922s = z;
            mo57082l();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: x */
    public void mo57091x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton n = m67765n(i);
            if (n.getVisibility() != 8) {
                ShapeAppearanceModel.Builder v = n.getShapeAppearanceModel().mo58707v();
                m67771u(v, m67767p(i, firstVisibleChildIndex, lastVisibleChildIndex));
                n.setShapeAppearanceModel(v.mo58721m());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f48913C
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f48915a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$CheckedStateTracker r7 = new com.google.android.material.button.MaterialButtonToggleGroup$CheckedStateTracker
            r0 = 0
            r7.<init>()
            r6.f48916c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$PressedStateTracker r7 = new com.google.android.material.button.MaterialButtonToggleGroup$PressedStateTracker
            r7.<init>()
            r6.f48917d = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f48918f = r7
            com.google.android.material.button.MaterialButtonToggleGroup$1 r7 = new com.google.android.material.button.MaterialButtonToggleGroup$1
            r7.<init>()
            r6.f48919g = r7
            r7 = 0
            r6.f48921p = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C10462R.styleable.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = com.google.android.material.C10462R.styleable.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f48914A = r9
            int r9 = com.google.android.material.C10462R.styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f48923z = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
