public class Triangle implements Shape{
    private int length = 5;

    @Override
    public void draw() {
        for (int i = 0; i <= length ; i++){//to draw triangle
            for (int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
