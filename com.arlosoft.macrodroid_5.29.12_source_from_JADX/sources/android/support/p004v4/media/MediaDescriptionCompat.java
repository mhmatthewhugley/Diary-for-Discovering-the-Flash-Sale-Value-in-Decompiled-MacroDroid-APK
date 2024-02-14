package android.support.p004v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0083a();

    /* renamed from: a */
    private final String f209a;

    /* renamed from: c */
    private final CharSequence f210c;

    /* renamed from: d */
    private final CharSequence f211d;

    /* renamed from: f */
    private final CharSequence f212f;

    /* renamed from: g */
    private final Bitmap f213g;

    /* renamed from: o */
    private final Uri f214o;

    /* renamed from: p */
    private final Bundle f215p;

    /* renamed from: s */
    private final Uri f216s;

    /* renamed from: z */
    private MediaDescription f217z;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    class C0083a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0083a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m213a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    private static class C0084b {
        @DoNotInline
        /* renamed from: a */
        static MediaDescription m218a(MediaDescription.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: b */
        static MediaDescription.Builder m219b() {
            return new MediaDescription.Builder();
        }

        @DoNotInline
        @Nullable
        /* renamed from: c */
        static CharSequence m220c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @DoNotInline
        @Nullable
        /* renamed from: d */
        static Bundle m221d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @DoNotInline
        @Nullable
        /* renamed from: e */
        static Bitmap m222e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @DoNotInline
        @Nullable
        /* renamed from: f */
        static Uri m223f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @DoNotInline
        @Nullable
        /* renamed from: g */
        static String m224g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @DoNotInline
        @Nullable
        /* renamed from: h */
        static CharSequence m225h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @DoNotInline
        @Nullable
        /* renamed from: i */
        static CharSequence m226i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @DoNotInline
        /* renamed from: j */
        static void m227j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @DoNotInline
        /* renamed from: k */
        static void m228k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: l */
        static void m229l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @DoNotInline
        /* renamed from: m */
        static void m230m(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @DoNotInline
        /* renamed from: n */
        static void m231n(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        @DoNotInline
        /* renamed from: o */
        static void m232o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @DoNotInline
        /* renamed from: p */
        static void m233p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    private static class C0085c {
        @DoNotInline
        @Nullable
        /* renamed from: a */
        static Uri m234a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @DoNotInline
        /* renamed from: b */
        static void m235b(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    public static final class C0086d {

        /* renamed from: a */
        private String f218a;

        /* renamed from: b */
        private CharSequence f219b;

        /* renamed from: c */
        private CharSequence f220c;

        /* renamed from: d */
        private CharSequence f221d;

        /* renamed from: e */
        private Bitmap f222e;

        /* renamed from: f */
        private Uri f223f;

        /* renamed from: g */
        private Bundle f224g;

        /* renamed from: h */
        private Uri f225h;

        /* renamed from: a */
        public MediaDescriptionCompat mo289a() {
            return new MediaDescriptionCompat(this.f218a, this.f219b, this.f220c, this.f221d, this.f222e, this.f223f, this.f224g, this.f225h);
        }

        /* renamed from: b */
        public C0086d mo290b(@Nullable CharSequence charSequence) {
            this.f221d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0086d mo291c(@Nullable Bundle bundle) {
            this.f224g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0086d mo292d(@Nullable Bitmap bitmap) {
            this.f222e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0086d mo293e(@Nullable Uri uri) {
            this.f223f = uri;
            return this;
        }

        /* renamed from: f */
        public C0086d mo294f(@Nullable String str) {
            this.f218a = str;
            return this;
        }

        /* renamed from: g */
        public C0086d mo295g(@Nullable Uri uri) {
            this.f225h = uri;
            return this;
        }

        /* renamed from: h */
        public C0086d mo296h(@Nullable CharSequence charSequence) {
            this.f220c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0086d mo297i(@Nullable CharSequence charSequence) {
            this.f219b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f209a = str;
        this.f210c = charSequence;
        this.f211d = charSequence2;
        this.f212f = charSequence3;
        this.f213g = bitmap;
        this.f214o = uri;
        this.f215p = bundle;
        this.f216s = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p004v4.media.MediaDescriptionCompat m213a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x007f
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$d r2 = new android.support.v4.media.MediaDescriptionCompat$d
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.p004v4.media.MediaDescriptionCompat.C0084b.m224g(r9)
            r2.mo294f(r3)
            java.lang.CharSequence r3 = android.support.p004v4.media.MediaDescriptionCompat.C0084b.m226i(r9)
            r2.mo297i(r3)
            java.lang.CharSequence r3 = android.support.p004v4.media.MediaDescriptionCompat.C0084b.m225h(r9)
            r2.mo296h(r3)
            java.lang.CharSequence r3 = android.support.p004v4.media.MediaDescriptionCompat.C0084b.m220c(r9)
            r2.mo290b(r3)
            android.graphics.Bitmap r3 = android.support.p004v4.media.MediaDescriptionCompat.C0084b.m222e(r9)
            r2.mo292d(r3)
            android.net.Uri r3 = android.support.p004v4.media.MediaDescriptionCompat.C0084b.m223f(r9)
            r2.mo293e(r3)
            android.os.Bundle r3 = android.support.p004v4.media.MediaDescriptionCompat.C0084b.m221d(r9)
            if (r3 == 0) goto L_0x0040
            android.os.Bundle r3 = android.support.p004v4.media.session.MediaSessionCompat.m279c(r3)
        L_0x0040:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004b
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x004c
        L_0x004b:
            r5 = r0
        L_0x004c:
            if (r5 == 0) goto L_0x0064
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x005e
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0064:
            r0 = r3
        L_0x0065:
            r2.mo291c(r0)
            if (r5 == 0) goto L_0x006e
            r2.mo295g(r5)
            goto L_0x0079
        L_0x006e:
            r0 = 23
            if (r1 < r0) goto L_0x0079
            android.net.Uri r0 = android.support.p004v4.media.MediaDescriptionCompat.C0085c.m234a(r9)
            r2.mo295g(r0)
        L_0x0079:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo289a()
            r0.f217z = r9
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p004v4.media.MediaDescriptionCompat.m213a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object mo280b() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f217z;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i = Build.VERSION.SDK_INT;
        MediaDescription.Builder b = C0084b.m219b();
        C0084b.m231n(b, this.f209a);
        C0084b.m233p(b, this.f210c);
        C0084b.m232o(b, this.f211d);
        C0084b.m227j(b, this.f212f);
        C0084b.m229l(b, this.f213g);
        C0084b.m230m(b, this.f214o);
        if (i >= 23 || this.f216s == null) {
            C0084b.m228k(b, this.f215p);
        } else {
            if (this.f215p == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.f215p);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f216s);
            C0084b.m228k(b, bundle);
        }
        if (i >= 23) {
            C0085c.m235b(b, this.f216s);
        }
        MediaDescription a = C0084b.m218a(b);
        this.f217z = a;
        return a;
    }

    @Nullable
    /* renamed from: c */
    public String mo281c() {
        return this.f209a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f210c + ", " + this.f211d + ", " + this.f212f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) mo280b()).writeToParcel(parcel, i);
    }
}
