package android.support.p004v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0101a();

    /* renamed from: A */
    final long f267A;

    /* renamed from: B */
    final Bundle f268B;

    /* renamed from: C */
    private PlaybackState f269C;

    /* renamed from: a */
    final int f270a;

    /* renamed from: c */
    final long f271c;

    /* renamed from: d */
    final long f272d;

    /* renamed from: f */
    final float f273f;

    /* renamed from: g */
    final long f274g;

    /* renamed from: o */
    final int f275o;

    /* renamed from: p */
    final CharSequence f276p;

    /* renamed from: s */
    final long f277s;

    /* renamed from: z */
    List<CustomAction> f278z;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    class C0101a implements Parcelable.Creator<PlaybackStateCompat> {
        C0101a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    private static class C0102b {
        @DoNotInline
        /* renamed from: a */
        static void m307a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        @DoNotInline
        /* renamed from: b */
        static PlaybackState.CustomAction m308b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: c */
        static PlaybackState m309c(PlaybackState.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: d */
        static PlaybackState.Builder m310d() {
            return new PlaybackState.Builder();
        }

        @DoNotInline
        /* renamed from: e */
        static PlaybackState.CustomAction.Builder m311e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        @DoNotInline
        /* renamed from: f */
        static String m312f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        @DoNotInline
        /* renamed from: g */
        static long m313g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        @DoNotInline
        /* renamed from: h */
        static long m314h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        @DoNotInline
        /* renamed from: i */
        static long m315i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        @DoNotInline
        /* renamed from: j */
        static List<PlaybackState.CustomAction> m316j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        @DoNotInline
        /* renamed from: k */
        static CharSequence m317k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        @DoNotInline
        /* renamed from: l */
        static Bundle m318l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        @DoNotInline
        /* renamed from: m */
        static int m319m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        @DoNotInline
        /* renamed from: n */
        static long m320n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        @DoNotInline
        /* renamed from: o */
        static CharSequence m321o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        @DoNotInline
        /* renamed from: p */
        static float m322p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        @DoNotInline
        /* renamed from: q */
        static long m323q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        @DoNotInline
        /* renamed from: r */
        static int m324r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        @DoNotInline
        /* renamed from: s */
        static void m325s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        @DoNotInline
        /* renamed from: t */
        static void m326t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        @DoNotInline
        /* renamed from: u */
        static void m327u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        @DoNotInline
        /* renamed from: v */
        static void m328v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        @DoNotInline
        /* renamed from: w */
        static void m329w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: x */
        static void m330x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    @RequiresApi(22)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    private static class C0103c {
        @DoNotInline
        /* renamed from: a */
        static Bundle m331a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        @DoNotInline
        /* renamed from: b */
        static void m332b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f270a = i;
        this.f271c = j;
        this.f272d = j2;
        this.f273f = f;
        this.f274g = j3;
        this.f275o = i2;
        this.f276p = charSequence;
        this.f277s = j4;
        this.f278z = new ArrayList(list);
        this.f267A = j5;
        this.f268B = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m300a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = C0102b.m316j(playbackState);
        if (j != null) {
            ArrayList arrayList2 = new ArrayList(j.size());
            for (PlaybackState.CustomAction a : j) {
                arrayList2.add(CustomAction.m302a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0103c.m331a(playbackState);
            MediaSessionCompat.m278a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0102b.m324r(playbackState), C0102b.m323q(playbackState), C0102b.m315i(playbackState), C0102b.m322p(playbackState), C0102b.m313g(playbackState), 0, C0102b.m317k(playbackState), C0102b.m320n(playbackState), arrayList, C0102b.m314h(playbackState), bundle);
        playbackStateCompat.f269C = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: b */
    public static int m301b(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f270a + ", position=" + this.f271c + ", buffered position=" + this.f272d + ", speed=" + this.f273f + ", updated=" + this.f277s + ", actions=" + this.f274g + ", error code=" + this.f275o + ", error message=" + this.f276p + ", custom actions=" + this.f278z + ", active item id=" + this.f267A + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f270a);
        parcel.writeLong(this.f271c);
        parcel.writeFloat(this.f273f);
        parcel.writeLong(this.f277s);
        parcel.writeLong(this.f272d);
        parcel.writeLong(this.f274g);
        TextUtils.writeToParcel(this.f276p, parcel, i);
        parcel.writeTypedList(this.f278z);
        parcel.writeLong(this.f267A);
        parcel.writeBundle(this.f268B);
        parcel.writeInt(this.f275o);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0100a();

        /* renamed from: a */
        private final String f279a;

        /* renamed from: c */
        private final CharSequence f280c;

        /* renamed from: d */
        private final int f281d;

        /* renamed from: f */
        private final Bundle f282f;

        /* renamed from: g */
        private PlaybackState.CustomAction f283g;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        class C0100a implements Parcelable.Creator<CustomAction> {
            C0100a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f279a = str;
            this.f280c = charSequence;
            this.f281d = i;
            this.f282f = bundle;
        }

        /* renamed from: a */
        public static CustomAction m302a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l = C0102b.m318l(customAction);
            MediaSessionCompat.m278a(l);
            CustomAction customAction2 = new CustomAction(C0102b.m312f(customAction), C0102b.m321o(customAction), C0102b.m319m(customAction), l);
            customAction2.f283g = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f280c + ", mIcon=" + this.f281d + ", mExtras=" + this.f282f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f279a);
            TextUtils.writeToParcel(this.f280c, parcel, i);
            parcel.writeInt(this.f281d);
            parcel.writeBundle(this.f282f);
        }

        CustomAction(Parcel parcel) {
            this.f279a = parcel.readString();
            this.f280c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f281d = parcel.readInt();
            this.f282f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f270a = parcel.readInt();
        this.f271c = parcel.readLong();
        this.f273f = parcel.readFloat();
        this.f277s = parcel.readLong();
        this.f272d = parcel.readLong();
        this.f274g = parcel.readLong();
        this.f276p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f278z = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f267A = parcel.readLong();
        this.f268B = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f275o = parcel.readInt();
    }
}
