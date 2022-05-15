/**
 * Java allows us to define two types of methods:
 *
 * Class methods, a.k.a. static methods.
 * actions that are taken by the class itself.
 *
 * Instance methods, a.k.a. non-static methods.
 * actions that can be taken only by a specific instance of a class.
 */

public class Dog {
    public int weightInPounds;

    public Dog(int w){
        weightInPounds = w;
    }

    /**Class methods, a.k.a. static methods.*/
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            System.out.println("d1");
            return d1;
        }
        System.out.println("d2");
        return d2;

    }

    /**Instance methods, a.k.a. non-static methods.*/
    public Dog maxDog(Dog d2){
        if (this.weightInPounds > d2.weightInPounds){
            return this;
        }
        return d2;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog(10);
        Dog d2 = new Dog(20);

        /**Class methods, a.k.a. static methods.*/
        Dog.maxDog(d1,d2);

        /**Instance methods, a.k.a. non-static methods.*/
        d1.maxDog(d2);
    }
}
