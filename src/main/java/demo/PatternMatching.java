package demo;

import java.util.regex.Pattern;

public class PatternMatching {
  private static Pattern userPattern = Pattern.compile("[\\w_-]{5,}");
  private static Pattern passwordPattern = Pattern.compile("[@!?-_.]");
  private static Pattern emailPattern = Pattern.compile(".*@(.*?\\.)+(edu|ac\\.uk)");

  public boolean verifyUserRegistrationCredentials(String user, String password, String email) {
    String trimmedLowerUser = user.trim().toLowerCase();
    if (!userPattern.matcher(user).matches() || lookupInDatabase(user) != null || !emailPattern.matcher(email).matches()) {
      return false;
    }

    if (password.length() < 6 || !passwordPattern.matcher(password).find()) {
      throw new RuntimeException("You must obey the password rules!");
    }

    return true;
  }

  private Object lookupInDatabase(String user) {
    // TODO
    return null;
  }
}
