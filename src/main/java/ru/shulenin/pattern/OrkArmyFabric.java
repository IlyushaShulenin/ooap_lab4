package ru.shulenin.pattern;

import ru.shulenin.unit.Unit;
import ru.shulenin.unit.UnitType;
import ru.shulenin.unit.ork.OrkWarmaster;
import ru.shulenin.unit.ork.OrkWarrior;

public class OrkArmyFabric implements UnitFabric {
    @Override
    public Unit getUnit(UnitType unitType) {
        return switch (unitType) {
            case WARRIOR -> new OrkWarrior();
            case WARMASTER -> new OrkWarmaster();
            default -> null;
        };
    }
}
