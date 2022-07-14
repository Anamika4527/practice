package training.Day1;

public class CatPractice {
    public static void main(String[] args){
        int a = 5;

          Cat thor = new Cat();
//        thor.name = "Thor";
//        thor.age = 2;
//        thor.color = "White";
//        thor.weight = 2.5f;

        thor.setName();
        thor.setAge();
        thor.setColor();
        thor.setWeight();

        Cat rambo = new Cat();
//        rambo.name = "Rambo";
//        rambo.age = 3;
//        rambo.color = "Black";
//        rambo.weight = 3.0f;

        rambo.setName();
        rambo.setAge();
        rambo.setColor();
        rambo.setWeight();

 //       String thorName = thor.name;
        String thorName = thor.getName();
        System.out.println(thorName);

 //       int thorAge = thor.age;
        int thorAge = thor.getAge();
        System.out.println(thorAge);

 //       String ramboColor = rambo.color;
        String ramboColor = rambo.getColor();
        System.out.println(ramboColor);

 //       String thorColor = thor.color;
        String thorColor = thor.getColor();
        System.out.println(thorColor);

        thor.sleep();
        rambo.play();

    }
}
