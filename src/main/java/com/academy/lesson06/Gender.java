package com.academy.lesson06;

public enum Gender {
    MALE("м", "m", 110),
    FEMALE("ж", "f", 120),;

    String ru;
    String eng;
    private int maxage;

    Gender(String ru, String eng, int maxage) {
        this.ru = ru;
        this.eng = eng;
        this.maxage = maxage;
    }

    public int getMaxage() {
        return maxage;
    }

//    @Override
//    public String toString() {
//        if (this == MALE)
//            return "муж";
//        else
//            return "жен";
//    }


}
