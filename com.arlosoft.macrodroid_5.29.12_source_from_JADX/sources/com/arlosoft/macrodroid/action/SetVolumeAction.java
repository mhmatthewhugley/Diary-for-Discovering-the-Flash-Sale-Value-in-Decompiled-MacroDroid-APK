package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.activities.SetVolumeActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.BluetoothTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p057a2.C2217f;
import p057a2.C2222k;
import p112j2.C7439d0;
import p128m0.C7726d4;
import p319lc.C15626c;

public class SetVolumeAction extends Action implements C2222k, C2217f {
    public static final Parcelable.Creator<SetVolumeAction> CREATOR = new C2667a();
    private static final int NO_VOLUME_VALUE = -1;

    /* renamed from: d */
    public static final int[] f7537d = {4, 3, 5, 2, 1, 0, 6, 10};
    private boolean m_forceVibrateOff;
    private boolean[] m_streamIndexArray;
    private int[] m_streamVolumeArray;
    private MacroDroidVariable[] m_variables;
    private int m_volume;
    private boolean setInForeground;
    /* access modifiers changed from: private */
    public DictionaryKeys[] varDictionaryKeys;

    /* renamed from: com.arlosoft.macrodroid.action.SetVolumeAction$a */
    class C2667a implements Parcelable.Creator<SetVolumeAction> {
        C2667a() {
        }

        /* renamed from: a */
        public SetVolumeAction createFromParcel(Parcel parcel) {
            return new SetVolumeAction(parcel, (C2667a) null);
        }

