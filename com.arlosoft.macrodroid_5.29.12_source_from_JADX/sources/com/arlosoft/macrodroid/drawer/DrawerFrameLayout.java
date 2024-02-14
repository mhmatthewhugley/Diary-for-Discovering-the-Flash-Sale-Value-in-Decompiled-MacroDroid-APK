package com.arlosoft.macrodroid.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DrawerFrameLayout extends FrameLayout {

    /* renamed from: a */
    private C4454a f11308a;

    /* renamed from: com.arlosoft.macrodroid.drawer.DrawerFrameLayout$a */
    public interface C4454a {
        /* renamed from: a */
        void mo28815a();
    }

    public DrawerFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C4454a aVar = this.f11308a;
        if (aVar == null) {
            return true;
        }
        aVar.mo28815a();
        return true;
    }

    public void setBackKeyListener(C4454a aVar) {
        this.f11308a = aVar;
    }
}
