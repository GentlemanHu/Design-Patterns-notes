package builder.oldDe;

/*
 * @GentlemanHu
 * 建造者模式
 *
 * */
public class AirShip {

    public AirShip.orbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(AirShip.orbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public AirShip.escapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(AirShip.escapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    private orbitalModule orbitalModule;//轨道舱
    private Engine engine;//动力
    private escapeTower escapeTower;//紧急


    static class orbitalModule {
        private String name;

        public orbitalModule(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Engine {
        private String name;

        public Engine(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class escapeTower {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public escapeTower(String name) {
            this.name = name;
        }
    }
}
