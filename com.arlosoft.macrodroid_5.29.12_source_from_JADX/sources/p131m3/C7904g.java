package p131m3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import com.arlosoft.macrodroid.C17540R$raw;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.MediaButtonV2Trigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.services.NotificationService;
import com.arlosoft.macrodroid.triggers.services.NotificationServiceOreo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;
import p112j2.C7439d0;
import p455ag.C17105a;

/* renamed from: m3.g */
/* compiled from: MediaButtonDetection.kt */
public final class C7904g {

    /* renamed from: i */
    public static final C7905a f19000i = new C7905a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static C7906b f19001j;

    /* renamed from: k */
    private static final boolean f19002k = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f19003a;

    /* renamed from: b */
    private final MediaSessionManager f19004b;

    /* renamed from: c */
    private final PlaybackState f19005c = new PlaybackState.Builder().setActions(639).setState(8, -1, 0.0f).build();

    /* renamed from: d */
    private MediaSession f19006d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ArrayList<MediaController> f19007e = new ArrayList<>();

    /* renamed from: f */
    private final MediaSession.Callback f19008f = new C7907c(this);

    /* renamed from: g */
    private final MediaSessionManager.OnActiveSessionsChangedListener f19009g = new C15697f(this);

    /* renamed from: h */
    private final C7908d f19010h = new C7908d(this);

    /* renamed from: m3.g$a */
    /* compiled from: MediaButtonDetection.kt */
    public static final class C7905a {
        private C7905a() {
        }

        public /* synthetic */ C7905a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: m3.g$b */
    /* compiled from: MediaButtonDetection.kt */
    private static final class C7906b {

        /* renamed from: a */
        private final int f19011a;

        /* renamed from: b */
        private final long f19012b;

        public C7906b(int i, long j) {
            this.f19011a = i;
            this.f19012b = j;
        }

        /* renamed from: a */
        public final int mo37798a() {
            return this.f19011a;
        }

        /* renamed from: b */
        public final long mo37799b() {
            return this.f19012b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7906b)) {
                return false;
            }
            C7906b bVar = (C7906b) obj;
            return this.f19011a == bVar.f19011a && this.f19012b == bVar.f19012b;
        }

        public int hashCode() {
            return (this.f19011a * 31) + C1405a.m633a(this.f19012b);
        }

