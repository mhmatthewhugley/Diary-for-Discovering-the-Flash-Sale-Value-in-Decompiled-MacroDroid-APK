package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

final class AwaitListener implements OnCompleteListener<Void> {

    /* renamed from: a */
    private final CountDownLatch f54827a = new CountDownLatch(1);

    AwaitListener() {
    }

    /* renamed from: a */
    public void mo21120a(@NonNull Task<Void> task) {
        this.f54827a.countDown();
    }
}
