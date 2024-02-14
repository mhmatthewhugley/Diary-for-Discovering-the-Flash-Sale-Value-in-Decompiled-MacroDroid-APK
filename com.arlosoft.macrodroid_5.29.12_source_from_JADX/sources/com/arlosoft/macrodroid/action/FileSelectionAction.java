package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;

public abstract class FileSelectionAction extends Action {
    protected static final int FILE_PICKER_ID = 9876;
    protected String m_filePath;

    public FileSelectionAction() {
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 == -1) {
            this.m_filePath = intent.getExtras().getString("FileSelection");
            mo24689O1();
        }
    }

    public FileSelectionAction(Parcel parcel) {
        super(parcel);
    }
}
