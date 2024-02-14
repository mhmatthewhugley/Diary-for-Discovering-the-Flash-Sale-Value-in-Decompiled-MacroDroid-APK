package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.C0144Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C10462R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends PickerFragment<S> {
    @VisibleForTesting

    /* renamed from: C */
    static final Object f49161C = "MONTHS_VIEW_GROUP_TAG";
    @VisibleForTesting

    /* renamed from: D */
    static final Object f49162D = "NAVIGATION_PREV_TAG";
    @VisibleForTesting

    /* renamed from: E */
    static final Object f49163E = "NAVIGATION_NEXT_TAG";
    @VisibleForTesting

    /* renamed from: F */
    static final Object f49164F = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A */
    private View f49165A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public View f49166B;
    @StyleRes

    /* renamed from: c */
    private int f49167c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public DateSelector<S> f49168d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public CalendarConstraints f49169f;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public Month f49170g;

    /* renamed from: o */
    private CalendarSelector f49171o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public CalendarStyle f49172p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public RecyclerView f49173s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public RecyclerView f49174z;

    enum CalendarSelector {
        DAY,
        YEAR
    }

    interface OnDayClickListener {
        /* renamed from: a */
        void mo57623a(long j);
    }

    /* renamed from: h0 */
    private void m68185h0(@NonNull View view, @NonNull final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(C10462R.C10465id.month_navigation_fragment_toggle);
        materialButton.setTag(f49164F);
        ViewCompat.setAccessibilityDelegate(materialButton, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String str;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (MaterialCalendar.this.f49166B.getVisibility() == 0) {
                    str = MaterialCalendar.this.getString(C10462R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    str = MaterialCalendar.this.getString(C10462R.string.mtrl_picker_toggle_to_day_selection);
                }
                accessibilityNodeInfoCompat.setHintText(str);
            }
        });
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C10462R.C10465id.month_navigation_previous);
        materialButton2.setTag(f49162D);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C10462R.C10465id.month_navigation_next);
        materialButton3.setTag(f49163E);
        this.f49165A = view.findViewById(C10462R.C10465id.mtrl_calendar_year_selector_frame);
        this.f49166B = view.findViewById(C10462R.C10465id.mtrl_calendar_day_selector_frame);
        mo57621y0(CalendarSelector.DAY);
        materialButton.setText(this.f49170g.mo57654k(view.getContext()));
        this.f49174z.addOnScrollListener(new RecyclerView.OnScrollListener() {
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                if (i == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }

            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                int i3;
                if (i < 0) {
                    i3 = MaterialCalendar.this.mo57619r0().findFirstVisibleItemPosition();
                } else {
                    i3 = MaterialCalendar.this.mo57619r0().findLastVisibleItemPosition();
                }
                Month unused = MaterialCalendar.this.f49170g = monthsPagerAdapter.mo57678C(i3);
                materialButton.setText(monthsPagerAdapter.mo57679D(i3));
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MaterialCalendar.this.mo57613A0();
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int findFirstVisibleItemPosition = MaterialCalendar.this.mo57619r0().findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < MaterialCalendar.this.f49174z.getAdapter().getItemCount()) {
                    MaterialCalendar.this.mo57620v0(monthsPagerAdapter.mo57678C(findFirstVisibleItemPosition));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int findLastVisibleItemPosition = MaterialCalendar.this.mo57619r0().findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    MaterialCalendar.this.mo57620v0(monthsPagerAdapter.mo57678C(findLastVisibleItemPosition));
                }
            }
        });
    }

    @NonNull
    /* renamed from: i0 */
    private RecyclerView.ItemDecoration m68186i0() {
        return new RecyclerView.ItemDecoration() {

            /* renamed from: a */
            private final Calendar f49181a = UtcDates.m68330q();

            /* renamed from: b */
            private final Calendar f49182b = UtcDates.m68330q();

            public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                int i;
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (Pair next : MaterialCalendar.this.f49168d.mo57590o1()) {
                        F f = next.first;
                        if (!(f == null || next.second == null)) {
                            this.f49181a.setTimeInMillis(((Long) f).longValue());
                            this.f49182b.setTimeInMillis(((Long) next.second).longValue());
                            int D = yearGridAdapter.mo57701D(this.f49181a.get(1));
                            int D2 = yearGridAdapter.mo57701D(this.f49182b.get(1));
                            View findViewByPosition = gridLayoutManager.findViewByPosition(D);
                            View findViewByPosition2 = gridLayoutManager.findViewByPosition(D2);
                            int spanCount = D / gridLayoutManager.getSpanCount();
                            int spanCount2 = D2 / gridLayoutManager.getSpanCount();
                            int i2 = spanCount;
                            while (i2 <= spanCount2) {
                                View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i2);
                                if (findViewByPosition3 != null) {
                                    int top = findViewByPosition3.getTop() + MaterialCalendar.this.f49172p.f49136d.mo57566c();
                                    int bottom = findViewByPosition3.getBottom() - MaterialCalendar.this.f49172p.f49136d.mo57565b();
                                    int left = i2 == spanCount ? findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2) : 0;
                                    if (i2 == spanCount2) {
                                        i = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                    } else {
                                        i = recyclerView.getWidth();
                                    }
                                    canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, MaterialCalendar.this.f49172p.f49140h);
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
        };
    }

    @C0144Px
    /* renamed from: p0 */
    static int m68187p0(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(C10462R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: q0 */
    private static int m68188q0(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C10462R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C10462R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C10462R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C10462R.dimen.mtrl_calendar_days_of_week_height);
        int i = MonthAdapter.f49237o;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C10462R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C10462R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C10462R.dimen.mtrl_calendar_bottom_padding);
    }

    @NonNull
    /* renamed from: s0 */
    public static <T> MaterialCalendar<T> m68189s0(@NonNull DateSelector<T> dateSelector, @StyleRes int i, @NonNull CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.mo57553i());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    /* renamed from: u0 */
    private void m68190u0(final int i) {
        this.f49174z.post(new Runnable() {
            public void run() {
                MaterialCalendar.this.f49174z.smoothScrollToPosition(i);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo57613A0() {
        CalendarSelector calendarSelector = this.f49171o;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            mo57621y0(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            mo57621y0(calendarSelector2);
        }
    }

    /* renamed from: U */
    public boolean mo57614U(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.mo57614U(onSelectionChangedListener);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: j0 */
    public CalendarConstraints mo57615j0() {
        return this.f49169f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public CalendarStyle mo57616m0() {
        return this.f49172p;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: n0 */
    public Month mo57617n0() {
        return this.f49170g;
    }

    @Nullable
    /* renamed from: o0 */
    public DateSelector<S> mo57618o0() {
        return this.f49168d;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f49167c = bundle.getInt("THEME_RES_ID_KEY");
        this.f49168d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f49169f = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f49170g = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        final int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f49167c);
        this.f49172p = new CalendarStyle(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month j = this.f49169f.mo57554j();
        if (MaterialDatePicker.m68220p0(contextThemeWrapper)) {
            i2 = C10462R.C10467layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C10462R.C10467layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(m68188q0(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C10462R.C10465id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo((Object) null);
            }
        });
        gridView.setAdapter(new DaysOfWeekAdapter());
        gridView.setNumColumns(j.f49233f);
        gridView.setEnabled(false);
        this.f49174z = (RecyclerView) inflate.findViewById(C10462R.C10465id.mtrl_calendar_months);
        this.f49174z.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i, false) {
            /* access modifiers changed from: protected */
            public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
                if (i == 0) {
                    iArr[0] = MaterialCalendar.this.f49174z.getWidth();
                    iArr[1] = MaterialCalendar.this.f49174z.getWidth();
                    return;
                }
                iArr[0] = MaterialCalendar.this.f49174z.getHeight();
                iArr[1] = MaterialCalendar.this.f49174z.getHeight();
            }
        });
        this.f49174z.setTag(f49161C);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f49168d, this.f49169f, new OnDayClickListener() {
            /* renamed from: a */
            public void mo57623a(long j) {
                if (MaterialCalendar.this.f49169f.mo57549f().mo57564C0(j)) {
                    MaterialCalendar.this.f49168d.mo57588g2(j);
                    Iterator it = MaterialCalendar.this.f49252a.iterator();
                    while (it.hasNext()) {
                        ((OnSelectionChangedListener) it.next()).mo57642b(MaterialCalendar.this.f49168d.mo57587b2());
                    }
                    MaterialCalendar.this.f49174z.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.f49173s != null) {
                        MaterialCalendar.this.f49173s.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.f49174z.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(C10462R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C10462R.C10465id.mtrl_calendar_year_selector_frame);
        this.f49173s = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f49173s.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f49173s.setAdapter(new YearGridAdapter(this));
            this.f49173s.addItemDecoration(m68186i0());
        }
        if (inflate.findViewById(C10462R.C10465id.month_navigation_fragment_toggle) != null) {
            m68185h0(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.m68220p0(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f49174z);
        }
        this.f49174z.scrollToPosition(monthsPagerAdapter.mo57680E(this.f49170g));
        return inflate;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f49167c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f49168d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f49169f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f49170g);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: r0 */
    public LinearLayoutManager mo57619r0() {
        return (LinearLayoutManager) this.f49174z.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo57620v0(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.f49174z.getAdapter();
        int E = monthsPagerAdapter.mo57680E(month);
        int E2 = E - monthsPagerAdapter.mo57680E(this.f49170g);
        boolean z = true;
        boolean z2 = Math.abs(E2) > 3;
        if (E2 <= 0) {
            z = false;
        }
        this.f49170g = month;
        if (z2 && z) {
            this.f49174z.scrollToPosition(E - 3);
            m68190u0(E);
        } else if (z2) {
            this.f49174z.scrollToPosition(E + 3);
            m68190u0(E);
        } else {
            m68190u0(E);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo57621y0(CalendarSelector calendarSelector) {
        this.f49171o = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f49173s.getLayoutManager().scrollToPosition(((YearGridAdapter) this.f49173s.getAdapter()).mo57701D(this.f49170g.f49232d));
            this.f49165A.setVisibility(0);
            this.f49166B.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f49165A.setVisibility(8);
            this.f49166B.setVisibility(0);
            mo57620v0(this.f49170g);
        }
    }
}
