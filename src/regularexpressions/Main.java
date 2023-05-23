package regularexpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        // Email Validation
        String email = "example@example.com";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        validateInput(email, emailRegex, "Email");

        // Phone Number Validation
        String phoneNumber = "(123) 456-7890";
        String phoneRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        validateInput(phoneNumber, phoneRegex, "Phone Number");

        // Date Validation
        String date = "12/31/2022";
        String dateRegex = "^\\d{2}/\\d{2}/\\d{4}$";
        validateInput(date, dateRegex, "Date");

        // URL Validation
        String url = "https://www.example.com";
        String urlRegex = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        validateInput(url, urlRegex, "URL");

        // Credit Card Number Validation
        String creditCard = "1234-5678-9012-3456";
        String creditCardRegex = "^(\\d{4}-){3}\\d{4}$";
        validateInput(creditCard, creditCardRegex, "Credit Card");

        // US Zip Code Validation
        String zipCode = "12345-6789";
        String zipCodeRegex = "^\\d{5}(-\\d{4})?$";
        validateInput(zipCode, zipCodeRegex, "ZIP Code");

        // Java Identifier Validation
        String identifier = "my_variable";
        String identifierRegex = "^[A-Za-z_$][A-Za-z0-9_$]*$";
        validateInput(identifier, identifierRegex, "Java Identifier");

        // Hexadecimal Color Code Validation
        String colorCode = "#FF0000";
        String colorCodeRegex = "^#([A-Fa-f0-9]{6})$";
        validateInput(colorCode, colorCodeRegex, "Hexadecimal Color Code");

        // Time Validation
        String time = "13:45";
        String timeRegex = "^([01]\\d|2[0-3]):[0-5]\\d$";
        validateInput(time, timeRegex, "Time");
    }

    private static void validateInput(String input, String regex, String patternName) {
        Pattern pattern = Pattern.compile(regex); // Compile the regex pattern
        Matcher matcher = pattern.matcher(input); // Create a matcher for the input string

        if (matcher.matches()) {
            System.out.println("The " + patternName + " is valid."); // Input matches the regex pattern
        } else {
            System.out.println("The " + patternName + " is invalid."); // Input does not match the regex pattern
        }
    }
    }
