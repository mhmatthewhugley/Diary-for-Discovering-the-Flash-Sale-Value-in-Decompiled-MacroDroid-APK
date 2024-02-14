package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.speech.tts.TextToSpeech;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p128m0.C7876x2;
import p148q0.C8151a;

public class SayTimeAction extends Action implements TextToSpeech.OnInitListener {
    public static final Parcelable.Creator<SayTimeAction> CREATOR = new C2608a();
    private static final int RESTART_TTS_MIN_PERIOD_MS = 60000;
    private static int s_actionCounter;
    private static final Set<Long> s_enabledSet = new HashSet();
    private static boolean s_initialised;
    private static TextToSpeech s_tts;
    private boolean m_12Hour;
    private transient TriggerContextInfo m_delayedContextInfo;
    private transient long m_lastRetryTimestamp;

    /* renamed from: com.arlosoft.macrodroid.action.SayTimeAction$a */
    class C2608a implements Parcelable.Creator<SayTimeAction> {
        C2608a() {
        }

        /* renamed from: a */
        public SayTimeAction createFromParcel(Parcel parcel) {
            return new SayTimeAction(parcel, (C2608a) null);
        }

        /* renamed from: b */
        public SayTimeAction[] newArray(int i) {
            return new SayTimeAction[i];
        }
    }

    /* synthetic */ SayTimeAction(Parcel parcel, C2608a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m12084k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_say_time_24_hour), SelectableItem.m15535j1(C17541R$string.action_say_time_12_hour)};
    }

    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_12Hour ? 1 : 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return SelectableItem.m15535j1(this.m_12Hour ? C17541R$string.action_say_time_12_hour_clock : C17541R$string.action_say_time_24_hour_clock);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7876x2.m32951u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo24692U2() {
        if (mo27837X0() != null) {
            Set<Long> set = s_enabledSet;
            if (set.contains(Long.valueOf(mo27837X0().getGUID()))) {
                if (mo27837X0() != null) {
                    set.remove(Long.valueOf(mo27837X0().getGUID()));
                }
                int i = s_actionCounter - 1;
                s_actionCounter = i;
                if (i == 0) {
                    TextToSpeech textToSpeech = s_tts;
                    if (textToSpeech != null) {
                        textToSpeech.stop();
                        s_tts.shutdown();
                        s_tts = null;
                    }
                    s_initialised = false;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
        if (mo27837X0() != null) {
            Set<Long> set = s_enabledSet;
            if (!set.contains(Long.valueOf(mo27837X0().getGUID()))) {
                set.add(Long.valueOf(mo27837X0().getGUID()));
                if (s_actionCounter == 0 && !s_initialised && s_tts == null) {
                    s_tts = new TextToSpeech(mo27827K0().getApplicationContext(), this);
                }
                s_actionCounter++;
            }
        }
    }

    /* renamed from: X2 */
    public void mo24697X2() {
        if (s_tts == null) {
            s_tts = new TextToSpeech(mo27827K0().getApplicationContext(), this);
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        TextToSpeech textToSpeech;
        SimpleDateFormat simpleDateFormat;
        try {
            if (s_initialised) {
                Locale c2 = C5163j2.m20129c2(mo27827K0());
                AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
                if (c2 != null && (textToSpeech = s_tts) != null) {
                    textToSpeech.setLanguage(c2);
                    s_tts.setPitch(1.0f);
                    s_tts.setSpeechRate(1.0f);
                    int d2 = C5163j2.m20137d2(mo27827K0());
                    if (this.m_12Hour) {
                        simpleDateFormat = new SimpleDateFormat("h:mm aa");
                    } else {
                        simpleDateFormat = new SimpleDateFormat("H:mm");
                    }
                    String format = simpleDateFormat.format(new Date());
                    int streamVolume = audioManager.getStreamVolume(d2);
                    if (streamVolume == 0) {
                        C4878b.m18869h(mo24738G0() + " - " + SelectableItem.m15535j1(C17541R$string.current_volume) + " = " + streamVolume, mo27840Y0().longValue());
                    }
                    s_tts.setOnUtteranceCompletedListener(new C3625ye(audioManager));
                    audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, d2, 3);
                    Bundle bundle = new Bundle();
                    bundle.putInt("streamType", d2);
                    if (s_tts.speak(format, 0, bundle, "SpokenText") == -1) {
                        audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - this.m_lastRetryTimestamp > 60000) {
                            this.m_lastRetryTimestamp = currentTimeMillis;
                            this.m_delayedContextInfo = triggerContextInfo;
                            s_initialised = false;
                            s_tts.stop();
                            s_tts.shutdown();
                            s_tts = new TextToSpeech(mo27827K0().getApplicationContext(), this);
                            return;
                        }
                        C8151a.m33873n(new RuntimeException("SayTimeAction: Text To Speech cannot retry"));
                        return;
                    }
                    return;
                }
                return;
            }
            this.m_delayedContextInfo = triggerContextInfo;
        } catch (Exception e) {
            C8151a.m33873n(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12084k3();
    }

    public void onInit(int i) {
        TextToSpeech textToSpeech;
        if (i == 0) {
            s_initialised = true;
            Locale c2 = C5163j2.m20129c2(mo27827K0());
            if (!(c2 == null || (textToSpeech = s_tts) == null)) {
                try {
                    int isLanguageAvailable = textToSpeech.isLanguageAvailable(c2);
                    if (!(isLanguageAvailable == -1 || isLanguageAvailable == -2)) {
                        s_tts.setLanguage(c2);
                    }
                } catch (Exception e) {
                    C4878b.m18869h("Failed to set language: " + e.toString(), mo27840Y0().longValue());
                }
            }
            TriggerContextInfo triggerContextInfo = this.m_delayedContextInfo;
            if (triggerContextInfo != null) {
                mo24675a3(triggerContextInfo);
                this.m_delayedContextInfo = null;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_12Hour ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.m_12Hour = z;
    }

    public SayTimeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SayTimeAction() {
        this.m_12Hour = false;
    }

    private SayTimeAction(Parcel parcel) {
        super(parcel);
        this.m_12Hour = parcel.readInt() == 0;
    }
}
