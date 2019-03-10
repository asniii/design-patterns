package Creational.Builder.pattern.example1;

public class Computer {

    public static class ComputerBuilder{
        private String monitor;
        private String ram;
        private String cpu;
        private String motherBoard;
        private String cabinet;
        private String smps;
        private String hardDisk;
        private String ssd;
        private String cdRom;
        private String floopyDisk;
        private String fan;
        private String keyboard;
        private String mouse;
        private String camera;
        private String touchpad;

        ComputerBuilder(String monitor, String ram, String motherBoard,String mouse, String keyboard){
            this.monitor = monitor;
            this.ram = ram;
            this.motherBoard = motherBoard;
            this.mouse = mouse;
            this.keyboard = keyboard;
        }
        public ComputerBuilder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder cabinet(String cabinet){
            this.cabinet = cabinet;
            return this;
        }
        public ComputerBuilder smps(String smps){
            this.smps = smps;
            return this;
        }
        public ComputerBuilder hardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }
        public ComputerBuilder ssd(String ssd){
            this.ssd = ssd;
            return this;
        }
        public ComputerBuilder cdRom(String cdRom){
            this.cdRom = cdRom;
            return this;
        }
        public ComputerBuilder floopyDisk(String floopyDisk){
            this.floopyDisk = floopyDisk;
            return this;
        }
        public ComputerBuilder fan(String fan){
            this.fan = fan;
            return this;
        }
        public ComputerBuilder camera(String camera){
            this.camera = camera;
            return this;
        }
        public ComputerBuilder touchpad(String touchpad){
            this.touchpad = touchpad;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    private String monitor;
    private String ram;
    private String cpu;
    private String motherBoard;
    private String cabinet;
    private String smps;
    private String hardDisk;
    private String ssd;
    private String cdRom;
    private String floopyDisk;
    private String fan;
    private String keyboard;
    private String mouse;
    private String camera;
    private String touchpad;

    private Computer(ComputerBuilder computerBuilder){
        this.monitor = computerBuilder.monitor;
        this.ram = computerBuilder.ram;
        this.cpu = computerBuilder.cpu;
        this.motherBoard = computerBuilder.motherBoard;
        this.cabinet = computerBuilder.cabinet;
        this.smps = computerBuilder.smps;
        this.hardDisk = computerBuilder.hardDisk;
        this.ssd = computerBuilder.ssd;
        this.cdRom = computerBuilder.cdRom;
        this.floopyDisk = computerBuilder.floopyDisk;
        this.fan = computerBuilder.fan;
        this.keyboard = computerBuilder.keyboard;
        this.mouse = computerBuilder.mouse;
        this.camera = computerBuilder.camera;
        this.touchpad = computerBuilder.touchpad;

    }

    public String getMonitor() {
        return monitor;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getCabinet() {
        return cabinet;
    }

    public String getSmps() {
        return smps;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getSsd() {
        return ssd;
    }

    public String getCdRom() {
        return cdRom;
    }

    public String getFloopyDisk() {
        return floopyDisk;
    }

    public String getFan() {
        return fan;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getCamera() {
        return camera;
    }

    public String getTouchpad() {
        return touchpad;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "monitor='" + monitor + '\n' +
                ", ram='" + ram + '\n' +
                ", cpu='" + cpu + '\n' +
                ", motherBoard='" + motherBoard + '\n' +
                ", cabinet='" + cabinet + '\n' +
                ", smps='" + smps + '\n' +
                ", hardDisk='" + hardDisk + '\n' +
                ", ssd='" + ssd + '\n' +
                ", cdRom='" + cdRom + '\n' +
                ", floopyDisk='" + floopyDisk + '\n' +
                ", fan='" + fan + '\n' +
                ", keyboard='" + keyboard + '\n' +
                ", mouse='" + mouse + '\n' +
                ", camera='" + camera + '\n' +
                ", touchpad='" + touchpad + '\n' +
                '}';
    }
}
