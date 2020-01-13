package builder;

public interface AirShipBuilder {
    AirShip.Engine builderEngine();

    AirShip.orbitalModule buildorbitalModule();

    AirShip.escapeTower buildEscapeTower();
}
