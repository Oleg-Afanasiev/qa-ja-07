package com.academy.lesson07.lambda;

public class LambdaDemo2  {
    public static void main(String[] args) {
        String track = "track_21";
        ExtractorAPI trackerNumberExtractor = s -> Integer.parseInt(s.substring(s.length()-2));

        int number = trackerNumberExtractor.extract(track);
        System.out.println(number);
        assert number == 21;

        trackerNumberExtractor = s ->
                Integer.parseInt(s.substring(s.length()-2, s.length() -1)) +
                        Integer.parseInt(s.substring(s.length()-1));

        int sum = trackerNumberExtractor.extract(track);
        System.out.println(sum);

        trackerNumberExtractor = LambdaDemo2::extractNumberAndSum;

        int sum2 = trackerNumberExtractor.extract(track);
        System.out.println(sum2);

    }

    public static int extractNumberAndSum(String track) {
        String beforeLastSymb = track.substring(track.length()-2, track.length() -1);
        String lastSymb = track.substring(track.length()-1);
        int beforeLastDigit = Integer.parseInt(beforeLastSymb);
        int lastDigit = Integer.parseInt(lastSymb);
        return beforeLastDigit + lastDigit;
    }
}
