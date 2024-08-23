public class LivingRoomLight implements Light{

    private int currentBrightnessLevel;

    @Override
    public void on() {
        currentBrightnessLevel = 100;
        System.out.println("Living Room light is ON at full brightness.");

    }

    @Override
    public void off() {
        currentBrightnessLevel = 0;
        System.out.println("Living Room light is OFF.");

    }

    @Override
    public void dim(int level) {
        if (level>=0 && level<=100){
            currentBrightnessLevel = level;
            System.out.println("Living Room light dimmed to " + level + "%");
        }
    }

    public int getCurrentBrightnessLevel() {
        return currentBrightnessLevel;
    }
}
