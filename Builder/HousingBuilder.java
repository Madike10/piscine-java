public interface HousingBuilder {
     HousingBuilder setSize(int size);

     HousingBuilder setPrice(int price);

     HousingBuilder setRooms(int rooms);

     HousingBuilder setName(String name);

     Housing build();
}
