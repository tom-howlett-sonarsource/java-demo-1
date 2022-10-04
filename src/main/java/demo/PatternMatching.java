package demo;

import java.util.regex.Pattern;

public class PatternMatching {
  private static Pattern userPattern = Pattern.compile("([\\w-]|\\w_)+");
  private static Pattern passwordPattern = Pattern.compile(".*[@!?_-]+.*");

  public boolean verifyUserRegistrationCredentials(String user, String password) {
    String trimmedLowerUser = user.trim().toLowerCase();
    if (!userPattern.matcher(user).matches() || lookupInDatabase(user) != null) {
      return false;
    }

    if (password.length() < 6 || !passwordPattern.matcher(password).matches()) {
      throw new RuntimeException("You must obey the password rules!");
    }

    return true;
  }

  private Object lookupInDatabase(String user) {
    // TODO
    return null;
  }
}
