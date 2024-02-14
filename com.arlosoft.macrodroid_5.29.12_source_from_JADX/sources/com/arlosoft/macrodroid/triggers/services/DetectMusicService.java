package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.MusicPlayingTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DetectMusicService extends Service {

    /* renamed from: a */
    private C6094a f14426a;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.DetectMusicService$a */
    private static class C6094a extends AsyncTask<Void, List<Macro>, Void> {

        /* renamed from: a */
        private boolean f14427a = true;

        /* renamed from: b */
        private final Object f14428b = new Object();

        /* renamed from: c */
        private WeakReference<Context> f14429c;

        public C6094a(Context context) {
            this.f14429c = new WeakReference<>(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Context context = (Context) this.f14429c.get();
            if (context == null) {
                return null;
            }
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            while (this.f14427a) {
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException unused) {
                }
                boolean isMusicActive = audioManager.isMusicActive();
                if (isMusicActive != z) {
                    synchronized (this.f14428b) {
                        arrayList.clear();
                        for (Macro next : C4934n.m18998M().mo29679I()) {
                            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                            while (it.hasNext()) {
                                Trigger next2 = it.next();
                                if (next2 instanceof MusicPlayingTrigger) {
                                    MusicPlayingTrigger musicPlayingTrigger = (MusicPlayingTrigger) next2;
                                    if ((musicPlayingTrigger.mo31342g3() == 0) == isMusicActive && musicPlayingTrigger.mo31374R2()) {
                                        next.setTriggerThatInvoked(musicPlayingTrigger);
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    publishProgress(new List[]{arrayList});
                    z = isMusicActive;
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(List<Macro>... listArr) {
            synchronized (this.f14428b) {
                for (Macro next : listArr[0]) {
                    next.invokeActions(new TriggerContextInfo(next.getTriggerThatInvoked()));
                }
            }
        }

        /* renamed from: d */
        public void mo32021d(boolean z) {
            this.f14427a = z;
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C6094a aVar = new C6094a(getApplicationContext());
        this.f14426a = aVar;
        aVar.mo32021d(true);
        this.f14426a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[]) null);
    }

    public void onDestroy() {
        C6094a aVar = this.f14426a;
        if (aVar != null) {
            aVar.mo32021d(false);
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
