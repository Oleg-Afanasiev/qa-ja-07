package com.academy.lesson05;

import com.academy.lesson04.track.Corrector;

public class InheritedDemo {
    public static void main(String[] args) {
        String[] tracks={"Track_01", "   track_03", "trACk_21", "track_15   ", "   tRAck_12   ","track_99", "track_11", "track_10"};

        Corrector corrector = new Corrector(tracks);
        String str = corrector.toString();
//        System.out.println("Corrector-> toString(): " + str);
        System.out.println(new InheritedDemo());
    }

    @Override
    public String toString() {
        return "----InheritedDemo----";
    }
}
