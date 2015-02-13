package com.example.nikolay.training_activity;


import android.os.Parcel;
import android.os.Parcelable;

public class StudentCool implements Parcelable {
    private String name;
    private int age;

    public StudentCool(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    private StudentCool (Parcel in){
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<StudentCool> CREATOR = new Creator<StudentCool>() {
        @Override
        public StudentCool createFromParcel(Parcel source) {
            return new StudentCool(source);
        }

        @Override
        public StudentCool[] newArray(int size) {
            return new StudentCool[0];
        }
    };
}
