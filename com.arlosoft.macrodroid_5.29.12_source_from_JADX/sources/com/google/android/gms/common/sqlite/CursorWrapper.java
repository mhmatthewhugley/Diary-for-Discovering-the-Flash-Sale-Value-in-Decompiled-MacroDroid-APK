package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {

    /* renamed from: a */
    private AbstractWindowedCursor f3908a;

    @KeepForSdk
    public void fillWindow(int i, @NonNull CursorWindow cursorWindow) {
        this.f3908a.fillWindow(i, cursorWindow);
    }

    @KeepForSdk
    @Nullable
    public CursorWindow getWindow() {
        return this.f3908a.getWindow();
    }

    @NonNull
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f3908a;
    }

    public final boolean onMove(int i, int i2) {
        return this.f3908a.onMove(i, i2);
    }
}
