package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f49196a;

    /* renamed from: c */
    private final boolean f49197c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m68202a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo57674i());
        } else if (i == 130) {
            setSelection(getAdapter().mo57664b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private View m68203c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* renamed from: d */
    private static int m68204d(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    private static boolean m68205e(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @NonNull
    /* renamed from: b */
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(@NonNull Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter b = getAdapter();
        DateSelector<?> dateSelector = b.f49239c;
        CalendarStyle calendarStyle = b.f49241f;
        int max = Math.max(b.mo57664b(), getFirstVisiblePosition());
        int min = Math.min(b.mo57674i(), getLastVisiblePosition());
        Long c = b.getItem(max);
        Long c2 = b.getItem(min);
        Iterator<Pair<Long, Long>> it = dateSelector.mo57590o1().iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            F f = next.first;
            if (f == null) {
                materialCalendarGridView = this;
            } else if (next.second != null) {
                long longValue = ((Long) f).longValue();
                long longValue2 = ((Long) next.second).longValue();
                if (!m68205e(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean i9 = ViewUtils.m68842i(this);
                    if (longValue < c.longValue()) {
                        if (b.mo57667f(max)) {
                            i8 = 0;
                        } else if (!i9) {
                            i8 = materialCalendarGridView.m68203c(max - 1).getRight();
                        } else {
                            i8 = materialCalendarGridView.m68203c(max - 1).getLeft();
                        }
                        i = i8;
                        i2 = max;
                    } else {
                        materialCalendarGridView.f49196a.setTimeInMillis(longValue);
                        i2 = b.mo57663a(materialCalendarGridView.f49196a.get(5));
                        i = m68204d(materialCalendarGridView.m68203c(i2));
                    }
                    if (longValue2 > c2.longValue()) {
                        if (b.mo57668g(min)) {
                            i7 = getWidth();
                        } else if (!i9) {
                            i7 = materialCalendarGridView.m68203c(min).getRight();
                        } else {
                            i7 = materialCalendarGridView.m68203c(min).getLeft();
                        }
                        i3 = i7;
                        i4 = min;
                    } else {
                        materialCalendarGridView.f49196a.setTimeInMillis(longValue2);
                        i4 = b.mo57663a(materialCalendarGridView.f49196a.get(5));
                        i3 = m68204d(materialCalendarGridView.m68203c(i4));
                    }
                    int itemId = (int) b.getItemId(i2);
                    int i10 = max;
                    int i11 = min;
                    int itemId2 = (int) b.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        MonthAdapter monthAdapter = b;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c3 = materialCalendarGridView.m68203c(numColumns);
                        int top = c3.getTop() + calendarStyle.f49133a.mo57566c();
                        Iterator<Pair<Long, Long>> it2 = it;
                        int bottom = c3.getBottom() - calendarStyle.f49133a.mo57565b();
                        if (!i9) {
                            i5 = numColumns > i2 ? 0 : i;
                            i6 = i4 > numColumns2 ? getWidth() : i3;
                        } else {
                            int i12 = i4 > numColumns2 ? 0 : i3;
                            int width = numColumns > i2 ? getWidth() : i;
                            i5 = i12;
                            i6 = width;
                        }
                        canvas.drawRect((float) i5, (float) top, (float) i6, (float) bottom, calendarStyle.f49140h);
                        itemId++;
                        materialCalendarGridView = this;
                        itemId2 = itemId2;
                        b = monthAdapter;
                        it = it2;
                    }
                    materialCalendarGridView = this;
                    max = i10;
                    min = i11;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m68202a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo57664b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo57664b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f49197c) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo57664b()) {
            super.setSelection(getAdapter().mo57664b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49196a = UtcDates.m68330q();
        if (MaterialDatePicker.m68220p0(getContext())) {
            setNextFocusLeftId(C10462R.C10465id.cancel_button);
            setNextFocusRightId(C10462R.C10465id.confirm_button);
        }
        this.f49197c = MaterialDatePicker.m68221q0(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo((Object) null);
            }
        });
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()}));
        }
    }
}
