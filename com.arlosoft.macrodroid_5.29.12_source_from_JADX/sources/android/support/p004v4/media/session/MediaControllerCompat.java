package android.support.p004v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaMetadataCompat;
import android.support.p004v4.media.session.C0104a;
import android.support.p004v4.media.session.C0106b;
import android.support.p004v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0093b f234a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f235b;

    /* renamed from: c */
    private final ConcurrentHashMap<C0090a, Boolean> f236c = new ConcurrentHashMap<>();

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0093b {

        /* renamed from: a */
        protected final MediaController f237a;

        /* renamed from: b */
        final Object f238b = new Object();
        @GuardedBy("mLock")

        /* renamed from: c */
        private final List<C0090a> f239c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0090a, C0089a> f240d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f241e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f242a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f242a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f242a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f238b) {
                        mediaControllerImplApi21.f241e.mo364e(C0106b.C0107a.m348y(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f241e.mo366f(ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.mo313b();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0089a extends C0090a.C0092b {
            C0089a(C0090a aVar) {
                super(aVar);
            }

            /* renamed from: G9 */
            public void mo316G9(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: K6 */
            public void mo317K6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: R7 */
            public void mo318R7(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: S2 */
            public void mo319S2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: f4 */
            public void mo320f4() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: j4 */
            public void mo321j4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f241e = token;
            this.f237a = new MediaController(context, (MediaSession.Token) token.mo362d());
            if (token.mo361c() == null) {
                m251c();
            }
        }

        /* renamed from: c */
        private void m251c() {
            mo314d("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: a */
        public boolean mo312a(KeyEvent keyEvent) {
            return this.f237a.dispatchMediaButtonEvent(keyEvent);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("mLock")
        /* renamed from: b */
        public void mo313b() {
            if (this.f241e.mo361c() != null) {
                for (C0090a next : this.f239c) {
                    C0089a aVar = new C0089a(next);
                    this.f240d.put(next, aVar);
                    next.f244b = aVar;
                    try {
                        this.f241e.mo361c().mo395V6(aVar);
                        next.mo331i(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f239c.clear();
            }
        }

        /* renamed from: d */
        public void mo314d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f237a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0090a implements IBinder.DeathRecipient {

        /* renamed from: a */
        final MediaController.Callback f243a = new C0091a(this);

        /* renamed from: b */
        C0104a f244b;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private static class C0091a extends MediaController.Callback {

            /* renamed from: a */
            private final WeakReference<C0090a> f245a;

            C0091a(C0090a aVar) {
                this.f245a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar != null) {
                    aVar.mo322a(new C0094c(playbackInfo.getPlaybackType(), AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m278a(bundle);
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar != null) {
                    aVar.mo323b(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar != null) {
                    aVar.mo325c(MediaMetadataCompat.m245a(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar != null && aVar.f244b == null) {
                    aVar.mo326d(PlaybackStateCompat.m300a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar != null) {
                    aVar.mo327e(MediaSessionCompat.QueueItem.m282b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar != null) {
                    aVar.mo328f(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar != null) {
                    aVar.mo329g();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m278a(bundle);
                C0090a aVar = (C0090a) this.f245a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f244b == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.mo330h(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0092b extends C0104a.C0105a {

            /* renamed from: a */
            private final WeakReference<C0090a> f246a;

            C0092b(C0090a aVar) {
                this.f246a = new WeakReference<>(aVar);
            }

            /* renamed from: C9 */
            public void mo340C9(boolean z) throws RemoteException {
            }

            /* renamed from: Cb */
            public void mo341Cb(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0090a aVar = (C0090a) this.f246a.get();
                if (aVar != null) {
                    aVar.mo331i(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: D2 */
            public void mo342D2() throws RemoteException {
                C0090a aVar = (C0090a) this.f246a.get();
                if (aVar != null) {
                    aVar.mo331i(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: E1 */
            public void mo343E1(String str, Bundle bundle) throws RemoteException {
                C0090a aVar = (C0090a) this.f246a.get();
                if (aVar != null) {
                    aVar.mo331i(1, str, bundle);
                }
            }

            /* renamed from: W8 */
            public void mo344W8(boolean z) throws RemoteException {
                C0090a aVar = (C0090a) this.f246a.get();
                if (aVar != null) {
                    aVar.mo331i(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: Z4 */
            public void mo345Z4(int i) throws RemoteException {
                C0090a aVar = (C0090a) this.f246a.get();
                if (aVar != null) {
                    aVar.mo331i(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: ca */
            public void mo346ca(int i) throws RemoteException {
                C0090a aVar = (C0090a) this.f246a.get();
                if (aVar != null) {
                    aVar.mo331i(9, Integer.valueOf(i), (Bundle) null);
                }
            }
        }

        /* renamed from: a */
        public void mo322a(C0094c cVar) {
        }

        /* renamed from: b */
        public void mo323b(Bundle bundle) {
        }

        public void binderDied() {
            mo331i(8, (Object) null, (Bundle) null);
        }

        /* renamed from: c */
        public void mo325c(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: d */
        public void mo326d(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: e */
        public void mo327e(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: f */
        public void mo328f(CharSequence charSequence) {
        }

        /* renamed from: g */
        public void mo329g() {
        }

        /* renamed from: h */
        public void mo330h(String str, Bundle bundle) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo331i(int i, Object obj, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0093b {
        /* renamed from: a */
        boolean mo312a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public static final class C0094c {

        /* renamed from: a */
        private final int f247a;

        /* renamed from: b */
        private final AudioAttributesCompat f248b;

        /* renamed from: c */
        private final int f249c;

        /* renamed from: d */
        private final int f250d;

        /* renamed from: e */
        private final int f251e;

        C0094c(int i, @NonNull AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f247a = i;
            this.f248b = audioAttributesCompat;
            this.f249c = i2;
            this.f250d = i3;
            this.f251e = i4;
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token != null) {
            this.f235b = token;
            this.f234a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: a */
    public boolean mo311a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f234a.mo312a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
