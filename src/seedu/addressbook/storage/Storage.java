package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * Represents the file used to store address book data.
 */
public interface Storage {
    public AddressBook load() throws StorageOperationException;    
    public void save(AddressBook addressBook) throws StorageOperationException;
    public String getPath();
}