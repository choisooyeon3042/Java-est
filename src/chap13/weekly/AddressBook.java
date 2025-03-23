package chap13.weekly;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("연락처가 추가되었습니다.");
    }

    // 기능4. 모든 연락처 출력
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어 있습니다.");
        }  else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
    
    // 기능5. 이름으로 연락처 검색
    public void searchContact(String name) {
        List<Contact> matchedContacts = contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .toList();

        if (matchedContacts.isEmpty()) {
            System.out.println("연락처를 찾을 수 없습니다.");
        } else {
            matchedContacts.forEach(System.out::println);
        }
    }

}
