package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.lesson.Lesson;
import seedu.address.model.person.Student;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Student> getPersonList();

    /**
     * Returns list of lessons.
     */
    ObservableList<Lesson> getLessonList();
}
