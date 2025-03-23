package chap13.weekly;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {

        // 메뉴 입력 프로그램 생성
        while(true) {
            menuProgram();
            int input = getInput();

            try {
                switch (input) {
                    case 1 -> addBusinessContact();
                    case 2 -> addPersonalContact();
                    case 3 -> addressBook.displayContacts();
                    case 4 -> {
                        System.out.print("검색할 이름을 입력하세요: ");
                        String name = sc.nextLine().trim();
                        addressBook.searchContact(name);
                    }
                    case 5 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.print("메뉴 번호를 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("Error 발생: " + e.getMessage());
            }
            System.out.println();
        }
    }

    // 기능1. 메뉴 입력 출력문
    private static void menuProgram() {
        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.print("메뉴를 선택해주세요: ");
    }

    // 입력한 값을 정수로 변환하여 반환
    // 1~5 사이의 숫자만 받기
    private static int getInput() {
        int input = -1;

        while (input == -1) {
            try {
                input = Integer.parseInt(sc.nextLine().trim());
                if (input < 1 || input > 5) {
                    System.out.println("번호는 1~5번만 가능합니다.");
                    input = -1;
                }
            } catch (NumberFormatException e) {
                System.out.print("메뉴 번호를 입력해주세요: ");
            }
        }
        return input;
    }

    // 기능2. 비즈니스 연락처 추가
    private static void addBusinessContact() {
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        String phoneNumber;

        while (true) {
            System.out.print("전화번호를 입력하세요 (010-0000-0000): ");
            phoneNumber = sc.nextLine().trim();

            if (isValidPhoneNumber(phoneNumber)) {
                break;
            } else {
                System.out.println("전화번호 형식을 지켜주세요. 다시 입력 바랍니다.");
            }
        }

        System.out.print("회사명을 입력하세요: ");
        String company = sc.nextLine().trim();

        if (Arrays.asList(name, phoneNumber, company).contains(" ")) {
            System.out.println("모든 정보를 입력해야 합니다.");
        } else {
            addressBook.addContact(new BusinessContact(name, phoneNumber, company));
        }
    }

    // 기능3. 개인 연락처 추가
    private static void addPersonalContact() {
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        String phoneNumber;

        while (true) {
            System.out.print("전화번호를 입력하세요 (010-0000-0000): ");
            phoneNumber = sc.nextLine().trim();

            if (isValidPhoneNumber(phoneNumber)) {
                break;
            } else {
                System.out.println("전화번호 형식을 지켜주세요. 다시 입력 바랍니다.");
            }
        }

        System.out.print("관계를 입력하세요: ");
        String relationship = sc.nextLine().trim();

        if (Arrays.asList(name, phoneNumber, relationship).contains(" ")) {
            System.out.println("모든 정보를 입력해야 합니다.");
        } else {
            addressBook.addContact(new PersonalContact(name, phoneNumber, relationship));
        }
    }

    // 전화번호 형식 유효성 010
    static boolean isValidPhoneNumber(String phoneNumber) {
        String telNumber = "^010-\\d{4}-\\d{4}$";
        return phoneNumber.matches(telNumber);
    }

}
