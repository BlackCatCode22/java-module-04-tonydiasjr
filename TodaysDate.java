//TD 10/01/24
//TodaysDate.java
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class TodaysDate {
    public static void main(String[] args) {

        System.out.println("\nwelcome to dates and animal class!\n");

        //create a date obj to rep the current date
        Date today = new Date();

        //define the desire date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");;
        SimpleDateFormat yearFormatter = new SimpleDateFormat("yyyy");

        //format the date and store ir in a strong
        String strTodaysDate = formatter.format(today);
        String currentYearStr = yearFormatter.format(today);
        int currentYear = Integer.parseInt(currentYearStr);

        //output the result
        System.out.println("todays date in the format is:"+strTodaysDate);

        // Calculate birthdates for the following two hyenas
        //1)4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        //2)12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        //Write a java code to calculate birthdates for the animal and then create a method that returns the animal
        //for the animals birthdate.
        //input: "4years old female hyena, born in spring
        //processing:find the age and birth season
        // and then use decision control structures to calculate the date
        // parse the string

        String strStarting ="4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia";

       String[] arrayOfStrPatOnComma =strStarting.split(", ");

               for (String thePart : arrayOfStrPatOnComma){
                   System.out.println("element of the string is:"+thePart);


        }
               String[] arrayOfStrpartsOnSpace =arrayOfStrPatOnComma[0].split(" ");
        for (String thePart : arrayOfStrpartsOnSpace){
            System.out.println("element of the string is:"+thePart);}



        System.out.println();
        String[] arrayOfStrpartsOnSpace02 =arrayOfStrPatOnComma[1].split(" ");
        for (String thePart : arrayOfStrpartsOnSpace){
            System.out.println("element of the string is:"+thePart);}

        String ageInYears = arrayOfStrpartsOnSpace[0];
        String animalBirthSeasson = arrayOfStrpartsOnSpace02[2];
        System.out.println("The age in years of the animal is:"+ageInYears);
        System.out.println("the season of birth of the animal is:"+animalBirthSeasson);
        String[] ageAndGender = arrayOfStrPatOnComma[0].split(" ");
        String ageInYears = ageAndGender[0];
        String animalBirthSeason = ageAndGender[3]; // Accessing 'spring'

        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);
        int animalBirthYear = currentYear - Integer.parseInt(ageInYears);
        String animalBirthdate="";
        int todaysYear = Integer.parseInt(strTodayYear);
        int animalBirthyear = todaysYear-Integer.parseInt(ageInYears);
        if(animalBirthSeasson.contains("spring")){
            animalBirthdate = "2020-03-21";
        }
        if (animalBirthSeasson.contains("spring")){
            animalBirthdate = Integer.toString(animalBirthyear)+"03-21"

        }
        if (animalBirthSeasson.contains("fall")){
            animalBirthdate = Integer.toString(animalBirthyear)+"09-21"

        }
        if (animalBirthSeasson.contains("winter")){
            animalBirthdate = Integer.toString(animalBirthyear)+"12-21"

        }
        if (animalBirthSeasson.contains("summer")){
            animalBirthdate = Integer.toString(animalBirthyear)+"06-21"

        }
        System.out.println("\n animal birthdate ="+animalBirthdate);

    }
}
