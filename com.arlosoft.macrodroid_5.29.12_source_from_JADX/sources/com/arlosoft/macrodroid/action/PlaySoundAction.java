package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6420q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.UUID;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2212a;
import p128m0.C7817p2;
import p319lc.C15626c;

public class PlaySoundAction extends FileSelectionAction implements C2212a {
    private static final int ANDROID_5_PICKER_ID = 1067;
    public static final Parcelable.Creator<PlaySoundAction> CREATOR = new C2579a();
    private static final List<PlaySoundAction> s_activePlaySoundActions = Collections.synchronizedList(new ArrayList());
    private int audioStream;
    private String m_fileDisplayName;
    private String m_fileUri;
    private transient MediaPlayer m_mediaPlayer;
    private int m_selectedIndex;
    private boolean specifyAudioStream;
    private boolean waitToFinish;
    private transient PowerManager.WakeLock wakelock;

    /* renamed from: com.arlosoft.macrodroid.action.PlaySoundAction$a */
    class C2579a implements Parcelable.Creator<PlaySoundAction> {
        C2579a() {
        }

        /* renamed from: a */
        public PlaySoundAction createFromParcel(Parcel parcel) {
            return new PlaySoundAction(parcel, (C2579a) null);
        }

        /* renamed from: b */
        public PlaySoundAction[] newArray(int i) {
            return new PlaySoundAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.PlaySoundAction$b */
    private interface C2580b {
        /* renamed from: a */
        void mo25482a(long j);
    }

    /* synthetic */ PlaySoundAction(Parcel parcel, C2579a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m11848A3(int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m11849B3(long j, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo, long j2) {
        if (j == j2 && this.waitToFinish && !z) {
            new Handler(Looper.getMainLooper()).post(new C3515ud(this, i, triggerContextInfo, z2, stack, resumeMacroInfo));
        }
        PowerManager.WakeLock wakeLock = this.wakelock;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.wakelock.release();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m11850C3(AudioManager audioManager, C2580b bVar, long j, MediaPlayer mediaPlayer) {
        audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        mo25477t3(true);
        bVar.mo25482a(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m11851D3(AudioManager audioManager, C2580b bVar, long j, MediaPlayer mediaPlayer) {
        audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        mo25477t3(true);
        bVar.mo25482a(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m11852E3(AudioManager audioManager, C2580b bVar, long j, MediaPlayer mediaPlayer) {
        audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        mo25477t3(true);
        bVar.mo25482a(j);
    }

    /* renamed from: F3 */
    private void m11853F3(TriggerContextInfo triggerContextInfo, long j, C2580b bVar) {
        int i;
        Cursor cursor;
        long j2 = j;
        C2580b bVar2 = bVar;
        AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
        if (!this.specifyAudioStream) {
            i = C5163j2.m20176i1(mo27827K0());
        } else {
            i = this.audioStream;
        }
        audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, i, 3);
        String str = this.m_filePath;
        boolean z = false;
        if (str == null && this.m_fileUri == null) {
            for (PlaySoundAction t3 : s_activePlaySoundActions) {
                t3.mo25477t3(false);
            }
            s_activePlaySoundActions.clear();
            audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            bVar2.mo25482a(j2);
        } else if (this.m_fileUri != null) {
            m11864u3();
            try {
                if (!this.m_mediaPlayer.isPlaying()) {
                    this.m_mediaPlayer.reset();
                    this.m_mediaPlayer.setDataSource(mo27827K0(), Uri.parse(this.m_fileUri));
                    this.m_mediaPlayer.setAudioStreamType(i);
                    this.m_mediaPlayer.prepare();
                    this.m_mediaPlayer.setOnCompletionListener(new C3310od(this, audioManager, bVar, j));
                    this.m_mediaPlayer.start();
                }
            } catch (Exception e) {
                C4878b.m18869h("Error playing media file: " + this.m_fileUri + IOUtils.LINE_SEPARATOR_UNIX + e.toString(), mo27840Y0().longValue());
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                mo25477t3(true);
                bVar2.mo25482a(j2);
            }
        } else if (!str.contains("/")) {
            m11864u3();
            List<String> X = C4061t1.m15978X(mo27827K0(), 2, false);
            int i2 = 0;
            while (true) {
                if (i2 >= X.size()) {
                    break;
                }
                C4878b.m18864c("Sound file: " + X.get(i2) + " Comparing with: " + this.m_filePath);
                if (X.get(i2).equals(this.m_filePath)) {
                    RingtoneManager ringtoneManager = new RingtoneManager(mo27827K0().getApplicationContext());
                    ringtoneManager.setType(2);
                    try {
                        cursor = ringtoneManager.getCursor();
                        try {
                            Uri ringtoneUri = ringtoneManager.getRingtoneUri(i2);
                            this.m_mediaPlayer.reset();
                            this.m_mediaPlayer.setDataSource(mo27827K0(), ringtoneUri);
                            this.m_mediaPlayer.setAudioStreamType(i);
                            this.m_mediaPlayer.prepare();
                            MediaPlayer mediaPlayer = this.m_mediaPlayer;
                            C3282nd ndVar = r1;
                            C3282nd ndVar2 = new C3282nd(this, audioManager, bVar, j);
                            mediaPlayer.setOnCompletionListener(ndVar);
                            this.m_mediaPlayer.start();
                            try {
                                cursor.close();
                            } catch (Exception unused) {
                            }
                            z = true;
                            break;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                C4878b.m18869h("Failed to play sound: " + th.toString(), mo27840Y0().longValue());
                                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                                mo25477t3(true);
                                bVar2.mo25482a(j2);
                                try {
                                    return;
                                } catch (Exception unused2) {
                                    return;
                                }
                            } finally {
                                try {
                                    cursor.close();
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        C4878b.m18869h("Failed to play sound: " + th.toString(), mo27840Y0().longValue());
                        audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                        mo25477t3(true);
                        bVar2.mo25482a(j2);
                        return;
                    }
                } else {
                    i2++;
                }
            }
            if (!z) {
                C4878b.m18869h("Sound file not found: " + this.m_filePath, mo27840Y0().longValue());
                C4878b.m18880s("Files found were: " + X, mo27840Y0().longValue());
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                mo25477t3(true);
                bVar2.mo25482a(j2);
            }
        } else {
            m11864u3();
            try {
                if (!this.m_mediaPlayer.isPlaying()) {
                    this.m_mediaPlayer.reset();
                    this.m_mediaPlayer.setDataSource(this.m_filePath);
                    this.m_mediaPlayer.setAudioStreamType(i);
                    this.m_mediaPlayer.prepare();
                    this.m_mediaPlayer.setOnCompletionListener(new C3254md(this, audioManager, bVar, j));
                    this.m_mediaPlayer.start();
                }
            } catch (Exception unused4) {
                C4878b.m18869h("Error playing media file: " + this.m_filePath, mo27840Y0().longValue());
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                mo25477t3(true);
                bVar2.mo25482a(j2);
            }
        }
    }

    /* renamed from: u3 */
    private void m11864u3() {
        if (this.m_mediaPlayer == null) {
            this.m_mediaPlayer = new MediaPlayer();
            s_activePlaySoundActions.add(this);
            this.m_mediaPlayer.setOnCompletionListener(new C3226ld(this));
            this.m_mediaPlayer.setOnErrorListener(new C3340pd(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m11865v3(AdapterView adapterView, View view, int i, long j) {
        C4061t1.m15963J0();
        if (i > 1) {
            C4061t1.m16028x0(mo27827K0(), i - 2, 2, C5163j2.m20176i1(mo27827K0()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m11867x3(CheckBox checkBox, ListView listView, Spinner spinner, int[] iArr, String[] strArr, Activity activity, AppCompatDialog appCompatDialog, View view) {
        this.waitToFinish = checkBox.isChecked();
        C4061t1.m15963J0();
        this.m_selectedIndex = listView.getCheckedItemPosition();
        if (spinner.getSelectedItemPosition() == 0) {
            this.specifyAudioStream = false;
        } else {
            this.specifyAudioStream = true;
            this.audioStream = iArr[spinner.getSelectedItemPosition() - 1];
        }
        int i = this.m_selectedIndex;
        if (i > 1) {
            this.m_fileDisplayName = null;
            this.m_fileUri = null;
            this.m_filePath = strArr[i];
            mo24677v2();
        } else if (i == 0) {
            try {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                activity.startActivityForResult(intent, ANDROID_5_PICKER_ID);
            } catch (Exception unused) {
                Context applicationContext = mo27827K0().getApplicationContext();
                C15626c.m94876a(applicationContext, "ACTION_OPEN_DOCUMENT " + SelectableItem.m15535j1(C17541R$string.not_supported), 0).show();
            }
        } else if (i == 1) {
            this.m_filePath = null;
            this.m_fileUri = null;
            this.m_fileDisplayName = null;
            mo24677v2();
        }
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m11868y3(MediaPlayer mediaPlayer) {
        mo25477t3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ boolean m11869z3(MediaPlayer mediaPlayer, int i, int i2) {
        ((AudioManager) mo27827K0().getSystemService("audio")).abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        mo25477t3(true);
        return true;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (!TextUtils.isEmpty(this.m_fileDisplayName)) {
            return SelectableItem.m15535j1(C17541R$string.action_play_sound_play) + " " + this.m_fileDisplayName;
        }
        String str = this.m_fileUri;
        if (str != null) {
            try {
                String decode = Uri.decode(str);
                String substring = decode.substring(decode.lastIndexOf("/") + 1);
                return SelectableItem.m15535j1(C17541R$string.action_play_sound_play) + " " + substring;
            } catch (Exception unused) {
                return SelectableItem.m15535j1(C17541R$string.action_play_sound_play) + " " + this.m_fileUri;
            }
        } else {
            String str2 = this.m_filePath;
            if (str2 == null) {
                return SelectableItem.m15535j1(C17541R$string.action_play_sound_stop_sounds);
            }
            if (str2.contains("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(SelectableItem.m15535j1(C17541R$string.action_play_sound_play));
                sb.append(" ");
                String str3 = this.m_filePath;
                sb.append(str3.substring(str3.lastIndexOf(47) + 1));
                return sb.toString();
            }
            return SelectableItem.m15535j1(C17541R$string.action_play_sound_play) + " " + this.m_filePath;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7817p2.m32665u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: c3 */
    public void mo24699c3() {
        s_activePlaySoundActions.remove(this);
        MediaPlayer mediaPlayer = this.m_mediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
                this.m_mediaPlayer = null;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        PowerManager.WakeLock wakeLock = this.wakelock;
        if (wakeLock != null) {
            wakeLock.acquire(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        }
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        m11853F3(triggerContextInfo, leastSignificantBits, new C3479td(this, leastSignificantBits, z2, i, triggerContextInfo, z, stack, resumeMacroInfo));
        if (!this.waitToFinish && !z2) {
            mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 == -1) {
            if (i == ANDROID_5_PICKER_ID) {
                try {
                    Uri data = intent.getData();
                    mo27827K0().getContentResolver().takePersistableUriPermission(data, 3);
                    this.m_fileUri = data.toString();
                    this.m_fileDisplayName = C6420q1.m24719a(mo27827K0(), data);
                    this.m_filePath = null;
                } catch (SecurityException unused) {
                    C15626c.m94876a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.file_explorer_broken), 1).show();
                    C4878b.m18868g(SelectableItem.m15535j1(C17541R$string.file_explorer_broken));
                }
            } else {
                this.m_filePath = intent.getExtras().getString("FileSelection");
            }
            mo24689O1();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|(1:8)|9|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* renamed from: t3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25477t3(boolean r2) {
        /*
            r1 = this;
            android.media.MediaPlayer r0 = r1.m_mediaPlayer
            if (r0 == 0) goto L_0x0018
            r0.stop()     // Catch:{ Exception -> 0x0007 }
        L_0x0007:
            android.media.MediaPlayer r0 = r1.m_mediaPlayer     // Catch:{ Exception -> 0x000d }
            r0.release()     // Catch:{ Exception -> 0x000d }
            goto L_0x000e
        L_0x000d:
        L_0x000e:
            if (r2 == 0) goto L_0x0015
            java.util.List<com.arlosoft.macrodroid.action.PlaySoundAction> r2 = s_activePlaySoundActions
            r2.remove(r1)
        L_0x0015:
            r2 = 0
            r1.m_mediaPlayer = r2
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.PlaySoundAction.mo25477t3(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_sound_chooser);
            appCompatDialog.setTitle((int) C17541R$string.action_play_sound_select);
            ListView listView = (ListView) appCompatDialog.findViewById(C17532R$id.sound_list);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.wait_to_complete_checkbox);
            Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.audio_stream);
            List<String> X = C4061t1.m15978X(mo27827K0(), 2, false);
            X.add(0, SelectableItem.m15535j1(C17541R$string.action_play_sound_choose_file));
            X.add(1, SelectableItem.m15535j1(C17541R$string.action_play_sound_stop_existing_sound));
            String[] strArr = (String[]) X.toArray(new String[0]);
            if (this.m_filePath == null) {
                this.m_filePath = strArr[1];
            }
            if (this.m_selectedIndex > strArr.length - 1) {
                this.m_selectedIndex = strArr.length - 1;
            }
            String[] stringArray = j0.getResources().getStringArray(C17525R$array.audio_streams);
            int[] intArray = j0.getResources().getIntArray(C17525R$array.audio_streams_values_int);
            String[] strArr2 = new String[(stringArray.length + 1)];
            strArr2[0] = SelectableItem.m15535j1(C17541R$string.macrodroid_default);
            int i = 0;
            int i2 = 0;
            while (i2 < stringArray.length) {
                int i3 = i2 + 1;
                strArr2[i3] = stringArray[i2];
                String[] strArr3 = stringArray;
                if (this.audioStream == intArray[i2]) {
                    i = i3;
                }
                i2 = i3;
                stringArray = strArr3;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(j0, C17535R$layout.simple_spinner_item, strArr2);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
            if (!this.specifyAudioStream) {
                spinner.setSelection(0, false);
            } else {
                spinner.setSelection(i, false);
            }
            checkBox.setChecked(this.waitToFinish);
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(new ContextThemeWrapper((Context) j0, mo24688L0()), C17535R$layout.single_choice_list_item, X);
            listView.setChoiceMode(1);
            listView.setAdapter(arrayAdapter2);
            listView.setItemChecked(this.m_selectedIndex, true);
            listView.setOnItemClickListener(new C3429sd(this));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            button2.setOnClickListener(new C3368qd(appCompatDialog));
            button.setOnClickListener(new C3396rd(this, checkBox, listView, spinner, intArray, strArr, j0, appCompatDialog));
            appCompatDialog.show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_filePath);
        parcel.writeString(this.m_fileUri);
        parcel.writeString(this.m_fileDisplayName);
        parcel.writeInt(this.waitToFinish ? 1 : 0);
        parcel.writeInt(this.specifyAudioStream ? 1 : 0);
        parcel.writeInt(this.audioStream);
    }

    public PlaySoundAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo27827K0().getSystemService("power")).newWakeLock(1, "macrodroid:PlaySoundAction");
        this.wakelock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public PlaySoundAction() {
        this.waitToFinish = false;
        this.m_selectedIndex = 0;
    }

    private PlaySoundAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.waitToFinish = false;
        this.m_filePath = parcel.readString();
        this.m_fileUri = parcel.readString();
        this.m_fileDisplayName = parcel.readString();
        this.waitToFinish = parcel.readInt() != 0;
        this.specifyAudioStream = parcel.readInt() != 0 ? true : z;
        this.audioStream = parcel.readInt();
    }
}
