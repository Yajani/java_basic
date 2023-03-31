package day05.member;

// 역할: 회원 저장소 역할
public class MemberRepository {

    Member[] memberList;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member(1,"abc@def.com",
                "1234","콩벌레",
                Gender.MALE, 50);
        memberList[1] = new Member(2,"xxx@zzz.com",
                "9999","팥죽이",
                Gender.FEMALE, 30);
        memberList[2] = new Member(3,"hhh@qwe.com",
                "5678","카레왕",
                Gender.FEMALE, 44);
    }

    /*
    * 모든 회원 정보를 출력해주는 메서드
     */
    void showMembers() {
        System.out.printf("========= 현재 회원정보 (총 %d명) ==========\n",memberList.length);

        for(Member m : memberList) {
            System.out.println(m.inform());
        }
    }
    /*
    * 회원 가입 기능
    * @paraml - newMember: 새롭게 회원가입하는 회원의 정보
    */
    void addMember(Member newMember) {
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;
    }

    /*
    *이메일의 중복여부를 확인하는 기능
    * @paraml targetEmail : 검사 대상 이메일
    * @return : 중복되었을 시 true, 사용가능할 시 false
    */
    boolean isDuplicateEmail(String targetEmail){
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;

    }




}