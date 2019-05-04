package com.example.josegeorges.trivelapp;

import java.util.ArrayList;

/**
 * Created by josegeorges on 2017-12-27.

 This class will help to hold every package

 */
public class PackagesCreater {

    /*
    * This method is creating a couple of arrays that are going to create several packages and
     * add them into an ArrayList of packages.
    * This packages are going to the adapter to inflate the layout.
    *
    * */
    public static ArrayList<TripPackage> populatePackages(ArrayList<TripPackage> tripPackages, MainActivity activity){
        tripPackages.clear();
        //title for each object
        String[] titles = {"Lossy Villa", "Puerto Viana Resort", "Now Dominicano Resort",
                "Blue Sway Resort", "Water Bay Resort", "Free Wind Water", "Glitter Canyon Resort",
                "High Blue Resort", "Now Viaje", "Great Hawk Lodge", "Dunas Resort", "White Passion", "Royal Crown", "Vida Rica", "Caribbean Cruise", "Wonders"
                , "Exotica", "Royal Palace", "Jungle Wild", "The Class"};
        //description for each object
        String[] descriptions = {activity.getString(R.string.description1),
                //Description 2
                activity.getString(R.string.description2),
                //Description 3
                activity.getString(R.string.description3),
                //Description 4
                activity.getString(R.string.description4),
                //Description 5
                activity.getString(R.string.description5),
                //Description 6
                activity.getString(R.string.description6),
                //Description 7
                activity.getString(R.string.description7),
                //Description 8
                activity.getString(R.string.description8),
                //Description 9
                activity.getString(R.string.description9),
                //Description 10
                activity.getString(R.string.description10),
                //Description 11
                activity.getString(R.string.description11),
                //Description 12
                activity.getString(R.string.description12),
                //Description 13
                activity.getString(R.string.description13),
                //Description 14
                activity.getString(R.string.description14),
                //Description 15
                activity.getString(R.string.description15),
                //Description 16
                activity.getString(R.string.description16),
                //Description 17
                activity.getString(R.string.description17),
                //Description 18
                activity.getString(R.string.description18),
                //Description 19
                activity.getString(R.string.description19),
                //Description 20
                activity.getString(R.string.description20)};
        //activities for each object
        String[] activities = {activity.getString(R.string.activities1)};
        String[] activities2 = {activity.getString(R.string.activities2)};
        String[] activities3 = {activity.getString(R.string.activities3)};
        String[] activities4 = {activity.getString(R.string.activities4)};
        String[] activities5 = {activity.getString(R.string.activities5)};
        String[] activities6 = {activity.getString(R.string.activities6)};
        String[] activities7 = {activity.getString(R.string.activities7)};
        String[] activities8 = {activity.getString(R.string.activities8)};
        String[] activities9 = {activity.getString(R.string.activities9)};
        String[] activities10 = {activity.getString(R.string.activities10)};
        String[] activities11 = {activity.getString(R.string.activities11)};
        String[] activities12 = {activity.getString(R.string.activities12)};
        String[] activities13 = {activity.getString(R.string.activities13)};
        String[] activities14 = {activity.getString(R.string.activities14)};
        String[] activities15 = {activity.getString(R.string.activities15)};
        String[] activities16 = {activity.getString(R.string.activities16)};
        String[] activities17 = {activity.getString(R.string.activities17)};
        String[] activities18 = {activity.getString(R.string.activities18)};
        String[] activities19 = {activity.getString(R.string.activities19)};
        String[] activities20 = {activity.getString(R.string.activities20)};


        ArrayList<String[]> arrayListActivities = new ArrayList<>();
        arrayListActivities.add(activities);
        arrayListActivities.add(activities2);
        arrayListActivities.add(activities3);
        arrayListActivities.add(activities4);
        arrayListActivities.add(activities5);
        arrayListActivities.add(activities6);
        arrayListActivities.add(activities7);
        arrayListActivities.add(activities8);
        arrayListActivities.add(activities9);
        arrayListActivities.add(activities10);
        arrayListActivities.add(activities11);
        arrayListActivities.add(activities12);
        arrayListActivities.add(activities13);
        arrayListActivities.add(activities14);
        arrayListActivities.add(activities15);
        arrayListActivities.add(activities16);
        arrayListActivities.add(activities17);
        arrayListActivities.add(activities18);
        arrayListActivities.add(activities19);
        arrayListActivities.add(activities20);

        //duration for each object
        String[] duration = {activity.getString(R.string.duration1),
                //Duration 2
                activity.getString(R.string.duration2),
                //Duration 3
                activity.getString(R.string.duration3),
                //Duration 4
                activity.getString(R.string.duration4),
                //Duration 5
                activity.getString(R.string.duration5),
                //Duration 6
                activity.getString(R.string.duration6),
                //Duration 7
                activity.getString(R.string.duration7),
                //Duration 8
                activity.getString(R.string.duration8),
                //Duration 9
                activity.getString(R.string.duration9),
                //Duration 10
                activity.getString(R.string.duration10),
                //Duration 11
                activity.getString(R.string.duration11),
                //Duration 12
                activity.getString(R.string.duration12),
                //Duration 13
                activity.getString(R.string.duration13),
                //Duration 14
                activity.getString(R.string.duration14),
                //Duration 15
                activity.getString(R.string.duration15),
                //Duration 16
                activity.getString(R.string.duration16),
                //Duration 17
                activity.getString(R.string.duration17),
                //Duration 18
                activity.getString(R.string.duration18),
                //Duration 19
                activity.getString(R.string.duration19),
                //Duration 20
                activity.getString(R.string.duration20)};
        //prices for each object
        String[] prices = {"$5000",
                //Price 2
                "$3299",
                //Price 3
                "$4500",
                //Price 4
                "$2000",
                //Price 5
                "$3599",
                //Price 6
                "$4200",
                //Price 7
                "$7899",
                //Price 8
                "$4699",
                //Price 9
                "$2599",
                //Price 10
                "$2616",
                //Price 11
                "$1500",
                //Price 12
                "$2390",
                //Price 13
                "$999",
                //Price 14
                "$3457",
                //Price 15
                "$1765",
                //Price 16
                "$5890",
                //Price 17
                "$3464",
                //Price 18
                "$4897",
                //Price 19
                "$3878",
                //Price 20
                "$7897"};
        //location for each object
        String[] longitude = {"-106.402266",
                //Longitude 2
                "-67.156323",
                //Longitude 3
                "-68.412316",
                //Longitude 4
                "-81.925049",
                //Longitude 5
                "-90.062742",
                //Longitude 6
                "-80.196226",
                //Longitude 7
                "-115.174484",
                //Longitude 8
                "-77.928686",
                //Longitude 9
                "114.173800",
                //Longitude 10
                "-89.771905",
                //Longitude 11
                "10.992794",
                //Longitude 12
                "36.395113",
                //Longitude 13
                "51.518482",
                //Longitude 14
                "19.083127",
                //Longitude 15
                "25.899108",
                //Longitude 16
                "1.259133",
                //Longitude 17
                "19.724641",
                //Longitude 18
                "11.129415",
                //Longitude 19
                "17.901814",
                //Longitude 20
                "25.789909"};
        String[] latitute = {"23.186051",
                //Latitude 2
                "18.437631",
                //Latitude 3
                "18.680727",
                //Latitude 4
                "26.422927",
                //Latitude 5
                "29.948396",
                //Latitude 6
                "25.753462",
                //Latitude 7
                "36.118485",
                //Latitude 8
                "24.895402",
                //Latitude 9
                "22.300518",
                //Latitude 10
                "43.569993",
                //Latitude 11
                "-63.930741",
                //Latitude 12
                "25.464917",
                //Latitude 13
                "-0.105745",
                //Latitude 14
                "-87.553813",
                //Latitude 15
                "-80.123943",
                //Latitude 16
                "103.811248",
                //Latitude 17
                "-79.795893",
                //Latitude 18
                "-63.918236",
                //Latitude 19
                "100.667700",
                //Latitude 20
                "-80.199873"};
        //array of images id for each object
        int[] imagesIds = {R.drawable.trip1_pic1, R.drawable.trip1_pic2, R.drawable.trip1_pic3, R.drawable.trip1_pic4, R.drawable.trip1_pic5};
        int[] imagesIds2 = {R.drawable.trip2_pic1, R.drawable.trip2_pic2, R.drawable.trip2_pic3, R.drawable.trip2_pic4, R.drawable.trip2_pic5};
        int[] imagesIds3 = {R.drawable.trip3_pic1, R.drawable.trip3_pic2, R.drawable.trip3_pic3, R.drawable.trip3_pic4, R.drawable.trip3_pic5};
        int[] imagesIds4 = {R.drawable.trip4_pic1, R.drawable.trip4_pic2, R.drawable.trip4_pic3, R.drawable.trip4_pic4, R.drawable.trip4_pic5};
        int[] imagesIds5 = {R.drawable.trip5_pic1, R.drawable.trip5_pic2, R.drawable.trip5_pic3, R.drawable.trip5_pic4, R.drawable.trip5_pic5};
        int[] imagesIds6 = {R.drawable.trip6_pic1, R.drawable.trip6_pic2, R.drawable.trip6_pic3, R.drawable.trip6_pic4, R.drawable.trip6_pic5};
        int[] imagesIds7 = {R.drawable.trip7_pic1, R.drawable.trip7_pic2, R.drawable.trip7_pic3, R.drawable.trip7_pic4, R.drawable.trip7_pic5};
        int[] imagesIds8 = {R.drawable.trip8_pic1, R.drawable.trip8_pic2, R.drawable.trip8_pic3, R.drawable.trip8_pic4, R.drawable.trip8_pic5};
        int[] imagesIds9 = {R.drawable.trip9_pic1, R.drawable.trip9_pic2, R.drawable.trip9_pic3, R.drawable.trip9_pic4, R.drawable.trip9_pic5};
        int[] imagesIds10 = {R.drawable.trip10_pic1, R.drawable.trip10_pic2, R.drawable.trip10_pic3, R.drawable.trip10_pic4, R.drawable.trip1_pic5};
        int[] imagesIds11 = {R.drawable.trip11_pic1, R.drawable.trip11_pic2, R.drawable.trip11_pic3, R.drawable.trip11_pic4, R.drawable.trip11_pic5};
        int[] imagesIds12 = {R.drawable.trip12_pic1, R.drawable.trip12_pic2, R.drawable.trip12_pic3, R.drawable.trip12_pic4, R.drawable.trip12_pic5};
        int[] imagesIds13 = {R.drawable.trip13_pic1, R.drawable.trip13_pic2, R.drawable.trip13_pic3, R.drawable.trip13_pic4, R.drawable.trip13_pic5};
        int[] imagesIds14 = {R.drawable.trip14_pic1, R.drawable.trip14_pic2, R.drawable.trip14_pic3, R.drawable.trip14_pic4, R.drawable.trip14_pic5};
        int[] imagesIds15 = {R.drawable.trip15_pic1, R.drawable.trip15_pic2, R.drawable.trip15_pic3, R.drawable.trip15_pic4, R.drawable.trip15_pic5};
        int[] imagesIds16 = {R.drawable.trip16_pic1, R.drawable.trip16_pic2, R.drawable.trip16_pic3, R.drawable.trip16_pic4, R.drawable.trip16_pic5};
        int[] imagesIds17 = {R.drawable.trip17_pic1, R.drawable.trip17_pic2, R.drawable.trip17_pic3, R.drawable.trip17_pic4, R.drawable.trip17_pic5};
        int[] imagesIds18 = {R.drawable.trip18_pic1, R.drawable.trip18_pic2, R.drawable.trip18_pic3, R.drawable.trip18_pic4, R.drawable.trip18_pic5};
        int[] imagesIds19 = {R.drawable.trip19_pic1, R.drawable.trip19_pic2, R.drawable.trip19_pic3, R.drawable.trip19_pic4, R.drawable.trip19_pic5};
        int[] imagesIds20 = {R.drawable.trip20_pic1, R.drawable.trip20_pic2, R.drawable.trip20_pic3, R.drawable.trip20_pic4, R.drawable.trip20_pic5 };



        ArrayList<int[]> arrayListimagesIds = new ArrayList<>();
        arrayListimagesIds.add(imagesIds);
        arrayListimagesIds.add(imagesIds2);
        arrayListimagesIds.add(imagesIds3);
        arrayListimagesIds.add(imagesIds4);
        arrayListimagesIds.add(imagesIds5);
        arrayListimagesIds.add(imagesIds6);
        arrayListimagesIds.add(imagesIds7);
        arrayListimagesIds.add(imagesIds8);
        arrayListimagesIds.add(imagesIds9);
        arrayListimagesIds.add(imagesIds10);
        arrayListimagesIds.add(imagesIds11);
        arrayListimagesIds.add(imagesIds12);
        arrayListimagesIds.add(imagesIds13);
        arrayListimagesIds.add(imagesIds14);
        arrayListimagesIds.add(imagesIds15);
        arrayListimagesIds.add(imagesIds16);
        arrayListimagesIds.add(imagesIds17);
        arrayListimagesIds.add(imagesIds18);
        arrayListimagesIds.add(imagesIds19);
        arrayListimagesIds.add(imagesIds20);




        for(int i = 0; i < titles.length; i++){
            TripPackage tripPackage = new TripPackage(titles[i], descriptions[i], arrayListActivities.get(i)
                    ,duration[i], prices[i], longitude[i], latitute[i], arrayListimagesIds.get(i));
            tripPackages.add(tripPackage);
        }

        return tripPackages;
    }

}
