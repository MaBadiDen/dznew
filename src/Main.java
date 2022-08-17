public class Main {
    public static void main(String[] args) {
        Author Rudasov = new Author("Alexey", "Rudasov");
        Author Gogol = new Author("Nikolay", "Gogol");

        Book Arhimag = new Book("Arhimag", Rudasov, 2005);
        Book deadSouls = new Book("Dead Souls", Gogol, 1111);

        deadSouls.setPublishYear(1842);

        System.out.println(deadSouls);
    }
}