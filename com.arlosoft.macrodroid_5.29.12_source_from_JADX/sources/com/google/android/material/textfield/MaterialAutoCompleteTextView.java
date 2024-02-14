package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: a */
    public final ListPopupWindow f50485a;
    @Nullable

    /* renamed from: c */
    private final AccessibilityManager f50486c;
    @NonNull

    /* renamed from: d */
    private final Rect f50487d;

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.autoCompleteTextViewStyle);
    }

    @Nullable
    /* renamed from: c */
    private TextInputLayout m69848c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m69849d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = m69848c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f50485a.getSelectedItemPosition()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable background = this.f50485a.getBackground();
        if (background != null) {
            background.getPadding(this.f50487d);
            Rect rect = this.f50487d;
            i2 += rect.left + rect.right;
        }
        return i2 + c.getEndIconView().getMeasuredWidth();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m69850e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Nullable
    public CharSequence getHint() {
        TextInputLayout c = m69848c();
        if (c == null || !c.mo59170P()) {
            return super.getHint();
        }
        return c.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = m69848c();
        if (c != null && c.mo59170P() && super.getHint() == null && ManufacturerUtils.m68721c()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m69849d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f50485a.setAdapter(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f50486c;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f50485a.show();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m69957c(context, attributeSet, i, 0), attributeSet, i);
        this.f50487d = new Rect();
        Context context2 = getContext();
        TypedArray h = ThemeEnforcement.m68822h(context2, attributeSet, C10462R.styleable.MaterialAutoCompleteTextView, i, C10462R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C10462R.styleable.MaterialAutoCompleteTextView_android_inputType;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f50486c = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f50485a = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MaterialAutoCompleteTextView.this.m69850e(i < 0 ? MaterialAutoCompleteTextView.this.f50485a.getSelectedItem() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = MaterialAutoCompleteTextView.this.f50485a.getSelectedView();
                        i = MaterialAutoCompleteTextView.this.f50485a.getSelectedItemPosition();
                        j = MaterialAutoCompleteTextView.this.f50485a.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f50485a.getListView(), view, i, j);
                }
                MaterialAutoCompleteTextView.this.f50485a.dismiss();
            }
        });
        h.recycle();
    }
}
