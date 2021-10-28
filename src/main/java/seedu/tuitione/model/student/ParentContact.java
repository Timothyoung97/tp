package seedu.tuitione.model.student;

import static java.util.Objects.requireNonNull;
import static seedu.tuitione.commons.util.AppUtil.checkArgument;

/**
 * Represents a Student's phone number in the tuitione book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPhone(String)}
 */
public class ParentContact {


    public static final String MESSAGE_CONSTRAINTS =
            "Phone numbers should only contain numbers, should be 8 digits long and should start with either a "
                    + "'9','8' or '6'.";
    public static final String VALIDATION_REGEX = "\\d{8}";
    public final String value;

    /**
     * Constructs a {@code Phone}.
     *
     * @param phone A valid phone number.
     */
    public ParentContact(String phone) {
        requireNonNull(phone);
        checkArgument(isValidPhone(phone), MESSAGE_CONSTRAINTS);
        value = phone;
    }

    /**
     * Returns true if a given string is a valid phone number.
     */
    public static boolean isValidPhone(String test) {
        return test.matches(VALIDATION_REGEX) && (test.charAt(0) == '9' || test.charAt(0) == '8'
                || test.charAt(0) == '6');
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ParentContact // instanceof handles nulls
                && value.equals(((ParentContact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
