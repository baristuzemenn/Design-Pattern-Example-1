public class HeroContextTestDrive {
    public static void main(String[] args) {
        HeroContext heroContext = new HeroContext(10);
        System.out.println(heroContext);

        heroContext.attacked(5);
        System.out.println(heroContext);

        heroContext.attack();
        System.out.println(heroContext);

        heroContext.appear();
        heroContext.recovered();
        heroContext.revived(10);

        heroContext.disappear();
        System.out.println(heroContext);

        heroContext.disappear();
        heroContext.attacked(10);
        heroContext.silenced();
        heroContext.recovered();
        heroContext.revived(10);

        heroContext.attack();
        System.out.println(heroContext);
        heroContext.appear();
        System.out.println(heroContext);

        heroContext.attacked(10);
        System.out.println(heroContext);

        heroContext.appear();
        heroContext.disappear();
        heroContext.attack();
        heroContext.attacked(5);
        heroContext.recovered();
        heroContext.silenced();

        heroContext.revived(10);
        System.out.println(heroContext);

        heroContext.silenced();
        System.out.println(heroContext);

        heroContext.appear();
        heroContext.attack();
        heroContext.silenced();
        heroContext.revived(10);

        heroContext.disappear();
        System.out.println(heroContext);

        heroContext.appear();
        heroContext.attacked(5);
        System.out.println(heroContext);

        heroContext.recovered();
        System.out.println(heroContext);

        heroContext.silenced();
        heroContext.attacked(10);
        System.out.println(heroContext);

        heroContext.revived(10);
        System.out.println(heroContext);
    }
}
