package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.settings.PreferencesActivity;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
import p057a2.C2212a;
import p057a2.C2224m;
import p128m0.C7775j4;
import p148q0.C8151a;
import p319lc.C15626c;

public class SpeakTextAction extends Action implements TextToSpeech.OnInitListener, C2224m, C2212a {
    public static final Parcelable.Creator<SpeakTextAction> CREATOR = new C2701g();
    private static final int RESTART_TTS_MIN_PERIOD_MS = 60000;
    private static int s_actionCounter;
    private static final Set<Long> s_enabledSet = new HashSet();
    private static boolean s_initialised;
    /* access modifiers changed from: private */
    public static TextToSpeech s_tts;
    /* access modifiers changed from: private */
    public transient Locale localeToSpeakWhileConfiguring;
    /* access modifiers changed from: private */
    public transient Locale localeWhileConfiguring;
    private int m_audioStream;
    private transient TriggerContextInfo m_contextInfo;
    /* access modifiers changed from: private */
    public transient TriggerContextInfo m_delayedContextInfo;
    private transient long m_lastRetryTimestamp;
    private Locale m_locale;
    private transient boolean m_oldReadNumbersIndividually;
    private float m_pitch;
    private boolean m_queue;
    private boolean m_readNumbersIndividually;
    private boolean m_specifyAudioStream;
    private float m_speed;
    private String m_textToSay;
    private boolean m_waitToFinish;
    /* access modifiers changed from: private */
    public transient C2702h speechCompletedListener;
    private transient TextToSpeech tempTTS;
    /* access modifiers changed from: private */
    public transient String uniqueId;
    private transient PowerManager.WakeLock wakelock;

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$a */
    class C2695a extends UtteranceProgressListener {

        /* renamed from: a */
        final /* synthetic */ AudioManager f7593a;

        /* renamed from: b */
        final /* synthetic */ C2702h f7594b;

        C2695a(AudioManager audioManager, C2702h hVar) {
            this.f7593a = audioManager;
            this.f7594b = hVar;
        }

        public void onDone(String str) {
            this.f7593a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            C2702h hVar = this.f7594b;
            if (hVar != null) {
                hVar.mo25804a(str);
            }
        }

        public void onError(String str) {
            this.f7593a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            C2702h hVar = this.f7594b;
            if (hVar != null) {
                hVar.mo25804a(str);
            }
        }

        public void onStart(String str) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$b */
    class C2696b implements Runnable {
        C2696b() {
        }

