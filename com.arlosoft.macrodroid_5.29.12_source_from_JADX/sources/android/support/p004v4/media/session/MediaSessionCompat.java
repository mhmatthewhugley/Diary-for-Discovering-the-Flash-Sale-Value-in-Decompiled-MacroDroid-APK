package android.support.p004v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.p007os.BuildCompat;
import androidx.versionedparcelable.VersionedParcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: b */
    public static final int f252b = (BuildCompat.isAtLeastS() ? 33554432 : 0);

    /* renamed from: a */
    private final MediaControllerCompat f253a;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0097a();

        /* renamed from: a */
        ResultReceiver f257a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        class C0097a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0097a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f257a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f257a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0098a();

        /* renamed from: a */
        private final Object f258a;

        /* renamed from: c */
        private final Object f259c;
        @GuardedBy("mLock")

        /* renamed from: d */
        private C0106b f260d;
        @GuardedBy("mLock")

        /* renamed from: f */
        private VersionedParcelable f261f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        class C0098a implements Parcelable.Creator<Token> {
            C0098a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0106b) null, (VersionedParcelable) null);
        }

        /* renamed from: a */
        public static Token m290a(Object obj) {
            return m291b(obj, (C0106b) null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: b */
        public static Token m291b(Object obj, C0106b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: c */
        public C0106b mo361c() {
            C0106b bVar;
            synchronized (this.f258a) {
                bVar = this.f260d;
            }
            return bVar;
        }

        /* renamed from: d */
        public Object mo362d() {
            return this.f259c;
        }

        public int describeContents() {
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: e */
        public void mo364e(C0106b bVar) {
            synchronized (this.f258a) {
                this.f260d = bVar;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f259c;
            if (obj2 != null) {
                Object obj3 = token.f259c;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f259c == null) {
                return true;
            } else {
                return false;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: f */
        public void mo366f(VersionedParcelable versionedParcelable) {
            synchronized (this.f258a) {
                this.f261f = versionedParcelable;
            }
        }

        public int hashCode() {
            Object obj = this.f259c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f259c, i);
        }

        Token(Object obj, C0106b bVar) {
            this(obj, bVar, (VersionedParcelable) null);
        }

        Token(Object obj, C0106b bVar, VersionedParcelable versionedParcelable) {
            this.f258a = new Object();
            this.f259c = obj;
            this.f260d = bVar;
            this.f261f = versionedParcelable;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public static void m278a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public static Bundle m279c(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m278a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: b */
    public MediaControllerCompat mo347b() {
        return this.f253a;
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0095a();

        /* renamed from: a */
        private final MediaDescriptionCompat f254a;

        /* renamed from: c */
        private final long f255c;

        /* renamed from: d */
        private MediaSession.QueueItem f256d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        class C0095a implements Parcelable.Creator<QueueItem> {
            C0095a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        private static class C0096b {
            @DoNotInline
            /* renamed from: a */
            static MediaSession.QueueItem m285a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            @DoNotInline
            /* renamed from: b */
            static MediaDescription m286b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            /* renamed from: c */
            static long m287c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f254a = mediaDescriptionCompat;
                this.f255c = j;
                this.f256d = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m281a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m213a(C0096b.m286b(queueItem)), C0096b.m287c(queueItem));
        }

        /* renamed from: b */
        public static List<QueueItem> m282b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m281a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f254a + ", Id=" + this.f255c + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f254a.writeToParcel(parcel, i);
            parcel.writeLong(this.f255c);
        }

        QueueItem(Parcel parcel) {
            this.f254a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f255c = parcel.readLong();
        }
    }
}
