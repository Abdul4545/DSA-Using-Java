package OOPS.Interfaces;

public class NiceCar {

    private Engine engine;

    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }


    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startAudio() {
        player.mediaStart();
    }

    public void stopAudio() {
        player.mediaStop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }

  
}
