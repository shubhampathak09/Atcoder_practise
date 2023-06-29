package loveDictionary;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static loveDictionary.Dictionary.loveCheckList;

public class Arsenal {

    public static void main(String[] args) throws InterruptedException {
       // System.out.println(loveCheckList.length);

        Scanner s = new Scanner(System.in);
        System.out.println("Prompt........");
        Thread.sleep(1000);
        System.out.println("Happy Birthday to you Love");
        String choice ="";

//        Set<String> filteredChoice = new HashSet<>();
//
//        filteredChoice=Stream.of(loveCheckList).collect(Collectors.toSet());

        List<String> listLove = Stream.of(loveCheckList).collect(Collectors.toList());
        Random rndm = new Random();
//        System.out.println(listLove.get(0));

        boolean enableLoveLoop = true;

        System.out.println("Prompt........");

        while(enableLoveLoop){

            System.out.println("Do you love me......YES / NO ");
            choice = s.nextLine();

            if("YES".equalsIgnoreCase(choice)){
                System.out.println("OMGGGGGGGGGGGG i love you tooooooooooooooooooooooo, lets get married......");
                System.out.println("application will exit in 2 sec");
                Thread.sleep(2000);
                break;
            }else if ("NO".equalsIgnoreCase(choice)){

                if(loveCheckList.length == 0){
                    System.out.println("Fatal Error, terminating the application");
                    return;
                }


                System.out.println("Here is the reason why I love you,my jaan ");
                int randomNumber=rndm.nextInt(listLove.size());
                System.out.println(listLove.get(randomNumber));
                listLove.remove(randomNumber);
            }else
            {
                System.out.println("Bad choices, only yes or no allowed, enter a valid choice continue");
            }
        }

         return;

    }



}
