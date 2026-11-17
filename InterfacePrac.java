interface Camera {
    void takePhoto();
}

interface Microphone{
    void recordAudio();
}

class SmartPhone implements  Camera , Microphone {
    public void takePhoto(){
        System.out.println("Taking photo");
    }
    public void recordAudio(){
        System.out.println("Recording Audio");
    }
}

public class InterfacePrac {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.recordAudio();

    }
}
