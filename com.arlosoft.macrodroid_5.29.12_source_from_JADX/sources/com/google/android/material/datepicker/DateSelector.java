package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @NonNull
    /* renamed from: H1 */
    View mo57584H1(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<S> onSelectionChangedListener);

    /* renamed from: Y1 */
    boolean mo57585Y1();

    @NonNull
    /* renamed from: Z1 */
    Collection<Long> mo57586Z1();

    @Nullable
    /* renamed from: b2 */
    S mo57587b2();

    /* renamed from: g2 */
    void mo57588g2(long j);

    @NonNull
    /* renamed from: l1 */
    String mo57589l1(Context context);

    @NonNull
    /* renamed from: o1 */
    Collection<Pair<Long, Long>> mo57590o1();

    @StyleRes
    /* renamed from: z0 */
    int mo57591z0(Context context);
}
