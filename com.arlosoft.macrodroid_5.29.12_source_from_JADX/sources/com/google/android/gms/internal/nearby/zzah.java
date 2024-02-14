package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzah implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzax f44542a;

    /* renamed from: b */
    public final /* synthetic */ List f44543b;

    /* renamed from: c */
    public final /* synthetic */ ExposureConfiguration f44544c;

    /* renamed from: d */
    public final /* synthetic */ String f44545d;

    public /* synthetic */ zzah(zzax zzax, List list, ExposureConfiguration exposureConfiguration, String str) {
        this.f44542a = zzax;
        this.f44543b = list;
        this.f44544c = exposureConfiguration;
        this.f44545d = str;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzax zzax = this.f44542a;
        List<File> list = this.f44543b;
        ExposureConfiguration exposureConfiguration = this.f44544c;
        String str = this.f44545d;
        zzn zzn = (zzn) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        try {
            for (File open : list) {
                arrayList.add(ParcelFileDescriptor.open(open, 268435456));
            }
            zzed zzed = new zzed();
            zzed.mo52639c(arrayList);
            zzed.mo52638b(exposureConfiguration);
            zzed.mo52640d(new zzas(zzax, arrayList, taskCompletionSource));
            zzed.mo52641e(str);
            ((zzdr) zzn.mo21626I()).mo52628x9(zzed.mo52642f());
        } catch (FileNotFoundException e) {
            TaskUtil.m3877a(new Status(39506, e.getMessage()), taskCompletionSource);
        }
    }
}
