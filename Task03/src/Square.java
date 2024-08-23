public class Square implements Shape{
    private int length = 5;

    @Override
    public void draw() {
        for (int i = 0; i< length; i++){ //to draw square
            for (int j = 0; j < length; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }

    }
}
