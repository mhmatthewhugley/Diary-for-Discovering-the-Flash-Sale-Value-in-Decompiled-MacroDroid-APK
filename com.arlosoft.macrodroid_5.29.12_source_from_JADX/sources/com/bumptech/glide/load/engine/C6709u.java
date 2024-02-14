package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p120k4.C7587c;

/* renamed from: com.bumptech.glide.load.engine.u */
/* compiled from: ResourceRecycler */
class C6709u {

    /* renamed from: a */
    private boolean f15699a;

    /* renamed from: b */
    private final Handler f15700b = new Handler(Looper.getMainLooper(), new C6710a());

    /* renamed from: com.bumptech.glide.load.engine.u$a */
    /* compiled from: ResourceRecycler */
    private static final class C6710a implements Handler.Callback {
        C6710a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C7587c) message.obj).recycle();
            return true;
        }
    }

    C6709u() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo33120a(C7587c<?> cVar) {
        if (this.f15699a) {
            this.f15700b.obtainMessage(1, cVar).sendToTarget();
        } else {
            this.f15699a = true;
            cVar.recycle();
            this.f15699a = false;
        }
    }
}