        /* renamed from: b */
        public SetVolumeAction[] newArray(int i) {
            return new SetVolumeAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVolumeAction$b */
    static class C2668b {

        /* renamed from: a */
        CheckBox f7538a;

        /* renamed from: b */
        Spinner f7539b;

        /* renamed from: c */
        SeekBar f7540c;

        /* renamed from: d */
        TextView f7541d;

        C2668b() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVolumeAction$c */
    private class C2669c extends BaseAdapter {

        /* renamed from: a */
        private final LayoutInflater f7542a;

        /* renamed from: c */
        private final boolean[] f7543c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int[] f7544d;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final MacroDroidVariable[] f7545f;

        /* renamed from: g */
        private final List<MacroDroidVariable> f7546g;

        /* renamed from: com.arlosoft.macrodroid.action.SetVolumeAction$c$a */
        class C2670a implements C6520o0.C6540f {

            /* renamed from: a */
            final /* synthetic */ C2668b f7548a;

            /* renamed from: b */
            final /* synthetic */ int f7549b;

            C2670a(C2668b bVar, int i) {
                this.f7548a = bVar;
                this.f7549b = i;
            }

            /* renamed from: a */
            public void mo24722a(int i, @NonNull String str) {
                this.f7548a.f7540c.setVisibility(0);
                this.f7548a.f7541d.setVisibility(0);
                C2669c.this.f7545f[this.f7549b] = null;
                SetVolumeAction.this.varDictionaryKeys[this.f7549b] = null;
            }

            /* renamed from: b */
            public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
                this.f7548a.f7540c.setVisibility(8);
                this.f7548a.f7541d.setVisibility(8);
                C2669c.this.f7545f[this.f7549b] = macroDroidVariable;
                SetVolumeAction.this.varDictionaryKeys[this.f7549b] = list != null ? new DictionaryKeys(list) : null;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.action.SetVolumeAction$c$b */
        class C2671b implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a */
            final /* synthetic */ int f7551a;

            /* renamed from: b */
            final /* synthetic */ C2668b f7552b;

            C2671b(int i, C2668b bVar) {
                this.f7551a = i;
                this.f7552b = bVar;
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C2669c.this.f7544d[this.f7551a] = i;
                TextView textView = this.f7552b.f7541d;
                textView.setText(i + TaskerPlugin.VARIABLE_PREFIX);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        }

        public C2669c(Context context, boolean[] zArr, int[] iArr, MacroDroidVariable[] macroDroidVariableArr) {
            this.f7542a = LayoutInflater.from(context);
            this.f7543c = Arrays.copyOf(zArr, zArr.length);
            this.f7544d = Arrays.copyOf(iArr, iArr.length);
            this.f7545f = (MacroDroidVariable[]) Arrays.copyOf(macroDroidVariableArr, macroDroidVariableArr.length);
            ArrayList<MacroDroidVariable> s0 = SetVolumeAction.this.mo27865s0();
            this.f7546g = s0;
            s0.addAll(SetVolumeAction.this.mo27857o0());
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m12795h(int i, C2668b bVar, CompoundButton compoundButton, boolean z) {
            this.f7543c[i] = z;
            bVar.f7539b.setEnabled(z);
            bVar.f7539b.setAlpha(z ? 1.0f : 0.5f);
            bVar.f7540c.setEnabled(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ boolean m12796i(C2668b bVar, View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && bVar.f7539b.getAdapter().getCount() <= 1) {
                C15626c.makeText(SetVolumeAction.this.mo27827K0(), C17541R$string.no_integer_variables_defined, 0).show();
            }
            return false;
        }

        /* renamed from: e */
        public boolean[] mo25719e() {
            return this.f7543c;
        }

        /* renamed from: f */
        public MacroDroidVariable[] mo25720f() {
            return this.f7545f;
        }

        /* renamed from: g */
        public int[] mo25721g() {
            return this.f7544d;
        }

        public int getCount() {
            return Math.min(SetVolumeAction.m12774q3().length, this.f7543c.length);
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.arlosoft.macrodroid.action.SetVolumeAction$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = 0
                if (r21 != 0) goto L_0x0047
                android.view.LayoutInflater r3 = r0.f7542a
                r4 = 2131559002(0x7f0d025a, float:1.8743336E38)
                r5 = r22
                android.view.View r3 = r3.inflate(r4, r5, r2)
                com.arlosoft.macrodroid.action.SetVolumeAction$b r4 = new com.arlosoft.macrodroid.action.SetVolumeAction$b
                r4.<init>()
                r5 = 2131363761(0x7f0a07b1, float:1.834734E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.CheckBox r5 = (android.widget.CheckBox) r5
                r4.f7538a = r5
                r5 = 2131363762(0x7f0a07b2, float:1.8347342E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.Spinner r5 = (android.widget.Spinner) r5
                r4.f7539b = r5
                r5 = 2131363763(0x7f0a07b3, float:1.8347344E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.SeekBar r5 = (android.widget.SeekBar) r5
                r4.f7540c = r5
                r5 = 2131363766(0x7f0a07b6, float:1.834735E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f7541d = r5
                r3.setTag(r4)
                goto L_0x0050
            L_0x0047:
                java.lang.Object r3 = r21.getTag()
                r4 = r3
                com.arlosoft.macrodroid.action.SetVolumeAction$b r4 = (com.arlosoft.macrodroid.action.SetVolumeAction.C2668b) r4
                r3 = r21
            L_0x0050:
                android.widget.Spinner r5 = r4.f7539b
                r6 = 0
                r5.setOnItemSelectedListener(r6)
                android.widget.CheckBox r5 = r4.f7538a
                r5.setOnCheckedChangeListener(r6)
                android.widget.CheckBox r5 = r4.f7538a
                boolean[] r7 = r0.f7543c
                boolean r7 = r7[r1]
                r5.setChecked(r7)
                android.widget.Spinner r5 = r4.f7539b
                boolean[] r7 = r0.f7543c
                boolean r7 = r7[r1]
                if (r7 == 0) goto L_0x006f
                r7 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0071
            L_0x006f:
                r7 = 1056964608(0x3f000000, float:0.5)
            L_0x0071:
                r5.setAlpha(r7)
                android.widget.Spinner r5 = r4.f7539b
                boolean[] r7 = r0.f7543c
                boolean r7 = r7[r1]
                r5.setEnabled(r7)
                android.widget.SeekBar r5 = r4.f7540c
                boolean[] r7 = r0.f7543c
                boolean r7 = r7[r1]
                r5.setEnabled(r7)
                android.widget.CheckBox r5 = r4.f7538a
                com.arlosoft.macrodroid.action.yi r7 = new com.arlosoft.macrodroid.action.yi
                r7.<init>(r0, r1, r4)
                r5.setOnCheckedChangeListener(r7)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r7 = 2131955729(0x7f131011, float:1.9547994E38)
                java.lang.String r8 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r7)
                r5.add(r8)
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.lang.String r5 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r7)
                r14.add(r5)
                com.arlosoft.macrodroid.action.SetVolumeAction r5 = com.arlosoft.macrodroid.action.SetVolumeAction.this
                android.app.Activity r9 = r5.mo27850j0()
                r10 = 2132017802(0x7f14028a, float:1.9673893E38)
                com.arlosoft.macrodroid.action.SetVolumeAction r11 = com.arlosoft.macrodroid.action.SetVolumeAction.this
                android.widget.Spinner r12 = r4.f7539b
                com.arlosoft.macrodroid.macro.Macro r13 = r11.mo27837X0()
                com.arlosoft.macrodroid.common.MacroDroidVariable[] r5 = r0.f7545f
                r5 = r5[r1]
                if (r5 == 0) goto L_0x00e7
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.arlosoft.macrodroid.common.MacroDroidVariable[] r7 = r0.f7545f
                r7 = r7[r1]
                java.lang.String r7 = r7.getName()
                r5.append(r7)
                com.arlosoft.macrodroid.action.SetVolumeAction r7 = com.arlosoft.macrodroid.action.SetVolumeAction.this
                com.arlosoft.macrodroid.variables.DictionaryKeys[] r7 = r7.varDictionaryKeys
                r7 = r7[r1]
                java.lang.String r7 = com.arlosoft.macrodroid.variables.C6520o0.m24912e0(r7)
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                r15 = r5
                goto L_0x00e8
            L_0x00e7:
                r15 = r6
            L_0x00e8:
                r17 = 0
                com.arlosoft.macrodroid.action.SetVolumeAction$c$a r5 = new com.arlosoft.macrodroid.action.SetVolumeAction$c$a
                r5.<init>(r4, r1)
                java.lang.String r16 = ""
                r18 = r5
                com.arlosoft.macrodroid.variables.C6520o0.m24879I(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                android.widget.SeekBar r5 = r4.f7540c
                com.arlosoft.macrodroid.common.MacroDroidVariable[] r7 = r0.f7545f
                r7 = r7[r1]
                r8 = 8
                if (r7 == 0) goto L_0x0103
                r7 = 8
                goto L_0x0104
            L_0x0103:
                r7 = 0
            L_0x0104:
                r5.setVisibility(r7)
                android.widget.TextView r5 = r4.f7541d
                com.arlosoft.macrodroid.common.MacroDroidVariable[] r7 = r0.f7545f
                r7 = r7[r1]
                if (r7 == 0) goto L_0x0111
                r2 = 8
            L_0x0111:
                r5.setVisibility(r2)
                android.widget.Spinner r2 = r4.f7539b
                com.arlosoft.macrodroid.action.xi r5 = new com.arlosoft.macrodroid.action.xi
                r5.<init>(r0, r4)
                r2.setOnTouchListener(r5)
                android.widget.SeekBar r2 = r4.f7540c
                r2.setOnSeekBarChangeListener(r6)
                android.widget.SeekBar r2 = r4.f7540c
                int[] r5 = r0.f7544d
                r5 = r5[r1]
                r2.setProgress(r5)
                android.widget.TextView r2 = r4.f7541d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                int[] r6 = r0.f7544d
                r6 = r6[r1]
                r5.append(r6)
                java.lang.String r6 = "%"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r2.setText(r5)
                android.widget.SeekBar r2 = r4.f7540c
                com.arlosoft.macrodroid.action.SetVolumeAction$c$b r5 = new com.arlosoft.macrodroid.action.SetVolumeAction$c$b
                r5.<init>(r1, r4)
                r2.setOnSeekBarChangeListener(r5)
                android.widget.CheckBox r2 = r4.f7538a
                java.lang.String[] r4 = com.arlosoft.macrodroid.action.SetVolumeAction.m12774q3()
                r1 = r4[r1]
                r2.setText(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetVolumeAction.C2669c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* synthetic */ SetVolumeAction(Parcel parcel, C2667a aVar) {
        this(parcel);
    }

    /* renamed from: p3 */
    private void m12773p3() {
        int[] iArr = f7537d;
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        if (this.m_streamIndexArray.length > iArr.length) {
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean[] zArr2 = this.m_streamIndexArray;
                if (i < zArr2.length) {
                    if (i != 3) {
                        zArr[i2] = zArr2[i];
                        i2++;
                    }
                    i++;
                } else {
                    boolean[] zArr3 = new boolean[f7537d.length];
                    this.m_streamIndexArray = zArr3;
                    System.arraycopy(zArr, 0, zArr3, 0, length);
                    return;
                }
            }
        }
    }

    /* renamed from: q3 */
    public static String[] m12774q3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_volume_alarm), SelectableItem.m15535j1(C17541R$string.action_set_volume_music), SelectableItem.m15535j1(C17541R$string.action_set_volume_notification), SelectableItem.m15535j1(C17541R$string.action_set_volume_ringer), SelectableItem.m15535j1(C17541R$string.action_set_volume_system_sounds), SelectableItem.m15535j1(C17541R$string.action_set_volume_voice_call), SelectableItem.m15535j1(C17541R$string.action_set_volume_bluetooth_voice), SelectableItem.m15535j1(C17541R$string.action_set_volume_accessibility_channel)};
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public void m12778u3(TriggerContextInfo triggerContextInfo) {
        double d;
        if (this.setInForeground) {
            SetVolumeActivity.m13983L1(mo27827K0(), this.m_streamIndexArray, this.m_streamVolumeArray, this.m_variables, this.varDictionaryKeys, mo27840Y0().longValue());
            return;
        }
        String[] q3 = m12774q3();
        AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
        if (this.m_volume != -1) {
            int i = 0;
            while (true) {
                int[] iArr = this.m_streamVolumeArray;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = this.m_volume;
                i++;
            }
            this.m_volume = -1;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.m_streamIndexArray;
            if (i2 < zArr.length) {
                if (zArr[i2]) {
                    try {
                        int[] iArr2 = f7537d;
                        int streamMaxVolume = audioManager.getStreamMaxVolume(iArr2[i2]);
                        if (streamMaxVolume == 0) {
                            C4878b.m18869h("Max volume for " + q3[i2] + " is zero", mo27840Y0().longValue());
                            d = 0.0d;
                        } else {
                            d = (double) (100 / streamMaxVolume);
                        }
                        MacroDroidVariable[] macroDroidVariableArr = this.m_variables;
                        if (macroDroidVariableArr[i2] != null) {
                            MacroDroidVariable q = mo27861q(macroDroidVariableArr[i2].getName());
                            if (q != null) {
                                ArrayList<String> arrayList = null;
                                if (this.varDictionaryKeys[i2] != null) {
                                    try {
                                        arrayList = C6520o0.m24868C(mo27827K0(), this.varDictionaryKeys[i2].getKeys(), triggerContextInfo, mo27837X0());
                                    } catch (Exception e) {
                                        e = e;
                                        C4878b.m18869h("Set volume failed for channel " + m12774q3()[i2] + ": " + e.toString(), mo27840Y0().longValue());
                                        i2++;
                                    }
                                } else {
                                    TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
                                }
                                Long E = q.mo27733E(arrayList);
                                if (E != null) {
                                    try {
                                        audioManager.setStreamVolume(iArr2[i2], (int) ((((double) (((long) streamMaxVolume) * E.longValue())) + (d / 2.0d)) / 100.0d), 0);
                                    } catch (Exception e2) {
                                        C4878b.m18869h("Set volume failed: " + e2.toString(), mo27840Y0().longValue());
                                    }
                                } else {
                                    C4878b.m18869h("Set volume failed, variable not found: " + this.m_variables[i2].getName() + C6520o0.m24912e0(this.varDictionaryKeys[i2]), mo27840Y0().longValue());
                                }
                            } else {
                                TriggerContextInfo triggerContextInfo3 = triggerContextInfo;
                                C4878b.m18869h("Set volume failed, variable not found: " + this.m_variables[i2].getName(), mo27840Y0().longValue());
                            }
                        } else {
                            TriggerContextInfo triggerContextInfo4 = triggerContextInfo;
                            try {
                                try {
                                    audioManager.setStreamVolume(iArr2[i2], (int) ((((double) (streamMaxVolume * this.m_streamVolumeArray[i2])) + (d / 2.0d)) / 100.0d), 0);
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                try {
                                    C4878b.m18869h("Set volume failed: " + e.toString(), mo27840Y0().longValue());
                                } catch (Exception e5) {
                                    e = e5;
                                }
                                i2++;
                            }
                            i2++;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        TriggerContextInfo triggerContextInfo5 = triggerContextInfo;
                        C4878b.m18869h("Set volume failed for channel " + m12774q3()[i2] + ": " + e.toString(), mo27840Y0().longValue());
                        i2++;
                    }
                } else {
                    TriggerContextInfo triggerContextInfo6 = triggerContextInfo;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m12776s3(C2669c cVar, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        boolean[] e = cVar.mo25719e();
        int[] g = cVar.mo25721g();
        MacroDroidVariable[] f = cVar.mo25720f();
        this.setInForeground = checkBox.isChecked();
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_streamIndexArray;
            if (i < zArr.length) {
                zArr[i] = e[i];
                this.m_streamVolumeArray[i] = g[i];
                this.m_variables[i] = f[i];
                i++;
            } else {
                appCompatDialog.dismiss();
                mo24689O1();
                return;
            }
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String[] q3 = m12774q3();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_streamIndexArray;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                sb.append(q3[i]);
                sb.append(" = ");
                if (this.m_variables[i] != null) {
                    sb.append(this.m_variables[i].getName() + C6520o0.m24912e0(this.varDictionaryKeys[i]) + ", ");
                } else {
                    sb.append(this.m_streamVolumeArray[i]);
                    sb.append("%, ");
                }
            }
            i++;
        }
        String sb2 = sb.toString();
        return sb2.endsWith(", ") ? sb2.substring(0, sb2.length() - 2) : sb2;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7726d4.m32218u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        m12773p3();
        if (mo25672e2() && !((NotificationManager) mo27827K0().getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            C7439d0.m30911p0(mo27827K0(), mo25559a1(), 7);
        }
        m12778u3(triggerContextInfo);
        if (triggerContextInfo != null && triggerContextInfo.mo31565r() != null && triggerContextInfo.mo31565r().equals(BluetoothTrigger.class.getSimpleName())) {
            new Handler(Looper.getMainLooper()).postDelayed(new C3575wi(this, triggerContextInfo), 1000);
        }
    }

    @NonNull
    /* renamed from: b */
    public DictionaryKeys[] mo24428b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: e2 */
    public boolean mo25672e2() {
        if (!C5163j2.m20223o0(mo27827K0()) && Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return this.setInForeground;
    }

    /* renamed from: j */
    public List<MacroDroidVariable> mo24437j() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable macroDroidVariable : this.m_variables) {
            if (macroDroidVariable != null) {
                arrayList.add(macroDroidVariable);
            }
        }
        return arrayList;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m12773p3();
        if (this.m_volume != -1) {
            int i = 0;
            while (true) {
                int[] iArr = this.m_streamVolumeArray;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = this.m_volume;
                i++;
            }
            this.m_volume = -1;
        }
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.system_volume_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_set_volume);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.set_volume_set_in_forground);
        ListView listView = (ListView) appCompatDialog.findViewById(C17532R$id.set_volume_streamList);
        C2669c cVar = new C2669c(new ContextThemeWrapper((Context) j0, (int) C17542R$style.Theme_App_Dialog_Action), this.m_streamIndexArray, this.m_streamVolumeArray, this.m_variables);
        checkBox.setChecked(this.setInForeground);
        listView.setAdapter(cVar);
        listView.setItemsCanFocus(false);
        listView.setChoiceMode(2);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3547vi(this, cVar, checkBox, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3520ui(appCompatDialog));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_streamIndexArray.length);
        parcel.writeBooleanArray(this.m_streamIndexArray);
        parcel.writeInt(this.m_volume);
        parcel.writeInt(this.m_forceVibrateOff ? 1 : 0);
        parcel.writeInt(this.m_streamVolumeArray.length);
        parcel.writeIntArray(this.m_streamVolumeArray);
        parcel.writeParcelableArray(this.m_variables, i);
        parcel.writeParcelableArray(this.varDictionaryKeys, i);
        parcel.writeInt(this.setInForeground ? 1 : 0);
    }

    /* renamed from: z */
    public void mo24429z(@NonNull DictionaryKeys[] dictionaryKeysArr) {
        this.varDictionaryKeys = dictionaryKeysArr;
    }

    public SetVolumeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetVolumeAction() {
        int[] iArr = f7537d;
        this.m_streamIndexArray = new boolean[iArr.length];
        this.m_streamVolumeArray = new int[iArr.length];
        this.m_variables = new MacroDroidVariable[iArr.length];
        this.varDictionaryKeys = new DictionaryKeys[iArr.length];
        this.m_volume = -1;
    }

    private SetVolumeAction(Parcel parcel) {
        super(parcel);
        int[] iArr = f7537d;
        this.m_streamIndexArray = new boolean[iArr.length];
        this.m_streamVolumeArray = new int[iArr.length];
        this.m_variables = new MacroDroidVariable[iArr.length];
        this.varDictionaryKeys = new DictionaryKeys[iArr.length];
        boolean[] zArr = new boolean[parcel.readInt()];
        this.m_streamIndexArray = zArr;
        parcel.readBooleanArray(zArr);
        this.m_volume = parcel.readInt();
        boolean z = true;
        this.m_forceVibrateOff = parcel.readInt() != 0;
        int[] iArr2 = new int[parcel.readInt()];
        this.m_streamVolumeArray = iArr2;
        parcel.readIntArray(iArr2);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(MacroDroidVariable.class.getClassLoader());
        this.m_variables = new MacroDroidVariable[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.m_variables[i] = (MacroDroidVariable) readParcelableArray[i];
        }
        Parcelable[] readParcelableArray2 = parcel.readParcelableArray(DictionaryKeys.class.getClassLoader());
        this.varDictionaryKeys = new DictionaryKeys[f7537d.length];
        for (int i2 = 0; i2 < readParcelableArray2.length; i2++) {
            this.varDictionaryKeys[i2] = (DictionaryKeys) readParcelableArray2[i2];
        }
        this.setInForeground = parcel.readInt() == 0 ? false : z;
    }
}
