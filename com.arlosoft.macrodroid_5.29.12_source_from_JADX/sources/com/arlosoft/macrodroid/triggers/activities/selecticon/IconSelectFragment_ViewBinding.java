package com.arlosoft.macrodroid.triggers.activities.selecticon;

import android.content.Context;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import com.arlosoft.macrodroid.C17529R$dimen;

public class IconSelectFragment_ViewBinding implements Unbinder {
    @UiThread
    @Deprecated
    public IconSelectFragment_ViewBinding(IconSelectFragment iconSelectFragment, View view) {
        this(iconSelectFragment, view.getContext());
    }

    @CallSuper
    public void unbind() {
    }

    @UiThread
    public IconSelectFragment_ViewBinding(IconSelectFragment iconSelectFragment, Context context) {
        iconSelectFragment.userIconSize = context.getResources().getDimensionPixelSize(C17529R$dimen.user_icon_size);
    }
}