        public void run() {
            C8151a.m33860a("Invoking actions with delayed context info");
            SpeakTextAction speakTextAction = SpeakTextAction.this;
            speakTextAction.m13110l4(speakTextAction.m_delayedContextInfo, SpeakTextAction.this.uniqueId, SpeakTextAction.this.speechCompletedListener);
            TriggerContextInfo unused = SpeakTextAction.this.m_delayedContextInfo = null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$c */
    class C2697c implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7597a;

        C2697c(TextView textView) {
            this.f7597a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int max = (int) ((((double) i) / ((double) seekBar.getMax())) * 100.0d);
            TextView textView = this.f7597a;
            textView.setText("(" + max + ")");
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$d */
    class C2698d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7599a;

        C2698d(TextView textView) {
            this.f7599a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int max = (int) ((((double) i) / ((double) seekBar.getMax())) * 100.0d);
            TextView textView = this.f7599a;
            textView.setText("(" + max + ")");
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$e */
    class C2699e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7601a;

        /* renamed from: c */
        final /* synthetic */ EditText f7602c;

        /* renamed from: d */
        final /* synthetic */ Button f7603d;

        C2699e(Button button, EditText editText, Button button2) {
            this.f7601a = button;
            this.f7602c = editText;
            this.f7603d = button2;
        }

        public void afterTextChanged(Editable editable) {
            boolean z = true;
            this.f7601a.setEnabled(this.f7602c.getText().length() > 0);
            Button button = this.f7603d;
            if (this.f7602c.getText().length() <= 0) {
                z = false;
            }
            button.setEnabled(z);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$f */
    class C2700f implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ List f7605a;

        /* renamed from: c */
        final /* synthetic */ List f7606c;

        C2700f(List list, List list2) {
            this.f7605a = list;
            this.f7606c = list2;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (((String) this.f7605a.get(i)).contains("(*)")) {
                SpeakTextAction.this.m13108k4();
            }
            if (i == 0) {
                Locale unused = SpeakTextAction.this.localeWhileConfiguring = null;
                SpeakTextAction speakTextAction = SpeakTextAction.this;
                Locale unused2 = speakTextAction.localeToSpeakWhileConfiguring = C5163j2.m20129c2(speakTextAction.mo27827K0());
            } else {
                Locale unused3 = SpeakTextAction.this.localeWhileConfiguring = (Locale) this.f7606c.get(i);
                Locale unused4 = SpeakTextAction.this.localeToSpeakWhileConfiguring = (Locale) this.f7606c.get(i);
            }
            if (SpeakTextAction.s_tts.isLanguageAvailable(SpeakTextAction.this.localeToSpeakWhileConfiguring) != -1 && SpeakTextAction.s_tts.isLanguageAvailable(SpeakTextAction.this.localeToSpeakWhileConfiguring) != -2) {
                SpeakTextAction.s_tts.setLanguage(SpeakTextAction.this.localeToSpeakWhileConfiguring);
                SpeakTextAction.s_tts.getLanguage();
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$g */
    class C2701g implements Parcelable.Creator<SpeakTextAction> {
        C2701g() {
        }

        /* renamed from: a */
        public SpeakTextAction createFromParcel(Parcel parcel) {
            return new SpeakTextAction(parcel, (C2695a) null);
        }

        /* renamed from: b */
        public SpeakTextAction[] newArray(int i) {
            return new SpeakTextAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SpeakTextAction$h */
    private interface C2702h {
        /* renamed from: a */
        void mo25804a(String str);
    }

    /* synthetic */ SpeakTextAction(Parcel parcel, C2695a aVar) {
        this(parcel);
    }

    /* renamed from: M3 */
    private void m13082M3(Activity activity, Spinner spinner) {
        this.localeWhileConfiguring = this.m_locale;
        this.tempTTS = new TextToSpeech(MacroDroidApplication.m14845u(), new C3290nl(this, activity, spinner));
    }

    /* renamed from: N3 */
    private void m13083N3() {
        if (mo27836X()) {
            this.m_oldReadNumbersIndividually = this.m_readNumbersIndividually;
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.speak_action_config_dialog);
            appCompatDialog.setVolumeControlStream(3);
            appCompatDialog.setTitle((int) C17541R$string.action_speak_text);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.speak_action_config_dialog_button_test);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.speak_action_config_dialog_text_to_say);
            SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.speak_action_config_dialog_pitch_seekbar);
            SeekBar seekBar2 = (SeekBar) appCompatDialog.findViewById(C17532R$id.speak_action_config_dialog_speed_seekbar);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.speak_action_config_dialog_queue_checkbox);
            CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.speak_action_config_dialog_wait_checkbox);
            CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.speak_digits_individually_checkbox);
            Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.audio_stream);
            Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.language_to_speak);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.ttsSettingsLink);
            TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.ttsEngineLink);
            ImageView imageView = (ImageView) appCompatDialog.findViewById(C17532R$id.language_to_speak_help);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.speak_action_config_dialog_button_special_text);
            Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            seekBar2.setMax(180);
            seekBar.setOnSeekBarChangeListener(new C2697c((TextView) appCompatDialog.findViewById(C17532R$id.pitch_value)));
            seekBar2.setOnSeekBarChangeListener(new C2698d((TextView) appCompatDialog.findViewById(C17532R$id.speed_value)));
            seekBar.setProgress(m13084O3(this.m_pitch));
            seekBar2.setProgress(m13084O3(this.m_speed));
            checkBox.setChecked(this.m_queue);
            checkBox2.setChecked(this.m_waitToFinish);
            checkBox3.setChecked(this.m_readNumbersIndividually);
            checkBox3.setOnCheckedChangeListener(new C3009dl(this));
            String str = this.m_textToSay;
            if (str != null) {
                editText.setText(str);
                editText.setSelection(editText.length());
            }
            if (editText.getText().length() > 0) {
                button.setEnabled(true);
                button2.setEnabled(true);
            }
            String[] stringArray = j0.getResources().getStringArray(C17525R$array.audio_streams);
            int[] intArray = j0.getResources().getIntArray(C17525R$array.audio_streams_values_int);
            String[] strArr = new String[(stringArray.length + 1)];
            CheckBox checkBox4 = checkBox3;
            int i = 0;
            strArr[0] = SelectableItem.m15535j1(C17541R$string.macrodroid_default);
            CheckBox checkBox5 = checkBox2;
            CheckBox checkBox6 = checkBox;
            int i2 = 0;
            while (i < stringArray.length) {
                int i3 = i + 1;
                strArr[i3] = stringArray[i];
                String[] strArr2 = stringArray;
                if (this.m_audioStream == intArray[i]) {
                    i2 = i3;
                }
                i = i3;
                stringArray = strArr2;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(j0, C17535R$layout.simple_spinner_item, strArr);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
            if (!this.m_specifyAudioStream) {
                spinner.setSelection(0, false);
            } else {
                spinner.setSelection(i2, false);
            }
            m13082M3(j0, spinner2);
            editText.addTextChangedListener(new C2699e(button, editText, button2));
            TextView textView3 = textView;
            Spinner spinner3 = spinner;
            ImageView imageView2 = imageView;
            TextView textView4 = textView2;
            TextView textView5 = textView3;
            Button button5 = button3;
            Activity activity = j0;
            C2980cl clVar = r0;
            SeekBar seekBar3 = seekBar2;
            SeekBar seekBar4 = seekBar;
            EditText editText2 = editText;
            C2980cl clVar2 = new C2980cl(this, appCompatDialog, editText, seekBar, seekBar2, checkBox6, checkBox5, checkBox4, spinner3, intArray);
            button.setOnClickListener(clVar);
            button2.setOnClickListener(new C2924al(this, editText2, seekBar4, seekBar3, spinner3, intArray));
            button4.setOnClickListener(new C2952bl(this, appCompatDialog));
            appCompatDialog.setOnCancelListener(new C3631yk(this));
            C3066fl flVar = new C3066fl(editText2);
            Activity activity2 = activity;
            textView5.setOnClickListener(new C3376ql(this, activity2));
            textView4.setOnClickListener(new C3318ol(activity2));
            imageView2.setOnClickListener(new C3348pl(this));
            button5.setOnClickListener(new C3658zk(this, activity2, flVar));
            appCompatDialog.setOnCancelListener(new C3150il(this));
            appCompatDialog.show();
        }
    }

    /* renamed from: O3 */
    private int m13084O3(float f) {
        return (int) ((f - 0.01f) * 50.0f);
    }

    /* renamed from: P3 */
    private String m13085P3(int i) {
        int[] intArray = mo27827K0().getResources().getIntArray(C17525R$array.audio_streams_values_int);
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.audio_streams);
        for (int i2 = 0; i2 < intArray.length; i2++) {
            if (intArray[i2] == i) {
                return stringArray[i2];
            }
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m13087R3(Activity activity, Spinner spinner, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(SelectableItem.m15535j1(C17541R$string.macrodroid_default));
            arrayList2.add((Object) null);
            Locale[] localeArr = C5163j2.f12950b;
            Arrays.sort(localeArr, C3122hl.f8445a);
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 0; i4 < localeArr.length; i4++) {
                TextToSpeech textToSpeech = this.tempTTS;
                if (textToSpeech != null) {
                    Locale locale = localeArr[i4];
                    int isLanguageAvailable = textToSpeech.isLanguageAvailable(locale);
                    String displayName = locale.getDisplayName();
                    if (isLanguageAvailable != -2) {
                        arrayList2.add(locale);
                        if (locale.equals(this.m_locale)) {
                            i2 = i3;
                        }
                        if (this.tempTTS.isLanguageAvailable(locale) == -1) {
                            arrayList.add(displayName + " (*)");
                        } else {
                            arrayList.add(displayName);
                        }
                        i3++;
                    }
                }
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(activity, C17535R$layout.simple_spinner_item, arrayList);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
            spinner.setSelection(i2);
            spinner.setOnItemSelectedListener(new C2700f(arrayList, arrayList2));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void m13088S3(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("com.android.settings.TTS_SETTINGS");
            intent.setFlags(268435456);
            mo27850j0().startActivity(intent);
        } catch (Exception e) {
            C4878b.m18869h("Could not open TTS settings: " + e.toString(), mo27840Y0().longValue());
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.error, 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public static /* synthetic */ void m13089T3(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void m13090U3(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0());
        builder.setTitle((int) C17541R$string.language_to_speak);
        builder.setMessage((int) C17541R$string.speak_text_language_missing_info);
        builder.setNeutralButton((int) C17541R$string.open_text_to_speech_settings, (DialogInterface.OnClickListener) new C3178jl(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C3234ll.f8664a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void m13091V3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void m13092W3(DialogInterface dialogInterface) {
        this.m_readNumbersIndividually = this.m_oldReadNumbersIndividually;
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public /* synthetic */ void m13093X3(CompoundButton compoundButton, boolean z) {
        this.m_readNumbersIndividually = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public /* synthetic */ void m13094Y3(AppCompatDialog appCompatDialog, EditText editText, SeekBar seekBar, SeekBar seekBar2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, Spinner spinner, int[] iArr, View view) {
        appCompatDialog.dismiss();
        this.m_textToSay = editText.getText().toString();
        this.m_pitch = m13106j4(seekBar.getProgress());
        this.m_speed = m13106j4(seekBar2.getProgress());
        this.m_queue = checkBox.isChecked();
        this.m_waitToFinish = checkBox2.isChecked();
        this.m_readNumbersIndividually = checkBox3.isChecked();
        this.m_locale = this.localeWhileConfiguring;
        if (spinner.getSelectedItemPosition() == 0) {
            this.m_specifyAudioStream = false;
        } else {
            this.m_specifyAudioStream = true;
            this.m_audioStream = iArr[spinner.getSelectedItemPosition() - 1];
        }
        this.localeWhileConfiguring = null;
        this.localeToSpeakWhileConfiguring = null;
        this.tempTTS = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public /* synthetic */ void m13095Z3(EditText editText, SeekBar seekBar, SeekBar seekBar2, Spinner spinner, int[] iArr, View view) {
        int i;
        this.m_textToSay = editText.getText().toString();
        this.m_pitch = m13106j4(seekBar.getProgress());
        this.m_speed = m13106j4(seekBar2.getProgress());
        if (spinner.getSelectedItemPosition() == 0) {
            this.m_specifyAudioStream = false;
        } else {
            this.m_specifyAudioStream = true;
            spinner.getSelectedItemPosition();
            this.m_audioStream = iArr[spinner.getSelectedItemPosition() - 1];
        }
        AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
        if (!this.m_specifyAudioStream) {
            i = C5163j2.m20137d2(mo27827K0().getApplicationContext());
        } else {
            i = this.m_audioStream;
        }
        if (audioManager.getStreamVolume(i) == 0) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), String.format(SelectableItem.m15535j1(C17541R$string.audio_stream_name_is_currently_zero), new Object[]{m13085P3(i)}), 1).show();
            return;
        }
        m13110l4((TriggerContextInfo) null, "0", (C2702h) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public /* synthetic */ void m13096a4(AppCompatDialog appCompatDialog, View view) {
        this.localeWhileConfiguring = null;
        this.localeToSpeakWhileConfiguring = null;
        this.tempTTS = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public /* synthetic */ void m13097b4(DialogInterface dialogInterface) {
        this.localeToSpeakWhileConfiguring = null;
        this.localeWhileConfiguring = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static /* synthetic */ void m13098c4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public /* synthetic */ void m13099d4(Activity activity, View view) {
        try {
            Intent intent = new Intent("com.android.settings.TTS_SETTINGS");
            intent.setFlags(268435456);
            activity.startActivity(intent);
        } catch (Exception e) {
            C4878b.m18869h("Could not open TTS settings: " + e.toString(), mo27840Y0().longValue());
            C15626c.makeText(activity.getApplicationContext(), C17541R$string.error, 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static /* synthetic */ void m13100e4(Activity activity, View view) {
        Intent intent = new Intent(activity, PreferencesActivity.class);
        intent.putExtra("shortcut", 4);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public /* synthetic */ void m13101f4(int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public /* synthetic */ void m13102g4(String str, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo, String str2) {
        if (str.equals(str2) && this.m_waitToFinish && !z) {
            new Handler(Looper.getMainLooper()).post(new C3094gl(this, i, triggerContextInfo, z2, stack, resumeMacroInfo));
        }
        PowerManager.WakeLock wakeLock = this.wakelock;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.wakelock.release();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public /* synthetic */ void m13103h4(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.speech.tts.engine.INSTALL_TTS_DATA");
        mo27850j0().startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static /* synthetic */ void m13104i4(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: j4 */
    private float m13106j4(int i) {
        return (((float) i) / 50.0f) + 0.01f;
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public void m13108k4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0());
        builder.setTitle((int) C17541R$string.no_speech_data_files);
        builder.setMessage((int) C17541R$string.no_speech_info);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3206kl(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3262ml.f8712a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:44|45|46|47|48|49|50) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:55|56|57|58|59|60|61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0220, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x019b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x01a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x01e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x01e9 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x01a0=Splitter:B:49:0x01a0, B:61:0x01e9=Splitter:B:61:0x01e9} */
    /* renamed from: l4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m13110l4(com.arlosoft.macrodroid.triggers.TriggerContextInfo r12, java.lang.String r13, @androidx.annotation.Nullable com.arlosoft.macrodroid.action.SpeakTextAction.C2702h r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            android.content.Context r0 = r11.mo27827K0()     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0221 }
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch:{ all -> 0x0221 }
            r11.speechCompletedListener = r14     // Catch:{ all -> 0x0221 }
            r11.uniqueId = r13     // Catch:{ all -> 0x0221 }
            boolean r1 = s_initialised     // Catch:{ Exception -> 0x0201 }
            r2 = 0
            if (r1 == 0) goto L_0x01cd
            java.util.Locale r1 = r11.localeToSpeakWhileConfiguring     // Catch:{ Exception -> 0x0201 }
            if (r1 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            java.util.Locale r1 = r11.m_locale     // Catch:{ Exception -> 0x0201 }
            if (r1 == 0) goto L_0x0020
            goto L_0x002c
        L_0x0020:
            android.content.Context r1 = r11.mo27827K0()     // Catch:{ Exception -> 0x0201 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0201 }
            java.util.Locale r1 = com.arlosoft.macrodroid.settings.C5163j2.m20129c2(r1)     // Catch:{ Exception -> 0x0201 }
        L_0x002c:
            android.speech.tts.TextToSpeech r3 = s_tts     // Catch:{ Exception -> 0x0201 }
            if (r3 == 0) goto L_0x01be
            int r3 = r3.isLanguageAvailable(r1)     // Catch:{ Exception -> 0x0201 }
            r4 = -1
            if (r3 == r4) goto L_0x0046
            android.speech.tts.TextToSpeech r3 = s_tts     // Catch:{ Exception -> 0x0201 }
            int r3 = r3.isLanguageAvailable(r1)     // Catch:{ Exception -> 0x0201 }
            r5 = -2
            if (r3 == r5) goto L_0x0046
            android.speech.tts.TextToSpeech r3 = s_tts     // Catch:{ Exception -> 0x0201 }
            r3.setLanguage(r1)     // Catch:{ Exception -> 0x0201 }
            goto L_0x0066
        L_0x0046:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0201 }
            r3.<init>()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r5 = "Desired language is not available: "
            r3.append(r5)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r1 = r1.getLanguage()     // Catch:{ Exception -> 0x0201 }
            r3.append(r1)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0201 }
            java.lang.Long r3 = r11.mo27840Y0()     // Catch:{ Exception -> 0x0201 }
            long r5 = r3.longValue()     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r1, r5)     // Catch:{ Exception -> 0x0201 }
        L_0x0066:
            r11.m_contextInfo = r12     // Catch:{ Exception -> 0x0201 }
            boolean r1 = r11.m_specifyAudioStream     // Catch:{ Exception -> 0x0201 }
            if (r1 != 0) goto L_0x0079
            android.content.Context r1 = r11.mo27827K0()     // Catch:{ Exception -> 0x0201 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0201 }
            int r1 = com.arlosoft.macrodroid.settings.C5163j2.m20137d2(r1)     // Catch:{ Exception -> 0x0201 }
            goto L_0x007b
        L_0x0079:
            int r1 = r11.m_audioStream     // Catch:{ Exception -> 0x0201 }
        L_0x007b:
            java.lang.String r3 = r11.m_textToSay     // Catch:{ Exception -> 0x0201 }
            android.speech.tts.TextToSpeech r5 = s_tts     // Catch:{ Exception -> 0x0201 }
            float r6 = r11.m_pitch     // Catch:{ Exception -> 0x0201 }
            r5.setPitch(r6)     // Catch:{ Exception -> 0x0201 }
            android.speech.tts.TextToSpeech r5 = s_tts     // Catch:{ Exception -> 0x0201 }
            float r6 = r11.m_speed     // Catch:{ Exception -> 0x0201 }
            r5.setSpeechRate(r6)     // Catch:{ Exception -> 0x0201 }
            android.speech.tts.TextToSpeech r5 = s_tts     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.action.SpeakTextAction$a r6 = new com.arlosoft.macrodroid.action.SpeakTextAction$a     // Catch:{ Exception -> 0x0201 }
            r6.<init>(r0, r14)     // Catch:{ Exception -> 0x0201 }
            r5.setOnUtteranceProgressListener(r6)     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r14 = r11.m_contextInfo     // Catch:{ Exception -> 0x0201 }
            java.lang.String r14 = r11.mo24690R2(r3, r14)     // Catch:{ Exception -> 0x0201 }
            boolean r3 = r11.m_readNumbersIndividually     // Catch:{ Exception -> 0x0201 }
            r5 = 0
            if (r3 == 0) goto L_0x00c9
            r3 = 0
        L_0x00a1:
            r6 = 9
            if (r3 >= r6) goto L_0x00c1
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0201 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0201 }
            r7.<init>()     // Catch:{ Exception -> 0x0201 }
            r7.append(r3)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = " "
            r7.append(r8)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r14 = r14.replace(r6, r7)     // Catch:{ Exception -> 0x0201 }
            int r3 = r3 + 1
            goto L_0x00a1
        L_0x00c1:
            java.lang.String r3 = "0"
            java.lang.String r6 = "0 "
            java.lang.String r14 = r14.replace(r3, r6)     // Catch:{ Exception -> 0x0201 }
        L_0x00c9:
            int r3 = r0.getStreamVolume(r1)     // Catch:{ Exception -> 0x0201 }
            r6 = 1
            if (r3 != 0) goto L_0x0126
            android.content.Context r3 = r11.mo27827K0()     // Catch:{ Exception -> 0x0201 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ Exception -> 0x0201 }
            r7 = 2131952479(0x7f13035f, float:1.9541402E38)
            java.lang.String r8 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r7)     // Catch:{ Exception -> 0x0201 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0201 }
            java.lang.String r10 = r11.m13085P3(r1)     // Catch:{ Exception -> 0x0201 }
            r9[r5] = r10     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = java.lang.String.format(r8, r9)     // Catch:{ Exception -> 0x0201 }
            lc.c r3 = p319lc.C15626c.m94876a(r3, r8, r6)     // Catch:{ Exception -> 0x0201 }
            r3.show()     // Catch:{ Exception -> 0x0201 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0201 }
            r3.<init>()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = r11.mo24738G0()     // Catch:{ Exception -> 0x0201 }
            r3.append(r8)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = " - "
            r3.append(r8)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r7 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r7)     // Catch:{ Exception -> 0x0201 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0201 }
            java.lang.String r9 = r11.m13085P3(r1)     // Catch:{ Exception -> 0x0201 }
            r8[r5] = r9     // Catch:{ Exception -> 0x0201 }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ Exception -> 0x0201 }
            r3.append(r7)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0201 }
            java.lang.Long r7 = r11.mo27840Y0()     // Catch:{ Exception -> 0x0201 }
            long r7 = r7.longValue()     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r3, r7)     // Catch:{ Exception -> 0x0201 }
            goto L_0x0158
        L_0x0126:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0201 }
            r7.<init>()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = r11.mo24738G0()     // Catch:{ Exception -> 0x0201 }
            r7.append(r8)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = " - "
            r7.append(r8)     // Catch:{ Exception -> 0x0201 }
            r8 = 2131952991(0x7f13055f, float:1.954244E38)
            java.lang.String r8 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r8)     // Catch:{ Exception -> 0x0201 }
            r7.append(r8)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r8 = " = "
            r7.append(r8)     // Catch:{ Exception -> 0x0201 }
            r7.append(r3)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0201 }
            java.lang.Long r7 = r11.mo27840Y0()     // Catch:{ Exception -> 0x0201 }
            long r7 = r7.longValue()     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18880s(r3, r7)     // Catch:{ Exception -> 0x0201 }
        L_0x0158:
            r3 = 3
            r0.requestAudioFocus(r2, r1, r3)     // Catch:{ Exception -> 0x0201 }
            boolean r0 = r11.m_queue     // Catch:{ Exception -> 0x0201 }
            if (r0 == 0) goto L_0x0161
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x0201 }
            r0.<init>()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r2 = "streamType"
            r0.putInt(r2, r1)     // Catch:{ Exception -> 0x0201 }
            android.speech.tts.TextToSpeech r1 = s_tts     // Catch:{ Exception -> 0x0201 }
            int r13 = r1.speak(r14, r6, r0, r13)     // Catch:{ Exception -> 0x0201 }
            if (r13 != r4) goto L_0x021f
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0201 }
            long r0 = r11.m_lastRetryTimestamp     // Catch:{ Exception -> 0x0201 }
            long r0 = r13 - r0
            r2 = 60000(0xea60, double:2.9644E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b8
            r11.m_lastRetryTimestamp = r13     // Catch:{ Exception -> 0x0201 }
            java.lang.String r13 = "SpeakTextAction: Text To Speech not working Retrying once"
            java.lang.Long r14 = r11.mo27840Y0()     // Catch:{ Exception -> 0x0201 }
            long r0 = r14.longValue()     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r13, r0)     // Catch:{ Exception -> 0x0201 }
            r11.m_delayedContextInfo = r12     // Catch:{ Exception -> 0x0201 }
            s_initialised = r5     // Catch:{ Exception -> 0x0201 }
            android.speech.tts.TextToSpeech r12 = s_tts     // Catch:{ Exception -> 0x019b }
            r12.stop()     // Catch:{ Exception -> 0x019b }
        L_0x019b:
            android.speech.tts.TextToSpeech r12 = s_tts     // Catch:{ Exception -> 0x01a0 }
            r12.shutdown()     // Catch:{ Exception -> 0x01a0 }
        L_0x01a0:
            android.speech.tts.TextToSpeech r12 = new android.speech.tts.TextToSpeech     // Catch:{ Exception -> 0x0201 }
            android.content.Context r13 = r11.mo27827K0()     // Catch:{ Exception -> 0x0201 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ Exception -> 0x0201 }
            android.content.Context r14 = r11.mo27827K0()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r14 = com.arlosoft.macrodroid.settings.C5163j2.m20161g2(r14)     // Catch:{ Exception -> 0x0201 }
            r12.<init>(r13, r11, r14)     // Catch:{ Exception -> 0x0201 }
            s_tts = r12     // Catch:{ Exception -> 0x0201 }
            goto L_0x021f
        L_0x01b8:
            java.lang.String r12 = "Failed to initialise text to speech engine. Please check the text to speech engine is working properly via your phone's settings app."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r12)     // Catch:{ Exception -> 0x0201 }
            goto L_0x021f
        L_0x01be:
            java.lang.String r12 = "Text to speech engine is null, cannot speak text"
            java.lang.Long r13 = r11.mo27840Y0()     // Catch:{ Exception -> 0x0201 }
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r12, r13)     // Catch:{ Exception -> 0x0201 }
            monitor-exit(r11)
            return
        L_0x01cd:
            r0.abandonAudioFocus(r2)     // Catch:{ Exception -> 0x0201 }
            r11.m_delayedContextInfo = r12     // Catch:{ Exception -> 0x0201 }
            java.lang.String r12 = "Text to Speech not initialised - attempting to re-initialise"
            java.lang.Long r13 = r11.mo27840Y0()     // Catch:{ Exception -> 0x0201 }
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x0201 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r12, r13)     // Catch:{ Exception -> 0x0201 }
            android.speech.tts.TextToSpeech r12 = s_tts     // Catch:{ Exception -> 0x01e4 }
            r12.stop()     // Catch:{ Exception -> 0x01e4 }
        L_0x01e4:
            android.speech.tts.TextToSpeech r12 = s_tts     // Catch:{ Exception -> 0x01e9 }
            r12.shutdown()     // Catch:{ Exception -> 0x01e9 }
        L_0x01e9:
            android.speech.tts.TextToSpeech r12 = new android.speech.tts.TextToSpeech     // Catch:{ Exception -> 0x0201 }
            android.content.Context r13 = r11.mo27827K0()     // Catch:{ Exception -> 0x0201 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ Exception -> 0x0201 }
            android.content.Context r14 = r11.mo27827K0()     // Catch:{ Exception -> 0x0201 }
            java.lang.String r14 = com.arlosoft.macrodroid.settings.C5163j2.m20161g2(r14)     // Catch:{ Exception -> 0x0201 }
            r12.<init>(r13, r11, r14)     // Catch:{ Exception -> 0x0201 }
            s_tts = r12     // Catch:{ Exception -> 0x0201 }
            goto L_0x021f
        L_0x0201:
            r12 = move-exception
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ all -> 0x0221 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0221 }
            r14.<init>()     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = "SpeakTextAction: Exception while invoking SpeakTextAction: "
            r14.append(r0)     // Catch:{ all -> 0x0221 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0221 }
            r14.append(r12)     // Catch:{ all -> 0x0221 }
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x0221 }
            r13.<init>(r12)     // Catch:{ all -> 0x0221 }
            p148q0.C8151a.m33873n(r13)     // Catch:{ all -> 0x0221 }
        L_0x021f:
            monitor-exit(r11)
            return
        L_0x0221:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SpeakTextAction.m13110l4(com.arlosoft.macrodroid.triggers.TriggerContextInfo, java.lang.String, com.arlosoft.macrodroid.action.SpeakTextAction$h):void");
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_textToSay};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_textToSay = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return "'" + this.m_textToSay + "'";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7775j4.m32460u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + C6413o0.m24693b(this.m_textToSay, 20) + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public synchronized void mo24692U2() {
        if (mo27837X0() != null) {
            Set<Long> set = s_enabledSet;
            if (set.contains(Long.valueOf(mo27837X0().getGUID()))) {
                set.remove(Long.valueOf(mo27837X0().getGUID()));
                int i = s_actionCounter - 1;
                s_actionCounter = i;
                if (i == 0) {
                    s_initialised = false;
                    TextToSpeech textToSpeech = s_tts;
                    if (textToSpeech != null) {
                        textToSpeech.stop();
                        s_tts.shutdown();
                        s_tts = null;
                    }
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
                    s_tts = new TextToSpeech(mo27827K0().getApplicationContext(), this, C5163j2.m20161g2(mo27827K0()));
                }
                s_actionCounter++;
            }
        }
    }

    /* renamed from: X2 */
    public void mo24697X2() {
        if (s_tts == null) {
            s_tts = new TextToSpeech(mo27827K0().getApplicationContext(), this, C5163j2.m20161g2(mo27827K0()));
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: h */
    public void mo24421h(@NonNull TriggerContextInfo triggerContextInfo, int i, boolean z, @NonNull Stack<Integer> stack, @Nullable ResumeMacroInfo resumeMacroInfo, boolean z2) {
        String valueOf = String.valueOf(UUID.randomUUID().getLeastSignificantBits());
        PowerManager.WakeLock wakeLock = this.wakelock;
        if (wakeLock != null) {
            wakeLock.acquire(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        }
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        m13110l4(triggerContextInfo, valueOf, new C3037el(this, valueOf, z2, i, triggerContextInfo, z, stack, resumeMacroInfo));
        if (!this.m_waitToFinish && !z2) {
            mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " (" + mo24690R2(this.m_textToSay, triggerContextInfo) + ")";
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onInit(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0081
            r4 = 1
            s_initialised = r4     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            java.util.Locale r4 = r3.localeToSpeakWhileConfiguring     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            if (r4 == 0) goto L_0x000b
            goto L_0x001c
        L_0x000b:
            java.util.Locale r4 = r3.m_locale     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            if (r4 == 0) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            android.content.Context r4 = r3.mo27827K0()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            java.util.Locale r4 = com.arlosoft.macrodroid.settings.C5163j2.m20129c2(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
        L_0x001c:
            android.speech.tts.TextToSpeech r0 = s_tts     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            if (r0 == 0) goto L_0x006f
            int r0 = r0.isLanguageAvailable(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r1 = -1
            if (r0 == r1) goto L_0x003b
            android.speech.tts.TextToSpeech r0 = s_tts     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            int r0 = r0.isLanguageAvailable(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r1 = -2
            if (r0 == r1) goto L_0x003b
            android.speech.tts.TextToSpeech r0 = s_tts     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r0.setLanguage(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            android.speech.tts.TextToSpeech r4 = s_tts     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r4.getLanguage()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            goto L_0x005b
        L_0x003b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r0.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            java.lang.String r1 = "Desired language is not available: "
            r0.append(r1)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            java.lang.String r4 = r4.getLanguage()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r0.append(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            java.lang.Long r0 = r3.mo27840Y0()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r4, r0)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
        L_0x005b:
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = r3.m_delayedContextInfo     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            if (r4 == 0) goto L_0x0081
            android.os.Handler r4 = new android.os.Handler     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r4.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            com.arlosoft.macrodroid.action.SpeakTextAction$b r0 = new com.arlosoft.macrodroid.action.SpeakTextAction$b     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r0.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r1 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r0, r1)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            goto L_0x0081
        L_0x006f:
            java.lang.String r4 = "Text to speech engine is null, cannot speak text"
            java.lang.Long r0 = r3.mo27840Y0()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r4, r0)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            monitor-exit(r3)
            return
        L_0x007e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0081:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SpeakTextAction.onInit(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (s_tts == null) {
            s_tts = new TextToSpeech(mo27827K0().getApplicationContext(), this, C5163j2.m20161g2(mo27827K0()));
        }
        m13083N3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_textToSay);
        parcel.writeFloat(this.m_pitch);
        parcel.writeFloat(this.m_speed);
        parcel.writeInt(this.m_queue ? 1 : 0);
        parcel.writeInt(this.m_specifyAudioStream ? 1 : 0);
        parcel.writeInt(this.m_audioStream);
        parcel.writeInt(this.m_waitToFinish ? 1 : 0);
        parcel.writeInt(this.m_readNumbersIndividually ? 1 : 0);
        parcel.writeSerializable(this.m_locale);
    }

    public SpeakTextAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SpeakTextAction() {
        this.m_pitch = 1.0f;
        this.m_speed = 1.0f;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo27827K0().getSystemService("power")).newWakeLock(1, "macrodroid:SpeakTextAction");
        this.wakelock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private SpeakTextAction(Parcel parcel) {
        super(parcel);
        this.m_textToSay = parcel.readString();
        this.m_pitch = parcel.readFloat();
        this.m_speed = parcel.readFloat();
        boolean z = true;
        this.m_queue = parcel.readInt() != 0;
        this.m_specifyAudioStream = parcel.readInt() != 0;
        this.m_audioStream = parcel.readInt();
        this.m_waitToFinish = parcel.readInt() != 0;
        this.m_readNumbersIndividually = parcel.readInt() == 0 ? false : z;
        this.m_locale = (Locale) parcel.readSerializable();
    }
}
