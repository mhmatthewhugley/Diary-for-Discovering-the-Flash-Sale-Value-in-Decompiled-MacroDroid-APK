package com.arlosoft.macrodroid.utils.sparkpostutil;

public class SparkPostResult {

    /* renamed from: id */
    private String f15056id;
    private int total_accepted_recipients;
    private int total_rejected_recipients;

    public SparkPostResult(String str, int i, int i2) {
        this.f15056id = str;
        this.total_accepted_recipients = i;
        this.total_rejected_recipients = i2;
    }

    public String getId() {
        return this.f15056id;
    }

    public int getTotal_accepted_recipients() {
        return this.total_accepted_recipients;
    }

    public int getTotal_rejected_recipients() {
        return this.total_rejected_recipients;
    }
}
