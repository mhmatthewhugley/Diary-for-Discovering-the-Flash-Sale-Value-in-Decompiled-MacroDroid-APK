package com.google.android.play.core.tasks;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* renamed from: a */
    private final long f51953a;

    /* renamed from: b */
    private final int f51954b;

    /* renamed from: a */
    public void mo59814a(Task<Object> task) {
        if (!task.mo60022h()) {
            int i = this.f51954b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("onComplete called for incomplete task: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (task.mo60023i()) {
            nativeOnComplete(this.f51953a, this.f51954b, task.mo60021g(), 0);
        } else {
            Exception f = task.mo60020f();
            if (!(f instanceof zzj)) {
                nativeOnComplete(this.f51953a, this.f51954b, (Object) null, -100);
                return;
            }
            int a = ((zzj) f).mo59570a();
            if (a != 0) {
                nativeOnComplete(this.f51953a, this.f51954b, (Object) null, a);
                return;
            }
            int i2 = this.f51954b;
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("TaskException has error code 0 on task: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public native void nativeOnComplete(long j, int i, @Nullable Object obj, int i2);
}
