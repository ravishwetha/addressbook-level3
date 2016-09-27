package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * Represents the file used to store address book data.
 */
public interface Storage {
    public AddressBook load() throws StorageOperationException, seedu.addressbook.storage.StorageStub.StorageOperationException;    
    public void save(AddressBook addressBook) throws StorageOperationException, seedu.addressbook.storage.StorageStub.StorageOperationException;
    public String getPath();
}