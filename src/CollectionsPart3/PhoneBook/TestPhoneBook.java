package CollectionsPart3.PhoneBook;
public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Andrey", "+79106726283");
        phoneBook.addContact("Anna", "+79677284274");
        phoneBook.addContact("Daniel", "+79028357523");
        System.out.println(phoneBook);

        phoneBook.removeContact("Andrey");
        System.out.println(phoneBook);
    }
}
