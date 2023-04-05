package day08.poly.book;

//도서관 관리 시스템 처리
public class LibraryRepository {

    //회원 1명
    private static BookUser bookUser;

    //도서들의 정보
    private static Book[] bookList;

    static {
        bookList = new Book[] {
                new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }
    //유저를 등록하는 기능
    public void register(BookUser userInfo){
        bookUser = userInfo;
    }

    //마이페이지 기능
    /*
    * 여기에 있는 bookUser 정보 리턴
    * */

    BookUser findBookUser(){
        return bookUser;
    }

    //모든 책의 정보를 알려주는 메서드
    public String[] getBookInfoList(){
        String[] infoList = new String[bookList.length];
        for (int i = 0; i < infoList.length ; i++) {
            infoList[i] = bookList[i].info();
        }
        return infoList;
    }

}
