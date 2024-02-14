package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: com.arlosoft.macrodroid.widget.f */
/* compiled from: MacroDroidTimePickerDialog */
public class C6638f extends AlertDialog implements DialogInterface.OnClickListener, TimePicker.OnTimeChangedListener {

    /* renamed from: a */
    private final TimePicker f15406a;

    /* renamed from: c */
    private final C6639a f15407c;

    /* renamed from: d */
    private final int f15408d;

    /* renamed from: f */
    private final int f15409f;

    /* renamed from: g */
    private final boolean f15410g;

    /* renamed from: com.arlosoft.macrodroid.widget.f$a */
    /* compiled from: MacroDroidTimePickerDialog */
    public interface C6639a {
        /* renamed from: a */
        void mo32912a(TimePicker timePicker, int i, int i2);
    }

    public C6638f(Context context, C6639a aVar, int i, int i2, boolean z) {
        this(context, 0, aVar, i, i2, z);
    }

    private static int resolveDialogTheme(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843934, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public TimePicker mo32907e() {
        return this.f15406a;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C6639a aVar;
        if (i == -1 && (aVar = this.f15407c) != null) {
            TimePicker timePicker = this.f15406a;
            aVar.mo32912a(timePicker, timePicker.getCurrentHour().intValue(), this.f15406a.getCurrentMinute().intValue());
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i = bundle.getInt("hour");
        int i2 = bundle.getInt("minute");
        this.f15406a.setIs24HourView(Boolean.valueOf(bundle.getBoolean("is24hour")));
        this.f15406a.setCurrentHour(Integer.valueOf(i));
        this.f15406a.setCurrentMinute(Integer.valueOf(i2));
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("hour", this.f15406a.getCurrentHour().intValue());
        onSaveInstanceState.putInt("minute", this.f15406a.getCurrentMinute().intValue());
        onSaveInstanceState.putBoolean("is24hour", this.f15406a.is24HourView());
        return onSaveInstanceState;
    }

    public void onTimeChanged(TimePicker timePicker, int i, int i2) {
    }

    private C6638f(Context context, int i, C6639a aVar, int i2, int i3, boolean z) {
        super(context, resolveDialogTheme(context, i));
        this.f15407c = aVar;
        this.f15408d = i2;
        this.f15409f = i3;
        this.f15410g = z;
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(C17535R$layout.macrodroid_time_picker_dialog, (ViewGroup) null);
        setView(inflate);
        setButton(-1, (CharSequence) context2.getString(17039370), (DialogInterface.OnClickListener) this);
        setButton(-2, (CharSequence) context2.getString(17039360), (DialogInterface.OnClickListener) this);
        TimePicker timePicker = (TimePicker) inflate.findViewById(2131364018);
        this.f15406a = timePicker;
        timePicker.setIs24HourView(Boolean.valueOf(z));
        timePicker.setCurrentHour(Integer.valueOf(i2));
        timePicker.setCurrentMinute(Integer.valueOf(i3));
        timePicker.setOnTimeChangedListener(this);
    }
}
