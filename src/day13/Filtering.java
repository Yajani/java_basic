package day13;

import day07.util.Utility;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Dish.Type.MEAT;
import static day13.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Filtering {
    public static void main(String[] args) {

        // stream의 filter
        //필터조건에 맞는 데이터들을 필터링

        //메뉴목록중에 채식주의자가 먹을 수 있는 요리를 알려주세요

        List<Dish> filteredList = menuList.stream()
                .filter(dish -> dish.isVegeterian()).collect(toList());

        System.out.println("============ 채식주의자 식용 요리 목록 =========");
//        for (Dish dish : filteredList) {
//            System.out.println(dish);
//        }
        filteredList.forEach(dish -> System.out.println(dish));

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링
        makeLine();

        menuList.stream().filter(d -> d.getType() == MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));
        // => 메서드 체인
        String greeting = "hello world!";
        String upperCase = "hello world".toUpperCase();
        String subString = upperCase.substring(0,5);

        char c = "hellow world".toUpperCase().substring(0,5).charAt(2);
        System.out.println("c = " + c);

        makeLine();

        //메뉴 목록에서 요리의 이름이 4글자인 요리들만 필터링해서 출력
        menuList.stream().filter(d -> d.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d.getName()));

        makeLine();

        //원하는 개수만 필터링하기
        //칼로리가 300칼로리보다 큰 요리 중 앞에[서 3개만 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) //앞에서부터 3개 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));






    }


}
