class init {
    public static void main(String[] args) {

        int age = 20;
        int height = 170;
        String name = "John Doe";
        boolean isStudent = true;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Is Student: " + isStudent);
        System.out.println("Hello, World!");
        System.out.println("This is a simple Java program.");

        System.out.println("This to work on control statement: If-else statement");
        if (age<18){
            name = "John Doe";
            System.out.println("Name: " + name);
            System.out.println("You are a minor.");
        } else if (age>=18 && age<65) {
            name = "Akinola Ayo";
            System.out.println("Name: " + name);
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }


    }
}