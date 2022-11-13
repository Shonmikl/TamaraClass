package tamara.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        int[] a = {7, 87, 9, 56, 41, 32, 13, 24, 67, 89, 1, 5, 62, 13, 648};//99999
        List<Integer> listA = new ArrayList<>();//10
        List<Integer> listL = new LinkedList<>();//10
        double d = Arrays.stream(a).average().getAsDouble();
        double d1= Arrays.stream(a).distinct().count();
        List<Integer> lll = listL.stream().map(el -> el * 2).toList();

        String text = "Heartbroken to hear of the passing of the gifted artist Coolio, " +
                "she wrote on Instagram, sharing a clip from the famous music video, " +
                "which sees her sitting opposite the hip-hop star glaring at him as he raps." +
                "A life cut entirely too short, she continued. " +
                "I remember him being nothing but gracious." +
                "Dangerous Minds saw Pfeiffer play an ex-Marine who " +
                "becomes a teacher working on a pilot programme for " +
                "teenagers who are bright but underachieving, in a tough, " +
                "inner-city school." +
                "Coolio's haunting track from it, " +
                "which samples the Stevie Wonder song Pastime " +
                "Paradise for its chorus, went on to become one of the most " +
                "successful rap songs of all time, helping to bring the genre into the mainstream." +
                "It continues to be widely listened to and has just passed a billion streams on Spotify, " +
                "according to his official website.";



//        int[] result = Arrays.stream(a).map(e -> e*2).toArray();
//        System.out.println(Arrays.toString(result));

//        int[] result = Arrays.stream(a)
//                .map(el -> el + 1)
//                .filter(tamara ->tamara % 2 == 0)
//                .toArray();
//        System.out.println(Arrays.toString(result));
        int[] r = {1,2,3,4,5,6,25};
        int chain = Arrays.stream(r)
                .filter(el -> el % 2 == 1)
                .map(el -> {
                    if(el % 5 == 0) {
                        el = el/5;
                    }
                    return el;
                        })
                .reduce((acc, el2) -> acc * el2)
                .getAsInt();

        System.out.println(chain);



    }
}