package com.example.rafaj.fragmentapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Planet implements Parcelable{
    int imageRes;
    String planetName;
    int planetInfo;

    public Planet(int imageRes, String planetName, int planetInfo){
        this.imageRes = imageRes;
        this.planetName = planetName;
        this.planetInfo = planetInfo;
    }

    //Implementacion Parcelable

    protected Planet(Parcel in) {
        imageRes = in.readInt();
        planetName = in.readString();
        planetInfo = in.readInt();
    }



    public static final Creator<Planet> CREATOR = new Creator<Planet>() {
        @Override
        public Planet createFromParcel(Parcel in) {
            return new Planet(in);
        }

        @Override
        public Planet[] newArray(int size) {
            return new Planet[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageRes);
        dest.writeString(planetName);
        dest.writeInt(planetInfo);
    }
}
