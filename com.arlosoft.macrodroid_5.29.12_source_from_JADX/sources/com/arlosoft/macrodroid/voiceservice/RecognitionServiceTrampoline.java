package com.arlosoft.macrodroid.voiceservice;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionListener;
import android.speech.RecognitionService;
import android.speech.SpeechRecognizer;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class RecognitionServiceTrampoline extends RecognitionService {

    /* renamed from: a */
    public final ConcurrentHashMap<RecognitionService.Callback, SpeechRecognizer> f15359a = new ConcurrentHashMap<>();

    /* renamed from: com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline$a */
    class C6617a implements RecognitionListener {

        /* renamed from: a */
        final /* synthetic */ RecognitionService.Callback f15360a;

        C6617a(RecognitionService.Callback callback) {
            this.f15360a = callback;
        }

        /* renamed from: m */
        private void m25099m(C6618b bVar) {
            try {
                bVar.run();
            } catch (RemoteException unused) {
            }
        }

        public void onBeginningOfSpeech() {
            RecognitionService.Callback callback = this.f15360a;
            Objects.requireNonNull(callback);
            m25099m(new C6619a(callback));
        }

        public void onBufferReceived(byte[] bArr) {
            m25099m(new C6626h(this.f15360a, bArr));
        }

        public void onEndOfSpeech() {
            RecognitionService.Callback callback = this.f15360a;
            Objects.requireNonNull(callback);
            m25099m(new C6620b(callback));
        }

        public void onError(int i) {
            m25099m(new C6622d(this.f15360a, i));
        }

        public void onEvent(int i, Bundle bundle) {
        }

        public void onPartialResults(Bundle bundle) {
            m25099m(new C6624f(this.f15360a, bundle));
        }

        public void onReadyForSpeech(Bundle bundle) {
            m25099m(new C6625g(this.f15360a, bundle));
        }

        public void onResults(Bundle bundle) {
            m25099m(new C6623e(this.f15360a, bundle));
        }

        public void onRmsChanged(float f) {
            m25099m(new C6621c(this.f15360a, f));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.voiceservice.RecognitionServiceTrampoline$b */
    private interface C6618b {
        void run() throws RemoteException;
    }

    /* renamed from: a */
    private RecognitionListener m25084a(RecognitionService.Callback callback) {
        return new C6617a(callback);
    }

    /* renamed from: b */
    private String m25085b() {
        return Build.VERSION.SDK_INT >= 31 ? "com.google.android.tts" : "com.google.android.googlequicksearchbox";
    }

    /* renamed from: c */
    private String m25086c() {
        return Build.VERSION.SDK_INT >= 31 ? "com.google.android.apps.speech.tts.googletts.service.GoogleTTSRecognitionService" : "com.google.android.voicesearch.serviceapi.GoogleRecognitionService";
    }

    /* access modifiers changed from: protected */
    public void onCancel(RecognitionService.Callback callback) {
        SpeechRecognizer remove = this.f15359a.remove(callback);
        if (remove != null) {
            remove.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onStartListening(Intent intent, RecognitionService.Callback callback) {
        if (!this.f15359a.containsKey(callback) || this.f15359a.get(callback) == null) {
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(getApplicationContext(), new ComponentName(m25085b(), m25086c()));
            createSpeechRecognizer.setRecognitionListener(m25084a(callback));
            this.f15359a.put(callback, createSpeechRecognizer);
        }
        this.f15359a.get(callback).startListening(intent);
    }

    /* access modifiers changed from: protected */
    public void onStopListening(RecognitionService.Callback callback) {
        SpeechRecognizer speechRecognizer = this.f15359a.get(callback);
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
    }
}
