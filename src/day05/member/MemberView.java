package day05.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {

    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("=============================");
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void ViewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    // 엔터를 누르기전까지 멈추는 기능
    void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속...======");
        sc.nextLine();
    }

    //회원 등록 입력 처리
    void signUp() {
        System.out.println("\n#회원 등록을 시작합니다!!");
        while (true) {
            String email = input("# 이메일: ");
            if(mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("#중복된 이메일입니다 ㅋㅋ");
        }

    }

    void showDetailMember(){
        //이메일을 입력하세요!
        System.out.print("#이메일 : ");

        //찾은 회원의 정보~~~
    }


}