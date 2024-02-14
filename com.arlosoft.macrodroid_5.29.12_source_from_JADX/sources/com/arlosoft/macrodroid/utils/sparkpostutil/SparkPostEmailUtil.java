package com.arlosoft.macrodroid.utils.sparkpostutil;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.arlosoft.macrodroid.C17541R$string;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15923f;
import okhttp3.C15995x;
import okhttp3.C16002z;
import org.apache.http.auth.AUTH;
import p402u6.C16642e;

public class SparkPostEmailUtil {
    public static void cancelSending(Context context) {
        C16642e.m99060g(context).mo79542c();
    }

    public static void sendEmail(Context context, String str, String str2, String str3, SparkPostSender sparkPostSender, SparkPostRecipient sparkPostRecipient, EmailListener emailListener) {
        ArrayList arrayList = new ArrayList();
        SparkPostRecipient sparkPostRecipient2 = sparkPostRecipient;
        arrayList.add(sparkPostRecipient);
        sendEmail(context, str, str2, str3, sparkPostSender, (ArrayList<SparkPostRecipient>) arrayList, (String) null, (ArrayList<SparkPostFile>) null, (String) null, emailListener);
    }

    public static void sendEmailOkHttp(final Context context, String str, String str2, String str3, SparkPostSender sparkPostSender, ArrayList<SparkPostRecipient> arrayList, String str4, ArrayList<SparkPostFile> arrayList2, String str5, EmailListener emailListener) {
        SparkPostEmailJsonRequest sparkPostEmailJsonRequest = new SparkPostEmailJsonRequest(str2, str3, arrayList, sparkPostSender, str4, arrayList2, str5);
        String str6 = str;
        Context context2 = context;
        final EmailListener emailListener2 = emailListener;
        new C16002z().mo76008a(new C15904b0.C15905a().mo75935n("https://api.sparkpost.com/api/v1/transmissions?num_rcpt_errors=3").mo75922a("Content-Type", "application/json").mo75922a("Accept", "application/json").mo75922a(AUTH.WWW_AUTH_RESP, str).mo75931j(C15907c0.m95943d(C15995x.m96395e("application/json; charset=utf-8"), sparkPostEmailJsonRequest.toString())).mo75923b()).mo76007u1(new C15923f() {
            Handler handler = new Handler(Looper.getMainLooper());

            public void onFailure(C15917e eVar, final IOException iOException) {
                this.handler.post(new Runnable() {
                    public void run() {
                        EmailListener.this.onError(iOException.toString());
                    }
                });
            }

            public void onResponse(C15917e eVar, C15915d0 d0Var) {
                try {
                    String string = d0Var.mo75966b().string();
                    if (!TextUtils.isEmpty(string)) {
                        final SparkPostResultWrapper fromJson = SparkPostResultWrapper.fromJson(string);
                        if (fromJson.getErrors() != null) {
                            if (!fromJson.getErrors().isEmpty()) {
                                this.handler.post(new Runnable() {
                                    public void run() {
                                        EmailListener.this.onError(fromJson.getErrors().get(0).getMessage());
                                    }
                                });
                                return;
                            } else {
                                this.handler.post(new Runnable() {
                                    public void run() {
                                        C64271 r0 = C64271.this;
                                        EmailListener.this.onError(context.getString(C17541R$string.error));
                                    }
                                });
                                return;
                            }
                        } else if (fromJson.getResults().getTotal_rejected_recipients() == 0) {
                            this.handler.post(new Runnable() {
                                public void run() {
                                    EmailListener.this.onSuccess();
                                }
                            });
                            return;
                        }
                    }
                    this.handler.post(new Runnable() {
                        public void run() {
                            EmailListener.this.onError("No response.");
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    EmailListener.this.onError(e.toString());
                }
            }
        });
    }

    public static void sendEmail(Context context, String str, String str2, String str3, SparkPostRecipient sparkPostRecipient, EmailListener emailListener) {
        SparkPostSender sparkPostSender = new SparkPostSender("feedback@sparkpostbox.com", "unknown user");
        ArrayList arrayList = new ArrayList();
        arrayList.add(sparkPostRecipient);
        sendEmail(context, str, str2, str3, sparkPostSender, (ArrayList<SparkPostRecipient>) arrayList, (String) null, (ArrayList<SparkPostFile>) null, (String) null, emailListener);
    }

    public static void sendEmail(Context context, String str, String str2, String str3, SparkPostRecipient sparkPostRecipient, SparkPostSender sparkPostSender, String str4, ArrayList<SparkPostFile> arrayList, String str5, EmailListener emailListener) {
        ArrayList arrayList2 = new ArrayList();
        SparkPostRecipient sparkPostRecipient2 = sparkPostRecipient;
        arrayList2.add(sparkPostRecipient);
        sendEmail(context, str, str2, str3, sparkPostSender, (ArrayList<SparkPostRecipient>) arrayList2, str4, arrayList, str5, emailListener);
    }

    public static void sendEmail(Context context, String str, String str2, String str3, String str4, EmailListener emailListener) {
        sendEmail(context, str, str2, str3, new SparkPostRecipient("feedback@sparkpostbox.com"), emailListener);
    }

    public static void sendEmail(Context context, String str, String str2, String str3, ArrayList<SparkPostRecipient> arrayList, EmailListener emailListener) {
        sendEmail(context, str, str2, str3, new SparkPostSender("feedback@sparkpostbox.com", "unknown user"), arrayList, (String) null, (ArrayList<SparkPostFile>) null, (String) null, emailListener);
    }

    public static void sendEmail(Context context, String str, String str2, String str3, SparkPostSender sparkPostSender, ArrayList<SparkPostRecipient> arrayList, String str4, ArrayList<SparkPostFile> arrayList2, String str5, EmailListener emailListener) {
        sendEmailOkHttp(context, str, str2, str3, sparkPostSender, arrayList, str4, arrayList2, str5, emailListener);
    }
}
