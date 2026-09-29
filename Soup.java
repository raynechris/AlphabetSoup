//Name: Rayne Christopher
//Date: 09/24/26
//Description: This program will produce soup that will only contain letters that spell out specific words in the hopes of subliminally influencing the customer


public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }


//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //precond: letters variable has to equal something
    //postcond: prints a random character from the letters variable
    public char randomLetter(){
        return (letters.charAt((int)(Math.random()*letters.length())));
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //precond: letters variable has to have a length longer than 1
    //postcond: letters is split in half and the company name inserted is put between the string
    public String companyCentered(){
        int between = letters.length()/2;
        return (letters.substring(0,between) + company + letters.substring(between,letters.length()));
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //precond: letters variable has at least one vowel present and is a valid string
    //postcond: letters no longer contains the first vowel found
    public void removeFirstVowel(){
        System.out.println(letters.replaceFirst("[aeiouAEIOU]",""));
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //precond: has to get an inserted number that is not above the length of the string
    //postcond: removes that number of letters from a random spot in the string letters.
    public void removeSome(int num){
        int randomIndex = ((int)(Math.random()*(letters.length()-num))); //finds random spot in letters
        letters = letters.substring(0,randomIndex) + letters.substring(randomIndex+num);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //precond: contains the word inserted
    //postcond: removes it from the string
    public void removeWord(String word){
        letters = letters.substring(0, letters.indexOf(word))+letters.substring(letters.indexOf(word)+word.length());
    }
}