        public String toString() {
            return "PressEvent(keyCode=" + this.f19011a + ", timestamp=" + this.f19012b + ')';
        }
    }

    /* renamed from: m3.g$c */
    /* compiled from: MediaButtonDetection.kt */
    public static final class C7907c extends MediaSession.Callback {

        /* renamed from: a */
        final /* synthetic */ C7904g f19013a;

        C7907c(C7904g gVar) {
            this.f19013a = gVar;
        }

        public boolean onMediaButtonEvent(Intent intent) {
            boolean z;
            C13706o.m87929f(intent, "mediaButtonIntent");
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C7906b h = C7904g.f19001j;
            if (h != null && h.mo37798a() == keyEvent.getKeyCode() && h.mo37799b() + ((long) 100) > currentTimeMillis) {
                return true;
            }
            C7905a aVar = C7904g.f19000i;
            C7904g.f19001j = new C7906b(keyEvent.getKeyCode(), currentTimeMillis);
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79) {
                z = this.f19013a.m33097p(C7903a.PAUSE);
            } else if (keyCode == 126) {
                z = this.f19013a.m33097p(C7903a.PLAY);
            } else if (keyCode != 127) {
                switch (keyCode) {
                    case 85:
                        z = this.f19013a.m33097p(C7903a.PLAY_PAUSE);
                        break;
                    case 86:
                        z = this.f19013a.m33097p(C7903a.STOP);
                        break;
                    case 87:
                        z = this.f19013a.m33097p(C7903a.NEXT);
                        break;
                    case 88:
                        z = this.f19013a.m33097p(C7903a.PREVIOUS);
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = this.f19013a.m33097p(C7903a.PAUSE);
            }
            if (!z && C5163j2.m20069U0(this.f19013a.f19003a) && (!this.f19013a.f19007e.isEmpty())) {
                ((MediaController) C13566b0.m87422W(this.f19013a.f19007e)).dispatchMediaButtonEvent(keyEvent);
            }
            return false;
        }
    }

    /* renamed from: m3.g$d */
    /* compiled from: MediaButtonDetection.kt */
    public static final class C7908d extends MediaController.Callback {

        /* renamed from: a */
        final /* synthetic */ C7904g f19014a;

        C7908d(C7904g gVar) {
            this.f19014a = gVar;
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            C7904g gVar = this.f19014a;
            gVar.m33098q("PLAYBACK STATE CHANGE: " + playbackState);
            if (playbackState != null) {
                C7904g gVar2 = this.f19014a;
                if (playbackState.getState() == 1 || playbackState.getState() == 2) {
                    gVar2.m33098q("MEDIA HAS STOPPED PLAYING");
                    gVar2.m33106z();
                }
            }
        }
    }

    public C7904g(Context context) {
        C13706o.m87929f(context, "appContext");
        this.f19003a = context;
        Object systemService = context.getSystemService("media_session");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.media.session.MediaSessionManager");
        this.f19004b = (MediaSessionManager) systemService;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m33094m(C7904g gVar, List list) {
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87926c(list);
        gVar.m33096o(list);
    }

    /* renamed from: n */
    private final void m33095n() {
        ComponentName componentName;
        MediaSession mediaSession = new MediaSession(this.f19003a, "MacroDroidMediaSession");
        this.f19006d = mediaSession;
        mediaSession.setFlags(3);
        mediaSession.setCallback(this.f19008f, (Handler) null);
        mediaSession.setActive(true);
        mediaSession.setPlaybackToLocal(new AudioAttributes.Builder().setContentType(0).setUsage(0).build());
        mediaSession.setPlaybackState(this.f19005c);
        C17105a.m100581c("Media Session is active: " + mediaSession.isActive() + " id = " + mediaSession.getSessionToken(), new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("pbState = ");
        sb.append(639);
        m33098q(sb.toString());
        m33098q("PLAYING SOUND");
        m33105x();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                componentName = new ComponentName(this.f19003a, NotificationServiceOreo.class);
            } else {
                componentName = new ComponentName(this.f19003a, NotificationService.class);
            }
            this.f19004b.addOnActiveSessionsChangedListener(this.f19009g, componentName);
        } catch (SecurityException unused) {
            C4878b.m18868g("Media Button V2 trigger requires notification access to be granted to MacroDroid");
            C7439d0.m30911p0(this.f19003a, "Media Button V2", 6);
        }
    }

    /* renamed from: o */
    private final void m33096o(List<MediaController> list) {
        m33098q("-----------------------------+++++++++++++++++++++");
        m33098q("ACTIVE SESSION COUNT: " + list.size() + " +++++++++++++++");
        StringBuilder sb = new StringBuilder();
        sb.append("MACRODROID SESSION token = : ");
        MediaSession mediaSession = this.f19006d;
        sb.append(mediaSession != null ? mediaSession.getSessionToken() : null);
        m33098q(sb.toString());
        m33098q("ACTIVE SESSION COUNT: " + list.size() + " +++++++++++++++++++");
        for (MediaController next : list) {
            m33098q("ACTIVE SESSION: " + next.getPackageName() + ", token = " + next.getSessionToken());
        }
        m33098q("CLEARED ALL OTHER ALIVE MEDIA CONTROLLERS");
        Iterator<MediaController> it = this.f19007e.iterator();
        while (it.hasNext()) {
            it.next().unregisterCallback(this.f19010h);
        }
        this.f19007e.clear();
        if (list.isEmpty()) {
            m33098q("MacroDroid is already top");
            return;
        }
        if (C13706o.m87924a(((MediaController) C13566b0.m87422W(list)).getPackageName(), this.f19003a.getPackageName())) {
            m33106z();
            m33098q("We are the top media controller");
        }
        for (MediaController next2 : list) {
            m33098q("CHECKING CONTROLLER: " + next2.getPackageName());
            if (C13706o.m87924a(next2.getPackageName(), this.f19003a.getPackageName())) {
                m33098q("We are active");
            } else {
                m33098q("ADDING OTHER MEDIA CONTROLLER: " + next2.getPackageName() + ' ');
                this.f19007e.add(next2);
                next2.registerCallback(this.f19010h);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m33097p(C7903a aVar) {
        ArrayList<Macro> arrayList = new ArrayList<>();
        C4878b.m18879r("Media Button Pressed: " + this.f19003a.getString(aVar.mo37795e()));
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if ((next2 instanceof MediaButtonV2Trigger) && ((MediaButtonV2Trigger) next2).mo31328n3(aVar) && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        C13706o.m87928e(next, "macro");
                        arrayList.add(next);
                    }
                }
            }
        }
        for (Macro macro : arrayList) {
            macro.invokeActions(macro.getTriggerContextInfo());
        }
        return !arrayList.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m33098q(String str) {
        C17105a.m100579a("++++++++++ " + str, new Object[0]);
    }

    /* renamed from: r */
    private final void m33099r() {
        RingtoneManager ringtoneManager = new RingtoneManager(this.f19003a);
        ringtoneManager.setType(2);
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(new C15693b(mediaPlayer));
        mediaPlayer.setOnErrorListener(new C15695d(mediaPlayer));
        try {
            ringtoneManager.getCursor();
            Uri ringtoneUri = ringtoneManager.getRingtoneUri(0);
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.reset();
                mediaPlayer.setDataSource(this.f19003a, ringtoneUri);
                mediaPlayer.prepare();
                mediaPlayer.start();
            }
        } catch (Exception e) {
            C17105a.m100581c("Failed to play ringtone: " + e, new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m33100s(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2) {
        C13706o.m87929f(mediaPlayer, "$mediaPlayer");
        mediaPlayer.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final boolean m33101t(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2, int i, int i2) {
        C13706o.m87929f(mediaPlayer, "$mediaPlayer");
        mediaPlayer.release();
        return true;
    }

    /* renamed from: u */
    private final void m33102u() {
        try {
            MediaPlayer create = MediaPlayer.create(this.f19003a, C17540R$raw.silence);
            create.setOnCompletionListener(new C15694c(create));
            create.setOnErrorListener(new C15696e(create));
            if (!create.isPlaying()) {
                create.start();
                m33098q("Called mediaPlayer.start()");
            }
        } catch (Exception e) {
            C17105a.m100581c("Failed to play sound: " + e, new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m33103v(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2) {
        mediaPlayer.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m33104w(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2, int i, int i2) {
        mediaPlayer.release();
        return true;
    }

    /* renamed from: x */
    private final void m33105x() {
        if (f19002k) {
            m33099r();
        } else {
            m33102u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m33106z() {
        m33098q("Trying to steal back priority for our media session - playing sound");
        m33105x();
    }

    /* renamed from: A */
    public final void mo37796A() {
        Iterator<MediaController> it = this.f19007e.iterator();
        while (it.hasNext()) {
            it.next().unregisterCallback(this.f19010h);
        }
        this.f19007e.clear();
        MediaSession mediaSession = this.f19006d;
        if (mediaSession != null) {
            mediaSession.setActive(false);
        }
        MediaSession mediaSession2 = this.f19006d;
        if (mediaSession2 != null) {
            mediaSession2.release();
        }
        try {
            this.f19004b.removeOnActiveSessionsChangedListener(this.f19009g);
        } catch (Exception e) {
            C4878b.m18868g("Failed to remove active sessions changed listener: " + e);
        }
    }

    /* renamed from: y */
    public final void mo37797y() {
        m33095n();
    }
}
