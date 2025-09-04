public class Actor {
    String name;
    int age;
    int nom;
    int noh;
    int nof;

    public Actor(String a, int b, int c, int d, int e) {
        name = a;
        age = b;
        nom = c;
        noh = d;
        nof = e;

    }

}

class mainoffunction {
    public static void main(String[] args) {
        Actor a1 = new Actor("vijay", 43, 12, 13, 45);
        System.out.println(a1.name);
        System.out.println(a1.age);
        System.out.println(a1.nom);
        System.out.println(a1.noh);
        System.out.println(a1.nof);
        System.out.println("-----------");
        Actor a2 = new Actor("surya", 43, 12, 13, 45);
        System.out.println(a2.name);
        System.out.println(a2.age);
        System.out.println(a2.nom);
        System.out.println(a2.noh);
        System.out.println(a2.nof);
        System.out.println("-----------");
        Actor a3 = new Actor("ajith", 43, 12, 13, 45);
        System.out.println(a3.name);
        System.out.println(a3.age);
        System.out.println(a3.nom);
        System.out.println(a3.noh);
        System.out.println(a3.nof);
        System.out.println("-----------");
        Actor a4 = new Actor("SK", 43, 12, 13, 45);
        System.out.println(a4.name);
        System.out.println(a4.age);
        System.out.println(a4.nom);
        System.out.println(a4.noh);
        System.out.println(a4.nof);
        System.out.println("-----------");
        Actor a5 = new Actor("simbu", 43, 12, 13, 45);
        System.out.println(a5.name);
        System.out.println(a5.age);
        System.out.println(a5.nom);
        System.out.println(a5.noh);
        System.out.println(a5.nof);
        System.out.println("-----------");

    }
}
