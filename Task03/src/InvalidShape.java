public class InvalidShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Invalid shape type provided.");
    }
}
