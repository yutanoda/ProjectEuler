public class Main {

public static String[] digits = {"Error", "one", "two", "three", "four", "five", "six",
                        "seven", "eight", "nine"};

public static String[] tensArray = {"Error", "twenty", "thirty", "forty", "fifty", 
                     "sixty", "seventy", "eighty", "ninety"};

public static String[] elevenToNineteen = {"Error", "eleven", "twelve", "thirteen", "fourteen",
                                    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

public static String giveMeString(int num){
    // Using StringBuilder to make up the number
    StringBuilder theNumber = new StringBuilder();
    // String value of the number so that I can
    // extract specific numbers from it
    String number = String.valueOf(num);
    // Deals with three digit numbers
    if(number.length()==3){
        int units = Integer.parseInt(String.valueOf(number.charAt(2)));
        int tens = Integer.parseInt(String.valueOf(number.charAt(1)));
        int hundreds = Integer.parseInt(String.valueOf(number.charAt(0)));
        if(tens == 0){
            if(units == 0){
                theNumber.append(digits[hundreds]);
                theNumber.append("Hundred");
                return theNumber.toString();
            }
            xHunderedAnd(theNumber, hundreds);
            theNumber.append(digits[units]);
        }else{
            theNumber.append(digits[hundreds]);
            theNumber.append("HundredAnd");
            StringBuilder _ifNumberLessThanNineteen = new StringBuilder();
            _ifNumberLessThanNineteen.append(tens);
            _ifNumberLessThanNineteen.append(units);
            int ifNumberLessThanNineteen = Integer.parseInt(_ifNumberLessThanNineteen.toString());
            if(ifNumberLessThanNineteen<=19){
                lessThanNineteen(theNumber, ifNumberLessThanNineteen);
            }else{
                theNumber.append(tensArray[tens-1]);
                if(units!=0)
                    theNumber.append(digits[units]);
            }
        }
    // Deal with 2 digit numbers
    }else if(number.length()==2){
        int units = Integer.parseInt(String.valueOf(number.charAt(1)));
        int tens = Integer.parseInt(String.valueOf(number.charAt(0)));
        StringBuilder _ifNumberLessThanNineteen = new StringBuilder();
        _ifNumberLessThanNineteen.append(tens);
        _ifNumberLessThanNineteen.append(units);
        int ifNumberLessThanNineteen = Integer.parseInt(_ifNumberLessThanNineteen.toString());
        if(ifNumberLessThanNineteen<=19){
            lessThanNineteen(theNumber, ifNumberLessThanNineteen);
        }else{
            theNumber.append(tensArray[tens-1]);
            if(units!=0)
                theNumber.append(digits[units]);
        }
    // This one will only go for 1,000
    }else if (number.length() == 4){
        theNumber.append("oneThousand");
    // This one is for single digit number
    }else{
        theNumber.append(digits[num]);
    }
    return theNumber.toString();
}

// Appends to StringBuilder the numbers in the form of
// {1-9} Hundered and {1-9} {1-9}
public static void xHunderedAnd(StringBuilder theNumber, int num){
    theNumber.append(digits[num]);
    theNumber.append("HundredAnd");
}

// Special case for the numbers less than nineteen
public static void lessThanNineteen(StringBuilder theNumber, int numberLessThanNineteen){
    if(numberLessThanNineteen==10){
        theNumber.append("Ten");
        return;
    }
    theNumber.append(elevenToNineteen[numberLessThanNineteen-10]);
}

public static void main(String[] args) {
    int totalChars = 0;
    for(int i=1; i<=1000; i++){
        String number = giveMeString(i);
        System.out.println(number);
        totalChars += number.length();
    }
    System.out.println("The total length is : " + totalChars);
}
}
