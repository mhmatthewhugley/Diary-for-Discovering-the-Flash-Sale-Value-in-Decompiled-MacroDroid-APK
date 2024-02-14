package com.ikovac.timepickerwithseconds;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class TimePicker extends FrameLayout {

    /* renamed from: D */
    private static final C11666g f57306D = new C11660a();

    /* renamed from: E */
    public static final NumberPicker.Formatter f57307E = new C11661b();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final String f57308A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final String f57309B;

    /* renamed from: C */
    private C11666g f57310C;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f57311a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f57312c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f57313d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Boolean f57314f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f57315g;

    /* renamed from: o */
    private final NumberPicker f57316o;

    /* renamed from: p */
    private final NumberPicker f57317p;

    /* renamed from: s */
    private final NumberPicker f57318s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final Button f57319z;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11659a();

        /* renamed from: a */
        private final int f57320a;

        /* renamed from: c */
        private final int f57321c;

        /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$SavedState$a */
        static class C11659a implements Parcelable.Creator<SavedState> {
            C11659a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C11660a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C11660a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        public int mo65600a() {
            return this.f57320a;
        }

        /* renamed from: b */
        public int mo65601b() {
            return this.f57321c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f57320a);
            parcel.writeInt(this.f57321c);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, C11660a aVar) {
            this(parcelable, i, i2);
        }

        private SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f57320a = i;
            this.f57321c = i2;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f57320a = parcel.readInt();
            this.f57321c = parcel.readInt();
        }
    }

    /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$a */
    static class C11660a implements C11666g {
        C11660a() {
        }

        /* renamed from: a */
        public void mo65607a(TimePicker timePicker, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$b */
    static class C11661b implements NumberPicker.Formatter {
        C11661b() {
        }

        public String format(int i) {
            return String.format("%02d", new Object[]{Integer.valueOf(i)});
        }
    }

    /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$c */
    class C11662c implements NumberPicker.OnValueChangeListener {
        C11662c() {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            int unused = TimePicker.this.f57311a = i2;
            if (!TimePicker.this.f57314f.booleanValue()) {
                if (TimePicker.this.f57311a == 12) {
                    int unused2 = TimePicker.this.f57311a = 0;
                }
                if (!TimePicker.this.f57315g) {
                    TimePicker timePicker = TimePicker.this;
                    int unused3 = timePicker.f57311a = timePicker.f57311a + 12;
                }
            }
            TimePicker.this.m81717m();
        }
    }

    /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$d */
    class C11663d implements NumberPicker.OnValueChangeListener {
        C11663d() {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            int unused = TimePicker.this.f57312c = i2;
            TimePicker.this.m81717m();
        }
    }

    /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$e */
    class C11664e implements NumberPicker.OnValueChangeListener {
        C11664e() {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            int unused = TimePicker.this.f57313d = i2;
            TimePicker.this.m81717m();
        }
    }

    /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$f */
    class C11665f implements View.OnClickListener {
        C11665f() {
        }

        public void onClick(View view) {
            TimePicker.this.requestFocus();
            if (TimePicker.this.f57315g) {
                if (TimePicker.this.f57311a < 12) {
                    TimePicker timePicker = TimePicker.this;
                    int unused = timePicker.f57311a = timePicker.f57311a + 12;
                }
            } else if (TimePicker.this.f57311a >= 12) {
                TimePicker timePicker2 = TimePicker.this;
                int unused2 = timePicker2.f57311a = timePicker2.f57311a - 12;
            }
            TimePicker timePicker3 = TimePicker.this;
            boolean unused3 = timePicker3.f57315g = !timePicker3.f57315g;
            TimePicker.this.f57319z.setText(TimePicker.this.f57315g ? TimePicker.this.f57308A : TimePicker.this.f57309B);
            TimePicker.this.m81717m();
        }
    }

    /* renamed from: com.ikovac.timepickerwithseconds.TimePicker$g */
    public interface C11666g {
        /* renamed from: a */
        void mo65607a(TimePicker timePicker, int i, int i2, int i3);
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: l */
    private void m81716l() {
        if (this.f57314f.booleanValue()) {
            this.f57316o.setMinValue(0);
            this.f57316o.setMaxValue(23);
            this.f57316o.setFormatter(f57307E);
            this.f57319z.setVisibility(8);
            return;
        }
        this.f57316o.setMinValue(1);
        this.f57316o.setMaxValue(12);
        this.f57316o.setFormatter((NumberPicker.Formatter) null);
        this.f57319z.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m81717m() {
        this.f57310C.mo65607a(this, getCurrentHour().intValue(), getCurrentMinute().intValue(), getCurrentSeconds().intValue());
    }

    /* renamed from: n */
    private void m81718n() {
        int i = this.f57311a;
        if (!this.f57314f.booleanValue()) {
            if (i > 12) {
                i -= 12;
            } else if (i == 0) {
                i = 12;
            }
        }
        this.f57316o.setValue(i);
        boolean z = this.f57311a < 12;
        this.f57315g = z;
        this.f57319z.setText(z ? this.f57308A : this.f57309B);
        m81717m();
    }

    /* renamed from: o */
    private void m81719o() {
        this.f57317p.setValue(this.f57312c);
        this.f57310C.mo65607a(this, getCurrentHour().intValue(), getCurrentMinute().intValue(), getCurrentSeconds().intValue());
    }

    /* renamed from: p */
    private void m81720p() {
        this.f57318s.setValue(this.f57313d);
        this.f57310C.mo65607a(this, getCurrentHour().intValue(), getCurrentMinute().intValue(), getCurrentSeconds().intValue());
    }

    public int getBaseline() {
        return this.f57316o.getBaseline();
    }

    public Integer getCurrentHour() {
        return Integer.valueOf(this.f57311a);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f57312c);
    }

    public Integer getCurrentSeconds() {
        return Integer.valueOf(this.f57313d);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentHour(Integer.valueOf(savedState.mo65600a()));
        setCurrentMinute(Integer.valueOf(savedState.mo65601b()));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f57311a, this.f57312c, (C11660a) null);
    }

    public void setCurrentHour(Integer num) {
        this.f57311a = num.intValue();
        m81718n();
    }

    public void setCurrentMinute(Integer num) {
        this.f57312c = num.intValue();
        m81719o();
    }

    public void setCurrentSecond(Integer num) {
        this.f57313d = num.intValue();
        m81720p();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f57317p.setEnabled(z);
        this.f57316o.setEnabled(z);
        this.f57319z.setEnabled(z);
    }

    public void setIs24HourView(Boolean bool) {
        if (this.f57314f != bool) {
            this.f57314f = bool;
            m81716l();
            m81718n();
        }
    }

    public void setOnTimeChangedListener(C11666g gVar) {
        this.f57310C = gVar;
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57311a = 0;
        this.f57312c = 0;
        this.f57313d = 0;
        this.f57314f = Boolean.FALSE;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.time_picker_widget, this, true);
        NumberPicker numberPicker = (NumberPicker) findViewById(R$id.hour);
        this.f57316o = numberPicker;
        numberPicker.setOnValueChangedListener(new C11662c());
        NumberPicker numberPicker2 = (NumberPicker) findViewById(R$id.minute);
        this.f57317p = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        NumberPicker.Formatter formatter = f57307E;
        numberPicker2.setFormatter(formatter);
        numberPicker2.setOnValueChangedListener(new C11663d());
        NumberPicker numberPicker3 = (NumberPicker) findViewById(R$id.seconds);
        this.f57318s = numberPicker3;
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setFormatter(formatter);
        numberPicker3.setOnValueChangedListener(new C11664e());
        Button button = (Button) findViewById(R$id.amPm);
        this.f57319z = button;
        m81716l();
        Calendar instance = Calendar.getInstance();
        setOnTimeChangedListener(f57306D);
        setCurrentHour(Integer.valueOf(instance.get(11)));
        setCurrentMinute(Integer.valueOf(instance.get(12)));
        setCurrentSecond(Integer.valueOf(instance.get(13)));
        this.f57315g = this.f57311a < 12;
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        String str = amPmStrings[0];
        this.f57308A = str;
        String str2 = amPmStrings[1];
        this.f57309B = str2;
        button.setText(!this.f57315g ? str2 : str);
        button.setOnClickListener(new C11665f());
        if (!isEnabled()) {
            setEnabled(false);
        }
    }
}
