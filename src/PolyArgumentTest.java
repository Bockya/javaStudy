class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품 구매시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스 점수 = 제품가격의 10%
    }
}

class Tv extends Product {
    Tv() {
        // 조상 클래스의 생성자 Product(int price) 호출
        super(100); //Tv 가격 100만원
    }

    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        // 조상 클래스의 생성자 Product(int price) 호출
        super(200); //Tv 가격 200만원
    }

    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000; // 소유 금액
    int bonusPoint = 0; // 보너스 점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price; // 가진 돈 - 제품 가격
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수 획득
        System.out.println(p + "를 구입하셨습니다.");
    }
}

class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv()); //but(Product p)
        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}
