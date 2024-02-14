package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C10462R;
import com.google.android.material.datepicker.MaterialCalendar;

class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final Context f49243a;
    @NonNull

    /* renamed from: b */
    private final CalendarConstraints f49244b;

    /* renamed from: c */
    private final DateSelector<?> f49245c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MaterialCalendar.OnDayClickListener f49246d;

    /* renamed from: e */
    private final int f49247e;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TextView f49250a;

        /* renamed from: b */
        final MaterialCalendarGridView f49251b;

        ViewHolder(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C10462R.C10465id.month_title);
            this.f49250a = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.f49251b = (MaterialCalendarGridView) linearLayout.findViewById(C10462R.C10465id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    MonthsPagerAdapter(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, MaterialCalendar.OnDayClickListener onDayClickListener) {
        Month j = calendarConstraints.mo57554j();
        Month g = calendarConstraints.mo57550g();
        Month i = calendarConstraints.mo57553i();
        if (j.compareTo(i) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i.compareTo(g) <= 0) {
            int p0 = MonthAdapter.f49237o * MaterialCalendar.m68187p0(context);
            int p02 = MaterialDatePicker.m68220p0(context) ? MaterialCalendar.m68187p0(context) : 0;
            this.f49243a = context;
            this.f49247e = p0 + p02;
            this.f49244b = calendarConstraints;
            this.f49245c = dateSelector;
            this.f49246d = onDayClickListener;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: C */
    public Month mo57678C(int i) {
        return this.f49244b.mo57554j().mo57656m(i);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: D */
    public CharSequence mo57679D(int i) {
        return mo57678C(i).mo57654k(this.f49243a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public int mo57680E(@NonNull Month month) {
        return this.f49244b.mo57554j().mo57657n(month);
    }

    /* renamed from: F */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Month m = this.f49244b.mo57554j().mo57656m(i);
        viewHolder.f49250a.setText(m.mo57654k(viewHolder.itemView.getContext()));
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.f49251b.findViewById(C10462R.C10465id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !m.equals(materialCalendarGridView.getAdapter().f49238a)) {
            MonthAdapter monthAdapter = new MonthAdapter(m, this.f49245c, this.f49244b);
            materialCalendarGridView.setNumColumns(m.f49233f);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo57676m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (materialCalendarGridView.getAdapter().mo57677n(i)) {
                    MonthsPagerAdapter.this.f49246d.mo57623a(materialCalendarGridView.getAdapter().getItem(i).longValue());
                }
            }
        });
    }

    @NonNull
    /* renamed from: G */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C10462R.C10467layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.m68220p0(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f49247e));
        return new ViewHolder(linearLayout, true);
    }

    public int getItemCount() {
        return this.f49244b.mo57551h();
    }

    public long getItemId(int i) {
        return this.f49244b.mo57554j().mo57656m(i).mo57655l();
    }
}
