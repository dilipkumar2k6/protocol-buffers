public class HelloWorld {
    public static void main(String[] args) {
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                                            .setName("Dilp Kumar")
                                            .setAge(33)
                                            .build();
        System.out.println(person.toString());
        PersonOuterClass.Person person2 = null;
        try {        
            person2 = PersonOuterClass.Person.parseFrom(person.toByteString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(person2.toString());
    }
}