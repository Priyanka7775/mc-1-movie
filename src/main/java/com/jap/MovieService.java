package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){
        Map<Movie,Integer> map=new HashMap<>();
        //create five movie object by calling Movie class parameterized constructor
        map.put(new Movie(101,"A Beautiful Mind","economic","11/1/2001"),4);
        map.put(new Movie(102,"Boiler Room","Crime","1/1/2000"),5);
        map.put(new Movie(103,"Buy and Cell","comedy","13/4/1988"),4);
        map.put(new Movie(104,"Corsair","Crime","11/11/1997"),3);
        map.put(new Movie(105,"Diamond Necklace","comedy","10/11/2021"),5);
        //create HashMap object and add all the Movie object inside it

        //Key will be movie object and value will be rating ranging from 1 to 5

        //return the HashMap object


        return map;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating){
        //Create a TreeSet object
       Set<String> movieTreeSet=new TreeSet<>();

        //Use entrySet() method to iterate through the map object
        for (Map.Entry<Movie,Integer>entry: map.entrySet()){
            if (entry.getValue()==rating){
                movieTreeSet.add(entry.getKey().getMovieName());
            }
        }
        //retrieve all the movies name having rating as 4

        //Store the movie name in TreeSet object

        //return the TreeSet object

      return movieTreeSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String
        List<String> list=new ArrayList<>();
        //get the first value from the map and store it in the variable max
        for (Map.Entry<Movie,Integer>integerEntry: map.entrySet()){
            if (integerEntry.getValue()==5){
                list.add(integerEntry.getKey().getMovieName());
            }
        }
        // Use entrySet().iterator().next() method to retrieve the first value of Map object


        //get the name of the movie with the highest rating and add it in the List created

        //return the List object


        return list;
    }
    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        //Create a Map object

        //use entrySet to iterate through the Map object

        //get all the movies name and their released date for the movie of genre "comedy"

        //store movie name with release date in the above created Map object and return the Map object

        Map<String,String> map1 = new HashMap();
        for (Map.Entry<Movie,Integer>entry: map.entrySet()){
            if (entry.getKey().getGenre().equalsIgnoreCase("comedy")){
                map1.put(entry.getKey().getMovieName(),entry.getKey().getReleaseDate());
            }
        }
        return map1;

    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map,4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating((Map<Movie, Integer>) map);
        System.out.println("--------------");
        System.out.println("Highest Rating " +list);
    }
}
