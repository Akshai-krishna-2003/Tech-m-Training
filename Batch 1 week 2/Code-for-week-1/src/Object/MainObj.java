package Object;

public class MainObj {
    public static void main(String[] args) {
        User u1 = new User("Akshai",21);
        SecondUser u2 = new SecondUser("Akshai",21);
        User u3 = new User("Akshai",21);

        System.out.println(u1.toString());
        System.out.println(u2.toString());

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u1.equals(u1));
        System.out.println(u2.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u2.equals(u3));
    }
}
