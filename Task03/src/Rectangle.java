public class Rectangle implements Shape{
    private int length = 6;
    private int height = 5;

    @Override
    public void draw() {
        for(int i = 0; i <= length; i++){//to draw rectangle
            for(int j = 0; j <= height ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
