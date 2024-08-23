abstract class Beverages {

    private boolean wantExtras;

    public void setWantExtras(boolean wantExtras){ //method for check wantExtras
        this.wantExtras = wantExtras;
    }

    final void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantExtras){//check wantExtras(yes/no)
            addExtras(); //when wantExtras equals to yes
        };
    }
    abstract void brew();//abstract method for both tea and coffee. Method body is different for separate classes
    abstract void addCondiments();//abstract method for both tea and coffee. Method body is different for separate classes
    abstract void addExtras();//abstract method for both tea and coffee. Method body is different for separate classes
    void boilWater() {
        System.out.println("Boiling water"); //same method body used for both tea and coffee
    }

    void pourInCup(){
        System.out.println("Pouring into cup"); //same method body used for both tea and coffee
    }

}
