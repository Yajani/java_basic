package day13;

public class Dish {

    //static final 붙이면 상수, final만 붙이면 요리마다 이름이 다를 수 있다.
    private final String name; //요리이름
    private final boolean vegeterian; //채식주의 여부
    private final int calories; //칼로리
    private final Type type; //요리 카테고리

    public  enum Type {
        MEAT,FISH, OTHER
    }

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    } //생성자로 초기화하면 값을 바꿀 수 없으므로 getter만 필요하다

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }
}
