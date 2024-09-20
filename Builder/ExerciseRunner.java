public class ExerciseRunner {

    public static void main(String[] args) {
        Housing house = new HouseBuilder()
                .setName("Maison")
                .setRooms(4)
                .setSize(80)
                .setPrice(100000)
                .build();
        Housing apartment = new ApartmentBuilder()
                .setName("Appart")
                .setRooms(2)
                .setSize(30)
                .setPrice(25000)
                .build();

        System.out.println(house);
        System.out.println(apartment);
    }
}