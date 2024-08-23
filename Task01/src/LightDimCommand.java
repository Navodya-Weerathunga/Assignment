public class LightDimCommand implements Command {

    private Light light;
    private int preBrightness;
    private int newBrightness;

    public LightDimCommand(Light light, int newBrightness){
        this.light = light;
        this.newBrightness = newBrightness;
    }
    @Override
    public void execute() {
        preBrightness = getCurrentBrightnessLevel(light);
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(100);
    }

    private int getCurrentBrightnessLevel(Light light){
        if (light instanceof KitchenRoomLight){
            return (((KitchenRoomLight) light).getCurrentBrightness());
        } else if (light instanceof LivingRoomLight) {
            return (((LivingRoomLight) light).getCurrentBrightnessLevel());
        }
        return (0);
    }
}
