package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C10462R;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;

class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MaterialCalendar<?> f49275a;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TextView f49278a;

        ViewHolder(TextView textView) {
            super(textView);
            this.f49278a = textView;
        }
    }

    YearGridAdapter(MaterialCalendar<?> materialCalendar) {
        this.f49275a = materialCalendar;
    }

    @NonNull
    /* renamed from: C */
    private View.OnClickListener m68336C(final int i) {
        return new View.OnClickListener() {
            public void onClick(View view) {
                YearGridAdapter.this.f49275a.mo57620v0(YearGridAdapter.this.f49275a.mo57615j0().mo57547e(Month.m68234d(i, YearGridAdapter.this.f49275a.mo57617n0().f49231c)));
                YearGridAdapter.this.f49275a.mo57621y0(MaterialCalendar.CalendarSelector.DAY);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo57701D(int i) {
        return i - this.f49275a.mo57615j0().mo57554j().f49232d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public int mo57702E(int i) {
        return this.f49275a.mo57615j0().mo57554j().f49232d + i;
    }

    /* renamed from: F */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int E = mo57702E(i);
        String string = viewHolder.f49278a.getContext().getString(C10462R.string.mtrl_picker_navigate_to_year_description);
        viewHolder.f49278a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(E)}));
        viewHolder.f49278a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(E)}));
        CalendarStyle m0 = this.f49275a.mo57616m0();
        Calendar o = UtcDates.m68328o();
        CalendarItemStyle calendarItemStyle = o.get(1) == E ? m0.f49138f : m0.f49136d;
        for (Long longValue : this.f49275a.mo57618o0().mo57586Z1()) {
            o.setTimeInMillis(longValue.longValue());
            if (o.get(1) == E) {
                calendarItemStyle = m0.f49137e;
            }
        }
        calendarItemStyle.mo57567d(viewHolder.f49278a);
        viewHolder.f49278a.setOnClickListener(m68336C(E));
    }

    @NonNull
    /* renamed from: G */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C10462R.C10467layout.mtrl_calendar_year, viewGroup, false));
    }

    public int getItemCount() {
        return this.f49275a.mo57615j0().mo57555k();
    }
}
