package android.support.p004v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p004v4.media.session.C0106b;
import android.support.p004v4.media.session.MediaSessionCompat;
import android.support.p004v4.p005os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f183b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final C0073d f184a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo240a(int i, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo240a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m279c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo240a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m279c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0068a {
        @DoNotInline
        /* renamed from: a */
        static MediaDescription m183a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        /* renamed from: b */
        static int m184b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    private static class C0069b extends Handler {

        /* renamed from: a */
        private final WeakReference<C0077h> f187a;

        /* renamed from: b */
        private WeakReference<Messenger> f188b;

        C0069b(C0077h hVar) {
            this.f187a = new WeakReference<>(hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo248a(Messenger messenger) {
            this.f188b = new WeakReference<>(messenger);
        }

        public void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.f188b;
            if (weakReference != null && weakReference.get() != null && this.f187a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m278a(data);
                C0077h hVar = (C0077h) this.f187a.get();
                Messenger messenger = (Messenger) this.f188b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.m278a(bundle);
                        hVar.mo264f(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                    } else if (i == 2) {
                        hVar.mo265h(messenger);
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                        MediaSessionCompat.m278a(bundle2);
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                        MediaSessionCompat.m278a(bundle3);
                        hVar.mo263a(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        hVar.mo265h(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0070c {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new C0071a();
        C0072b mConnectionCallbackInternal;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        private class C0071a extends MediaBrowser.ConnectionCallback {
            C0071a() {
            }

            public void onConnected() {
                C0072b bVar = C0070c.this.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.onConnected();
                }
                C0070c.this.onConnected();
            }

            public void onConnectionFailed() {
                C0072b bVar = C0070c.this.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.mo257d();
                }
                C0070c.this.onConnectionFailed();
            }

            public void onConnectionSuspended() {
                C0072b bVar = C0070c.this.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.mo258g();
                }
                C0070c.this.onConnectionSuspended();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        interface C0072b {
            /* renamed from: d */
            void mo257d();

            /* renamed from: g */
            void mo258g();

            void onConnected();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        /* access modifiers changed from: package-private */
        public void setInternalConnectionCallback(C0072b bVar) {
            this.mConnectionCallbackInternal = bVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    interface C0073d {
        /* renamed from: b */
        void mo260b();

        /* renamed from: c */
        void mo261c();

        @NonNull
        /* renamed from: e */
        MediaSessionCompat.Token mo262e();
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    static class C0074e implements C0073d, C0077h, C0070c.C0072b {

        /* renamed from: a */
        final Context f190a;

        /* renamed from: b */
        protected final MediaBrowser f191b;

        /* renamed from: c */
        protected final Bundle f192c;

        /* renamed from: d */
        protected final C0069b f193d = new C0069b(this);

        /* renamed from: e */
        private final ArrayMap<String, C0079j> f194e = new ArrayMap<>();

        /* renamed from: f */
        protected int f195f;

        /* renamed from: g */
        protected C0078i f196g;

        /* renamed from: h */
        protected Messenger f197h;

        /* renamed from: i */
        private MediaSessionCompat.Token f198i;

        /* renamed from: j */
        private Bundle f199j;

        C0074e(Context context, ComponentName componentName, C0070c cVar, Bundle bundle) {
            Bundle bundle2;
            this.f190a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f192c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
            cVar.setInternalConnectionCallback(this);
            this.f191b = new MediaBrowser(context, componentName, cVar.mConnectionCallbackFwk, bundle2);
        }

        /* renamed from: a */
        public void mo263a(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f197h == messenger) {
                C0079j jVar = this.f194e.get(str);
                if (jVar != null) {
                    C0080k a = jVar.mo268a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo273c(str);
                            return;
                        }
                        this.f199j = bundle2;
                        a.mo271a(str, list);
                        this.f199j = null;
                    } else if (list == null) {
                        a.mo274d(str, bundle);
                    } else {
                        this.f199j = bundle2;
                        a.mo272b(str, list, bundle);
                        this.f199j = null;
                    }
                } else if (MediaBrowserCompat.f183b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                }
            }
        }

        /* renamed from: b */
        public void mo260b() {
            Messenger messenger;
            C0078i iVar = this.f196g;
            if (!(iVar == null || (messenger = this.f197h) == null)) {
                try {
                    iVar.mo267c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f191b.disconnect();
        }

        /* renamed from: c */
        public void mo261c() {
            this.f191b.connect();
        }

        /* renamed from: d */
        public void mo257d() {
        }

        @NonNull
        /* renamed from: e */
        public MediaSessionCompat.Token mo262e() {
            if (this.f198i == null) {
                this.f198i = MediaSessionCompat.Token.m290a(this.f191b.getSessionToken());
            }
            return this.f198i;
        }

        /* renamed from: f */
        public void mo264f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /* renamed from: g */
        public void mo258g() {
            this.f196g = null;
            this.f197h = null;
            this.f198i = null;
            this.f193d.mo248a((Messenger) null);
        }

        /* renamed from: h */
        public void mo265h(Messenger messenger) {
        }

        public void onConnected() {
            try {
                Bundle extras = this.f191b.getExtras();
                if (extras != null) {
                    this.f195f = extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                    IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                    if (binder != null) {
                        this.f196g = new C0078i(binder, this.f192c);
                        Messenger messenger = new Messenger(this.f193d);
                        this.f197h = messenger;
                        this.f193d.mo248a(messenger);
                        try {
                            this.f196g.mo266a(this.f190a, this.f197h);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    C0106b y = C0106b.C0107a.m348y(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                    if (y != null) {
                        this.f198i = MediaSessionCompat.Token.m291b(this.f191b.getSessionToken(), y);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0075f extends C0074e {
        C0075f(Context context, ComponentName componentName, C0070c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0076g extends C0075f {
        C0076g(Context context, ComponentName componentName, C0070c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    interface C0077h {
        /* renamed from: a */
        void mo263a(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: f */
        void mo264f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: h */
        void mo265h(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    private static class C0078i {

        /* renamed from: a */
        private Messenger f200a;

        /* renamed from: b */
        private Bundle f201b;

        public C0078i(IBinder iBinder, Bundle bundle) {
            this.f200a = new Messenger(iBinder);
            this.f201b = bundle;
        }

        /* renamed from: b */
        private void m202b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f200a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo266a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f201b);
            m202b(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo267c(Messenger messenger) throws RemoteException {
            m202b(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    private static class C0079j {

        /* renamed from: a */
        private final List<C0080k> f202a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f203b = new ArrayList();

        /* renamed from: a */
        public C0080k mo268a(Bundle bundle) {
            for (int i = 0; i < this.f203b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.f203b.get(i), bundle)) {
                    return this.f202a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0080k> mo269b() {
            return this.f202a;
        }

        /* renamed from: c */
        public List<Bundle> mo270c() {
            return this.f203b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0080k {

        /* renamed from: a */
        final MediaBrowser.SubscriptionCallback f204a;

        /* renamed from: b */
        final IBinder f205b = new Binder();

        /* renamed from: c */
        WeakReference<C0079j> f206c;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$a */
        private class C0081a extends MediaBrowser.SubscriptionCallback {
            C0081a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public List<MediaItem> mo275a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<C0079j> weakReference = C0080k.this.f206c;
                C0079j jVar = weakReference == null ? null : (C0079j) weakReference.get();
                if (jVar == null) {
                    C0080k.this.mo271a(str, MediaItem.m179b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m179b(list);
                List<C0080k> b2 = jVar.mo269b();
                List<Bundle> c = jVar.mo270c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0080k.this.mo271a(str, b);
                    } else {
                        C0080k.this.mo272b(str, mo275a(b, bundle), bundle);
                    }
                }
            }

            public void onError(@NonNull String str) {
                C0080k.this.mo273c(str);
            }
        }

        @RequiresApi(26)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$b */
        private class C0082b extends C0081a {
            C0082b() {
                super();
            }

            public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.m278a(bundle);
                C0080k.this.mo272b(str, MediaItem.m179b(list), bundle);
            }

            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.m278a(bundle);
                C0080k.this.mo274d(str, bundle);
            }
        }

        public C0080k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f204a = new C0082b();
            } else {
                this.f204a = new C0081a();
            }
        }

        /* renamed from: a */
        public void mo271a(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        /* renamed from: b */
        public void mo272b(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        /* renamed from: c */
        public void mo273c(@NonNull String str) {
        }

        /* renamed from: d */
        public void mo274d(@NonNull String str, @NonNull Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0070c cVar, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f184a = new C0076g(context, componentName, cVar, bundle);
        } else if (i >= 23) {
            this.f184a = new C0075f(context, componentName, cVar, bundle);
        } else {
            this.f184a = new C0074e(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo237a() {
        this.f184a.mo261c();
    }

    /* renamed from: b */
    public void mo238b() {
        this.f184a.mo260b();
    }

    @NonNull
    /* renamed from: c */
    public MediaSessionCompat.Token mo239c() {
        return this.f184a.mo262e();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0067a();

        /* renamed from: a */
        private final int f185a;

        /* renamed from: c */
        private final MediaDescriptionCompat f186c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        class C0067a implements Parcelable.Creator<MediaItem> {
            C0067a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo281c())) {
                this.f185a = i;
                this.f186c = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m178a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m213a(C0068a.m183a(mediaItem)), C0068a.m184b(mediaItem));
        }

        /* renamed from: b */
        public static List<MediaItem> m179b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m178a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f185a + ", mDescription=" + this.f186c + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f185a);
            this.f186c.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.f185a = parcel.readInt();
            this.f186c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
